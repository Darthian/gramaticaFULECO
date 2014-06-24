package fuleco;
// Generated from C:\Users\Alexandra\Desktop\proyecto de lenguajes\FULECO_V3\Fuleco_v3.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Fuleco_v3Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Fuleco_v3Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Fuleco_v3Parser#relacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelacion(@NotNull Fuleco_v3Parser.RelacionContext ctx);

	/**
	 * Visit a parse tree produced by {@link Fuleco_v3Parser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(@NotNull Fuleco_v3Parser.TipoContext ctx);

	/**
	 * Visit a parse tree produced by {@link Fuleco_v3Parser#concaten}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcaten(@NotNull Fuleco_v3Parser.ConcatenContext ctx);

	/**
	 * Visit a parse tree produced by {@link Fuleco_v3Parser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(@NotNull Fuleco_v3Parser.ProgramaContext ctx);

	/**
	 * Visit a parse tree produced by {@link Fuleco_v3Parser#entero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntero(@NotNull Fuleco_v3Parser.EnteroContext ctx);

	/**
	 * Visit a parse tree produced by {@link Fuleco_v3Parser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(@NotNull Fuleco_v3Parser.ParametrosContext ctx);

	/**
	 * Visit a parse tree produced by {@link Fuleco_v3Parser#clase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClase(@NotNull Fuleco_v3Parser.ClaseContext ctx);

	/**
	 * Visit a parse tree produced by {@link Fuleco_v3Parser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(@NotNull Fuleco_v3Parser.LiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link Fuleco_v3Parser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(@NotNull Fuleco_v3Parser.ExpresionContext ctx);

	/**
	 * Visit a parse tree produced by {@link Fuleco_v3Parser#asign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsign(@NotNull Fuleco_v3Parser.AsignContext ctx);

	/**
	 * Visit a parse tree produced by {@link Fuleco_v3Parser#declaraciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaraciones(@NotNull Fuleco_v3Parser.DeclaracionesContext ctx);

	/**
	 * Visit a parse tree produced by {@link Fuleco_v3Parser#booleano}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleano(@NotNull Fuleco_v3Parser.BooleanoContext ctx);

	/**
	 * Visit a parse tree produced by {@link Fuleco_v3Parser#impr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpr(@NotNull Fuleco_v3Parser.ImprContext ctx);

	/**
	 * Visit a parse tree produced by {@link Fuleco_v3Parser#primario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimario(@NotNull Fuleco_v3Parser.PrimarioContext ctx);

	/**
	 * Visit a parse tree produced by {@link Fuleco_v3Parser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(@NotNull Fuleco_v3Parser.FuncionContext ctx);

	/**
	 * Visit a parse tree produced by {@link Fuleco_v3Parser#termino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermino(@NotNull Fuleco_v3Parser.TerminoContext ctx);

	/**
	 * Visit a parse tree produced by {@link Fuleco_v3Parser#comparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparacion(@NotNull Fuleco_v3Parser.ComparacionContext ctx);

	/**
	 * Visit a parse tree produced by {@link Fuleco_v3Parser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(@NotNull Fuleco_v3Parser.BloqueContext ctx);

	/**
	 * Visit a parse tree produced by {@link Fuleco_v3Parser#llamarFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamarFunc(@NotNull Fuleco_v3Parser.LlamarFuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link Fuleco_v3Parser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(@NotNull Fuleco_v3Parser.DeclaracionContext ctx);

	/**
	 * Visit a parse tree produced by {@link Fuleco_v3Parser#ciclo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclo(@NotNull Fuleco_v3Parser.CicloContext ctx);

	/**
	 * Visit a parse tree produced by {@link Fuleco_v3Parser#opIgu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpIgu(@NotNull Fuleco_v3Parser.OpIguContext ctx);

	/**
	 * Visit a parse tree produced by {@link Fuleco_v3Parser#opRel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpRel(@NotNull Fuleco_v3Parser.OpRelContext ctx);

	/**
	 * Visit a parse tree produced by {@link Fuleco_v3Parser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(@NotNull Fuleco_v3Parser.SentenciaContext ctx);

	/**
	 * Visit a parse tree produced by {@link Fuleco_v3Parser#opMul}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpMul(@NotNull Fuleco_v3Parser.OpMulContext ctx);

	/**
	 * Visit a parse tree produced by {@link Fuleco_v3Parser#opSum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpSum(@NotNull Fuleco_v3Parser.OpSumContext ctx);

	/**
	 * Visit a parse tree produced by {@link Fuleco_v3Parser#adicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdicion(@NotNull Fuleco_v3Parser.AdicionContext ctx);

	/**
	 * Visit a parse tree produced by {@link Fuleco_v3Parser#sentencias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencias(@NotNull Fuleco_v3Parser.SentenciasContext ctx);
}