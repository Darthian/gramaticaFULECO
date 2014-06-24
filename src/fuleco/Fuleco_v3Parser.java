package fuleco;

// Generated from C:\Users\Alexandra\Desktop\proyecto de lenguajes\FULECO_V3\Fuleco_v3.g4 by ANTLR 4.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Fuleco_v3Parser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SAQUE_INICIAL=1, ABRIR_LLAVE=2, CERRAR_LLAVE=3, BRASILERO=4, ALEMAN=5, 
		JAPON=6, PARENTESIS_IZQ=7, PARENTESIS_DER=8, GAMBETEAR=9, TRUE=10, FALSE=11, 
		ARBITRO=12, ENTONCES=13, SOBORNO=14, TIEMPO_ADICIONAL=15, QUEMAR_TIEMPO=16, 
		LESIONAR=17, ANIMAR=18, CARA=19, SELLO=20, EMPATE=21, PENALTY=22, DIFERENTE=23, 
		MOSTRAR_MARCADOR=24, COMILLAS=25, FIN_LINEA=26, CONCATENAR=27, RETURN=28, 
		COMA=29, WS=30, CADENA=31, NUMEROS=32, VARIABLE=33, DIGITOS=34, LETRA=35;
	public static final String[] tokenNames = {
		"<INVALID>", "'SAQUE_INICIAL'", "'(>_<)'", "'(>.<)'", "'Brasilero'", "'Aleman'", 
		"'Japon'", "'('", "')'", "'GAMBETEAR'", "'GOL'", "'AUTOGOL'", "'ARBITRO'", 
		"'PIENSA'", "'SOBORNO'", "'TIEMPO_ADICIONAL'", "'QUEMAR_TIEMPO'", "'LESIONAR'", 
		"'ANIMAR'", "'CARA'", "'SELLO'", "'EMPATE'", "'PENALTY'", "'!='", "'MOSTRAR_MARCADOR'", 
		"'\"'", "'!'", "'+'", "'return'", "','", "WS", "CADENA", "NUMEROS", "VARIABLE", 
		"DIGITOS", "LETRA"
	};
	public static final int
		RULE_clase = 0, RULE_programa = 1, RULE_funcion = 2, RULE_parametros = 3, 
		RULE_declaraciones = 4, RULE_declaracion = 5, RULE_tipo = 6, RULE_sentencias = 7, 
		RULE_sentencia = 8, RULE_llamarFunc = 9, RULE_impr = 10, RULE_concaten = 11, 
		RULE_bloque = 12, RULE_asign = 13, RULE_comparacion = 14, RULE_ciclo = 15, 
		RULE_expresion = 16, RULE_opIgu = 17, RULE_relacion = 18, RULE_opRel = 19, 
		RULE_adicion = 20, RULE_opSum = 21, RULE_termino = 22, RULE_opMul = 23, 
		RULE_primario = 24, RULE_literal = 25, RULE_entero = 26, RULE_booleano = 27;
	public static final String[] ruleNames = {
		"clase", "programa", "funcion", "parametros", "declaraciones", "declaracion", 
		"tipo", "sentencias", "sentencia", "llamarFunc", "impr", "concaten", "bloque", 
		"asign", "comparacion", "ciclo", "expresion", "opIgu", "relacion", "opRel", 
		"adicion", "opSum", "termino", "opMul", "primario", "literal", "entero", 
		"booleano"
	};

	@Override
	public String getGrammarFileName() { return "Fuleco_v3.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public Fuleco_v3Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ClaseContext extends ParserRuleContext {
		public List<FuncionContext> funcion() {
			return getRuleContexts(FuncionContext.class);
		}
		public FuncionContext funcion(int i) {
			return getRuleContext(FuncionContext.class,i);
		}
		public ProgramaContext programa() {
			return getRuleContext(ProgramaContext.class,0);
		}
		public ClaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v3Listener ) ((Fuleco_v3Listener)listener).enterClase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v3Listener ) ((Fuleco_v3Listener)listener).exitClase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Fuleco_v3Visitor ) return ((Fuleco_v3Visitor<? extends T>)visitor).visitClase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClaseContext clase() throws RecognitionException {
		ClaseContext _localctx = new ClaseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_clase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56); programa();
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BRASILERO) | (1L << ALEMAN) | (1L << JAPON))) != 0)) {
				{
				{
				setState(57); funcion();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode PARENTESIS_IZQ() { return getToken(Fuleco_v3Parser.PARENTESIS_IZQ, 0); }
		public TerminalNode BRASILERO() { return getToken(Fuleco_v3Parser.BRASILERO, 0); }
		public DeclaracionesContext declaraciones() {
			return getRuleContext(DeclaracionesContext.class,0);
		}
		public TerminalNode CERRAR_LLAVE() { return getToken(Fuleco_v3Parser.CERRAR_LLAVE, 0); }
		public SentenciasContext sentencias() {
			return getRuleContext(SentenciasContext.class,0);
		}
		public TerminalNode SAQUE_INICIAL() { return getToken(Fuleco_v3Parser.SAQUE_INICIAL, 0); }
		public TerminalNode ABRIR_LLAVE() { return getToken(Fuleco_v3Parser.ABRIR_LLAVE, 0); }
		public TerminalNode PARENTESIS_DER() { return getToken(Fuleco_v3Parser.PARENTESIS_DER, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v3Listener ) ((Fuleco_v3Listener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v3Listener ) ((Fuleco_v3Listener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Fuleco_v3Visitor ) return ((Fuleco_v3Visitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63); match(BRASILERO);
			setState(64); match(SAQUE_INICIAL);
			setState(65); match(PARENTESIS_IZQ);
			setState(66); match(PARENTESIS_DER);
			setState(67); match(ABRIR_LLAVE);
			setState(68); declaraciones();
			setState(69); sentencias();
			setState(70); match(CERRAR_LLAVE);
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

	public static class FuncionContext extends ParserRuleContext {
		public TerminalNode PARENTESIS_IZQ() { return getToken(Fuleco_v3Parser.PARENTESIS_IZQ, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ABRIR_LLAVE() { return getToken(Fuleco_v3Parser.ABRIR_LLAVE, 0); }
		public TerminalNode PARENTESIS_DER() { return getToken(Fuleco_v3Parser.PARENTESIS_DER, 0); }
		public List<TerminalNode> COMA() { return getTokens(Fuleco_v3Parser.COMA); }
		public TerminalNode RETURN() { return getToken(Fuleco_v3Parser.RETURN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ParametrosContext parametros(int i) {
			return getRuleContext(ParametrosContext.class,i);
		}
		public DeclaracionesContext declaraciones() {
			return getRuleContext(DeclaracionesContext.class,0);
		}
		public TerminalNode CERRAR_LLAVE() { return getToken(Fuleco_v3Parser.CERRAR_LLAVE, 0); }
		public List<ParametrosContext> parametros() {
			return getRuleContexts(ParametrosContext.class);
		}
		public TerminalNode COMA(int i) {
			return getToken(Fuleco_v3Parser.COMA, i);
		}
		public TerminalNode FIN_LINEA() { return getToken(Fuleco_v3Parser.FIN_LINEA, 0); }
		public TerminalNode VARIABLE() { return getToken(Fuleco_v3Parser.VARIABLE, 0); }
		public SentenciasContext sentencias() {
			return getRuleContext(SentenciasContext.class,0);
		}
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v3Listener ) ((Fuleco_v3Listener)listener).enterFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v3Listener ) ((Fuleco_v3Listener)listener).exitFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Fuleco_v3Visitor ) return ((Fuleco_v3Visitor<? extends T>)visitor).visitFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72); tipo();
			setState(73); match(VARIABLE);
			setState(74); match(PARENTESIS_IZQ);
			setState(83);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BRASILERO) | (1L << ALEMAN) | (1L << JAPON))) != 0)) {
				{
				setState(75); parametros();
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(76); match(COMA);
					setState(77); parametros();
					}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(85); match(PARENTESIS_DER);
			setState(86); match(ABRIR_LLAVE);
			setState(90);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BRASILERO) | (1L << ALEMAN) | (1L << JAPON))) != 0)) {
				{
				setState(87); declaraciones();
				setState(88); sentencias();
				}
			}

			setState(92); match(RETURN);
			setState(93); expresion();
			setState(94); match(FIN_LINEA);
			setState(95); match(CERRAR_LLAVE);
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

	public static class ParametrosContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(Fuleco_v3Parser.VARIABLE, 0); }
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v3Listener ) ((Fuleco_v3Listener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v3Listener ) ((Fuleco_v3Listener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Fuleco_v3Visitor ) return ((Fuleco_v3Visitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parametros);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97); tipo();
			setState(98); match(VARIABLE);
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
			if ( listener instanceof Fuleco_v3Listener ) ((Fuleco_v3Listener)listener).enterDeclaraciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v3Listener ) ((Fuleco_v3Listener)listener).exitDeclaraciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Fuleco_v3Visitor ) return ((Fuleco_v3Visitor<? extends T>)visitor).visitDeclaraciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionesContext declaraciones() throws RecognitionException {
		DeclaracionesContext _localctx = new DeclaracionesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaraciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(100); declaracion();
				}
				}
				setState(103); 
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
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode FIN_LINEA() { return getToken(Fuleco_v3Parser.FIN_LINEA, 0); }
		public TerminalNode VARIABLE() { return getToken(Fuleco_v3Parser.VARIABLE, 0); }
		public AsignContext asign() {
			return getRuleContext(AsignContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v3Listener ) ((Fuleco_v3Listener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v3Listener ) ((Fuleco_v3Listener)listener).exitDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Fuleco_v3Visitor ) return ((Fuleco_v3Visitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaracion);
		try {
			setState(112);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105); tipo();
				setState(106); match(VARIABLE);
				setState(107); match(FIN_LINEA);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109); tipo();
				setState(110); asign();
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
		public TerminalNode BRASILERO() { return getToken(Fuleco_v3Parser.BRASILERO, 0); }
		public TerminalNode JAPON() { return getToken(Fuleco_v3Parser.JAPON, 0); }
		public TerminalNode ALEMAN() { return getToken(Fuleco_v3Parser.ALEMAN, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v3Listener ) ((Fuleco_v3Listener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v3Listener ) ((Fuleco_v3Listener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Fuleco_v3Visitor ) return ((Fuleco_v3Visitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
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
			if ( listener instanceof Fuleco_v3Listener ) ((Fuleco_v3Listener)listener).enterSentencias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v3Listener ) ((Fuleco_v3Listener)listener).exitSentencias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Fuleco_v3Visitor ) return ((Fuleco_v3Visitor<? extends T>)visitor).visitSentencias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciasContext sentencias() throws RecognitionException {
		SentenciasContext _localctx = new SentenciasContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sentencias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(116); sentencia();
				}
				}
				setState(119); 
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
		public ImprContext impr() {
			return getRuleContext(ImprContext.class,0);
		}
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public LlamarFuncContext llamarFunc() {
			return getRuleContext(LlamarFuncContext.class,0);
		}
		public AsignContext asign() {
			return getRuleContext(AsignContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v3Listener ) ((Fuleco_v3Listener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v3Listener ) ((Fuleco_v3Listener)listener).exitSentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Fuleco_v3Visitor ) return ((Fuleco_v3Visitor<? extends T>)visitor).visitSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sentencia);
		try {
			setState(127);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121); impr();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122); bloque();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(123); asign();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(124); comparacion();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(125); ciclo();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(126); llamarFunc();
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

	public static class LlamarFuncContext extends ParserRuleContext {
		public List<PrimarioContext> primario() {
			return getRuleContexts(PrimarioContext.class);
		}
		public TerminalNode PARENTESIS_IZQ() { return getToken(Fuleco_v3Parser.PARENTESIS_IZQ, 0); }
		public PrimarioContext primario(int i) {
			return getRuleContext(PrimarioContext.class,i);
		}
		public TerminalNode COMA(int i) {
			return getToken(Fuleco_v3Parser.COMA, i);
		}
		public TerminalNode VARIABLE() { return getToken(Fuleco_v3Parser.VARIABLE, 0); }
		public TerminalNode PARENTESIS_DER() { return getToken(Fuleco_v3Parser.PARENTESIS_DER, 0); }
		public List<TerminalNode> COMA() { return getTokens(Fuleco_v3Parser.COMA); }
		public LlamarFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamarFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v3Listener ) ((Fuleco_v3Listener)listener).enterLlamarFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v3Listener ) ((Fuleco_v3Listener)listener).exitLlamarFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Fuleco_v3Visitor ) return ((Fuleco_v3Visitor<? extends T>)visitor).visitLlamarFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LlamarFuncContext llamarFunc() throws RecognitionException {
		LlamarFuncContext _localctx = new LlamarFuncContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_llamarFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129); match(VARIABLE);
			setState(130); match(PARENTESIS_IZQ);
			setState(139);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << CADENA) | (1L << NUMEROS) | (1L << VARIABLE))) != 0)) {
				{
				setState(131); primario();
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(132); match(COMA);
					setState(133); primario();
					}
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(141); match(PARENTESIS_DER);
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
		public TerminalNode MOSTRAR_MARCADOR() { return getToken(Fuleco_v3Parser.MOSTRAR_MARCADOR, 0); }
		public TerminalNode PARENTESIS_IZQ() { return getToken(Fuleco_v3Parser.PARENTESIS_IZQ, 0); }
		public ConcatenContext concaten(int i) {
			return getRuleContext(ConcatenContext.class,i);
		}
		public List<ConcatenContext> concaten() {
			return getRuleContexts(ConcatenContext.class);
		}
		public TerminalNode FIN_LINEA() { return getToken(Fuleco_v3Parser.FIN_LINEA, 0); }
		public TerminalNode PARENTESIS_DER() { return getToken(Fuleco_v3Parser.PARENTESIS_DER, 0); }
		public ImprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v3Listener ) ((Fuleco_v3Listener)listener).enterImpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v3Listener ) ((Fuleco_v3Listener)listener).exitImpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Fuleco_v3Visitor ) return ((Fuleco_v3Visitor<? extends T>)visitor).visitImpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImprContext impr() throws RecognitionException {
		ImprContext _localctx = new ImprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_impr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143); match(MOSTRAR_MARCADOR);
			setState(144); match(PARENTESIS_IZQ);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CADENA || _la==VARIABLE) {
				{
				{
				setState(145); concaten();
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151); match(PARENTESIS_DER);
			setState(152); match(FIN_LINEA);
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
		public List<TerminalNode> CONCATENAR() { return getTokens(Fuleco_v3Parser.CONCATENAR); }
		public TerminalNode CONCATENAR(int i) {
			return getToken(Fuleco_v3Parser.CONCATENAR, i);
		}
		public List<TerminalNode> CADENA() { return getTokens(Fuleco_v3Parser.CADENA); }
		public List<TerminalNode> VARIABLE() { return getTokens(Fuleco_v3Parser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(Fuleco_v3Parser.VARIABLE, i);
		}
		public TerminalNode CADENA(int i) {
			return getToken(Fuleco_v3Parser.CADENA, i);
		}
		public ConcatenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concaten; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v3Listener ) ((Fuleco_v3Listener)listener).enterConcaten(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v3Listener ) ((Fuleco_v3Listener)listener).exitConcaten(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Fuleco_v3Visitor ) return ((Fuleco_v3Visitor<? extends T>)visitor).visitConcaten(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConcatenContext concaten() throws RecognitionException {
		ConcatenContext _localctx = new ConcatenContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_concaten);
		int _la;
		try {
			setState(163);
			switch (_input.LA(1)) {
			case CADENA:
				enterOuterAlt(_localctx, 1);
				{
				setState(154); match(CADENA);
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(155); match(VARIABLE);
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CONCATENAR) {
					{
					{
					setState(156); match(CONCATENAR);
					setState(157);
					_la = _input.LA(1);
					if ( !(_la==CADENA || _la==VARIABLE) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					setState(162);
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
		public TerminalNode CERRAR_LLAVE() { return getToken(Fuleco_v3Parser.CERRAR_LLAVE, 0); }
		public SentenciasContext sentencias() {
			return getRuleContext(SentenciasContext.class,0);
		}
		public TerminalNode ABRIR_LLAVE() { return getToken(Fuleco_v3Parser.ABRIR_LLAVE, 0); }
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v3Listener ) ((Fuleco_v3Listener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v3Listener ) ((Fuleco_v3Listener)listener).exitBloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Fuleco_v3Visitor ) return ((Fuleco_v3Visitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_bloque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165); match(ABRIR_LLAVE);
			setState(166); sentencias();
			setState(167); match(CERRAR_LLAVE);
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
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode EMPATE() { return getToken(Fuleco_v3Parser.EMPATE, 0); }
		public TerminalNode FIN_LINEA() { return getToken(Fuleco_v3Parser.FIN_LINEA, 0); }
		public TerminalNode VARIABLE() { return getToken(Fuleco_v3Parser.VARIABLE, 0); }
		public AsignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v3Listener ) ((Fuleco_v3Listener)listener).enterAsign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v3Listener ) ((Fuleco_v3Listener)listener).exitAsign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Fuleco_v3Visitor ) return ((Fuleco_v3Visitor<? extends T>)visitor).visitAsign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignContext asign() throws RecognitionException {
		AsignContext _localctx = new AsignContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_asign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169); match(VARIABLE);
			setState(170); match(EMPATE);
			setState(171); expresion();
			setState(172); match(FIN_LINEA);
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
		public TerminalNode SOBORNO() { return getToken(Fuleco_v3Parser.SOBORNO, 0); }
		public List<TerminalNode> PARENTESIS_IZQ() { return getTokens(Fuleco_v3Parser.PARENTESIS_IZQ); }
		public TerminalNode PARENTESIS_IZQ(int i) {
			return getToken(Fuleco_v3Parser.PARENTESIS_IZQ, i);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public TerminalNode ARBITRO() { return getToken(Fuleco_v3Parser.ARBITRO, 0); }
		public TerminalNode PARENTESIS_DER() { return getToken(Fuleco_v3Parser.PARENTESIS_DER, 0); }
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public ComparacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v3Listener ) ((Fuleco_v3Listener)listener).enterComparacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v3Listener ) ((Fuleco_v3Listener)listener).exitComparacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Fuleco_v3Visitor ) return ((Fuleco_v3Visitor<? extends T>)visitor).visitComparacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparacionContext comparacion() throws RecognitionException {
		ComparacionContext _localctx = new ComparacionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_comparacion);
		try {
			setState(189);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174); match(ARBITRO);
				setState(175); match(PARENTESIS_IZQ);
				setState(176); expresion();
				setState(177); match(PARENTESIS_DER);
				setState(178); match(PARENTESIS_IZQ);
				setState(179); bloque();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(181); match(ARBITRO);
				setState(182); match(PARENTESIS_IZQ);
				setState(183); expresion();
				setState(184); match(PARENTESIS_DER);
				setState(185); bloque();
				setState(186); match(SOBORNO);
				setState(187); bloque();
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
		public TerminalNode GAMBETEAR() { return getToken(Fuleco_v3Parser.GAMBETEAR, 0); }
		public SentenciaContext sentencia() {
			return getRuleContext(SentenciaContext.class,0);
		}
		public TerminalNode PARENTESIS_IZQ() { return getToken(Fuleco_v3Parser.PARENTESIS_IZQ, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PARENTESIS_DER() { return getToken(Fuleco_v3Parser.PARENTESIS_DER, 0); }
		public CicloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v3Listener ) ((Fuleco_v3Listener)listener).enterCiclo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v3Listener ) ((Fuleco_v3Listener)listener).exitCiclo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Fuleco_v3Visitor ) return ((Fuleco_v3Visitor<? extends T>)visitor).visitCiclo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CicloContext ciclo() throws RecognitionException {
		CicloContext _localctx = new CicloContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ciclo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191); match(GAMBETEAR);
			setState(192); match(PARENTESIS_IZQ);
			setState(193); expresion();
			setState(194); match(PARENTESIS_DER);
			setState(195); sentencia();
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
			if ( listener instanceof Fuleco_v3Listener ) ((Fuleco_v3Listener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v3Listener ) ((Fuleco_v3Listener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Fuleco_v3Visitor ) return ((Fuleco_v3Visitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expresion);
		try {
			setState(202);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197); relacion();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(198); relacion();
				setState(199); opIgu();
				setState(200); relacion();
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
		public TerminalNode DIFERENTE() { return getToken(Fuleco_v3Parser.DIFERENTE, 0); }
		public TerminalNode PENALTY() { return getToken(Fuleco_v3Parser.PENALTY, 0); }
		public OpIguContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opIgu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v3Listener ) ((Fuleco_v3Listener)listener).enterOpIgu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v3Listener ) ((Fuleco_v3Listener)listener).exitOpIgu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Fuleco_v3Visitor ) return ((Fuleco_v3Visitor<? extends T>)visitor).visitOpIgu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpIguContext opIgu() throws RecognitionException {
		OpIguContext _localctx = new OpIguContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_opIgu);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
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
			return getRuleContexts(AdicionContext.class);
		}
		public OpRelContext opRel() {
			return getRuleContext(OpRelContext.class,0);
		}
		public AdicionContext adicion(int i) {
			return getRuleContext(AdicionContext.class,i);
		}
		public RelacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v3Listener ) ((Fuleco_v3Listener)listener).enterRelacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v3Listener ) ((Fuleco_v3Listener)listener).exitRelacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Fuleco_v3Visitor ) return ((Fuleco_v3Visitor<? extends T>)visitor).visitRelacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelacionContext relacion() throws RecognitionException {
		RelacionContext _localctx = new RelacionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_relacion);
		try {
			setState(211);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206); adicion();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207); adicion();
				setState(208); opRel();
				setState(209); adicion();
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
		public TerminalNode CARA() { return getToken(Fuleco_v3Parser.CARA, 0); }
		public TerminalNode SELLO() { return getToken(Fuleco_v3Parser.SELLO, 0); }
		public OpRelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opRel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v3Listener ) ((Fuleco_v3Listener)listener).enterOpRel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v3Listener ) ((Fuleco_v3Listener)listener).exitOpRel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Fuleco_v3Visitor ) return ((Fuleco_v3Visitor<? extends T>)visitor).visitOpRel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpRelContext opRel() throws RecognitionException {
		OpRelContext _localctx = new OpRelContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_opRel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
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
			return getRuleContexts(TerminoContext.class);
		}
		public List<OpSumContext> opSum() {
			return getRuleContexts(OpSumContext.class);
		}
		public TerminoContext termino(int i) {
			return getRuleContext(TerminoContext.class,i);
		}
		public OpSumContext opSum(int i) {
			return getRuleContext(OpSumContext.class,i);
		}
		public AdicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v3Listener ) ((Fuleco_v3Listener)listener).enterAdicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v3Listener ) ((Fuleco_v3Listener)listener).exitAdicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Fuleco_v3Visitor ) return ((Fuleco_v3Visitor<? extends T>)visitor).visitAdicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdicionContext adicion() throws RecognitionException {
		AdicionContext _localctx = new AdicionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_adicion);
		int _la;
		try {
			setState(224);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215); termino();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216); termino();
				setState(220); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(217); opSum();
					setState(218); termino();
					}
					}
					setState(222); 
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
		public TerminalNode TIEMPO_ADICIONAL() { return getToken(Fuleco_v3Parser.TIEMPO_ADICIONAL, 0); }
		public TerminalNode QUEMAR_TIEMPO() { return getToken(Fuleco_v3Parser.QUEMAR_TIEMPO, 0); }
		public OpSumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opSum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v3Listener ) ((Fuleco_v3Listener)listener).enterOpSum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v3Listener ) ((Fuleco_v3Listener)listener).exitOpSum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Fuleco_v3Visitor ) return ((Fuleco_v3Visitor<? extends T>)visitor).visitOpSum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpSumContext opSum() throws RecognitionException {
		OpSumContext _localctx = new OpSumContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_opSum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
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
		public List<PrimarioContext> primario() {
			return getRuleContexts(PrimarioContext.class);
		}
		public PrimarioContext primario(int i) {
			return getRuleContext(PrimarioContext.class,i);
		}
		public OpMulContext opMul(int i) {
			return getRuleContext(OpMulContext.class,i);
		}
		public List<OpMulContext> opMul() {
			return getRuleContexts(OpMulContext.class);
		}
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v3Listener ) ((Fuleco_v3Listener)listener).enterTermino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v3Listener ) ((Fuleco_v3Listener)listener).exitTermino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Fuleco_v3Visitor ) return ((Fuleco_v3Visitor<? extends T>)visitor).visitTermino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_termino);
		int _la;
		try {
			setState(237);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(228); primario();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229); primario();
				setState(233); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(230); opMul();
					setState(231); primario();
					}
					}
					setState(235); 
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
		public TerminalNode ANIMAR() { return getToken(Fuleco_v3Parser.ANIMAR, 0); }
		public TerminalNode LESIONAR() { return getToken(Fuleco_v3Parser.LESIONAR, 0); }
		public OpMulContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opMul; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v3Listener ) ((Fuleco_v3Listener)listener).enterOpMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v3Listener ) ((Fuleco_v3Listener)listener).exitOpMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Fuleco_v3Visitor ) return ((Fuleco_v3Visitor<? extends T>)visitor).visitOpMul(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpMulContext opMul() throws RecognitionException {
		OpMulContext _localctx = new OpMulContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_opMul);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
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
		public TerminalNode CADENA() { return getToken(Fuleco_v3Parser.CADENA, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LlamarFuncContext llamarFunc() {
			return getRuleContext(LlamarFuncContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(Fuleco_v3Parser.VARIABLE, 0); }
		public PrimarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v3Listener ) ((Fuleco_v3Listener)listener).enterPrimario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v3Listener ) ((Fuleco_v3Listener)listener).exitPrimario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Fuleco_v3Visitor ) return ((Fuleco_v3Visitor<? extends T>)visitor).visitPrimario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimarioContext primario() throws RecognitionException {
		PrimarioContext _localctx = new PrimarioContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_primario);
		try {
			setState(245);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241); match(VARIABLE);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(242); literal();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(243); match(CADENA);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(244); llamarFunc();
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
			if ( listener instanceof Fuleco_v3Listener ) ((Fuleco_v3Listener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v3Listener ) ((Fuleco_v3Listener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Fuleco_v3Visitor ) return ((Fuleco_v3Visitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_literal);
		try {
			setState(249);
			switch (_input.LA(1)) {
			case NUMEROS:
				enterOuterAlt(_localctx, 1);
				{
				setState(247); entero();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(248); booleano();
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
		public TerminalNode NUMEROS() { return getToken(Fuleco_v3Parser.NUMEROS, 0); }
		public EnteroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v3Listener ) ((Fuleco_v3Listener)listener).enterEntero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v3Listener ) ((Fuleco_v3Listener)listener).exitEntero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Fuleco_v3Visitor ) return ((Fuleco_v3Visitor<? extends T>)visitor).visitEntero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnteroContext entero() throws RecognitionException {
		EnteroContext _localctx = new EnteroContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_entero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251); match(NUMEROS);
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
		public TerminalNode FALSE() { return getToken(Fuleco_v3Parser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(Fuleco_v3Parser.TRUE, 0); }
		public BooleanoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleano; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v3Listener ) ((Fuleco_v3Listener)listener).enterBooleano(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Fuleco_v3Listener ) ((Fuleco_v3Listener)listener).exitBooleano(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Fuleco_v3Visitor ) return ((Fuleco_v3Visitor<? extends T>)visitor).visitBooleano(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanoContext booleano() throws RecognitionException {
		BooleanoContext _localctx = new BooleanoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_booleano);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3%\u0102\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\7\2=\n\2\f\2\16\2@\13"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4Q\n"+
		"\4\f\4\16\4T\13\4\5\4V\n\4\3\4\3\4\3\4\3\4\3\4\5\4]\n\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\6\6\6h\n\6\r\6\16\6i\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\5\7s\n\7\3\b\3\b\3\t\6\tx\n\t\r\t\16\ty\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0082"+
		"\n\n\3\13\3\13\3\13\3\13\3\13\7\13\u0089\n\13\f\13\16\13\u008c\13\13\5"+
		"\13\u008e\n\13\3\13\3\13\3\f\3\f\3\f\7\f\u0095\n\f\f\f\16\f\u0098\13\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\7\r\u00a1\n\r\f\r\16\r\u00a4\13\r\5\r\u00a6"+
		"\n\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00c0\n\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\5\22\u00cd\n\22"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\5\24\u00d6\n\24\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\6\26\u00df\n\26\r\26\16\26\u00e0\5\26\u00e3\n\26\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\6\30\u00ec\n\30\r\30\16\30\u00ed\5\30\u00f0"+
		"\n\30\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u00f8\n\32\3\33\3\33\5\33\u00fc"+
		"\n\33\3\34\3\34\3\35\3\35\3\35\2\36\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668\2\t\3\2\6\b\4\2!!##\3\2\30\31\3\2\25\26\3\2"+
		"\21\22\3\2\23\24\3\2\f\r\u0101\2:\3\2\2\2\4A\3\2\2\2\6J\3\2\2\2\bc\3\2"+
		"\2\2\ng\3\2\2\2\fr\3\2\2\2\16t\3\2\2\2\20w\3\2\2\2\22\u0081\3\2\2\2\24"+
		"\u0083\3\2\2\2\26\u0091\3\2\2\2\30\u00a5\3\2\2\2\32\u00a7\3\2\2\2\34\u00ab"+
		"\3\2\2\2\36\u00bf\3\2\2\2 \u00c1\3\2\2\2\"\u00cc\3\2\2\2$\u00ce\3\2\2"+
		"\2&\u00d5\3\2\2\2(\u00d7\3\2\2\2*\u00e2\3\2\2\2,\u00e4\3\2\2\2.\u00ef"+
		"\3\2\2\2\60\u00f1\3\2\2\2\62\u00f7\3\2\2\2\64\u00fb\3\2\2\2\66\u00fd\3"+
		"\2\2\28\u00ff\3\2\2\2:>\5\4\3\2;=\5\6\4\2<;\3\2\2\2=@\3\2\2\2><\3\2\2"+
		"\2>?\3\2\2\2?\3\3\2\2\2@>\3\2\2\2AB\7\6\2\2BC\7\3\2\2CD\7\t\2\2DE\7\n"+
		"\2\2EF\7\4\2\2FG\5\n\6\2GH\5\20\t\2HI\7\5\2\2I\5\3\2\2\2JK\5\16\b\2KL"+
		"\7#\2\2LU\7\t\2\2MR\5\b\5\2NO\7\37\2\2OQ\5\b\5\2PN\3\2\2\2QT\3\2\2\2R"+
		"P\3\2\2\2RS\3\2\2\2SV\3\2\2\2TR\3\2\2\2UM\3\2\2\2UV\3\2\2\2VW\3\2\2\2"+
		"WX\7\n\2\2X\\\7\4\2\2YZ\5\n\6\2Z[\5\20\t\2[]\3\2\2\2\\Y\3\2\2\2\\]\3\2"+
		"\2\2]^\3\2\2\2^_\7\36\2\2_`\5\"\22\2`a\7\34\2\2ab\7\5\2\2b\7\3\2\2\2c"+
		"d\5\16\b\2de\7#\2\2e\t\3\2\2\2fh\5\f\7\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2"+
		"ij\3\2\2\2j\13\3\2\2\2kl\5\16\b\2lm\7#\2\2mn\7\34\2\2ns\3\2\2\2op\5\16"+
		"\b\2pq\5\34\17\2qs\3\2\2\2rk\3\2\2\2ro\3\2\2\2s\r\3\2\2\2tu\t\2\2\2u\17"+
		"\3\2\2\2vx\5\22\n\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\21\3\2\2"+
		"\2{\u0082\5\26\f\2|\u0082\5\32\16\2}\u0082\5\34\17\2~\u0082\5\36\20\2"+
		"\177\u0082\5 \21\2\u0080\u0082\5\24\13\2\u0081{\3\2\2\2\u0081|\3\2\2\2"+
		"\u0081}\3\2\2\2\u0081~\3\2\2\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082"+
		"\23\3\2\2\2\u0083\u0084\7#\2\2\u0084\u008d\7\t\2\2\u0085\u008a\5\62\32"+
		"\2\u0086\u0087\7\37\2\2\u0087\u0089\5\62\32\2\u0088\u0086\3\2\2\2\u0089"+
		"\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008e\3\2"+
		"\2\2\u008c\u008a\3\2\2\2\u008d\u0085\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u0090\7\n\2\2\u0090\25\3\2\2\2\u0091\u0092\7\32\2"+
		"\2\u0092\u0096\7\t\2\2\u0093\u0095\5\30\r\2\u0094\u0093\3\2\2\2\u0095"+
		"\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2"+
		"\2\2\u0098\u0096\3\2\2\2\u0099\u009a\7\n\2\2\u009a\u009b\7\34\2\2\u009b"+
		"\27\3\2\2\2\u009c\u00a6\7!\2\2\u009d\u00a2\7#\2\2\u009e\u009f\7\35\2\2"+
		"\u009f\u00a1\t\3\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0"+
		"\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5"+
		"\u009c\3\2\2\2\u00a5\u009d\3\2\2\2\u00a6\31\3\2\2\2\u00a7\u00a8\7\4\2"+
		"\2\u00a8\u00a9\5\20\t\2\u00a9\u00aa\7\5\2\2\u00aa\33\3\2\2\2\u00ab\u00ac"+
		"\7#\2\2\u00ac\u00ad\7\27\2\2\u00ad\u00ae\5\"\22\2\u00ae\u00af\7\34\2\2"+
		"\u00af\35\3\2\2\2\u00b0\u00b1\7\16\2\2\u00b1\u00b2\7\t\2\2\u00b2\u00b3"+
		"\5\"\22\2\u00b3\u00b4\7\n\2\2\u00b4\u00b5\7\t\2\2\u00b5\u00b6\5\32\16"+
		"\2\u00b6\u00c0\3\2\2\2\u00b7\u00b8\7\16\2\2\u00b8\u00b9\7\t\2\2\u00b9"+
		"\u00ba\5\"\22\2\u00ba\u00bb\7\n\2\2\u00bb\u00bc\5\32\16\2\u00bc\u00bd"+
		"\7\20\2\2\u00bd\u00be\5\32\16\2\u00be\u00c0\3\2\2\2\u00bf\u00b0\3\2\2"+
		"\2\u00bf\u00b7\3\2\2\2\u00c0\37\3\2\2\2\u00c1\u00c2\7\13\2\2\u00c2\u00c3"+
		"\7\t\2\2\u00c3\u00c4\5\"\22\2\u00c4\u00c5\7\n\2\2\u00c5\u00c6\5\22\n\2"+
		"\u00c6!\3\2\2\2\u00c7\u00cd\5&\24\2\u00c8\u00c9\5&\24\2\u00c9\u00ca\5"+
		"$\23\2\u00ca\u00cb\5&\24\2\u00cb\u00cd\3\2\2\2\u00cc\u00c7\3\2\2\2\u00cc"+
		"\u00c8\3\2\2\2\u00cd#\3\2\2\2\u00ce\u00cf\t\4\2\2\u00cf%\3\2\2\2\u00d0"+
		"\u00d6\5*\26\2\u00d1\u00d2\5*\26\2\u00d2\u00d3\5(\25\2\u00d3\u00d4\5*"+
		"\26\2\u00d4\u00d6\3\2\2\2\u00d5\u00d0\3\2\2\2\u00d5\u00d1\3\2\2\2\u00d6"+
		"\'\3\2\2\2\u00d7\u00d8\t\5\2\2\u00d8)\3\2\2\2\u00d9\u00e3\5.\30\2\u00da"+
		"\u00de\5.\30\2\u00db\u00dc\5,\27\2\u00dc\u00dd\5.\30\2\u00dd\u00df\3\2"+
		"\2\2\u00de\u00db\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00d9\3\2\2\2\u00e2\u00da\3\2"+
		"\2\2\u00e3+\3\2\2\2\u00e4\u00e5\t\6\2\2\u00e5-\3\2\2\2\u00e6\u00f0\5\62"+
		"\32\2\u00e7\u00eb\5\62\32\2\u00e8\u00e9\5\60\31\2\u00e9\u00ea\5\62\32"+
		"\2\u00ea\u00ec\3\2\2\2\u00eb\u00e8\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00eb"+
		"\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00e6\3\2\2\2\u00ef"+
		"\u00e7\3\2\2\2\u00f0/\3\2\2\2\u00f1\u00f2\t\7\2\2\u00f2\61\3\2\2\2\u00f3"+
		"\u00f8\7#\2\2\u00f4\u00f8\5\64\33\2\u00f5\u00f8\7!\2\2\u00f6\u00f8\5\24"+
		"\13\2\u00f7\u00f3\3\2\2\2\u00f7\u00f4\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7"+
		"\u00f6\3\2\2\2\u00f8\63\3\2\2\2\u00f9\u00fc\5\66\34\2\u00fa\u00fc\58\35"+
		"\2\u00fb\u00f9\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc\65\3\2\2\2\u00fd\u00fe"+
		"\7\"\2\2\u00fe\67\3\2\2\2\u00ff\u0100\t\b\2\2\u01009\3\2\2\2\30>RU\\i"+
		"ry\u0081\u008a\u008d\u0096\u00a2\u00a5\u00bf\u00cc\u00d5\u00e0\u00e2\u00ed"+
		"\u00ef\u00f7\u00fb";
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