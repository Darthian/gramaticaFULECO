// Generated from /Users/ian/Documents/ANTLR/fuleco/Fuleco.g4 by ANTLR 4.1
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
public class FulecoLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		GAMBETEAR=1, PATEAR=2, PITAR=3, MOSTRAR_MARCADOR=4, SAQUE_INICIAL=5, GOL=6, 
		AUTOGOL=7, ARBITRO=8, SOBORNO=9, TIEMPO_ADICIONAL=10, QUEMAR_TIEMPO=11, 
		LESIONAR=12, ANIMAR=13, CARA=14, SELLO=15, EMPATE=16, PENALTY=17, BRASILERO=18, 
		ALEMAN=19, COMILLAS=20, PARENTESIS_IZQ=21, PARENTESIS_DER=22, CONCATENAR=23, 
		FIN_LINEA=24, WS=25, CADENA=26, NUMEROS=27, VARIABLE=28, DIGITOS=29, LETRA=30;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'GAMBETEAR'", "'(>_<)'", "'(>o<)'", "'MOSTRAR_MARCADOR'", "'SAQUE_INICIAL'", 
		"'GOL'", "'AUTOGOL'", "'ARBITRO'", "'SOBORNO'", "'TIEMPO_ADICIONAL'", 
		"'QUEMAR_TIEMPO'", "'LESIONAR'", "'ANIMAR'", "'CARA'", "'SELLO'", "'EMPATE'", 
		"'PENALTY'", "'BRASILERO'", "'ALEMAN'", "'\"'", "'('", "')'", "'+'", "'!'", 
		"WS", "CADENA", "NUMEROS", "VARIABLE", "DIGITOS", "LETRA"
	};
	public static final String[] ruleNames = {
		"GAMBETEAR", "PATEAR", "PITAR", "MOSTRAR_MARCADOR", "SAQUE_INICIAL", "GOL", 
		"AUTOGOL", "ARBITRO", "SOBORNO", "TIEMPO_ADICIONAL", "QUEMAR_TIEMPO", 
		"LESIONAR", "ANIMAR", "CARA", "SELLO", "EMPATE", "PENALTY", "BRASILERO", 
		"ALEMAN", "COMILLAS", "PARENTESIS_IZQ", "PARENTESIS_DER", "CONCATENAR", 
		"FIN_LINEA", "WS", "CADENA", "NUMEROS", "VARIABLE", "DIGITOS", "LETRA"
	};


	public FulecoLexer(CharStream input) {
		super(input);
//		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
		_interp = new LexerATNSimulator(this,_ATN);
	}

	@Override
	public String getGrammarFileName() { return "Fuleco.g4"; }

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
		case 24: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2 \u0115\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3"+
		"\27\3\30\3\30\3\31\3\31\3\32\6\32\u00f6\n\32\r\32\16\32\u00f7\3\32\3\32"+
		"\3\33\3\33\7\33\u00fe\n\33\f\33\16\33\u0101\13\33\3\33\3\33\3\34\6\34"+
		"\u0106\n\34\r\34\16\34\u0107\3\35\3\35\3\35\7\35\u010d\n\35\f\35\16\35"+
		"\u0110\13\35\3\36\3\36\3\37\3\37\3\u00ff \3\3\1\5\4\1\7\5\1\t\6\1\13\7"+
		"\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37"+
		"\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\2"+
		"\65\34\1\67\35\19\36\1;\37\1= \1\3\2\5\5\2\13\f\17\17\"\"\3\2\62;\6\2"+
		"C\\aac|~~\u0119\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3?\3\2\2\2\5I\3\2\2\2\7O\3\2\2\2\tU\3"+
		"\2\2\2\13f\3\2\2\2\rt\3\2\2\2\17x\3\2\2\2\21\u0080\3\2\2\2\23\u0088\3"+
		"\2\2\2\25\u0090\3\2\2\2\27\u00a1\3\2\2\2\31\u00af\3\2\2\2\33\u00b8\3\2"+
		"\2\2\35\u00bf\3\2\2\2\37\u00c4\3\2\2\2!\u00ca\3\2\2\2#\u00d1\3\2\2\2%"+
		"\u00d9\3\2\2\2\'\u00e3\3\2\2\2)\u00ea\3\2\2\2+\u00ec\3\2\2\2-\u00ee\3"+
		"\2\2\2/\u00f0\3\2\2\2\61\u00f2\3\2\2\2\63\u00f5\3\2\2\2\65\u00fb\3\2\2"+
		"\2\67\u0105\3\2\2\29\u0109\3\2\2\2;\u0111\3\2\2\2=\u0113\3\2\2\2?@\7I"+
		"\2\2@A\7C\2\2AB\7O\2\2BC\7D\2\2CD\7G\2\2DE\7V\2\2EF\7G\2\2FG\7C\2\2GH"+
		"\7T\2\2H\4\3\2\2\2IJ\7*\2\2JK\7@\2\2KL\7a\2\2LM\7>\2\2MN\7+\2\2N\6\3\2"+
		"\2\2OP\7*\2\2PQ\7@\2\2QR\7q\2\2RS\7>\2\2ST\7+\2\2T\b\3\2\2\2UV\7O\2\2"+
		"VW\7Q\2\2WX\7U\2\2XY\7V\2\2YZ\7T\2\2Z[\7C\2\2[\\\7T\2\2\\]\7a\2\2]^\7"+
		"O\2\2^_\7C\2\2_`\7T\2\2`a\7E\2\2ab\7C\2\2bc\7F\2\2cd\7Q\2\2de\7T\2\2e"+
		"\n\3\2\2\2fg\7U\2\2gh\7C\2\2hi\7S\2\2ij\7W\2\2jk\7G\2\2kl\7a\2\2lm\7K"+
		"\2\2mn\7P\2\2no\7K\2\2op\7E\2\2pq\7K\2\2qr\7C\2\2rs\7N\2\2s\f\3\2\2\2"+
		"tu\7I\2\2uv\7Q\2\2vw\7N\2\2w\16\3\2\2\2xy\7C\2\2yz\7W\2\2z{\7V\2\2{|\7"+
		"Q\2\2|}\7I\2\2}~\7Q\2\2~\177\7N\2\2\177\20\3\2\2\2\u0080\u0081\7C\2\2"+
		"\u0081\u0082\7T\2\2\u0082\u0083\7D\2\2\u0083\u0084\7K\2\2\u0084\u0085"+
		"\7V\2\2\u0085\u0086\7T\2\2\u0086\u0087\7Q\2\2\u0087\22\3\2\2\2\u0088\u0089"+
		"\7U\2\2\u0089\u008a\7Q\2\2\u008a\u008b\7D\2\2\u008b\u008c\7Q\2\2\u008c"+
		"\u008d\7T\2\2\u008d\u008e\7P\2\2\u008e\u008f\7Q\2\2\u008f\24\3\2\2\2\u0090"+
		"\u0091\7V\2\2\u0091\u0092\7K\2\2\u0092\u0093\7G\2\2\u0093\u0094\7O\2\2"+
		"\u0094\u0095\7R\2\2\u0095\u0096\7Q\2\2\u0096\u0097\7a\2\2\u0097\u0098"+
		"\7C\2\2\u0098\u0099\7F\2\2\u0099\u009a\7K\2\2\u009a\u009b\7E\2\2\u009b"+
		"\u009c\7K\2\2\u009c\u009d\7Q\2\2\u009d\u009e\7P\2\2\u009e\u009f\7C\2\2"+
		"\u009f\u00a0\7N\2\2\u00a0\26\3\2\2\2\u00a1\u00a2\7S\2\2\u00a2\u00a3\7"+
		"W\2\2\u00a3\u00a4\7G\2\2\u00a4\u00a5\7O\2\2\u00a5\u00a6\7C\2\2\u00a6\u00a7"+
		"\7T\2\2\u00a7\u00a8\7a\2\2\u00a8\u00a9\7V\2\2\u00a9\u00aa\7K\2\2\u00aa"+
		"\u00ab\7G\2\2\u00ab\u00ac\7O\2\2\u00ac\u00ad\7R\2\2\u00ad\u00ae\7Q\2\2"+
		"\u00ae\30\3\2\2\2\u00af\u00b0\7N\2\2\u00b0\u00b1\7G\2\2\u00b1\u00b2\7"+
		"U\2\2\u00b2\u00b3\7K\2\2\u00b3\u00b4\7Q\2\2\u00b4\u00b5\7P\2\2\u00b5\u00b6"+
		"\7C\2\2\u00b6\u00b7\7T\2\2\u00b7\32\3\2\2\2\u00b8\u00b9\7C\2\2\u00b9\u00ba"+
		"\7P\2\2\u00ba\u00bb\7K\2\2\u00bb\u00bc\7O\2\2\u00bc\u00bd\7C\2\2\u00bd"+
		"\u00be\7T\2\2\u00be\34\3\2\2\2\u00bf\u00c0\7E\2\2\u00c0\u00c1\7C\2\2\u00c1"+
		"\u00c2\7T\2\2\u00c2\u00c3\7C\2\2\u00c3\36\3\2\2\2\u00c4\u00c5\7U\2\2\u00c5"+
		"\u00c6\7G\2\2\u00c6\u00c7\7N\2\2\u00c7\u00c8\7N\2\2\u00c8\u00c9\7Q\2\2"+
		"\u00c9 \3\2\2\2\u00ca\u00cb\7G\2\2\u00cb\u00cc\7O\2\2\u00cc\u00cd\7R\2"+
		"\2\u00cd\u00ce\7C\2\2\u00ce\u00cf\7V\2\2\u00cf\u00d0\7G\2\2\u00d0\"\3"+
		"\2\2\2\u00d1\u00d2\7R\2\2\u00d2\u00d3\7G\2\2\u00d3\u00d4\7P\2\2\u00d4"+
		"\u00d5\7C\2\2\u00d5\u00d6\7N\2\2\u00d6\u00d7\7V\2\2\u00d7\u00d8\7[\2\2"+
		"\u00d8$\3\2\2\2\u00d9\u00da\7D\2\2\u00da\u00db\7T\2\2\u00db\u00dc\7C\2"+
		"\2\u00dc\u00dd\7U\2\2\u00dd\u00de\7K\2\2\u00de\u00df\7N\2\2\u00df\u00e0"+
		"\7G\2\2\u00e0\u00e1\7T\2\2\u00e1\u00e2\7Q\2\2\u00e2&\3\2\2\2\u00e3\u00e4"+
		"\7C\2\2\u00e4\u00e5\7N\2\2\u00e5\u00e6\7G\2\2\u00e6\u00e7\7O\2\2\u00e7"+
		"\u00e8\7C\2\2\u00e8\u00e9\7P\2\2\u00e9(\3\2\2\2\u00ea\u00eb\7$\2\2\u00eb"+
		"*\3\2\2\2\u00ec\u00ed\7*\2\2\u00ed,\3\2\2\2\u00ee\u00ef\7+\2\2\u00ef."+
		"\3\2\2\2\u00f0\u00f1\7-\2\2\u00f1\60\3\2\2\2\u00f2\u00f3\7#\2\2\u00f3"+
		"\62\3\2\2\2\u00f4\u00f6\t\2\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3\2\2"+
		"\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa"+
		"\b\32\2\2\u00fa\64\3\2\2\2\u00fb\u00ff\5)\25\2\u00fc\u00fe\13\2\2\2\u00fd"+
		"\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u0100\3\2\2\2\u00ff\u00fd\3\2"+
		"\2\2\u0100\u0102\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0103\5)\25\2\u0103"+
		"\66\3\2\2\2\u0104\u0106\5;\36\2\u0105\u0104\3\2\2\2\u0106\u0107\3\2\2"+
		"\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u01088\3\2\2\2\u0109\u010e"+
		"\5=\37\2\u010a\u010d\5=\37\2\u010b\u010d\5;\36\2\u010c\u010a\3\2\2\2\u010c"+
		"\u010b\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2"+
		"\2\2\u010f:\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0112\t\3\2\2\u0112<\3\2"+
		"\2\2\u0113\u0114\t\4\2\2\u0114>\3\2\2\2\b\2\u00f7\u00ff\u0107\u010c\u010e";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}