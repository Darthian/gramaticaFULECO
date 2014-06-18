// Generated from /Users/ian/Documents/ANTLR/fuleco/Fuleco_v2.g4 by ANTLR 4.1
package fuleco;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Fuleco_v2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Fuleco_v2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Fuleco_v2Parser#booleano}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleano(@NotNull Fuleco_v2Parser.BooleanoContext ctx);

	/**
	 * Visit a parse tree produced by {@link Fuleco_v2Parser#asign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsign(@NotNull Fuleco_v2Parser.AsignContext ctx);

	/**
	 * Visit a parse tree produced by {@link Fuleco_v2Parser#impr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpr(@NotNull Fuleco_v2Parser.ImprContext ctx);

	/**
	 * Visit a parse tree produced by {@link Fuleco_v2Parser#termino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermino(@NotNull Fuleco_v2Parser.TerminoContext ctx);

	/**
	 * Visit a parse tree produced by {@link Fuleco_v2Parser#concaten}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcaten(@NotNull Fuleco_v2Parser.ConcatenContext ctx);

	/**
	 * Visit a parse tree produced by {@link Fuleco_v2Parser#opMul}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpMul(@NotNull Fuleco_v2Parser.OpMulContext ctx);

	/**
	 * Visit a parse tree produced by {@link Fuleco_v2Parser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(@NotNull Fuleco_v2Parser.SentenciaContext ctx);

	/**
	 * Visit a parse tree produced by {@link Fuleco_v2Parser#entero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntero(@NotNull Fuleco_v2Parser.EnteroContext ctx);

	/**
	 * Visit a parse tree produced by {@link Fuleco_v2Parser#opIgu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpIgu(@NotNull Fuleco_v2Parser.OpIguContext ctx);

	/**
	 * Visit a parse tree produced by {@link Fuleco_v2Parser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(@NotNull Fuleco_v2Parser.ExpresionContext ctx);

	/**
	 * Visit a parse tree produced by {@link Fuleco_v2Parser#declaraciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaraciones(@NotNull Fuleco_v2Parser.DeclaracionesContext ctx);

	/**
	 * Visit a parse tree produced by {@link Fuleco_v2Parser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(@NotNull Fuleco_v2Parser.ProgramaContext ctx);

	/**
	 * Visit a parse tree produced by {@link Fuleco_v2Parser#relacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelacion(@NotNull Fuleco_v2Parser.RelacionContext ctx);

	/**
	 * Visit a parse tree produced by {@link Fuleco_v2Parser#sentencias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencias(@NotNull Fuleco_v2Parser.SentenciasContext ctx);

	/**
	 * Visit a parse tree produced by {@link Fuleco_v2Parser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(@NotNull Fuleco_v2Parser.TipoContext ctx);

	/**
	 * Visit a parse tree produced by {@link Fuleco_v2Parser#adicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdicion(@NotNull Fuleco_v2Parser.AdicionContext ctx);

	/**
	 * Visit a parse tree produced by {@link Fuleco_v2Parser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(@NotNull Fuleco_v2Parser.BloqueContext ctx);

	/**
	 * Visit a parse tree produced by {@link Fuleco_v2Parser#comparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparacion(@NotNull Fuleco_v2Parser.ComparacionContext ctx);

	/**
	 * Visit a parse tree produced by {@link Fuleco_v2Parser#ciclo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclo(@NotNull Fuleco_v2Parser.CicloContext ctx);

	/**
	 * Visit a parse tree produced by {@link Fuleco_v2Parser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(@NotNull Fuleco_v2Parser.DeclaracionContext ctx);

	/**
	 * Visit a parse tree produced by {@link Fuleco_v2Parser#opSum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpSum(@NotNull Fuleco_v2Parser.OpSumContext ctx);

	/**
	 * Visit a parse tree produced by {@link Fuleco_v2Parser#opRel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpRel(@NotNull Fuleco_v2Parser.OpRelContext ctx);

	/**
	 * Visit a parse tree produced by {@link Fuleco_v2Parser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(@NotNull Fuleco_v2Parser.LiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link Fuleco_v2Parser#primario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimario(@NotNull Fuleco_v2Parser.PrimarioContext ctx);
}