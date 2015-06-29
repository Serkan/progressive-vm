// Generated from /home/serkan/dev/progressive-vm/src/main/resources/Massive.g4 by ANTLR 4.5
package org.test.gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MassiveLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, BOOLEAN_LITERAL=6, STRING_LITERAL=7, 
		NUMBER_LITERAL=8, INTEGER_LITERAL=9, FLOAT_LITERAL=10, LITERAL=11, ARITHMETIC_OPERATOR=12, 
		RELATIONAL_OPERATOR=13, EQUALITY_OPERATOR=14, LOGICAL_OPERATOR=15, INTERNAL_TYPE=16, 
		ID=17, DIGIT=18, LETTER=19, WS=20;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "BOOLEAN_LITERAL", "STRING_LITERAL", 
		"NUMBER_LITERAL", "INTEGER_LITERAL", "FLOAT_LITERAL", "LITERAL", "ARITHMETIC_OPERATOR", 
		"RELATIONAL_OPERATOR", "EQUALITY_OPERATOR", "LOGICAL_OPERATOR", "INTERNAL_TYPE", 
		"ID", "DIGIT", "LETTER", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'='", "'return'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "BOOLEAN_LITERAL", "STRING_LITERAL", 
		"NUMBER_LITERAL", "INTEGER_LITERAL", "FLOAT_LITERAL", "LITERAL", "ARITHMETIC_OPERATOR", 
		"RELATIONAL_OPERATOR", "EQUALITY_OPERATOR", "LOGICAL_OPERATOR", "INTERNAL_TYPE", 
		"ID", "DIGIT", "LETTER", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override
	@NotNull
	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public MassiveLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Massive.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\26\u009a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7D\n"+
		"\7\3\b\3\b\7\bH\n\b\f\b\16\bK\13\b\3\b\3\b\3\t\3\t\5\tQ\n\t\3\n\6\nT\n"+
		"\n\r\n\16\nU\3\13\6\13Y\n\13\r\13\16\13Z\3\13\3\13\6\13_\n\13\r\13\16"+
		"\13`\3\f\3\f\5\fe\n\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\5\16n\n\16\3\17"+
		"\3\17\3\17\3\17\5\17t\n\17\3\20\3\20\3\20\3\20\3\20\5\20{\n\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0086\n\21\3\22\3\22\3\22"+
		"\7\22\u008b\n\22\f\22\16\22\u008e\13\22\3\23\3\23\3\24\3\24\3\25\6\25"+
		"\u0095\n\25\r\25\16\25\u0096\3\25\3\25\3I\2\26\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26\3\2\7\5\2,-//\61\61\4\2>>@@\3\2\62;\3\2C|\5\2\13\f\17\17\"\"\u00a8"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5-\3\2\2\2\7/\3\2\2"+
		"\2\t\66\3\2\2\2\138\3\2\2\2\rC\3\2\2\2\17E\3\2\2\2\21P\3\2\2\2\23S\3\2"+
		"\2\2\25X\3\2\2\2\27d\3\2\2\2\31f\3\2\2\2\33m\3\2\2\2\35s\3\2\2\2\37z\3"+
		"\2\2\2!\u0085\3\2\2\2#\u0087\3\2\2\2%\u008f\3\2\2\2\'\u0091\3\2\2\2)\u0094"+
		"\3\2\2\2+,\7=\2\2,\4\3\2\2\2-.\7?\2\2.\6\3\2\2\2/\60\7t\2\2\60\61\7g\2"+
		"\2\61\62\7v\2\2\62\63\7w\2\2\63\64\7t\2\2\64\65\7p\2\2\65\b\3\2\2\2\66"+
		"\67\7*\2\2\67\n\3\2\2\289\7+\2\29\f\3\2\2\2:;\7h\2\2;<\7c\2\2<=\7n\2\2"+
		"=>\7u\2\2>D\7g\2\2?@\7v\2\2@A\7t\2\2AB\7w\2\2BD\7g\2\2C:\3\2\2\2C?\3\2"+
		"\2\2D\16\3\2\2\2EI\7$\2\2FH\13\2\2\2GF\3\2\2\2HK\3\2\2\2IJ\3\2\2\2IG\3"+
		"\2\2\2JL\3\2\2\2KI\3\2\2\2LM\7$\2\2M\20\3\2\2\2NQ\5\23\n\2OQ\5\25\13\2"+
		"PN\3\2\2\2PO\3\2\2\2Q\22\3\2\2\2RT\5%\23\2SR\3\2\2\2TU\3\2\2\2US\3\2\2"+
		"\2UV\3\2\2\2V\24\3\2\2\2WY\5%\23\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2"+
		"\2\2[\\\3\2\2\2\\^\7\60\2\2]_\5%\23\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a"+
		"\3\2\2\2a\26\3\2\2\2be\5\21\t\2ce\5\17\b\2db\3\2\2\2dc\3\2\2\2e\30\3\2"+
		"\2\2fg\t\2\2\2g\32\3\2\2\2hn\t\3\2\2ij\7?\2\2jn\7>\2\2kl\7@\2\2ln\7?\2"+
		"\2mh\3\2\2\2mi\3\2\2\2mk\3\2\2\2n\34\3\2\2\2op\7?\2\2pt\7?\2\2qr\7#\2"+
		"\2rt\7?\2\2so\3\2\2\2sq\3\2\2\2t\36\3\2\2\2uv\7C\2\2vw\7P\2\2w{\7F\2\2"+
		"xy\7Q\2\2y{\7T\2\2zu\3\2\2\2zx\3\2\2\2{ \3\2\2\2|}\7M\2\2}~\7K\2\2~\177"+
		"\7U\2\2\177\u0086\7K\2\2\u0080\u0081\7J\2\2\u0081\u0082\7G\2\2\u0082\u0083"+
		"\7U\2\2\u0083\u0084\7C\2\2\u0084\u0086\7R\2\2\u0085|\3\2\2\2\u0085\u0080"+
		"\3\2\2\2\u0086\"\3\2\2\2\u0087\u008c\5\'\24\2\u0088\u008b\5\'\24\2\u0089"+
		"\u008b\5%\23\2\u008a\u0088\3\2\2\2\u008a\u0089\3\2\2\2\u008b\u008e\3\2"+
		"\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d$\3\2\2\2\u008e\u008c"+
		"\3\2\2\2\u008f\u0090\t\4\2\2\u0090&\3\2\2\2\u0091\u0092\t\5\2\2\u0092"+
		"(\3\2\2\2\u0093\u0095\t\6\2\2\u0094\u0093\3\2\2\2\u0095\u0096\3\2\2\2"+
		"\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099"+
		"\b\25\2\2\u0099*\3\2\2\2\21\2CIPUZ`dmsz\u0085\u008a\u008c\u0096\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}