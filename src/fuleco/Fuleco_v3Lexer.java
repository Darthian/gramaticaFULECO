package fuleco;
// Generated from C:\Users\Alexandra\Desktop\proyecto de lenguajes\FULECO_V3\Fuleco_v3.g4 by ANTLR 4.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Fuleco_v3Lexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'SAQUE_INICIAL'", "'(>_<)'", "'(>.<)'", "'Brasilero'", "'Aleman'", "'Japon'", 
		"'('", "')'", "'GAMBETEAR'", "'GOL'", "'AUTOGOL'", "'ARBITRO'", "'PIENSA'", 
		"'SOBORNO'", "'TIEMPO_ADICIONAL'", "'QUEMAR_TIEMPO'", "'LESIONAR'", "'ANIMAR'", 
		"'CARA'", "'SELLO'", "'EMPATE'", "'PENALTY'", "'!='", "'MOSTRAR_MARCADOR'", 
		"'\"'", "'!'", "'+'", "'return'", "','", "WS", "CADENA", "NUMEROS", "VARIABLE", 
		"DIGITOS", "LETRA"
	};
	public static final String[] ruleNames = {
		"SAQUE_INICIAL", "ABRIR_LLAVE", "CERRAR_LLAVE", "BRASILERO", "ALEMAN", 
		"JAPON", "PARENTESIS_IZQ", "PARENTESIS_DER", "GAMBETEAR", "TRUE", "FALSE", 
		"ARBITRO", "ENTONCES", "SOBORNO", "TIEMPO_ADICIONAL", "QUEMAR_TIEMPO", 
		"LESIONAR", "ANIMAR", "CARA", "SELLO", "EMPATE", "PENALTY", "DIFERENTE", 
		"MOSTRAR_MARCADOR", "COMILLAS", "FIN_LINEA", "CONCATENAR", "RETURN", "COMA", 
		"WS", "CADENA", "NUMEROS", "VARIABLE", "DIGITOS", "LETRA"
	};


	public Fuleco_v3Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Fuleco_v3.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 29: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2%\u0138\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\37"+
		"\6\37\u0119\n\37\r\37\16\37\u011a\3\37\3\37\3 \3 \7 \u0121\n \f \16 \u0124"+
		"\13 \3 \3 \3!\6!\u0129\n!\r!\16!\u012a\3\"\3\"\3\"\7\"\u0130\n\"\f\"\16"+
		"\"\u0133\13\"\3#\3#\3$\3$\3\u0122%\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b"+
		"\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1"+
		"!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34"+
		"\1\67\35\19\36\1;\37\1= \2?!\1A\"\1C#\1E$\1G%\1\3\2\5\5\2\13\f\17\17\""+
		"\"\3\2\62;\6\2C\\aac|~~\u013c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\3I\3\2\2\2\5W\3\2\2\2\7]\3\2\2\2\tc\3"+
		"\2\2\2\13m\3\2\2\2\rt\3\2\2\2\17z\3\2\2\2\21|\3\2\2\2\23~\3\2\2\2\25\u0088"+
		"\3\2\2\2\27\u008c\3\2\2\2\31\u0094\3\2\2\2\33\u009c\3\2\2\2\35\u00a3\3"+
		"\2\2\2\37\u00ab\3\2\2\2!\u00bc\3\2\2\2#\u00ca\3\2\2\2%\u00d3\3\2\2\2\'"+
		"\u00da\3\2\2\2)\u00df\3\2\2\2+\u00e5\3\2\2\2-\u00ec\3\2\2\2/\u00f4\3\2"+
		"\2\2\61\u00f7\3\2\2\2\63\u0108\3\2\2\2\65\u010a\3\2\2\2\67\u010c\3\2\2"+
		"\29\u010e\3\2\2\2;\u0115\3\2\2\2=\u0118\3\2\2\2?\u011e\3\2\2\2A\u0128"+
		"\3\2\2\2C\u012c\3\2\2\2E\u0134\3\2\2\2G\u0136\3\2\2\2IJ\7U\2\2JK\7C\2"+
		"\2KL\7S\2\2LM\7W\2\2MN\7G\2\2NO\7a\2\2OP\7K\2\2PQ\7P\2\2QR\7K\2\2RS\7"+
		"E\2\2ST\7K\2\2TU\7C\2\2UV\7N\2\2V\4\3\2\2\2WX\7*\2\2XY\7@\2\2YZ\7a\2\2"+
		"Z[\7>\2\2[\\\7+\2\2\\\6\3\2\2\2]^\7*\2\2^_\7@\2\2_`\7\60\2\2`a\7>\2\2"+
		"ab\7+\2\2b\b\3\2\2\2cd\7D\2\2de\7t\2\2ef\7c\2\2fg\7u\2\2gh\7k\2\2hi\7"+
		"n\2\2ij\7g\2\2jk\7t\2\2kl\7q\2\2l\n\3\2\2\2mn\7C\2\2no\7n\2\2op\7g\2\2"+
		"pq\7o\2\2qr\7c\2\2rs\7p\2\2s\f\3\2\2\2tu\7L\2\2uv\7c\2\2vw\7r\2\2wx\7"+
		"q\2\2xy\7p\2\2y\16\3\2\2\2z{\7*\2\2{\20\3\2\2\2|}\7+\2\2}\22\3\2\2\2~"+
		"\177\7I\2\2\177\u0080\7C\2\2\u0080\u0081\7O\2\2\u0081\u0082\7D\2\2\u0082"+
		"\u0083\7G\2\2\u0083\u0084\7V\2\2\u0084\u0085\7G\2\2\u0085\u0086\7C\2\2"+
		"\u0086\u0087\7T\2\2\u0087\24\3\2\2\2\u0088\u0089\7I\2\2\u0089\u008a\7"+
		"Q\2\2\u008a\u008b\7N\2\2\u008b\26\3\2\2\2\u008c\u008d\7C\2\2\u008d\u008e"+
		"\7W\2\2\u008e\u008f\7V\2\2\u008f\u0090\7Q\2\2\u0090\u0091\7I\2\2\u0091"+
		"\u0092\7Q\2\2\u0092\u0093\7N\2\2\u0093\30\3\2\2\2\u0094\u0095\7C\2\2\u0095"+
		"\u0096\7T\2\2\u0096\u0097\7D\2\2\u0097\u0098\7K\2\2\u0098\u0099\7V\2\2"+
		"\u0099\u009a\7T\2\2\u009a\u009b\7Q\2\2\u009b\32\3\2\2\2\u009c\u009d\7"+
		"R\2\2\u009d\u009e\7K\2\2\u009e\u009f\7G\2\2\u009f\u00a0\7P\2\2\u00a0\u00a1"+
		"\7U\2\2\u00a1\u00a2\7C\2\2\u00a2\34\3\2\2\2\u00a3\u00a4\7U\2\2\u00a4\u00a5"+
		"\7Q\2\2\u00a5\u00a6\7D\2\2\u00a6\u00a7\7Q\2\2\u00a7\u00a8\7T\2\2\u00a8"+
		"\u00a9\7P\2\2\u00a9\u00aa\7Q\2\2\u00aa\36\3\2\2\2\u00ab\u00ac\7V\2\2\u00ac"+
		"\u00ad\7K\2\2\u00ad\u00ae\7G\2\2\u00ae\u00af\7O\2\2\u00af\u00b0\7R\2\2"+
		"\u00b0\u00b1\7Q\2\2\u00b1\u00b2\7a\2\2\u00b2\u00b3\7C\2\2\u00b3\u00b4"+
		"\7F\2\2\u00b4\u00b5\7K\2\2\u00b5\u00b6\7E\2\2\u00b6\u00b7\7K\2\2\u00b7"+
		"\u00b8\7Q\2\2\u00b8\u00b9\7P\2\2\u00b9\u00ba\7C\2\2\u00ba\u00bb\7N\2\2"+
		"\u00bb \3\2\2\2\u00bc\u00bd\7S\2\2\u00bd\u00be\7W\2\2\u00be\u00bf\7G\2"+
		"\2\u00bf\u00c0\7O\2\2\u00c0\u00c1\7C\2\2\u00c1\u00c2\7T\2\2\u00c2\u00c3"+
		"\7a\2\2\u00c3\u00c4\7V\2\2\u00c4\u00c5\7K\2\2\u00c5\u00c6\7G\2\2\u00c6"+
		"\u00c7\7O\2\2\u00c7\u00c8\7R\2\2\u00c8\u00c9\7Q\2\2\u00c9\"\3\2\2\2\u00ca"+
		"\u00cb\7N\2\2\u00cb\u00cc\7G\2\2\u00cc\u00cd\7U\2\2\u00cd\u00ce\7K\2\2"+
		"\u00ce\u00cf\7Q\2\2\u00cf\u00d0\7P\2\2\u00d0\u00d1\7C\2\2\u00d1\u00d2"+
		"\7T\2\2\u00d2$\3\2\2\2\u00d3\u00d4\7C\2\2\u00d4\u00d5\7P\2\2\u00d5\u00d6"+
		"\7K\2\2\u00d6\u00d7\7O\2\2\u00d7\u00d8\7C\2\2\u00d8\u00d9\7T\2\2\u00d9"+
		"&\3\2\2\2\u00da\u00db\7E\2\2\u00db\u00dc\7C\2\2\u00dc\u00dd\7T\2\2\u00dd"+
		"\u00de\7C\2\2\u00de(\3\2\2\2\u00df\u00e0\7U\2\2\u00e0\u00e1\7G\2\2\u00e1"+
		"\u00e2\7N\2\2\u00e2\u00e3\7N\2\2\u00e3\u00e4\7Q\2\2\u00e4*\3\2\2\2\u00e5"+
		"\u00e6\7G\2\2\u00e6\u00e7\7O\2\2\u00e7\u00e8\7R\2\2\u00e8\u00e9\7C\2\2"+
		"\u00e9\u00ea\7V\2\2\u00ea\u00eb\7G\2\2\u00eb,\3\2\2\2\u00ec\u00ed\7R\2"+
		"\2\u00ed\u00ee\7G\2\2\u00ee\u00ef\7P\2\2\u00ef\u00f0\7C\2\2\u00f0\u00f1"+
		"\7N\2\2\u00f1\u00f2\7V\2\2\u00f2\u00f3\7[\2\2\u00f3.\3\2\2\2\u00f4\u00f5"+
		"\7#\2\2\u00f5\u00f6\7?\2\2\u00f6\60\3\2\2\2\u00f7\u00f8\7O\2\2\u00f8\u00f9"+
		"\7Q\2\2\u00f9\u00fa\7U\2\2\u00fa\u00fb\7V\2\2\u00fb\u00fc\7T\2\2\u00fc"+
		"\u00fd\7C\2\2\u00fd\u00fe\7T\2\2\u00fe\u00ff\7a\2\2\u00ff\u0100\7O\2\2"+
		"\u0100\u0101\7C\2\2\u0101\u0102\7T\2\2\u0102\u0103\7E\2\2\u0103\u0104"+
		"\7C\2\2\u0104\u0105\7F\2\2\u0105\u0106\7Q\2\2\u0106\u0107\7T\2\2\u0107"+
		"\62\3\2\2\2\u0108\u0109\7$\2\2\u0109\64\3\2\2\2\u010a\u010b\7#\2\2\u010b"+
		"\66\3\2\2\2\u010c\u010d\7-\2\2\u010d8\3\2\2\2\u010e\u010f\7t\2\2\u010f"+
		"\u0110\7g\2\2\u0110\u0111\7v\2\2\u0111\u0112\7w\2\2\u0112\u0113\7t\2\2"+
		"\u0113\u0114\7p\2\2\u0114:\3\2\2\2\u0115\u0116\7.\2\2\u0116<\3\2\2\2\u0117"+
		"\u0119\t\2\2\2\u0118\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u0118\3\2"+
		"\2\2\u011a\u011b\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\b\37\2\2\u011d"+
		">\3\2\2\2\u011e\u0122\5\63\32\2\u011f\u0121\13\2\2\2\u0120\u011f\3\2\2"+
		"\2\u0121\u0124\3\2\2\2\u0122\u0123\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0125"+
		"\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0126\5\63\32\2\u0126@\3\2\2\2\u0127"+
		"\u0129\5E#\2\u0128\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u0128\3\2\2"+
		"\2\u012a\u012b\3\2\2\2\u012bB\3\2\2\2\u012c\u0131\5G$\2\u012d\u0130\5"+
		"G$\2\u012e\u0130\5E#\2\u012f\u012d\3\2\2\2\u012f\u012e\3\2\2\2\u0130\u0133"+
		"\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132D\3\2\2\2\u0133"+
		"\u0131\3\2\2\2\u0134\u0135\t\3\2\2\u0135F\3\2\2\2\u0136\u0137\t\4\2\2"+
		"\u0137H\3\2\2\2\b\2\u011a\u0122\u012a\u012f\u0131";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}