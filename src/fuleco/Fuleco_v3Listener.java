package fuleco;
// Generated from C:\Users\Alexandra\Desktop\proyecto de lenguajes\FULECO_V3\Fuleco_v3.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Fuleco_v3Parser}.
 */
public interface Fuleco_v3Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Fuleco_v3Parser#relacion}.
	 * @param ctx the parse tree
	 */
	void enterRelacion(@NotNull Fuleco_v3Parser.RelacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Fuleco_v3Parser#relacion}.
	 * @param ctx the parse tree
	 */
	void exitRelacion(@NotNull Fuleco_v3Parser.RelacionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Fuleco_v3Parser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(@NotNull Fuleco_v3Parser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Fuleco_v3Parser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(@NotNull Fuleco_v3Parser.TipoContext ctx);

	/**
	 * Enter a parse tree produced by {@link Fuleco_v3Parser#concaten}.
	 * @param ctx the parse tree
	 */
	void enterConcaten(@NotNull Fuleco_v3Parser.ConcatenContext ctx);
	/**
	 * Exit a parse tree produced by {@link Fuleco_v3Parser#concaten}.
	 * @param ctx the parse tree
	 */
	void exitConcaten(@NotNull Fuleco_v3Parser.ConcatenContext ctx);

	/**
	 * Enter a parse tree produced by {@link Fuleco_v3Parser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(@NotNull Fuleco_v3Parser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Fuleco_v3Parser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(@NotNull Fuleco_v3Parser.ProgramaContext ctx);

	/**
	 * Enter a parse tree produced by {@link Fuleco_v3Parser#entero}.
	 * @param ctx the parse tree
	 */
	void enterEntero(@NotNull Fuleco_v3Parser.EnteroContext ctx);
	/**
	 * Exit a parse tree produced by {@link Fuleco_v3Parser#entero}.
	 * @param ctx the parse tree
	 */
	void exitEntero(@NotNull Fuleco_v3Parser.EnteroContext ctx);

	/**
	 * Enter a parse tree produced by {@link Fuleco_v3Parser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(@NotNull Fuleco_v3Parser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link Fuleco_v3Parser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(@NotNull Fuleco_v3Parser.ParametrosContext ctx);

	/**
	 * Enter a parse tree produced by {@link Fuleco_v3Parser#clase}.
	 * @param ctx the parse tree
	 */
	void enterClase(@NotNull Fuleco_v3Parser.ClaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Fuleco_v3Parser#clase}.
	 * @param ctx the parse tree
	 */
	void exitClase(@NotNull Fuleco_v3Parser.ClaseContext ctx);

	/**
	 * Enter a parse tree produced by {@link Fuleco_v3Parser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull Fuleco_v3Parser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Fuleco_v3Parser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull Fuleco_v3Parser.LiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link Fuleco_v3Parser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(@NotNull Fuleco_v3Parser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Fuleco_v3Parser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(@NotNull Fuleco_v3Parser.ExpresionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Fuleco_v3Parser#asign}.
	 * @param ctx the parse tree
	 */
	void enterAsign(@NotNull Fuleco_v3Parser.AsignContext ctx);
	/**
	 * Exit a parse tree produced by {@link Fuleco_v3Parser#asign}.
	 * @param ctx the parse tree
	 */
	void exitAsign(@NotNull Fuleco_v3Parser.AsignContext ctx);

	/**
	 * Enter a parse tree produced by {@link Fuleco_v3Parser#declaraciones}.
	 * @param ctx the parse tree
	 */
	void enterDeclaraciones(@NotNull Fuleco_v3Parser.DeclaracionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Fuleco_v3Parser#declaraciones}.
	 * @param ctx the parse tree
	 */
	void exitDeclaraciones(@NotNull Fuleco_v3Parser.DeclaracionesContext ctx);

	/**
	 * Enter a parse tree produced by {@link Fuleco_v3Parser#booleano}.
	 * @param ctx the parse tree
	 */
	void enterBooleano(@NotNull Fuleco_v3Parser.BooleanoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Fuleco_v3Parser#booleano}.
	 * @param ctx the parse tree
	 */
	void exitBooleano(@NotNull Fuleco_v3Parser.BooleanoContext ctx);

	/**
	 * Enter a parse tree produced by {@link Fuleco_v3Parser#impr}.
	 * @param ctx the parse tree
	 */
	void enterImpr(@NotNull Fuleco_v3Parser.ImprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Fuleco_v3Parser#impr}.
	 * @param ctx the parse tree
	 */
	void exitImpr(@NotNull Fuleco_v3Parser.ImprContext ctx);

	/**
	 * Enter a parse tree produced by {@link Fuleco_v3Parser#primario}.
	 * @param ctx the parse tree
	 */
	void enterPrimario(@NotNull Fuleco_v3Parser.PrimarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link Fuleco_v3Parser#primario}.
	 * @param ctx the parse tree
	 */
	void exitPrimario(@NotNull Fuleco_v3Parser.PrimarioContext ctx);

	/**
	 * Enter a parse tree produced by {@link Fuleco_v3Parser#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(@NotNull Fuleco_v3Parser.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Fuleco_v3Parser#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(@NotNull Fuleco_v3Parser.FuncionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Fuleco_v3Parser#termino}.
	 * @param ctx the parse tree
	 */
	void enterTermino(@NotNull Fuleco_v3Parser.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Fuleco_v3Parser#termino}.
	 * @param ctx the parse tree
	 */
	void exitTermino(@NotNull Fuleco_v3Parser.TerminoContext ctx);

	/**
	 * Enter a parse tree produced by {@link Fuleco_v3Parser#comparacion}.
	 * @param ctx the parse tree
	 */
	void enterComparacion(@NotNull Fuleco_v3Parser.ComparacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Fuleco_v3Parser#comparacion}.
	 * @param ctx the parse tree
	 */
	void exitComparacion(@NotNull Fuleco_v3Parser.ComparacionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Fuleco_v3Parser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(@NotNull Fuleco_v3Parser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Fuleco_v3Parser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(@NotNull Fuleco_v3Parser.BloqueContext ctx);

	/**
	 * Enter a parse tree produced by {@link Fuleco_v3Parser#llamarFunc}.
	 * @param ctx the parse tree
	 */
	void enterLlamarFunc(@NotNull Fuleco_v3Parser.LlamarFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link Fuleco_v3Parser#llamarFunc}.
	 * @param ctx the parse tree
	 */
	void exitLlamarFunc(@NotNull Fuleco_v3Parser.LlamarFuncContext ctx);

	/**
	 * Enter a parse tree produced by {@link Fuleco_v3Parser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(@NotNull Fuleco_v3Parser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Fuleco_v3Parser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(@NotNull Fuleco_v3Parser.DeclaracionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Fuleco_v3Parser#ciclo}.
	 * @param ctx the parse tree
	 */
	void enterCiclo(@NotNull Fuleco_v3Parser.CicloContext ctx);
	/**
	 * Exit a parse tree produced by {@link Fuleco_v3Parser#ciclo}.
	 * @param ctx the parse tree
	 */
	void exitCiclo(@NotNull Fuleco_v3Parser.CicloContext ctx);

	/**
	 * Enter a parse tree produced by {@link Fuleco_v3Parser#opIgu}.
	 * @param ctx the parse tree
	 */
	void enterOpIgu(@NotNull Fuleco_v3Parser.OpIguContext ctx);
	/**
	 * Exit a parse tree produced by {@link Fuleco_v3Parser#opIgu}.
	 * @param ctx the parse tree
	 */
	void exitOpIgu(@NotNull Fuleco_v3Parser.OpIguContext ctx);

	/**
	 * Enter a parse tree produced by {@link Fuleco_v3Parser#opRel}.
	 * @param ctx the parse tree
	 */
	void enterOpRel(@NotNull Fuleco_v3Parser.OpRelContext ctx);
	/**
	 * Exit a parse tree produced by {@link Fuleco_v3Parser#opRel}.
	 * @param ctx the parse tree
	 */
	void exitOpRel(@NotNull Fuleco_v3Parser.OpRelContext ctx);

	/**
	 * Enter a parse tree produced by {@link Fuleco_v3Parser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(@NotNull Fuleco_v3Parser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Fuleco_v3Parser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(@NotNull Fuleco_v3Parser.SentenciaContext ctx);

	/**
	 * Enter a parse tree produced by {@link Fuleco_v3Parser#opMul}.
	 * @param ctx the parse tree
	 */
	void enterOpMul(@NotNull Fuleco_v3Parser.OpMulContext ctx);
	/**
	 * Exit a parse tree produced by {@link Fuleco_v3Parser#opMul}.
	 * @param ctx the parse tree
	 */
	void exitOpMul(@NotNull Fuleco_v3Parser.OpMulContext ctx);

	/**
	 * Enter a parse tree produced by {@link Fuleco_v3Parser#opSum}.
	 * @param ctx the parse tree
	 */
	void enterOpSum(@NotNull Fuleco_v3Parser.OpSumContext ctx);
	/**
	 * Exit a parse tree produced by {@link Fuleco_v3Parser#opSum}.
	 * @param ctx the parse tree
	 */
	void exitOpSum(@NotNull Fuleco_v3Parser.OpSumContext ctx);

	/**
	 * Enter a parse tree produced by {@link Fuleco_v3Parser#adicion}.
	 * @param ctx the parse tree
	 */
	void enterAdicion(@NotNull Fuleco_v3Parser.AdicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Fuleco_v3Parser#adicion}.
	 * @param ctx the parse tree
	 */
	void exitAdicion(@NotNull Fuleco_v3Parser.AdicionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Fuleco_v3Parser#sentencias}.
	 * @param ctx the parse tree
	 */
	void enterSentencias(@NotNull Fuleco_v3Parser.SentenciasContext ctx);
	/**
	 * Exit a parse tree produced by {@link Fuleco_v3Parser#sentencias}.
	 * @param ctx the parse tree
	 */
	void exitSentencias(@NotNull Fuleco_v3Parser.SentenciasContext ctx);
}