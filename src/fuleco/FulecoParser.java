// Generated from /Users/ian/Documents/ANTLR/fuleco/Fuleco.g4 by ANTLR 4.1
package fuleco;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FulecoParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		GAMBETEAR=1, PATEAR=2, PITAR=3, MOSTRAR_MARCADOR=4, SAQUE_INICIAL=5, GOL=6, 
		AUTOGOL=7, ARBITRO=8, SOBORNO=9, TIEMPO_ADICIONAL=10, QUEMAR_TIEMPO=11, 
		LESIONAR=12, ANIMAR=13, CARA=14, SELLO=15, EMPATE=16, PENALTY=17, BRASILERO=18, 
		ALEMAN=19, COMILLAS=20, PARENTESIS_IZQ=21, PARENTESIS_DER=22, CONCATENAR=23, 
		FIN_LINEA=24, WS=25, CADENA=26, NUMEROS=27, VARIABLE=28, DIGITOS=29, LETRA=30;
	public static final String[] tokenNames = {
		"<INVALID>", "'GAMBETEAR'", "'(>_<)'", "'(>o<)'", "'MOSTRAR_MARCADOR'", 
		"'SAQUE_INICIAL'", "'GOL'", "'AUTOGOL'", "'ARBITRO'", "'SOBORNO'", "'TIEMPO_ADICIONAL'", 
		"'QUEMAR_TIEMPO'", "'LESIONAR'", "'ANIMAR'", "'CARA'", "'SELLO'", "'EMPATE'", 
		"'PENALTY'", "'BRASILERO'", "'ALEMAN'", "'\"'", "'('", "')'", "'+'", "'!'", 
		"WS", "CADENA", "NUMEROS", "VARIABLE", "DIGITOS", "LETRA"
	};
	public static final int
		RULE_programa = 0, RULE_declaraciones = 1, RULE_tipo = 2, RULE_sentencias = 3, 
		RULE_sentencia = 4, RULE_ciclo = 5, RULE_expr = 6, RULE_sente = 7, RULE_asign = 8, 
		RULE_comparacion = 9, RULE_comp = 10, RULE_operando = 11, RULE_opera = 12, 
		RULE_elem = 13, RULE_concaten = 14, RULE_impr = 15;
	public static final String[] ruleNames = {
		"programa", "declaraciones", "tipo", "sentencias", "sentencia", "ciclo", 
		"expr", "sente", "asign", "comparacion", "comp", "operando", "opera", 
		"elem", "concaten", "impr"
	};

	@Override
	public String getGrammarFileName() { return "Fuleco.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public FulecoParser(TokenStream input) {
		super(input);
//		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
		_interp = new ParserATNSimulator(this,_ATN);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode PARENTESIS_IZQ() { return getToken(FulecoParser.PARENTESIS_IZQ, 0); }
		public DeclaracionesContext declaraciones(int i) {
			return getRuleContext(DeclaracionesContext.class,i);
		}
		public TerminalNode SAQUE_INICIAL() { return getToken(FulecoParser.SAQUE_INICIAL, 0); }
		public List<DeclaracionesContext> declaraciones() {
			return (List<DeclaracionesContext>) getRuleContexts(DeclaracionesContext.class);
		}
		public TerminalNode PATEAR() { return getToken(FulecoParser.PATEAR, 0); }
		public List<SentenciasContext> sentencias() {
			return (List<SentenciasContext>) getRuleContexts(SentenciasContext.class);
		}
		public TerminalNode PARENTESIS_DER() { return getToken(FulecoParser.PARENTESIS_DER, 0); }
		public TerminalNode BRASILERO() { return getToken(FulecoParser.BRASILERO, 0); }
		public SentenciasContext sentencias(int i) {
			return getRuleContext(SentenciasContext.class,i);
		}
		public TerminalNode PITAR() { return getToken(FulecoParser.PITAR, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FulecoListener ) ((FulecoListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FulecoListener ) ((FulecoListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FulecoVisitor ) return ((FulecoVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32); match(BRASILERO);
			setState(33); match(SAQUE_INICIAL);
			setState(34); match(PARENTESIS_IZQ);
			setState(35); match(PARENTESIS_DER);
			setState(36); match(PATEAR);
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BRASILERO || _la==ALEMAN) {
				{
				{
				setState(37); declaraciones();
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(43); sentencias();
				}
				}
				setState(46); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PATEAR );
			setState(48); match(PITAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracionesContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(FulecoParser.VARIABLE, 0); }
		public TerminalNode FIN_LINEA() { return getToken(FulecoParser.FIN_LINEA, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public DeclaracionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaraciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FulecoListener ) ((FulecoListener)listener).enterDeclaraciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FulecoListener ) ((FulecoListener)listener).exitDeclaraciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FulecoVisitor ) return ((FulecoVisitor<? extends T>)visitor).visitDeclaraciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionesContext declaraciones() throws RecognitionException {
		DeclaracionesContext _localctx = new DeclaracionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaraciones);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50); tipo();
			setState(51); match(VARIABLE);
			setState(52); match(FIN_LINEA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode ALEMAN() { return getToken(FulecoParser.ALEMAN, 0); }
		public TerminalNode BRASILERO() { return getToken(FulecoParser.BRASILERO, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FulecoListener ) ((FulecoListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FulecoListener ) ((FulecoListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FulecoVisitor ) return ((FulecoVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_la = _input.LA(1);
			if ( !(_la==BRASILERO || _la==ALEMAN) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentenciasContext extends ParserRuleContext {
		public TerminalNode PATEAR() { return getToken(FulecoParser.PATEAR, 0); }
		public SentenciaContext sentencia() {
			return getRuleContext(SentenciaContext.class,0);
		}
		public TerminalNode PITAR() { return getToken(FulecoParser.PITAR, 0); }
		public SentenciasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FulecoListener ) ((FulecoListener)listener).enterSentencias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FulecoListener ) ((FulecoListener)listener).exitSentencias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FulecoVisitor ) return ((FulecoVisitor<? extends T>)visitor).visitSentencias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciasContext sentencias() throws RecognitionException {
		SentenciasContext _localctx = new SentenciasContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sentencias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56); match(PATEAR);
			setState(57); sentencia();
			setState(58); match(PITAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentenciaContext extends ParserRuleContext {
		public CicloContext ciclo() {
			return getRuleContext(CicloContext.class,0);
		}
		public List<ExprContext> expr() {
			return (List<ExprContext>) getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FulecoListener ) ((FulecoListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FulecoListener ) ((FulecoListener)listener).exitSentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FulecoVisitor ) return ((FulecoVisitor<? extends T>)visitor).visitSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sentencia);
		int _la;
		try {
			setState(66);
			switch (_input.LA(1)) {
			case GAMBETEAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(60); ciclo();
				}
				break;
			case MOSTRAR_MARCADOR:
			case ARBITRO:
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(62); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(61); expr();
					}
					}
					setState(64); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MOSTRAR_MARCADOR) | (1L << ARBITRO) | (1L << VARIABLE))) != 0) );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CicloContext extends ParserRuleContext {
		public TerminalNode PARENTESIS_IZQ() { return getToken(FulecoParser.PARENTESIS_IZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SentenciasContext sentencias() {
			return getRuleContext(SentenciasContext.class,0);
		}
		public TerminalNode PARENTESIS_DER() { return getToken(FulecoParser.PARENTESIS_DER, 0); }
		public TerminalNode GAMBETEAR() { return getToken(FulecoParser.GAMBETEAR, 0); }
		public CicloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FulecoListener ) ((FulecoListener)listener).enterCiclo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FulecoListener ) ((FulecoListener)listener).exitCiclo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FulecoVisitor ) return ((FulecoVisitor<? extends T>)visitor).visitCiclo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CicloContext ciclo() throws RecognitionException {
		CicloContext _localctx = new CicloContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ciclo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68); match(GAMBETEAR);
			setState(69); match(PARENTESIS_IZQ);
			setState(70); expr();
			setState(71); match(PARENTESIS_DER);
			setState(72); sentencias();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public SenteContext sente() {
			return getRuleContext(SenteContext.class,0);
		}
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FulecoListener ) ((FulecoListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FulecoListener ) ((FulecoListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FulecoVisitor ) return ((FulecoVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expr);
		try {
			setState(76);
			switch (_input.LA(1)) {
			case ARBITRO:
				enterOuterAlt(_localctx, 1);
				{
				setState(74); comparacion();
				}
				break;
			case MOSTRAR_MARCADOR:
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(75); sente();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SenteContext extends ParserRuleContext {
		public AsignContext asign() {
			return getRuleContext(AsignContext.class,0);
		}
		public TerminalNode FIN_LINEA() { return getToken(FulecoParser.FIN_LINEA, 0); }
		public ImprContext impr() {
			return getRuleContext(ImprContext.class,0);
		}
		public SenteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sente; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FulecoListener ) ((FulecoListener)listener).enterSente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FulecoListener ) ((FulecoListener)listener).exitSente(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FulecoVisitor ) return ((FulecoVisitor<? extends T>)visitor).visitSente(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SenteContext sente() throws RecognitionException {
		SenteContext _localctx = new SenteContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sente);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			switch (_input.LA(1)) {
			case VARIABLE:
				{
				setState(78); asign();
				}
				break;
			case MOSTRAR_MARCADOR:
				{
				setState(79); impr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(82); match(FIN_LINEA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsignContext extends ParserRuleContext {
		public ElemContext elem() {
			return getRuleContext(ElemContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(FulecoParser.VARIABLE, 0); }
		public TerminalNode EMPATE() { return getToken(FulecoParser.EMPATE, 0); }
		public AsignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FulecoListener ) ((FulecoListener)listener).enterAsign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FulecoListener ) ((FulecoListener)listener).exitAsign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FulecoVisitor ) return ((FulecoVisitor<? extends T>)visitor).visitAsign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignContext asign() throws RecognitionException {
		AsignContext _localctx = new AsignContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_asign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84); match(VARIABLE);
			setState(85); match(EMPATE);
			setState(86); elem();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparacionContext extends ParserRuleContext {
		public TerminalNode PARENTESIS_IZQ() { return getToken(FulecoParser.PARENTESIS_IZQ, 0); }
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public TerminalNode ARBITRO() { return getToken(FulecoParser.ARBITRO, 0); }
		public TerminalNode SOBORNO() { return getToken(FulecoParser.SOBORNO, 0); }
		public List<SentenciasContext> sentencias() {
			return (List<SentenciasContext>) getRuleContexts(SentenciasContext.class);
		}
		public TerminalNode PARENTESIS_DER() { return getToken(FulecoParser.PARENTESIS_DER, 0); }
		public SentenciasContext sentencias(int i) {
			return getRuleContext(SentenciasContext.class,i);
		}
		public ComparacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FulecoListener ) ((FulecoListener)listener).enterComparacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FulecoListener ) ((FulecoListener)listener).exitComparacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FulecoVisitor ) return ((FulecoVisitor<? extends T>)visitor).visitComparacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparacionContext comparacion() throws RecognitionException {
		ComparacionContext _localctx = new ComparacionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comparacion);
		try {
			setState(102);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88); match(ARBITRO);
				setState(89); match(PARENTESIS_IZQ);
				setState(90); comp();
				setState(91); match(PARENTESIS_DER);
				setState(92); sentencias();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94); match(ARBITRO);
				setState(95); match(PARENTESIS_IZQ);
				setState(96); comp();
				setState(97); match(PARENTESIS_DER);
				setState(98); sentencias();
				setState(99); match(SOBORNO);
				setState(100); sentencias();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompContext extends ParserRuleContext {
		public TerminalNode CARA() { return getToken(FulecoParser.CARA, 0); }
		public List<OperandoContext> operando() {
			return (List<OperandoContext>) getRuleContexts(OperandoContext.class);
		}
		public TerminalNode PENALTY() { return getToken(FulecoParser.PENALTY, 0); }
		public OperandoContext operando(int i) {
			return getRuleContext(OperandoContext.class,i);
		}
		public TerminalNode SELLO() { return getToken(FulecoParser.SELLO, 0); }
		public CompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FulecoListener ) ((FulecoListener)listener).enterComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FulecoListener ) ((FulecoListener)listener).exitComp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FulecoVisitor ) return ((FulecoVisitor<? extends T>)visitor).visitComp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompContext comp() throws RecognitionException {
		CompContext _localctx = new CompContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comp);
		try {
			setState(116);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104); operando();
				setState(105); match(CARA);
				setState(106); operando();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108); operando();
				setState(109); match(SELLO);
				setState(110); operando();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(112); operando();
				setState(113); match(PENALTY);
				setState(114); operando();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperandoContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(FulecoParser.VARIABLE, 0); }
		public TerminalNode NUMEROS() { return getToken(FulecoParser.NUMEROS, 0); }
		public OperandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FulecoListener ) ((FulecoListener)listener).enterOperando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FulecoListener ) ((FulecoListener)listener).exitOperando(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FulecoVisitor ) return ((FulecoVisitor<? extends T>)visitor).visitOperando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandoContext operando() throws RecognitionException {
		OperandoContext _localctx = new OperandoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_operando);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_la = _input.LA(1);
			if ( !(_la==NUMEROS || _la==VARIABLE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperaContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(FulecoParser.VARIABLE, 0); }
		public TerminalNode NUMEROS() { return getToken(FulecoParser.NUMEROS, 0); }
		public TerminalNode QUEMAR_TIEMPO() { return getToken(FulecoParser.QUEMAR_TIEMPO, 0); }
		public OperaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opera; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FulecoListener ) ((FulecoListener)listener).enterOpera(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FulecoListener ) ((FulecoListener)listener).exitOpera(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FulecoVisitor ) return ((FulecoVisitor<? extends T>)visitor).visitOpera(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperaContext opera() throws RecognitionException {
		OperaContext _localctx = new OperaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_opera);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120); match(VARIABLE);
			setState(121); match(QUEMAR_TIEMPO);
			setState(122); match(NUMEROS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElemContext extends ParserRuleContext {
		public OperaContext opera() {
			return getRuleContext(OperaContext.class,0);
		}
		public TerminalNode NUMEROS() { return getToken(FulecoParser.NUMEROS, 0); }
		public ElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FulecoListener ) ((FulecoListener)listener).enterElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FulecoListener ) ((FulecoListener)listener).exitElem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FulecoVisitor ) return ((FulecoVisitor<? extends T>)visitor).visitElem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElemContext elem() throws RecognitionException {
		ElemContext _localctx = new ElemContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_elem);
		try {
			setState(126);
			switch (_input.LA(1)) {
			case NUMEROS:
				enterOuterAlt(_localctx, 1);
				{
				setState(124); match(NUMEROS);
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(125); opera();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConcatenContext extends ParserRuleContext {
		public List<TerminalNode> VARIABLE() { return (List<TerminalNode>) getTokens(FulecoParser.VARIABLE); }
		public List<TerminalNode> CADENA() { return (List<TerminalNode>) getTokens(FulecoParser.CADENA); }
		public TerminalNode CONCATENAR(int i) {
			return getToken(FulecoParser.CONCATENAR, i);
		}
		public TerminalNode CADENA(int i) {
			return getToken(FulecoParser.CADENA, i);
		}
		public TerminalNode VARIABLE(int i) {
			return getToken(FulecoParser.VARIABLE, i);
		}
		public List<TerminalNode> CONCATENAR() { return (List<TerminalNode>) getTokens(FulecoParser.CONCATENAR); }
		public ConcatenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concaten; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FulecoListener ) ((FulecoListener)listener).enterConcaten(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FulecoListener ) ((FulecoListener)listener).exitConcaten(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FulecoVisitor ) return ((FulecoVisitor<? extends T>)visitor).visitConcaten(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConcatenContext concaten() throws RecognitionException {
		ConcatenContext _localctx = new ConcatenContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_concaten);
		int _la;
		try {
			setState(137);
			switch (_input.LA(1)) {
			case CADENA:
				enterOuterAlt(_localctx, 1);
				{
				setState(128); match(CADENA);
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(129); match(VARIABLE);
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CONCATENAR) {
					{
					{
					setState(130); match(CONCATENAR);
					setState(131);
					_la = _input.LA(1);
					if ( !(_la==CADENA || _la==VARIABLE) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImprContext extends ParserRuleContext {
		public TerminalNode PARENTESIS_IZQ() { return getToken(FulecoParser.PARENTESIS_IZQ, 0); }
		public List<ConcatenContext> concaten() {
			return (List<ConcatenContext>) getRuleContexts(ConcatenContext.class);
		}
		public TerminalNode MOSTRAR_MARCADOR() { return getToken(FulecoParser.MOSTRAR_MARCADOR, 0); }
		public ConcatenContext concaten(int i) {
			return getRuleContext(ConcatenContext.class,i);
		}
		public TerminalNode PARENTESIS_DER() { return getToken(FulecoParser.PARENTESIS_DER, 0); }
		public ImprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FulecoListener ) ((FulecoListener)listener).enterImpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FulecoListener ) ((FulecoListener)listener).exitImpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FulecoVisitor ) return ((FulecoVisitor<? extends T>)visitor).visitImpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImprContext impr() throws RecognitionException {
		ImprContext _localctx = new ImprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_impr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139); match(MOSTRAR_MARCADOR);
			setState(140); match(PARENTESIS_IZQ);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CADENA || _la==VARIABLE) {
				{
				{
				setState(141); concaten();
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(147); match(PARENTESIS_DER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3 \u0098\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\7\2)\n\2\f\2\16\2,\13\2\3\2\6\2/\n\2\r\2\16\2\60\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\6\6A\n\6\r\6\16\6B"+
		"\5\6E\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\5\bO\n\b\3\t\3\t\5\tS\n\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\5\13i\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\5\fw\n\f\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\5\17\u0081"+
		"\n\17\3\20\3\20\3\20\3\20\7\20\u0087\n\20\f\20\16\20\u008a\13\20\5\20"+
		"\u008c\n\20\3\21\3\21\3\21\7\21\u0091\n\21\f\21\16\21\u0094\13\21\3\21"+
		"\3\21\3\21\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\5\3\2\24\25"+
		"\3\2\35\36\4\2\34\34\36\36\u0094\2\"\3\2\2\2\4\64\3\2\2\2\68\3\2\2\2\b"+
		":\3\2\2\2\nD\3\2\2\2\fF\3\2\2\2\16N\3\2\2\2\20R\3\2\2\2\22V\3\2\2\2\24"+
		"h\3\2\2\2\26v\3\2\2\2\30x\3\2\2\2\32z\3\2\2\2\34\u0080\3\2\2\2\36\u008b"+
		"\3\2\2\2 \u008d\3\2\2\2\"#\7\24\2\2#$\7\7\2\2$%\7\27\2\2%&\7\30\2\2&*"+
		"\7\4\2\2\')\5\4\3\2(\'\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+.\3\2\2\2"+
		",*\3\2\2\2-/\5\b\5\2.-\3\2\2\2/\60\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61"+
		"\62\3\2\2\2\62\63\7\5\2\2\63\3\3\2\2\2\64\65\5\6\4\2\65\66\7\36\2\2\66"+
		"\67\7\32\2\2\67\5\3\2\2\289\t\2\2\29\7\3\2\2\2:;\7\4\2\2;<\5\n\6\2<=\7"+
		"\5\2\2=\t\3\2\2\2>E\5\f\7\2?A\5\16\b\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2B"+
		"C\3\2\2\2CE\3\2\2\2D>\3\2\2\2D@\3\2\2\2E\13\3\2\2\2FG\7\3\2\2GH\7\27\2"+
		"\2HI\5\16\b\2IJ\7\30\2\2JK\5\b\5\2K\r\3\2\2\2LO\5\24\13\2MO\5\20\t\2N"+
		"L\3\2\2\2NM\3\2\2\2O\17\3\2\2\2PS\5\22\n\2QS\5 \21\2RP\3\2\2\2RQ\3\2\2"+
		"\2ST\3\2\2\2TU\7\32\2\2U\21\3\2\2\2VW\7\36\2\2WX\7\22\2\2XY\5\34\17\2"+
		"Y\23\3\2\2\2Z[\7\n\2\2[\\\7\27\2\2\\]\5\26\f\2]^\7\30\2\2^_\5\b\5\2_i"+
		"\3\2\2\2`a\7\n\2\2ab\7\27\2\2bc\5\26\f\2cd\7\30\2\2de\5\b\5\2ef\7\13\2"+
		"\2fg\5\b\5\2gi\3\2\2\2hZ\3\2\2\2h`\3\2\2\2i\25\3\2\2\2jk\5\30\r\2kl\7"+
		"\20\2\2lm\5\30\r\2mw\3\2\2\2no\5\30\r\2op\7\21\2\2pq\5\30\r\2qw\3\2\2"+
		"\2rs\5\30\r\2st\7\23\2\2tu\5\30\r\2uw\3\2\2\2vj\3\2\2\2vn\3\2\2\2vr\3"+
		"\2\2\2w\27\3\2\2\2xy\t\3\2\2y\31\3\2\2\2z{\7\36\2\2{|\7\r\2\2|}\7\35\2"+
		"\2}\33\3\2\2\2~\u0081\7\35\2\2\177\u0081\5\32\16\2\u0080~\3\2\2\2\u0080"+
		"\177\3\2\2\2\u0081\35\3\2\2\2\u0082\u008c\7\34\2\2\u0083\u0088\7\36\2"+
		"\2\u0084\u0085\7\31\2\2\u0085\u0087\t\4\2\2\u0086\u0084\3\2\2\2\u0087"+
		"\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008c\3\2"+
		"\2\2\u008a\u0088\3\2\2\2\u008b\u0082\3\2\2\2\u008b\u0083\3\2\2\2\u008c"+
		"\37\3\2\2\2\u008d\u008e\7\6\2\2\u008e\u0092\7\27\2\2\u008f\u0091\5\36"+
		"\20\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0096\7\30"+
		"\2\2\u0096!\3\2\2\2\16*\60BDNRhv\u0080\u0088\u008b\u0092";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}