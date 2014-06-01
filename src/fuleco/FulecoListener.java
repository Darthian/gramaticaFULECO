// Generated from /Users/ian/Documents/ANTLR/fuleco/Fuleco.g4 by ANTLR 4.1
package fuleco;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FulecoParser}.
 */
public interface FulecoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FulecoParser#asign}.
	 * @param ctx the parse tree
	 */
	void enterAsign(@NotNull FulecoParser.AsignContext ctx);
	/**
	 * Exit a parse tree produced by {@link FulecoParser#asign}.
	 * @param ctx the parse tree
	 */
	void exitAsign(@NotNull FulecoParser.AsignContext ctx);

	/**
	 * Enter a parse tree produced by {@link FulecoParser#impr}.
	 * @param ctx the parse tree
	 */
	void enterImpr(@NotNull FulecoParser.ImprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FulecoParser#impr}.
	 * @param ctx the parse tree
	 */
	void exitImpr(@NotNull FulecoParser.ImprContext ctx);

	/**
	 * Enter a parse tree produced by {@link FulecoParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComp(@NotNull FulecoParser.CompContext ctx);
	/**
	 * Exit a parse tree produced by {@link FulecoParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComp(@NotNull FulecoParser.CompContext ctx);

	/**
	 * Enter a parse tree produced by {@link FulecoParser#concaten}.
	 * @param ctx the parse tree
	 */
	void enterConcaten(@NotNull FulecoParser.ConcatenContext ctx);
	/**
	 * Exit a parse tree produced by {@link FulecoParser#concaten}.
	 * @param ctx the parse tree
	 */
	void exitConcaten(@NotNull FulecoParser.ConcatenContext ctx);

	/**
	 * Enter a parse tree produced by {@link FulecoParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(@NotNull FulecoParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FulecoParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(@NotNull FulecoParser.SentenciaContext ctx);

	/**
	 * Enter a parse tree produced by {@link FulecoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull FulecoParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FulecoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull FulecoParser.ExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link FulecoParser#declaraciones}.
	 * @param ctx the parse tree
	 */
	void enterDeclaraciones(@NotNull FulecoParser.DeclaracionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FulecoParser#declaraciones}.
	 * @param ctx the parse tree
	 */
	void exitDeclaraciones(@NotNull FulecoParser.DeclaracionesContext ctx);

	/**
	 * Enter a parse tree produced by {@link FulecoParser#sente}.
	 * @param ctx the parse tree
	 */
	void enterSente(@NotNull FulecoParser.SenteContext ctx);
	/**
	 * Exit a parse tree produced by {@link FulecoParser#sente}.
	 * @param ctx the parse tree
	 */
	void exitSente(@NotNull FulecoParser.SenteContext ctx);

	/**
	 * Enter a parse tree produced by {@link FulecoParser#elem}.
	 * @param ctx the parse tree
	 */
	void enterElem(@NotNull FulecoParser.ElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link FulecoParser#elem}.
	 * @param ctx the parse tree
	 */
	void exitElem(@NotNull FulecoParser.ElemContext ctx);

	/**
	 * Enter a parse tree produced by {@link FulecoParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(@NotNull FulecoParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FulecoParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(@NotNull FulecoParser.ProgramaContext ctx);

	/**
	 * Enter a parse tree produced by {@link FulecoParser#sentencias}.
	 * @param ctx the parse tree
	 */
	void enterSentencias(@NotNull FulecoParser.SentenciasContext ctx);
	/**
	 * Exit a parse tree produced by {@link FulecoParser#sentencias}.
	 * @param ctx the parse tree
	 */
	void exitSentencias(@NotNull FulecoParser.SentenciasContext ctx);

	/**
	 * Enter a parse tree produced by {@link FulecoParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(@NotNull FulecoParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link FulecoParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(@NotNull FulecoParser.TipoContext ctx);

	/**
	 * Enter a parse tree produced by {@link FulecoParser#operando}.
	 * @param ctx the parse tree
	 */
	void enterOperando(@NotNull FulecoParser.OperandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link FulecoParser#operando}.
	 * @param ctx the parse tree
	 */
	void exitOperando(@NotNull FulecoParser.OperandoContext ctx);

	/**
	 * Enter a parse tree produced by {@link FulecoParser#opera}.
	 * @param ctx the parse tree
	 */
	void enterOpera(@NotNull FulecoParser.OperaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FulecoParser#opera}.
	 * @param ctx the parse tree
	 */
	void exitOpera(@NotNull FulecoParser.OperaContext ctx);

	/**
	 * Enter a parse tree produced by {@link FulecoParser#ciclo}.
	 * @param ctx the parse tree
	 */
	void enterCiclo(@NotNull FulecoParser.CicloContext ctx);
	/**
	 * Exit a parse tree produced by {@link FulecoParser#ciclo}.
	 * @param ctx the parse tree
	 */
	void exitCiclo(@NotNull FulecoParser.CicloContext ctx);

	/**
	 * Enter a parse tree produced by {@link FulecoParser#comparacion}.
	 * @param ctx the parse tree
	 */
	void enterComparacion(@NotNull FulecoParser.ComparacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FulecoParser#comparacion}.
	 * @param ctx the parse tree
	 */
	void exitComparacion(@NotNull FulecoParser.ComparacionContext ctx);
}