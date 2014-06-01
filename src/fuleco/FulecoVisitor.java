// Generated from /Users/ian/Documents/ANTLR/fuleco/Fuleco.g4 by ANTLR 4.1
package fuleco;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FulecoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FulecoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FulecoParser#asign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsign(@NotNull FulecoParser.AsignContext ctx);

	/**
	 * Visit a parse tree produced by {@link FulecoParser#impr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpr(@NotNull FulecoParser.ImprContext ctx);

	/**
	 * Visit a parse tree produced by {@link FulecoParser#comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp(@NotNull FulecoParser.CompContext ctx);

	/**
	 * Visit a parse tree produced by {@link FulecoParser#concaten}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcaten(@NotNull FulecoParser.ConcatenContext ctx);

	/**
	 * Visit a parse tree produced by {@link FulecoParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(@NotNull FulecoParser.SentenciaContext ctx);

	/**
	 * Visit a parse tree produced by {@link FulecoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(@NotNull FulecoParser.ExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link FulecoParser#declaraciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaraciones(@NotNull FulecoParser.DeclaracionesContext ctx);

	/**
	 * Visit a parse tree produced by {@link FulecoParser#sente}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSente(@NotNull FulecoParser.SenteContext ctx);

	/**
	 * Visit a parse tree produced by {@link FulecoParser#elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElem(@NotNull FulecoParser.ElemContext ctx);

	/**
	 * Visit a parse tree produced by {@link FulecoParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(@NotNull FulecoParser.ProgramaContext ctx);

	/**
	 * Visit a parse tree produced by {@link FulecoParser#sentencias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencias(@NotNull FulecoParser.SentenciasContext ctx);

	/**
	 * Visit a parse tree produced by {@link FulecoParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(@NotNull FulecoParser.TipoContext ctx);

	/**
	 * Visit a parse tree produced by {@link FulecoParser#operando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperando(@NotNull FulecoParser.OperandoContext ctx);

	/**
	 * Visit a parse tree produced by {@link FulecoParser#opera}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpera(@NotNull FulecoParser.OperaContext ctx);

	/**
	 * Visit a parse tree produced by {@link FulecoParser#ciclo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclo(@NotNull FulecoParser.CicloContext ctx);

	/**
	 * Visit a parse tree produced by {@link FulecoParser#comparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparacion(@NotNull FulecoParser.ComparacionContext ctx);
}