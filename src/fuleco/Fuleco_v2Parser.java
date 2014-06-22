// Generated from /Users/ian/Documents/ANTLR/fuleco/Fuleco_v2.g4 by ANTLR 4.1
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
public class Fuleco_v2Parser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	
	public static final int
		SAQUE_INICIAL=1, ABRIR_LLAVE=2, CERRAR_LLAVE=3, BRASILERO=4, ALEMAN=5, 
		JAPON=6, PARENTESIS_IZQ=7, PARENTESIS_DER=8, GAMBETEAR=9, TRUE=10, FALSE=11, 
		ARBITRO=12, ENTONCES=13, SOBORNO=14, TIEMPO_ADICIONAL=15, QUEMAR_TIEMPO=16, 
		LESIONAR=17, ANIMAR=18, CARA=19, SELLO=20, EMPATE=21, PENALTY=22, DIFERENTE=23, 
		MOSTRAR_MARCADOR=24, COMILLAS=25, FIN_LINEA=26, CONCATENAR=27, WS=28, 
		CADENA=29, NUMEROS=30, VARIABLE=31, DIGITOS=32, LETRA=33;
	public static final String[] tokenNames = {
		"<INVALID>", "'SAQUE_INICIAL'", "'(>_<)'", "'(>.<)'", "'Brasilero'", "'Aleman'", 
		"'Japon'", "'('", "')'", "'GAMBETEAR'", "'GOL'", "'AUTOGOL'", "'ARBITRO'", 
		"'PIENSA'", "'SOBORNO'", "'TIEMPO_ADICIONAL'", "'QUEMAR_TIEMPO'", "'LESIONAR'", 
		"'ANIMAR'", "'CARA'", "'SELLO'", "'EMPATE'", "'PENALTY'", "'!='", "'MOSTRAR_MARCADOR'", 
		"'\"'", "'!'", "'+'", "WS", "CADENA", "NUMEROS", "VARIABLE", "DIGITOS", 
		"LETRA"
	};
	
	public static final int
		RULE_programa = 0, RULE_declaraciones = 1, RULE_declaracion = 2, RULE_tipo = 3, 
		RULE_sentencias = 4, RULE_sentencia = 5, RULE_impr = 6, RULE_concaten = 7, 
		RULE_bloque = 8, RULE_asign = 9, RULE_comparacion = 10, RULE_ciclo = 11, 
		RULE_expresion = 12, RULE_opIgu = 13, RULE_relacion = 14, RULE_opRel = 15, 
		RULE_adicion = 16, RULE_opSum = 17, RULE_termino = 18, RULE_opMul = 19, 
		RULE_primario = 20, RULE_literal = 21, RULE_entero = 22, RULE_booleano = 23;
	
	public static final String[] ruleNames = {
		"programa", "declaraciones", "declaracion", "tipo", "sentencias", "sentencia", 
		"impr", "concaten", "bloque", "asign", "comparacion", "ciclo", "expresion", 
		"opIgu", "relacion", "opRel", "adicion", "opSum", "termino", "opMul", 
		"primario", "literal", "entero", "booleano"
	};

	@Override
	public String getGrammarFileName() { return "Fuleco_v2.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public Fuleco_v2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
//		_interp = new ParserATNSimulator(this,_ATN);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode PARENTESIS_IZQ() { return getToken(Fuleco_v2Parser.PARENTESIS_IZQ, 0); }
		public TerminalNode CERRAR_LLAVE() { return getToken(Fuleco_v2Parser.CERRAR_LLAVE, 0); }
		public TerminalNode SAQUE_INICIAL() { return getToken(Fuleco_v2Parser.SAQUE_INICIAL, 0); }
		public DeclaracionesContext declaraciones() {
			return getRuleContext(DeclaracionesContext.class,0);
		}
		public SentenciasContext sentencias() {
			return getRuleContext(SentenciasContext.class,0);
		}
		
		public TerminalNode PARENTESIS_DER() { return getToken(Fuleco_v2Parser.PARENTESIS_DER, 0); }
		public TerminalNode BRASILERO() { return getToken(Fuleco_v2Parser.BRASILERO, 0); }
		public TerminalNode ABRIR_LLAVE() { return getToken(Fuleco_v2Parser.ABRIR_LLAVE, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v2Listener ) ((Fuleco_v2Listener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v2Listener ) ((Fuleco_v2Listener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Fuleco_v2Visitor ) return ((Fuleco_v2Visitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48); match(BRASILERO);
			setState(49); match(SAQUE_INICIAL);
			setState(50); match(PARENTESIS_IZQ);
			setState(51); match(PARENTESIS_DER);
			setState(52); match(ABRIR_LLAVE);
			setState(53); declaraciones();
			setState(54); sentencias();
			setState(55); match(CERRAR_LLAVE);
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
		public List<DeclaracionContext> declaracion() {
//			return getRuleContexts(DeclaracionContext.class);
			return getRuleContexts(DeclaracionContext.class);			
		}
		public DeclaracionContext declaracion(int i) {
			return getRuleContext(DeclaracionContext.class,i);
		}
		public DeclaracionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaraciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v2Listener ) ((Fuleco_v2Listener)listener).enterDeclaraciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v2Listener ) ((Fuleco_v2Listener)listener).exitDeclaraciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Fuleco_v2Visitor ) return ((Fuleco_v2Visitor<? extends T>)visitor).visitDeclaraciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionesContext declaraciones() throws RecognitionException {
		DeclaracionesContext _localctx = new DeclaracionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaraciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(57); declaracion();
				}
				}
				setState(60); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BRASILERO) | (1L << ALEMAN) | (1L << JAPON))) != 0) );
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

	public static class DeclaracionContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(Fuleco_v2Parser.VARIABLE, 0); }
		public AsignContext asign() {
			return getRuleContext(AsignContext.class,0);
		}
		public TerminalNode FIN_LINEA() { return getToken(Fuleco_v2Parser.FIN_LINEA, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v2Listener ) ((Fuleco_v2Listener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v2Listener ) ((Fuleco_v2Listener)listener).exitDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Fuleco_v2Visitor ) return ((Fuleco_v2Visitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	
	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracion);
		try {
			setState(69);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62); tipo();
				setState(63); match(VARIABLE);
				setState(64); match(FIN_LINEA);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66); tipo();
				setState(67); asign();
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode ALEMAN() { return getToken(Fuleco_v2Parser.ALEMAN, 0); }
		public TerminalNode JAPON() { return getToken(Fuleco_v2Parser.JAPON, 0); }
		public TerminalNode BRASILERO() { return getToken(Fuleco_v2Parser.BRASILERO, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v2Listener ) ((Fuleco_v2Listener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v2Listener ) ((Fuleco_v2Listener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Fuleco_v2Visitor ) return ((Fuleco_v2Visitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BRASILERO) | (1L << ALEMAN) | (1L << JAPON))) != 0)) ) {
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
		public List<SentenciaContext> sentencia() {
//			return getRuleContexts(SentenciaContext.class);
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public SentenciasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v2Listener ) ((Fuleco_v2Listener)listener).enterSentencias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v2Listener ) ((Fuleco_v2Listener)listener).exitSentencias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Fuleco_v2Visitor ) return ((Fuleco_v2Visitor<? extends T>)visitor).visitSentencias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciasContext sentencias() throws RecognitionException {
		SentenciasContext _localctx = new SentenciasContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sentencias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(73); sentencia();
				}
				}
				setState(76); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABRIR_LLAVE) | (1L << GAMBETEAR) | (1L << ARBITRO) | (1L << MOSTRAR_MARCADOR) | (1L << VARIABLE))) != 0) );
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
		public AsignContext asign() {
			return getRuleContext(AsignContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public ImprContext impr() {
			return getRuleContext(ImprContext.class,0);
		}
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v2Listener ) ((Fuleco_v2Listener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v2Listener ) ((Fuleco_v2Listener)listener).exitSentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Fuleco_v2Visitor ) return ((Fuleco_v2Visitor<? extends T>)visitor).visitSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sentencia);
		try {
			setState(83);
			switch (_input.LA(1)) {
			case MOSTRAR_MARCADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(78); impr();
				}
				break;
			case ABRIR_LLAVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(79); bloque();
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(80); asign();
				}
				break;
			case ARBITRO:
				enterOuterAlt(_localctx, 4);
				{
				setState(81); comparacion();
				}
				break;
			case GAMBETEAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(82); ciclo();
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
		public TerminalNode PARENTESIS_IZQ() { return getToken(Fuleco_v2Parser.PARENTESIS_IZQ, 0); }
		public List<ConcatenContext> concaten() {
//			return getRuleContexts(ConcatenContext.class);
			return getRuleContexts(ConcatenContext.class);
		}
		public TerminalNode MOSTRAR_MARCADOR() { return getToken(Fuleco_v2Parser.MOSTRAR_MARCADOR, 0); }
		public TerminalNode FIN_LINEA() { return getToken(Fuleco_v2Parser.FIN_LINEA, 0); }
		public ConcatenContext concaten(int i) {
			return getRuleContext(ConcatenContext.class,i);
		}
		public TerminalNode PARENTESIS_DER() { return getToken(Fuleco_v2Parser.PARENTESIS_DER, 0); }
		public ImprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v2Listener ) ((Fuleco_v2Listener)listener).enterImpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v2Listener ) ((Fuleco_v2Listener)listener).exitImpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Fuleco_v2Visitor ) return ((Fuleco_v2Visitor<? extends T>)visitor).visitImpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImprContext impr() throws RecognitionException {
		ImprContext _localctx = new ImprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_impr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85); match(MOSTRAR_MARCADOR);
			setState(86); match(PARENTESIS_IZQ);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CADENA || _la==VARIABLE) {
				{
				{
				setState(87); concaten();
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93); match(PARENTESIS_DER);
			setState(94); match(FIN_LINEA);
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
		public List<TerminalNode> VARIABLE() { 
//			return getTokens(Fuleco_v2Parser.VARIABLE); 
			return getTokens(Fuleco_v2Parser.VARIABLE);
		}
		public List<TerminalNode> CADENA() { 
//			return getTokens(Fuleco_v2Parser.CADENA); 
			return getTokens(Fuleco_v2Parser.CADENA);
		}
		public TerminalNode CONCATENAR(int i) {
			return getToken(Fuleco_v2Parser.CONCATENAR, i);
		}
		public TerminalNode CADENA(int i) {
			return getToken(Fuleco_v2Parser.CADENA, i);
		}
		public TerminalNode VARIABLE(int i) {
			return getToken(Fuleco_v2Parser.VARIABLE, i);
		}
		public List<TerminalNode> CONCATENAR() { 
//			return getTokens(Fuleco_v2Parser.CONCATENAR); 
			return getTokens(Fuleco_v2Parser.CONCATENAR);
		}
		public ConcatenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concaten; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v2Listener ) ((Fuleco_v2Listener)listener).enterConcaten(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v2Listener ) ((Fuleco_v2Listener)listener).exitConcaten(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Fuleco_v2Visitor ) return ((Fuleco_v2Visitor<? extends T>)visitor).visitConcaten(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConcatenContext concaten() throws RecognitionException {
		ConcatenContext _localctx = new ConcatenContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_concaten);
		int _la;
		try {
			setState(105);
			switch (_input.LA(1)) {
			case CADENA:
				enterOuterAlt(_localctx, 1);
				{
				setState(96); match(CADENA);
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(97); match(VARIABLE);
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CONCATENAR) {
					{
					{
					setState(98); match(CONCATENAR);
					setState(99);
					_la = _input.LA(1);
					if ( !(_la==CADENA || _la==VARIABLE) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					setState(104);
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

	public static class BloqueContext extends ParserRuleContext {
		public TerminalNode CERRAR_LLAVE() { return getToken(Fuleco_v2Parser.CERRAR_LLAVE, 0); }
		public SentenciasContext sentencias() {
			return getRuleContext(SentenciasContext.class,0);
		}
		public TerminalNode ABRIR_LLAVE() { return getToken(Fuleco_v2Parser.ABRIR_LLAVE, 0); }
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v2Listener ) ((Fuleco_v2Listener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v2Listener ) ((Fuleco_v2Listener)listener).exitBloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Fuleco_v2Visitor ) return ((Fuleco_v2Visitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bloque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107); match(ABRIR_LLAVE);
			setState(108); sentencias();
			setState(109); match(CERRAR_LLAVE);
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
		public TerminalNode VARIABLE() { return getToken(Fuleco_v2Parser.VARIABLE, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode FIN_LINEA() { return getToken(Fuleco_v2Parser.FIN_LINEA, 0); }
		public TerminalNode EMPATE() { return getToken(Fuleco_v2Parser.EMPATE, 0); }
		public AsignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v2Listener ) ((Fuleco_v2Listener)listener).enterAsign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v2Listener ) ((Fuleco_v2Listener)listener).exitAsign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Fuleco_v2Visitor ) return ((Fuleco_v2Visitor<? extends T>)visitor).visitAsign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignContext asign() throws RecognitionException {
		AsignContext _localctx = new AsignContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_asign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111); match(VARIABLE);
			setState(112); match(EMPATE);
			setState(113); expresion();
			setState(114); match(FIN_LINEA);
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
		public List<TerminalNode> PARENTESIS_IZQ() { 
//			return getTokens(Fuleco_v2Parser.PARENTESIS_IZQ); 
			return getTokens(Fuleco_v2Parser.CONCATENAR);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public List<BloqueContext> bloque() {
//			return getRuleContexts(BloqueContext.class);
			return getRuleContexts(BloqueContext.class);
		}
		public TerminalNode ARBITRO() { return getToken(Fuleco_v2Parser.ARBITRO, 0); }
		public TerminalNode SOBORNO() { return getToken(Fuleco_v2Parser.SOBORNO, 0); }
		public TerminalNode PARENTESIS_IZQ(int i) {
			return getToken(Fuleco_v2Parser.PARENTESIS_IZQ, i);
		}
		public TerminalNode PARENTESIS_DER() { return getToken(Fuleco_v2Parser.PARENTESIS_DER, 0); }
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public ComparacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v2Listener ) ((Fuleco_v2Listener)listener).enterComparacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v2Listener ) ((Fuleco_v2Listener)listener).exitComparacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Fuleco_v2Visitor ) return ((Fuleco_v2Visitor<? extends T>)visitor).visitComparacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparacionContext comparacion() throws RecognitionException {
		ComparacionContext _localctx = new ComparacionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comparacion);
		try {
			setState(131);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116); match(ARBITRO);
				setState(117); match(PARENTESIS_IZQ);
				setState(118); expresion();
				setState(119); match(PARENTESIS_DER);
				setState(120); match(PARENTESIS_IZQ);
				setState(121); bloque();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123); match(ARBITRO);
				setState(124); match(PARENTESIS_IZQ);
				setState(125); expresion();
				setState(126); match(PARENTESIS_DER);
				setState(127); bloque();
				setState(128); match(SOBORNO);
				setState(129); bloque();
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

	public static class CicloContext extends ParserRuleContext {
		public TerminalNode PARENTESIS_IZQ() { return getToken(Fuleco_v2Parser.PARENTESIS_IZQ, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PARENTESIS_DER() { return getToken(Fuleco_v2Parser.PARENTESIS_DER, 0); }
		public TerminalNode GAMBETEAR() { return getToken(Fuleco_v2Parser.GAMBETEAR, 0); }
		public SentenciaContext sentencia() {
			return getRuleContext(SentenciaContext.class,0);
		}
		public CicloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v2Listener ) ((Fuleco_v2Listener)listener).enterCiclo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v2Listener ) ((Fuleco_v2Listener)listener).exitCiclo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Fuleco_v2Visitor ) return ((Fuleco_v2Visitor<? extends T>)visitor).visitCiclo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CicloContext ciclo() throws RecognitionException {
		CicloContext _localctx = new CicloContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ciclo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133); match(GAMBETEAR);
			setState(134); match(PARENTESIS_IZQ);
			setState(135); expresion();
			setState(136); match(PARENTESIS_DER);
			setState(137); sentencia();
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

	public static class ExpresionContext extends ParserRuleContext {
		public OpIguContext opIgu() {
			return getRuleContext(OpIguContext.class,0);
		}
		public List<RelacionContext> relacion() {
//			return getRuleContexts(RelacionContext.class);
			return getRuleContexts(RelacionContext.class);
		}
		public RelacionContext relacion(int i) {
			return getRuleContext(RelacionContext.class,i);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v2Listener ) ((Fuleco_v2Listener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v2Listener ) ((Fuleco_v2Listener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Fuleco_v2Visitor ) return ((Fuleco_v2Visitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expresion);
		try {
			setState(144);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(139); relacion();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140); relacion();
				setState(141); opIgu();
				setState(142); relacion();
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

	public static class OpIguContext extends ParserRuleContext {
		public TerminalNode PENALTY() { return getToken(Fuleco_v2Parser.PENALTY, 0); }
		public TerminalNode DIFERENTE() { return getToken(Fuleco_v2Parser.DIFERENTE, 0); }
		public OpIguContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opIgu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v2Listener ) ((Fuleco_v2Listener)listener).enterOpIgu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v2Listener ) ((Fuleco_v2Listener)listener).exitOpIgu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Fuleco_v2Visitor ) return ((Fuleco_v2Visitor<? extends T>)visitor).visitOpIgu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpIguContext opIgu() throws RecognitionException {
		OpIguContext _localctx = new OpIguContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_opIgu);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_la = _input.LA(1);
			if ( !(_la==PENALTY || _la==DIFERENTE) ) {
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

	public static class RelacionContext extends ParserRuleContext {
		public List<AdicionContext> adicion() {
//			return getRuleContexts(AdicionContext.class);
			return getRuleContexts(AdicionContext.class);
		}
		public AdicionContext adicion(int i) {
			return getRuleContext(AdicionContext.class,i);
		}
		public OpRelContext opRel() {
			return getRuleContext(OpRelContext.class,0);
		}
		public RelacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v2Listener ) ((Fuleco_v2Listener)listener).enterRelacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v2Listener ) ((Fuleco_v2Listener)listener).exitRelacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Fuleco_v2Visitor ) return ((Fuleco_v2Visitor<? extends T>)visitor).visitRelacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelacionContext relacion() throws RecognitionException {
		RelacionContext _localctx = new RelacionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_relacion);
		try {
			setState(153);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148); adicion();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149); adicion();
				setState(150); opRel();
				setState(151); adicion();
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

	public static class OpRelContext extends ParserRuleContext {
		public TerminalNode CARA() { return getToken(Fuleco_v2Parser.CARA, 0); }
		public TerminalNode SELLO() { return getToken(Fuleco_v2Parser.SELLO, 0); }
		public OpRelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opRel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v2Listener ) ((Fuleco_v2Listener)listener).enterOpRel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v2Listener ) ((Fuleco_v2Listener)listener).exitOpRel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Fuleco_v2Visitor ) return ((Fuleco_v2Visitor<? extends T>)visitor).visitOpRel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpRelContext opRel() throws RecognitionException {
		OpRelContext _localctx = new OpRelContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_opRel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_la = _input.LA(1);
			if ( !(_la==CARA || _la==SELLO) ) {
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

	public static class AdicionContext extends ParserRuleContext {
		public List<TerminoContext> termino() {
//			return getRuleContexts(TerminoContext.class);
			return getRuleContexts(TerminoContext.class);
		}
		public List<OpSumContext> opSum() {
//			return getRuleContexts(OpSumContext.class);
			return getRuleContexts(OpSumContext.class);
		}
		public OpSumContext opSum(int i) {
			return getRuleContext(OpSumContext.class,i);
		}
		public TerminoContext termino(int i) {
			return getRuleContext(TerminoContext.class,i);
		}
		public AdicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v2Listener ) ((Fuleco_v2Listener)listener).enterAdicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v2Listener ) ((Fuleco_v2Listener)listener).exitAdicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Fuleco_v2Visitor ) return ((Fuleco_v2Visitor<? extends T>)visitor).visitAdicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdicionContext adicion() throws RecognitionException {
		AdicionContext _localctx = new AdicionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_adicion);
		int _la;
		try {
			setState(166);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157); termino();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(158); termino();
				setState(162); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(159); opSum();
					setState(160); termino();
					}
					}
					setState(164); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TIEMPO_ADICIONAL || _la==QUEMAR_TIEMPO );
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

	public static class OpSumContext extends ParserRuleContext {
		public TerminalNode TIEMPO_ADICIONAL() { return getToken(Fuleco_v2Parser.TIEMPO_ADICIONAL, 0); }
		public TerminalNode QUEMAR_TIEMPO() { return getToken(Fuleco_v2Parser.QUEMAR_TIEMPO, 0); }
		public OpSumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opSum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v2Listener ) ((Fuleco_v2Listener)listener).enterOpSum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v2Listener ) ((Fuleco_v2Listener)listener).exitOpSum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Fuleco_v2Visitor ) return ((Fuleco_v2Visitor<? extends T>)visitor).visitOpSum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpSumContext opSum() throws RecognitionException {
		OpSumContext _localctx = new OpSumContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_opSum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_la = _input.LA(1);
			if ( !(_la==TIEMPO_ADICIONAL || _la==QUEMAR_TIEMPO) ) {
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

	public static class TerminoContext extends ParserRuleContext {
		public List<OpMulContext> opMul() {
//			return getRuleContexts(OpMulContext.class);
			return getRuleContexts(OpMulContext.class);
		}
		public PrimarioContext primario(int i) {
			return getRuleContext(PrimarioContext.class,i);
		}
		public OpMulContext opMul(int i) {
			return getRuleContext(OpMulContext.class,i);
		}
		public List<PrimarioContext> primario() {
//			return getRuleContexts(PrimarioContext.class);
			return getRuleContexts(PrimarioContext.class);
		}
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v2Listener ) ((Fuleco_v2Listener)listener).enterTermino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v2Listener ) ((Fuleco_v2Listener)listener).exitTermino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Fuleco_v2Visitor ) return ((Fuleco_v2Visitor<? extends T>)visitor).visitTermino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_termino);
		int _la;
		try {
			setState(179);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170); primario();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171); primario();
				setState(175); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(172); opMul();
					setState(173); primario();
					}
					}
					setState(177); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LESIONAR || _la==ANIMAR );
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

	public static class OpMulContext extends ParserRuleContext {
		public TerminalNode LESIONAR() { return getToken(Fuleco_v2Parser.LESIONAR, 0); }
		public TerminalNode ANIMAR() { return getToken(Fuleco_v2Parser.ANIMAR, 0); }
		public OpMulContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opMul; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v2Listener ) ((Fuleco_v2Listener)listener).enterOpMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v2Listener ) ((Fuleco_v2Listener)listener).exitOpMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Fuleco_v2Visitor ) return ((Fuleco_v2Visitor<? extends T>)visitor).visitOpMul(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpMulContext opMul() throws RecognitionException {
		OpMulContext _localctx = new OpMulContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_opMul);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_la = _input.LA(1);
			if ( !(_la==LESIONAR || _la==ANIMAR) ) {
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

	public static class PrimarioContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(Fuleco_v2Parser.VARIABLE, 0); }
		public TerminalNode CADENA() { return getToken(Fuleco_v2Parser.CADENA, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PrimarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v2Listener ) ((Fuleco_v2Listener)listener).enterPrimario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v2Listener ) ((Fuleco_v2Listener)listener).exitPrimario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Fuleco_v2Visitor ) return ((Fuleco_v2Visitor<? extends T>)visitor).visitPrimario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimarioContext primario() throws RecognitionException {
		PrimarioContext _localctx = new PrimarioContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_primario);
		try {
			setState(186);
			switch (_input.LA(1)) {
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(183); match(VARIABLE);
				}
				break;
			case TRUE:
			case FALSE:
			case NUMEROS:
				enterOuterAlt(_localctx, 2);
				{
				setState(184); literal();
				}
				break;
			case CADENA:
				enterOuterAlt(_localctx, 3);
				{
				setState(185); match(CADENA);
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

	public static class LiteralContext extends ParserRuleContext {
		public EnteroContext entero() {
			return getRuleContext(EnteroContext.class,0);
		}
		public BooleanoContext booleano() {
			return getRuleContext(BooleanoContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v2Listener ) ((Fuleco_v2Listener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v2Listener ) ((Fuleco_v2Listener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Fuleco_v2Visitor ) return ((Fuleco_v2Visitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_literal);
		try {
			setState(190);
			switch (_input.LA(1)) {
			case NUMEROS:
				enterOuterAlt(_localctx, 1);
				{
				setState(188); entero();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(189); booleano();
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

	public static class EnteroContext extends ParserRuleContext {
		public TerminalNode NUMEROS() { return getToken(Fuleco_v2Parser.NUMEROS, 0); }
		public EnteroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v2Listener ) ((Fuleco_v2Listener)listener).enterEntero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v2Listener ) ((Fuleco_v2Listener)listener).exitEntero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Fuleco_v2Visitor ) return ((Fuleco_v2Visitor<? extends T>)visitor).visitEntero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnteroContext entero() throws RecognitionException {
		EnteroContext _localctx = new EnteroContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_entero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192); match(NUMEROS);
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

	public static class BooleanoContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(Fuleco_v2Parser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(Fuleco_v2Parser.FALSE, 0); }
		public BooleanoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleano; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v2Listener ) ((Fuleco_v2Listener)listener).enterBooleano(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v2Listener ) ((Fuleco_v2Listener)listener).exitBooleano(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Fuleco_v2Visitor ) return ((Fuleco_v2Visitor<? extends T>)visitor).visitBooleano(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanoContext booleano() throws RecognitionException {
		BooleanoContext _localctx = new BooleanoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_booleano);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3#\u00c7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\6\3=\n\3\r\3\16\3>\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4H\n\4\3\5\3\5\3\6\6\6M\n\6\r\6\16\6N\3\7\3\7\3\7"+
		"\3\7\3\7\5\7V\n\7\3\b\3\b\3\b\7\b[\n\b\f\b\16\b^\13\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\7\tg\n\t\f\t\16\tj\13\t\5\tl\n\t\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\5\f\u0086\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u0093\n\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\5\20\u009c\n\20\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\22\6\22\u00a5\n\22\r\22\16\22\u00a6\5\22"+
		"\u00a9\n\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\6\24\u00b2\n\24\r\24\16"+
		"\24\u00b3\5\24\u00b6\n\24\3\25\3\25\3\26\3\26\3\26\5\26\u00bd\n\26\3\27"+
		"\3\27\5\27\u00c1\n\27\3\30\3\30\3\31\3\31\3\31\2\32\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\2\t\3\2\6\b\4\2\37\37!!\3\2\30\31\3"+
		"\2\25\26\3\2\21\22\3\2\23\24\3\2\f\r\u00c2\2\62\3\2\2\2\4<\3\2\2\2\6G"+
		"\3\2\2\2\bI\3\2\2\2\nL\3\2\2\2\fU\3\2\2\2\16W\3\2\2\2\20k\3\2\2\2\22m"+
		"\3\2\2\2\24q\3\2\2\2\26\u0085\3\2\2\2\30\u0087\3\2\2\2\32\u0092\3\2\2"+
		"\2\34\u0094\3\2\2\2\36\u009b\3\2\2\2 \u009d\3\2\2\2\"\u00a8\3\2\2\2$\u00aa"+
		"\3\2\2\2&\u00b5\3\2\2\2(\u00b7\3\2\2\2*\u00bc\3\2\2\2,\u00c0\3\2\2\2."+
		"\u00c2\3\2\2\2\60\u00c4\3\2\2\2\62\63\7\6\2\2\63\64\7\3\2\2\64\65\7\t"+
		"\2\2\65\66\7\n\2\2\66\67\7\4\2\2\678\5\4\3\289\5\n\6\29:\7\5\2\2:\3\3"+
		"\2\2\2;=\5\6\4\2<;\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?\5\3\2\2\2@A"+
		"\5\b\5\2AB\7!\2\2BC\7\34\2\2CH\3\2\2\2DE\5\b\5\2EF\5\24\13\2FH\3\2\2\2"+
		"G@\3\2\2\2GD\3\2\2\2H\7\3\2\2\2IJ\t\2\2\2J\t\3\2\2\2KM\5\f\7\2LK\3\2\2"+
		"\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\13\3\2\2\2PV\5\16\b\2QV\5\22\n\2RV\5"+
		"\24\13\2SV\5\26\f\2TV\5\30\r\2UP\3\2\2\2UQ\3\2\2\2UR\3\2\2\2US\3\2\2\2"+
		"UT\3\2\2\2V\r\3\2\2\2WX\7\32\2\2X\\\7\t\2\2Y[\5\20\t\2ZY\3\2\2\2[^\3\2"+
		"\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\7\n\2\2`a\7\34\2\2a"+
		"\17\3\2\2\2bl\7\37\2\2ch\7!\2\2de\7\35\2\2eg\t\3\2\2fd\3\2\2\2gj\3\2\2"+
		"\2hf\3\2\2\2hi\3\2\2\2il\3\2\2\2jh\3\2\2\2kb\3\2\2\2kc\3\2\2\2l\21\3\2"+
		"\2\2mn\7\4\2\2no\5\n\6\2op\7\5\2\2p\23\3\2\2\2qr\7!\2\2rs\7\27\2\2st\5"+
		"\32\16\2tu\7\34\2\2u\25\3\2\2\2vw\7\16\2\2wx\7\t\2\2xy\5\32\16\2yz\7\n"+
		"\2\2z{\7\t\2\2{|\5\22\n\2|\u0086\3\2\2\2}~\7\16\2\2~\177\7\t\2\2\177\u0080"+
		"\5\32\16\2\u0080\u0081\7\n\2\2\u0081\u0082\5\22\n\2\u0082\u0083\7\20\2"+
		"\2\u0083\u0084\5\22\n\2\u0084\u0086\3\2\2\2\u0085v\3\2\2\2\u0085}\3\2"+
		"\2\2\u0086\27\3\2\2\2\u0087\u0088\7\13\2\2\u0088\u0089\7\t\2\2\u0089\u008a"+
		"\5\32\16\2\u008a\u008b\7\n\2\2\u008b\u008c\5\f\7\2\u008c\31\3\2\2\2\u008d"+
		"\u0093\5\36\20\2\u008e\u008f\5\36\20\2\u008f\u0090\5\34\17\2\u0090\u0091"+
		"\5\36\20\2\u0091\u0093\3\2\2\2\u0092\u008d\3\2\2\2\u0092\u008e\3\2\2\2"+
		"\u0093\33\3\2\2\2\u0094\u0095\t\4\2\2\u0095\35\3\2\2\2\u0096\u009c\5\""+
		"\22\2\u0097\u0098\5\"\22\2\u0098\u0099\5 \21\2\u0099\u009a\5\"\22\2\u009a"+
		"\u009c\3\2\2\2\u009b\u0096\3\2\2\2\u009b\u0097\3\2\2\2\u009c\37\3\2\2"+
		"\2\u009d\u009e\t\5\2\2\u009e!\3\2\2\2\u009f\u00a9\5&\24\2\u00a0\u00a4"+
		"\5&\24\2\u00a1\u00a2\5$\23\2\u00a2\u00a3\5&\24\2\u00a3\u00a5\3\2\2\2\u00a4"+
		"\u00a1\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2"+
		"\2\2\u00a7\u00a9\3\2\2\2\u00a8\u009f\3\2\2\2\u00a8\u00a0\3\2\2\2\u00a9"+
		"#\3\2\2\2\u00aa\u00ab\t\6\2\2\u00ab%\3\2\2\2\u00ac\u00b6\5*\26\2\u00ad"+
		"\u00b1\5*\26\2\u00ae\u00af\5(\25\2\u00af\u00b0\5*\26\2\u00b0\u00b2\3\2"+
		"\2\2\u00b1\u00ae\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00ac\3\2\2\2\u00b5\u00ad\3\2"+
		"\2\2\u00b6\'\3\2\2\2\u00b7\u00b8\t\7\2\2\u00b8)\3\2\2\2\u00b9\u00bd\7"+
		"!\2\2\u00ba\u00bd\5,\27\2\u00bb\u00bd\7\37\2\2\u00bc\u00b9\3\2\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd+\3\2\2\2\u00be\u00c1\5.\30\2"+
		"\u00bf\u00c1\5\60\31\2\u00c0\u00be\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1-"+
		"\3\2\2\2\u00c2\u00c3\7 \2\2\u00c3/\3\2\2\2\u00c4\u00c5\t\b\2\2\u00c5\61"+
		"\3\2\2\2\22>GNU\\hk\u0085\u0092\u009b\u00a6\u00a8\u00b3\u00b5\u00bc\u00c0";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
	public ParseTree parse() {
		// TODO Auto-generated method stub
		return null;
	}
}