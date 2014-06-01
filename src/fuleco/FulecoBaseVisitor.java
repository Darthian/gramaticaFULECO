// Generated from /Users/ian/Documents/ANTLR/fuleco/Fuleco.g4 by ANTLR 4.1
package fuleco;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link FulecoVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class FulecoBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements FulecoVisitor<T> {
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public T visitAsign(@NotNull FulecoParser.AsignContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public T visitImpr(@NotNull FulecoParser.ImprContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public T visitComp(@NotNull FulecoParser.CompContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public T visitConcaten(@NotNull FulecoParser.ConcatenContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public T visitSentencia(@NotNull FulecoParser.SentenciaContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public T visitExpr(@NotNull FulecoParser.ExprContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public T visitDeclaraciones(@NotNull FulecoParser.DeclaracionesContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public T visitSente(@NotNull FulecoParser.SenteContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public T visitElem(@NotNull FulecoParser.ElemContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public T visitPrograma(@NotNull FulecoParser.ProgramaContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public T visitSentencias(@NotNull FulecoParser.SentenciasContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public T visitTipo(@NotNull FulecoParser.TipoContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public T visitOperando(@NotNull FulecoParser.OperandoContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public T visitOpera(@NotNull FulecoParser.OperaContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public T visitCiclo(@NotNull FulecoParser.CicloContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public T visitComparacion(@NotNull FulecoParser.ComparacionContext ctx) { return visitChildren(ctx); }
}