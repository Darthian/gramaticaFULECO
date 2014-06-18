package fuleco;

import java.util.*;

public class EvalVisitor extends Fuleco_v2BaseVisitor<Value>{
	
	 // used to compare floating point numbers
    public static final double SMALL_VALUE = 0.00000000001;

    // store variables (there's only one global scope!)
    private Map<String, Value> memory = new HashMap<String, Value>();

    // assignment/id overrides
    @Override
    public Value visitAssignment(Fuleco_v2Parser.AssignmentContext ctx) {
        String id = ctx.ID().getText();
        Value value = this.visit(ctx.expr());
        return memory.put(id, value);
    }

    @Override
    public Value visitIdAtom(Fuleco_v2Parser.IdAtomContext ctx) {
        String id = ctx.getText();
        Value value = memory.get(id);
        if(value == null) {
            throw new RuntimeException("no such variable: " + id);
        }
        return value;
    }

    // atom overrides
    @Override
    public Value visitStringAtom(Fuleco_v2Parser.StringAtomContext ctx) {
        String str = ctx.getText();
        // strip quotes
        str = str.substring(1, str.length() - 1).replace("\"\"", "\"");
        return new Value(str);
    }

    @Override
    public Value visitNumberAtom(Fuleco_v2Parser.NumberAtomContext ctx) {
        return new Value(Double.valueOf(ctx.getText()));
    }

    @Override
    public Value visitBooleanAtom(Fuleco_v2Parser.BooleanAtomContext ctx) {
        return new Value(Boolean.valueOf(ctx.getText()));
    }

    @Override
    public Value visitNilAtom(Fuleco_v2Parser.NilAtomContext ctx) {
        return new Value(null);
    }

    // expr overrides
    @Override
    public Value visitParExpr(Fuleco_v2Parser.ParExprContext ctx) {
        return this.visit(ctx.expr());
    }

   

    @Override
    public Value visitUnaryMinusExpr(Fuleco_v2Parser.UnaryMinusExprContext ctx) {
        Value value = this.visit(ctx.expr());
        return new Value(-value.asDouble());
    }

    @Override
    public Value visitNotExpr(Fuleco_v2Parser.NotExprContext ctx) {
        Value value = this.visit(ctx.expr());
        return new Value(!value.asBoolean());
    }

  

    @Override
    public Value visitModExpr(Fuleco_v2Parser.ModExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(left.asDouble() % right.asDouble());
    }


    @Override
    public Value visitMinusExpr(Fuleco_v2Parser.MinusExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(left.asDouble() - right.asDouble());
    }

    @Override
    public Value visitLtExpr(Fuleco_v2Parser.LtExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(left.asDouble() < right.asDouble());
    }

    @Override
    public Value visitLteqExpr(Fuleco_v2Parser.LteqExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(left.asDouble() <= right.asDouble());
    }  

    // if override
    
    public Value visitIf_stat(Fuleco_v2Parser.ComparacionContext ctx) {

        List<Fuleco_v2Parser.Condition_blockContext> conditions = ctx.condition_block();

        boolean evaluatedBlock = false;

        for(Fuleco_v2Parser.Condition_blockContext condition : conditions) {

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
    public Value visitWhile_stat(Fuleco_v2Parser.CicloContext ctx) {

        Value value = this.visit(ctx.expr());

        while(value.asBoolean()) {

            // evaluate the code block
            this.visit(ctx.stat_block());

            // evaluate the expression
            value = this.visit(ctx.expr());
        }

        return Value.VOID;
    }

}
