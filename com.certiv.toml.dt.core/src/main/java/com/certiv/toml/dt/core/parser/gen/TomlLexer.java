// Generated from D:/DevFiles/Eclipse/Tools/Editors/com.certiv.toml.dt/com.certiv.toml.dt.core/src/main/java/com/certiv/toml/dt/core/parser/TomlLexer.g4 by ANTLR 4.8

package com.certiv.toml.dt.core.parser.gen;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast" })
public class TomlLexer extends Lexer {
	static {
		RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION);
	}

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
	public static final int DOC_COMMENT = 1, BLOCK_COMMENT = 2, LINE_COMMENT = 3, HORZ_WS = 4, VERT_WS = 5, LARRAY = 6,
			RARRAY = 7, LBRACKET = 8, RBRACKET = 9, LBRACE = 10, RBRACE = 11, DOT = 12, EQUAL = 13, LITERAL = 14,
			STRING = 15, BOOLEAN = 16, NUMBER = 17, DATE = 18, SEP = 19, ID = 20;
	public static String[] channelNames = { "DEFAULT_TOKEN_CHANNEL", "HIDDEN" };

	public static String[] modeNames = { "DEFAULT_MODE" };

	private static String[] makeRuleNames() {
		return new String[] { "DOC_COMMENT", "BLOCK_COMMENT", "LINE_COMMENT", "HORZ_WS", "VERT_WS", "LARRAY", "RARRAY",
				"LBRACKET", "RBRACKET", "LBRACE", "RBRACE", "DOT", "EQUAL", "LITERAL", "STRING", "BOOLEAN", "NUMBER",
				"DATE", "SEP", "ID", "Hws", "Vws", "DocComment", "BlockComment", "LineComment", "SQLiteral",
				"DQLiteral", "StLiteral", "EscSeq", "UnicodeEsc", "Hex", "Number", "Int", "Date", "Yr", "Mon", "Day",
				"Hr", "Min", "Sec", "Frac", "Exp", "Digit", "Digit2", "Digit4", "Digit6", "True", "False", "Id",
				"NameChar", "NameStartChar", "Equal", "Comma", "Dot", "LBrace", "RBrace", "LBracket", "RBracket",
				"LArray", "RArray", "Esc", "SQuote", "DQuote", "LitQuote" };
	}

	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {};
	}

	private static final String[] _LITERAL_NAMES = makeLiteralNames();

	private static String[] makeSymbolicNames() {
		return new String[] { null, "DOC_COMMENT", "BLOCK_COMMENT", "LINE_COMMENT", "HORZ_WS", "VERT_WS", "LARRAY",
				"RARRAY", "LBRACKET", "RBRACKET", "LBRACE", "RBRACE", "DOT", "EQUAL", "LITERAL", "STRING", "BOOLEAN",
				"NUMBER", "DATE", "SEP", "ID" };
	}

	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated public static final String[] tokenNames;
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

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	public TomlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
	}

	@Override
	public String getGrammarFileName() {
		return "TomlLexer.g4";
	}

	@Override
	public String[] getRuleNames() {
		return ruleNames;
	}

	@Override
	public String getSerializedATN() {
		return _serializedATN;
	}

	@Override
	public String[] getChannelNames() {
		return channelNames;
	}

	@Override
	public String[] getModeNames() {
		return modeNames;
	}

	@Override
	public ATN getATN() {
		return _ATN;
	}

	public static final String _serializedATN = "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u01b5\b\1\4\2"
			+ "\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"
			+ "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"
			+ "\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"
			+ "\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"
			+ " \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"
			+ "+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"
			+ "\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"
			+ "=\4>\t>\4?\t?\4@\t@\4A\tA\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4"
			+ "\3\4\3\5\6\5\u0091\n\5\r\5\16\5\u0092\3\5\3\5\3\6\6\6\u0098\n\6\r\6\16"
			+ "\6\u0099\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r"
			+ "\3\r\3\16\3\16\3\17\3\17\3\20\3\20\5\20\u00b2\n\20\3\21\3\21\5\21\u00b6"
			+ "\n\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30"
			+ "\3\30\3\30\3\30\3\30\7\30\u00c9\n\30\f\30\16\30\u00cc\13\30\3\30\3\30"
			+ "\3\30\5\30\u00d1\n\30\3\31\3\31\3\31\3\31\7\31\u00d7\n\31\f\31\16\31\u00da"
			+ "\13\31\3\31\3\31\3\31\5\31\u00df\n\31\3\32\3\32\7\32\u00e3\n\32\f\32\16"
			+ "\32\u00e6\13\32\3\32\5\32\u00e9\n\32\3\32\3\32\7\32\u00ed\n\32\f\32\16"
			+ "\32\u00f0\13\32\3\32\3\32\7\32\u00f4\n\32\f\32\16\32\u00f7\13\32\7\32"
			+ "\u00f9\n\32\f\32\16\32\u00fc\13\32\3\33\3\33\3\33\7\33\u0101\n\33\f\33"
			+ "\16\33\u0104\13\33\3\33\3\33\3\34\3\34\3\34\7\34\u010b\n\34\f\34\16\34"
			+ "\u010e\13\34\3\34\3\34\3\35\3\35\7\35\u0114\n\35\f\35\16\35\u0117\13\35"
			+ "\3\35\3\35\3\36\3\36\3\36\3\36\3\36\5\36\u0120\n\36\3\37\3\37\3\37\3\37"
			+ "\3\37\5\37\u0127\n\37\5\37\u0129\n\37\5\37\u012b\n\37\5\37\u012d\n\37"
			+ "\3 \3 \3!\3!\3!\5!\u0134\n!\3!\3!\3!\3!\5!\u013a\n!\3\"\5\"\u013d\n\""
			+ "\3\"\3\"\3\"\7\"\u0142\n\"\f\"\16\"\u0145\13\"\5\"\u0147\n\"\3#\3#\3#"
			+ "\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0157\n#\3#\3#\3#\3#\3#\5#\u015e"
			+ "\n#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\6*\u016e\n*\r*\16*\u016f"
			+ "\3+\3+\3+\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3"
			+ "\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\7\62\u018d\n\62\f\62\16\62\u0190"
			+ "\13\62\3\63\3\63\5\63\u0194\n\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3"
			+ "\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3<\3=\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A"
			+ "\3A\3A\5\u00ca\u00d8\u0115\2B\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"
			+ "\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\2-\2/\2\61\2"
			+ "\63\2\65\2\67\29\2;\2=\2?\2A\2C\2E\2G\2I\2K\2M\2O\2Q\2S\2U\2W\2Y\2[\2"
			+ "]\2_\2a\2c\2e\2g\2i\2k\2m\2o\2q\2s\2u\2w\2y\2{\2}\2\177\2\u0081\2\3\2"
			+ "\20\4\2\13\13\"\"\4\2\f\f\16\17\4\2\f\f\17\17\6\2\f\f\17\17))^^\6\2\f"
			+ "\f\17\17$$^^\t\2$$^^ddhhppttvv\5\2\62;CHch\4\2--//\3\2\63;\4\2\\\\||\4"
			+ "\2GGgg\3\2\62;\7\2\62;aa\u00b9\u00b9\u0302\u0371\u2041\u2042\17\2C\\c"
			+ "|\u00c2\u00d8\u00da\u00f8\u00fa\u0301\u0372\u037f\u0381\u2001\u200e\u200f"
			+ "\u2072\u2191\u2c02\u2ff1\u3003\ud801\uf902\ufdd1\ufdf2\uffff\2\u01ac\2"
			+ "\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"
			+ "\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"
			+ "\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"
			+ "\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3\u0083\3\2\2\2\5\u0087\3\2\2\2\7"
			+ "\u008b\3\2\2\2\t\u0090\3\2\2\2\13\u0097\3\2\2\2\r\u009d\3\2\2\2\17\u009f"
			+ "\3\2\2\2\21\u00a1\3\2\2\2\23\u00a3\3\2\2\2\25\u00a5\3\2\2\2\27\u00a7\3"
			+ "\2\2\2\31\u00a9\3\2\2\2\33\u00ab\3\2\2\2\35\u00ad\3\2\2\2\37\u00b1\3\2"
			+ "\2\2!\u00b5\3\2\2\2#\u00b7\3\2\2\2%\u00b9\3\2\2\2\'\u00bb\3\2\2\2)\u00bd"
			+ "\3\2\2\2+\u00bf\3\2\2\2-\u00c1\3\2\2\2/\u00c3\3\2\2\2\61\u00d2\3\2\2\2"
			+ "\63\u00e0\3\2\2\2\65\u00fd\3\2\2\2\67\u0107\3\2\2\29\u0111\3\2\2\2;\u011a"
			+ "\3\2\2\2=\u0121\3\2\2\2?\u012e\3\2\2\2A\u0139\3\2\2\2C\u013c\3\2\2\2E"
			+ "\u0148\3\2\2\2G\u015f\3\2\2\2I\u0161\3\2\2\2K\u0163\3\2\2\2M\u0165\3\2"
			+ "\2\2O\u0167\3\2\2\2Q\u0169\3\2\2\2S\u016b\3\2\2\2U\u0171\3\2\2\2W\u0174"
			+ "\3\2\2\2Y\u0176\3\2\2\2[\u0179\3\2\2\2]\u017c\3\2\2\2_\u017f\3\2\2\2a"
			+ "\u0184\3\2\2\2c\u018a\3\2\2\2e\u0193\3\2\2\2g\u0195\3\2\2\2i\u0197\3\2"
			+ "\2\2k\u0199\3\2\2\2m\u019b\3\2\2\2o\u019d\3\2\2\2q\u019f\3\2\2\2s\u01a1"
			+ "\3\2\2\2u\u01a3\3\2\2\2w\u01a5\3\2\2\2y\u01a8\3\2\2\2{\u01ab\3\2\2\2}"
			+ "\u01ad\3\2\2\2\177\u01af\3\2\2\2\u0081\u01b1\3\2\2\2\u0083\u0084\5/\30"
			+ "\2\u0084\u0085\3\2\2\2\u0085\u0086\b\2\2\2\u0086\4\3\2\2\2\u0087\u0088"
			+ "\5\61\31\2\u0088\u0089\3\2\2\2\u0089\u008a\b\3\2\2\u008a\6\3\2\2\2\u008b"
			+ "\u008c\5\63\32\2\u008c\u008d\3\2\2\2\u008d\u008e\b\4\2\2\u008e\b\3\2\2"
			+ "\2\u008f\u0091\5+\26\2\u0090\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090"
			+ "\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\b\5\2\2\u0095"
			+ "\n\3\2\2\2\u0096\u0098\5-\27\2\u0097\u0096\3\2\2\2\u0098\u0099\3\2\2\2"
			+ "\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c"
			+ "\b\6\2\2\u009c\f\3\2\2\2\u009d\u009e\5w<\2\u009e\16\3\2\2\2\u009f\u00a0"
			+ "\5y=\2\u00a0\20\3\2\2\2\u00a1\u00a2\5s:\2\u00a2\22\3\2\2\2\u00a3\u00a4"
			+ "\5u;\2\u00a4\24\3\2\2\2\u00a5\u00a6\5o8\2\u00a6\26\3\2\2\2\u00a7\u00a8"
			+ "\5q9\2\u00a8\30\3\2\2\2\u00a9\u00aa\5m\67\2\u00aa\32\3\2\2\2\u00ab\u00ac"
			+ "\5i\65\2\u00ac\34\3\2\2\2\u00ad\u00ae\59\35\2\u00ae\36\3\2\2\2\u00af\u00b2"
			+ "\5\67\34\2\u00b0\u00b2\5\65\33\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2"
			+ "\2\u00b2 \3\2\2\2\u00b3\u00b6\5_\60\2\u00b4\u00b6\5a\61\2\u00b5\u00b3"
			+ "\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\"\3\2\2\2\u00b7\u00b8\5A!\2\u00b8$"
			+ "\3\2\2\2\u00b9\u00ba\5E#\2\u00ba&\3\2\2\2\u00bb\u00bc\5k\66\2\u00bc(\3"
			+ "\2\2\2\u00bd\u00be\5c\62\2\u00be*\3\2\2\2\u00bf\u00c0\t\2\2\2\u00c0,\3"
			+ "\2\2\2\u00c1\u00c2\t\3\2\2\u00c2.\3\2\2\2\u00c3\u00c4\7\61\2\2\u00c4\u00c5"
			+ "\7,\2\2\u00c5\u00c6\7,\2\2\u00c6\u00ca\3\2\2\2\u00c7\u00c9\13\2\2\2\u00c8"
			+ "\u00c7\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00cb\3\2\2\2\u00ca\u00c8\3\2"
			+ "\2\2\u00cb\u00d0\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\7,\2\2\u00ce"
			+ "\u00d1\7\61\2\2\u00cf\u00d1\7\2\2\3\u00d0\u00cd\3\2\2\2\u00d0\u00cf\3"
			+ "\2\2\2\u00d1\60\3\2\2\2\u00d2\u00d3\7\61\2\2\u00d3\u00d4\7,\2\2\u00d4"
			+ "\u00d8\3\2\2\2\u00d5\u00d7\13\2\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00da\3"
			+ "\2\2\2\u00d8\u00d9\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00de\3\2\2\2\u00da"
			+ "\u00d8\3\2\2\2\u00db\u00dc\7,\2\2\u00dc\u00df\7\61\2\2\u00dd\u00df\7\2"
			+ "\2\3\u00de\u00db\3\2\2\2\u00de\u00dd\3\2\2\2\u00df\62\3\2\2\2\u00e0\u00e4"
			+ "\7%\2\2\u00e1\u00e3\n\4\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4"
			+ "\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00fa\3\2\2\2\u00e6\u00e4\3\2"
			+ "\2\2\u00e7\u00e9\7\17\2\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"
			+ "\u00ea\3\2\2\2\u00ea\u00ee\7\f\2\2\u00eb\u00ed\5+\26\2\u00ec\u00eb\3\2"
			+ "\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef"
			+ "\u00f1\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f5\7%\2\2\u00f2\u00f4\n\4"
			+ "\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5"
			+ "\u00f6\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00e8\3\2"
			+ "\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"
			+ "\64\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u0102\5}?\2\u00fe\u0101\5;\36\2"
			+ "\u00ff\u0101\n\5\2\2\u0100\u00fe\3\2\2\2\u0100\u00ff\3\2\2\2\u0101\u0104"
			+ "\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0105\3\2\2\2\u0104"
			+ "\u0102\3\2\2\2\u0105\u0106\5}?\2\u0106\66\3\2\2\2\u0107\u010c\5\177@\2"
			+ "\u0108\u010b\5;\36\2\u0109\u010b\n\6\2\2\u010a\u0108\3\2\2\2\u010a\u0109"
			+ "\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d"
			+ "\u010f\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0110\5\177@\2\u01108\3\2\2\2"
			+ "\u0111\u0115\5\u0081A\2\u0112\u0114\13\2\2\2\u0113\u0112\3\2\2\2\u0114"
			+ "\u0117\3\2\2\2\u0115\u0116\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0118\3\2"
			+ "\2\2\u0117\u0115\3\2\2\2\u0118\u0119\5\u0081A\2\u0119:\3\2\2\2\u011a\u011f"
			+ "\5{>\2\u011b\u0120\t\7\2\2\u011c\u0120\5=\37\2\u011d\u0120\13\2\2\2\u011e"
			+ "\u0120\7\2\2\3\u011f\u011b\3\2\2\2\u011f\u011c\3\2\2\2\u011f\u011d\3\2"
			+ "\2\2\u011f\u011e\3\2\2\2\u0120<\3\2\2\2\u0121\u012c\7w\2\2\u0122\u012a"
			+ "\5? \2\u0123\u0128\5? \2\u0124\u0126\5? \2\u0125\u0127\5? \2\u0126\u0125"
			+ "\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u0124\3\2\2\2\u0128"
			+ "\u0129\3\2\2\2\u0129\u012b\3\2\2\2\u012a\u0123\3\2\2\2\u012a\u012b\3\2"
			+ "\2\2\u012b\u012d\3\2\2\2\u012c\u0122\3\2\2\2\u012c\u012d\3\2\2\2\u012d"
			+ ">\3\2\2\2\u012e\u012f\t\b\2\2\u012f@\3\2\2\2\u0130\u0131\5C\"\2\u0131"
			+ "\u0133\5S*\2\u0132\u0134\5U+\2\u0133\u0132\3\2\2\2\u0133\u0134\3\2\2\2"
			+ "\u0134\u013a\3\2\2\2\u0135\u0136\5C\"\2\u0136\u0137\5U+\2\u0137\u013a"
			+ "\3\2\2\2\u0138\u013a\5C\"\2\u0139\u0130\3\2\2\2\u0139\u0135\3\2\2\2\u0139"
			+ "\u0138\3\2\2\2\u013aB\3\2\2\2\u013b\u013d\t\t\2\2\u013c\u013b\3\2\2\2"
			+ "\u013c\u013d\3\2\2\2\u013d\u0146\3\2\2\2\u013e\u0147\7\62\2\2\u013f\u0143"
			+ "\t\n\2\2\u0140\u0142\5W,\2\u0141\u0140\3\2\2\2\u0142\u0145\3\2\2\2\u0143"
			+ "\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2"
			+ "\2\2\u0146\u013e\3\2\2\2\u0146\u013f\3\2\2\2\u0147D\3\2\2\2\u0148\u0149"
			+ "\5G$\2\u0149\u014a\7/\2\2\u014a\u014b\5I%\2\u014b\u014c\7/\2\2\u014c\u014d"
			+ "\5K&\2\u014d\u014e\7V\2\2\u014e\u014f\5M\'\2\u014f\u0150\7<\2\2\u0150"
			+ "\u0151\5O(\2\u0151\u0152\7<\2\2\u0152\u015d\5Q)\2\u0153\u015e\t\13\2\2"
			+ "\u0154\u0155\7\60\2\2\u0155\u0157\5]/\2\u0156\u0154\3\2\2\2\u0156\u0157"
			+ "\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159\7/\2\2\u0159\u015a\5O(\2\u015a"
			+ "\u015b\7<\2\2\u015b\u015c\5Q)\2\u015c\u015e\3\2\2\2\u015d\u0153\3\2\2"
			+ "\2\u015d\u0156\3\2\2\2\u015eF\3\2\2\2\u015f\u0160\5[.\2\u0160H\3\2\2\2"
			+ "\u0161\u0162\5Y-\2\u0162J\3\2\2\2\u0163\u0164\5Y-\2\u0164L\3\2\2\2\u0165"
			+ "\u0166\5Y-\2\u0166N\3\2\2\2\u0167\u0168\5Y-\2\u0168P\3\2\2\2\u0169\u016a"
			+ "\5Y-\2\u016aR\3\2\2\2\u016b\u016d\5m\67\2\u016c\u016e\5W,\2\u016d\u016c"
			+ "\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170"
			+ "T\3\2\2\2\u0171\u0172\t\f\2\2\u0172\u0173\5C\"\2\u0173V\3\2\2\2\u0174"
			+ "\u0175\t\r\2\2\u0175X\3\2\2\2\u0176\u0177\5W,\2\u0177\u0178\5W,\2\u0178"
			+ "Z\3\2\2\2\u0179\u017a\5Y-\2\u017a\u017b\5Y-\2\u017b\\\3\2\2\2\u017c\u017d"
			+ "\5[.\2\u017d\u017e\5Y-\2\u017e^\3\2\2\2\u017f\u0180\7v\2\2\u0180\u0181"
			+ "\7t\2\2\u0181\u0182\7w\2\2\u0182\u0183\7g\2\2\u0183`\3\2\2\2\u0184\u0185"
			+ "\7h\2\2\u0185\u0186\7c\2\2\u0186\u0187\7n\2\2\u0187\u0188\7u\2\2\u0188"
			+ "\u0189\7g\2\2\u0189b\3\2\2\2\u018a\u018e\5g\64\2\u018b\u018d\5e\63\2\u018c"
			+ "\u018b\3\2\2\2\u018d\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2"
			+ "\2\2\u018fd\3\2\2\2\u0190\u018e\3\2\2\2\u0191\u0194\5g\64\2\u0192\u0194"
			+ "\t\16\2\2\u0193\u0191\3\2\2\2\u0193\u0192\3\2\2\2\u0194f\3\2\2\2\u0195"
			+ "\u0196\t\17\2\2\u0196h\3\2\2\2\u0197\u0198\7?\2\2\u0198j\3\2\2\2\u0199"
			+ "\u019a\7.\2\2\u019al\3\2\2\2\u019b\u019c\7\60\2\2\u019cn\3\2\2\2\u019d"
			+ "\u019e\7}\2\2\u019ep\3\2\2\2\u019f\u01a0\7\177\2\2\u01a0r\3\2\2\2\u01a1"
			+ "\u01a2\7]\2\2\u01a2t\3\2\2\2\u01a3\u01a4\7_\2\2\u01a4v\3\2\2\2\u01a5\u01a6"
			+ "\7]\2\2\u01a6\u01a7\7]\2\2\u01a7x\3\2\2\2\u01a8\u01a9\7_\2\2\u01a9\u01aa"
			+ "\7_\2\2\u01aaz\3\2\2\2\u01ab\u01ac\7^\2\2\u01ac|\3\2\2\2\u01ad\u01ae\7"
			+ ")\2\2\u01ae~\3\2\2\2\u01af\u01b0\7$\2\2\u01b0\u0080\3\2\2\2\u01b1\u01b2"
			+ "\7$\2\2\u01b2\u01b3\7$\2\2\u01b3\u01b4\7$\2\2\u01b4\u0082\3\2\2\2$\2\u0092"
			+ "\u0099\u00b1\u00b5\u00ca\u00d0\u00d8\u00de\u00e4\u00e8\u00ee\u00f5\u00fa"
			+ "\u0100\u0102\u010a\u010c\u0115\u011f\u0126\u0128\u012a\u012c\u0133\u0139"
			+ "\u013c\u0143\u0146\u0156\u015d\u016f\u018e\u0193\3\2\3\2";
	public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
