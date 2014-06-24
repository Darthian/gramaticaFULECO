package fuleco;

import java.util.*;

import org.antlr.v4.runtime.tree.ParseTree;

public class EvalVisitor extends Fuleco_v3BaseVisitor<Value>{
	
	 // used to compare floating point numbers
    public static final double SMALL_VALUE = 0.00000000001;

    // store variables (there's only one global scope!)
    private Map<String, Value> memory = new HashMap<String, Value>();

    // assignment/id overrides
    public Value visitPrograma(Fuleco_v3Parser.ProgramaContext ctx) {
	List<Fuleco_v3Parser.DeclaracionesContext> declaraciones;
        declaraciones = (List<Fuleco_v3Parser.DeclaracionesContext>) ctx.declaraciones();
	for (Fuleco_v3Parser.DeclaracionesContext declaracion : declaraciones) {
            visitDeclaraciones(declaracion);
        }
        return super.visitPrograma(ctx);
    }
    
    public Value visitDeclaraciones(Fuleco_v3Parser.DeclaracionesContext ctx){
        List<Fuleco_v3Parser.DeclaracionContext> declaraciones;
        declaraciones = (List<Fuleco_v3Parser.DeclaracionContext>) ctx.declaracion();
	for (Fuleco_v3Parser.DeclaracionContext declaracion : declaraciones) {
            visitDeclaracion(declaracion);
        }
        return super.visitPrograma(ctx);
    }
    
    public Value visitDeclaracion(Fuleco_v3Parser.DeclaracionContext ctx){
        return null;
    }
    
    public Value visitTipoBrasilero(Fuleco_v3Parser.TipoContext ctx) {
	return new Value(Double.valueOf(ctx.getText()));
    }	
	
    public Value visitTipoJapon(Fuleco_v3Parser.TipoContext ctx) {
	return new Value(Boolean.valueOf(ctx.getText()));
    }
     
    public Value visitAssig(Fuleco_v3Parser.AssigContext ctx) {
        String id = ctx.ID().getText();
        Value value = this.visit(ctx.expr());
        return memory.put(id, value);
    }
    
    public Value visitIdAtom(Fuleco_v3Parser.IdAtomContext ctx) {
        String id = ctx.getText();
        Value value = memory.get(id);
        if(value == null) {
            throw new RuntimeException("no such variable: " + id);
        }
        return value;
    }
    
    public Value visitStringAtom(Fuleco_v3Parser.StringAtomContext ctx) {
        String str = ctx.getText();
        // strip quotes
        str = str.substring(1, str.length() - 1).replace("\"\"", "\"");
        return new Value(str);
    }

    public Value visitNumberAtom(Fuleco_v3Parser.NumberAtomContext ctx) {
        return new Value(Double.valueOf(ctx.getText()));
    }

    public Value visitBooleanAtom(Fuleco_v3Parser.BooleanAtomContext ctx) {
        return new Value(Boolean.valueOf(ctx.getText()));
    }

    public Value visitNilAtom(Fuleco_v3Parser.NilAtomContext ctx) {
        return new Value(null);
    }

    public Value visitParExpr(Fuleco_v3Parser.ParExprContext ctx) {
        return this.visit(ctx.expr());
    }

    public Value visitUnaryMinusExpr(Fuleco_v3Parser.UnaryMinusExprContext ctx) {
        Value value = this.visit(ctx.expr());
        return new Value(-value.asDouble());
    }

    public Value visitNotExpr(Fuleco_v3Parser.NotExprContext ctx) {
        Value value = this.visit(ctx.expr());
        return new Value(!value.asBoolean());
    }

    public Value visitModExpr(Fuleco_v3Parser.ModExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(left.asDouble() % right.asDouble());
    }

    public Value visitMinusExpr(Fuleco_v3Parser.MinusExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(left.asDouble() - right.asDouble());
    }
     
    public Value visitLtExpr(Fuleco_v3Parser.LtExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(left.asDouble() < right.asDouble());
    }
     
    public Value visitLteqExpr(Fuleco_v3Parser.LteqExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(left.asDouble() <= right.asDouble());
    }  

    // if override
    
    public Value visitIf_stat(Fuleco_v3Parser.ComparacionContext ctx) {

        List<Fuleco_v3Parser.Condition_blockContext> conditions = ctx.condition_block();

        boolean evaluatedBlock = false;

        for(Fuleco_v3Parser.Condition_blockContext condition : conditions) {

            Value evaluated = this.visit(condition.expr());

            if(evaluated.asBoolean()) {
                evaluatedBlock = true;
                // evaluate this block whose expr==true
                this.visit(condition.stat_block());
                break;
            }
        }

        if(!evaluatedBlock && ctx.stat_block() != null) {
            // evaluate the else-stat_block (if present == not null)
            this.visit(ctx.stat_block());
        }

        return Value.VOID;
    }

    // while override
    public Value visitWhile_stat(Fuleco_v3Parser.CicloContext ctx) {

        Value value = this.visit(ctx.expr());

        while(value.asBoolean()) {

            // evaluate the code block
            this.visit(ctx.stat_block());

            // evaluate the expression
            value = this.visit(ctx.expr());
        }

        return Value.VOID;
    }

	public Value visit(ParseTree tree) {
		// TODO Auto-generated method stub
		return null;
	}

}
