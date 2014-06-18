// Generated from /Users/ian/Documents/ANTLR/fuleco/Fuleco_v2.g4 by ANTLR 4.1
package fuleco;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Fuleco_v2Lexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'SAQUE_INICIAL'", "'(>_<)'", "'(>.<)'", "'Brasilero'", "'Aleman'", "'Japon'", 
		"'('", "')'", "'GAMBETEAR'", "'GOL'", "'AUTOGOL'", "'ARBITRO'", "'PIENSA'", 
		"'SOBORNO'", "'TIEMPO_ADICIONAL'", "'QUEMAR_TIEMPO'", "'LESIONAR'", "'ANIMAR'", 
		"'CARA'", "'SELLO'", "'EMPATE'", "'PENALTY'", "'!='", "'MOSTRAR_MARCADOR'", 
		"'\"'", "'!'", "'+'", "WS", "CADENA", "NUMEROS", "VARIABLE", "DIGITOS", 
		"LETRA"
	};
	public static final String[] ruleNames = {
		"SAQUE_INICIAL", "ABRIR_LLAVE", "CERRAR_LLAVE", "BRASILERO", "ALEMAN", 
		"JAPON", "PARENTESIS_IZQ", "PARENTESIS_DER", "GAMBETEAR", "TRUE", "FALSE", 
		"ARBITRO", "ENTONCES", "SOBORNO", "TIEMPO_ADICIONAL", "QUEMAR_TIEMPO", 
		"LESIONAR", "ANIMAR", "CARA", "SELLO", "EMPATE", "PENALTY", "DIFERENTE", 
		"MOSTRAR_MARCADOR", "COMILLAS", "FIN_LINEA", "CONCATENAR", "WS", "CADENA", 
		"NUMEROS", "VARIABLE", "DIGITOS", "LETRA"
	};


	public Fuleco_v2Lexer(CharStream input) {
		super(input);
//		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
		_interp = new LexerATNSimulator(this,_ATN);
	}

	@Override
	public String getGrammarFileName() { return "Fuleco_v2.g4"; }

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
		case 27: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2#\u012b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\6\35\u010c\n\35\r\35\16\35\u010d\3\35\3\35\3\36\3\36\7"+
		"\36\u0114\n\36\f\36\16\36\u0117\13\36\3\36\3\36\3\37\6\37\u011c\n\37\r"+
		"\37\16\37\u011d\3 \3 \3 \7 \u0123\n \f \16 \u0126\13 \3!\3!\3\"\3\"\3"+
		"\u0115#\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25"+
		"\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)"+
		"\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36\2;\37\1= "+
		"\1?!\1A\"\1C#\1\3\2\5\5\2\13\f\17\17\"\"\3\2\62;\6\2C\\aac|~~\u012f\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3E\3\2\2\2\5S\3\2\2\2"+
		"\7Y\3\2\2\2\t_\3\2\2\2\13i\3\2\2\2\rp\3\2\2\2\17v\3\2\2\2\21x\3\2\2\2"+
		"\23z\3\2\2\2\25\u0084\3\2\2\2\27\u0088\3\2\2\2\31\u0090\3\2\2\2\33\u0098"+
		"\3\2\2\2\35\u009f\3\2\2\2\37\u00a7\3\2\2\2!\u00b8\3\2\2\2#\u00c6\3\2\2"+
		"\2%\u00cf\3\2\2\2\'\u00d6\3\2\2\2)\u00db\3\2\2\2+\u00e1\3\2\2\2-\u00e8"+
		"\3\2\2\2/\u00f0\3\2\2\2\61\u00f3\3\2\2\2\63\u0104\3\2\2\2\65\u0106\3\2"+
		"\2\2\67\u0108\3\2\2\29\u010b\3\2\2\2;\u0111\3\2\2\2=\u011b\3\2\2\2?\u011f"+
		"\3\2\2\2A\u0127\3\2\2\2C\u0129\3\2\2\2EF\7U\2\2FG\7C\2\2GH\7S\2\2HI\7"+
		"W\2\2IJ\7G\2\2JK\7a\2\2KL\7K\2\2LM\7P\2\2MN\7K\2\2NO\7E\2\2OP\7K\2\2P"+
		"Q\7C\2\2QR\7N\2\2R\4\3\2\2\2ST\7*\2\2TU\7@\2\2UV\7a\2\2VW\7>\2\2WX\7+"+
		"\2\2X\6\3\2\2\2YZ\7*\2\2Z[\7@\2\2[\\\7\60\2\2\\]\7>\2\2]^\7+\2\2^\b\3"+
		"\2\2\2_`\7D\2\2`a\7t\2\2ab\7c\2\2bc\7u\2\2cd\7k\2\2de\7n\2\2ef\7g\2\2"+
		"fg\7t\2\2gh\7q\2\2h\n\3\2\2\2ij\7C\2\2jk\7n\2\2kl\7g\2\2lm\7o\2\2mn\7"+
		"c\2\2no\7p\2\2o\f\3\2\2\2pq\7L\2\2qr\7c\2\2rs\7r\2\2st\7q\2\2tu\7p\2\2"+
		"u\16\3\2\2\2vw\7*\2\2w\20\3\2\2\2xy\7+\2\2y\22\3\2\2\2z{\7I\2\2{|\7C\2"+
		"\2|}\7O\2\2}~\7D\2\2~\177\7G\2\2\177\u0080\7V\2\2\u0080\u0081\7G\2\2\u0081"+
		"\u0082\7C\2\2\u0082\u0083\7T\2\2\u0083\24\3\2\2\2\u0084\u0085\7I\2\2\u0085"+
		"\u0086\7Q\2\2\u0086\u0087\7N\2\2\u0087\26\3\2\2\2\u0088\u0089\7C\2\2\u0089"+
		"\u008a\7W\2\2\u008a\u008b\7V\2\2\u008b\u008c\7Q\2\2\u008c\u008d\7I\2\2"+
		"\u008d\u008e\7Q\2\2\u008e\u008f\7N\2\2\u008f\30\3\2\2\2\u0090\u0091\7"+
		"C\2\2\u0091\u0092\7T\2\2\u0092\u0093\7D\2\2\u0093\u0094\7K\2\2\u0094\u0095"+
		"\7V\2\2\u0095\u0096\7T\2\2\u0096\u0097\7Q\2\2\u0097\32\3\2\2\2\u0098\u0099"+
		"\7R\2\2\u0099\u009a\7K\2\2\u009a\u009b\7G\2\2\u009b\u009c\7P\2\2\u009c"+
		"\u009d\7U\2\2\u009d\u009e\7C\2\2\u009e\34\3\2\2\2\u009f\u00a0\7U\2\2\u00a0"+
		"\u00a1\7Q\2\2\u00a1\u00a2\7D\2\2\u00a2\u00a3\7Q\2\2\u00a3\u00a4\7T\2\2"+
		"\u00a4\u00a5\7P\2\2\u00a5\u00a6\7Q\2\2\u00a6\36\3\2\2\2\u00a7\u00a8\7"+
		"V\2\2\u00a8\u00a9\7K\2\2\u00a9\u00aa\7G\2\2\u00aa\u00ab\7O\2\2\u00ab\u00ac"+
		"\7R\2\2\u00ac\u00ad\7Q\2\2\u00ad\u00ae\7a\2\2\u00ae\u00af\7C\2\2\u00af"+
		"\u00b0\7F\2\2\u00b0\u00b1\7K\2\2\u00b1\u00b2\7E\2\2\u00b2\u00b3\7K\2\2"+
		"\u00b3\u00b4\7Q\2\2\u00b4\u00b5\7P\2\2\u00b5\u00b6\7C\2\2\u00b6\u00b7"+
		"\7N\2\2\u00b7 \3\2\2\2\u00b8\u00b9\7S\2\2\u00b9\u00ba\7W\2\2\u00ba\u00bb"+
		"\7G\2\2\u00bb\u00bc\7O\2\2\u00bc\u00bd\7C\2\2\u00bd\u00be\7T\2\2\u00be"+
		"\u00bf\7a\2\2\u00bf\u00c0\7V\2\2\u00c0\u00c1\7K\2\2\u00c1\u00c2\7G\2\2"+
		"\u00c2\u00c3\7O\2\2\u00c3\u00c4\7R\2\2\u00c4\u00c5\7Q\2\2\u00c5\"\3\2"+
		"\2\2\u00c6\u00c7\7N\2\2\u00c7\u00c8\7G\2\2\u00c8\u00c9\7U\2\2\u00c9\u00ca"+
		"\7K\2\2\u00ca\u00cb\7Q\2\2\u00cb\u00cc\7P\2\2\u00cc\u00cd\7C\2\2\u00cd"+
		"\u00ce\7T\2\2\u00ce$\3\2\2\2\u00cf\u00d0\7C\2\2\u00d0\u00d1\7P\2\2\u00d1"+
		"\u00d2\7K\2\2\u00d2\u00d3\7O\2\2\u00d3\u00d4\7C\2\2\u00d4\u00d5\7T\2\2"+
		"\u00d5&\3\2\2\2\u00d6\u00d7\7E\2\2\u00d7\u00d8\7C\2\2\u00d8\u00d9\7T\2"+
		"\2\u00d9\u00da\7C\2\2\u00da(\3\2\2\2\u00db\u00dc\7U\2\2\u00dc\u00dd\7"+
		"G\2\2\u00dd\u00de\7N\2\2\u00de\u00df\7N\2\2\u00df\u00e0\7Q\2\2\u00e0*"+
		"\3\2\2\2\u00e1\u00e2\7G\2\2\u00e2\u00e3\7O\2\2\u00e3\u00e4\7R\2\2\u00e4"+
		"\u00e5\7C\2\2\u00e5\u00e6\7V\2\2\u00e6\u00e7\7G\2\2\u00e7,\3\2\2\2\u00e8"+
		"\u00e9\7R\2\2\u00e9\u00ea\7G\2\2\u00ea\u00eb\7P\2\2\u00eb\u00ec\7C\2\2"+
		"\u00ec\u00ed\7N\2\2\u00ed\u00ee\7V\2\2\u00ee\u00ef\7[\2\2\u00ef.\3\2\2"+
		"\2\u00f0\u00f1\7#\2\2\u00f1\u00f2\7?\2\2\u00f2\60\3\2\2\2\u00f3\u00f4"+
		"\7O\2\2\u00f4\u00f5\7Q\2\2\u00f5\u00f6\7U\2\2\u00f6\u00f7\7V\2\2\u00f7"+
		"\u00f8\7T\2\2\u00f8\u00f9\7C\2\2\u00f9\u00fa\7T\2\2\u00fa\u00fb\7a\2\2"+
		"\u00fb\u00fc\7O\2\2\u00fc\u00fd\7C\2\2\u00fd\u00fe\7T\2\2\u00fe\u00ff"+
		"\7E\2\2\u00ff\u0100\7C\2\2\u0100\u0101\7F\2\2\u0101\u0102\7Q\2\2\u0102"+
		"\u0103\7T\2\2\u0103\62\3\2\2\2\u0104\u0105\7$\2\2\u0105\64\3\2\2\2\u0106"+
		"\u0107\7#\2\2\u0107\66\3\2\2\2\u0108\u0109\7-\2\2\u01098\3\2\2\2\u010a"+
		"\u010c\t\2\2\2\u010b\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010b\3\2"+
		"\2\2\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\b\35\2\2\u0110"+
		":\3\2\2\2\u0111\u0115\5\63\32\2\u0112\u0114\13\2\2\2\u0113\u0112\3\2\2"+
		"\2\u0114\u0117\3\2\2\2\u0115\u0116\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0118"+
		"\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u0119\5\63\32\2\u0119<\3\2\2\2\u011a"+
		"\u011c\5A!\2\u011b\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011b\3\2\2"+
		"\2\u011d\u011e\3\2\2\2\u011e>\3\2\2\2\u011f\u0124\5C\"\2\u0120\u0123\5"+
		"C\"\2\u0121\u0123\5A!\2\u0122\u0120\3\2\2\2\u0122\u0121\3\2\2\2\u0123"+
		"\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125@\3\2\2\2"+
		"\u0126\u0124\3\2\2\2\u0127\u0128\t\3\2\2\u0128B\3\2\2\2\u0129\u012a\t"+
		"\4\2\2\u012aD\3\2\2\2\b\2\u010d\u0115\u011d\u0122\u0124";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}