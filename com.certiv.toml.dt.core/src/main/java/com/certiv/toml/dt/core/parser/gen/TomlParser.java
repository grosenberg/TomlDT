// Generated from D:/DevFiles/Eclipse/Tools/Editors/com.certiv.toml.dt/com.certiv.toml.dt.core/src/main/java/com/certiv/toml/dt/core/parser/TomlParser.g4 by ANTLR 4.8

	package com.certiv.toml.dt.core.parser.gen;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TomlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DOC_COMMENT=1, BLOCK_COMMENT=2, LINE_COMMENT=3, HORZ_WS=4, VERT_WS=5, 
		LARRAY=6, RARRAY=7, LBRACKET=8, RBRACKET=9, LBRACE=10, RBRACE=11, DOT=12, 
		EQUAL=13, LITERAL=14, STRING=15, BOOLEAN=16, NUMBER=17, DATE=18, SEP=19, 
		ID=20;
	public static final int
		RULE_toml = 0, RULE_table = 1, RULE_tableArray = 2, RULE_element = 3, 
		RULE_key = 4, RULE_value = 5, RULE_array = 6, RULE_inlineTable = 7, RULE_scalar = 8, 
		RULE_string = 9, RULE_dottedID = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"toml", "table", "tableArray", "element", "key", "value", "array", "inlineTable", 
			"scalar", "string", "dottedID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DOC_COMMENT", "BLOCK_COMMENT", "LINE_COMMENT", "HORZ_WS", "VERT_WS", 
			"LARRAY", "RARRAY", "LBRACKET", "RBRACKET", "LBRACE", "RBRACE", "DOT", 
			"EQUAL", "LITERAL", "STRING", "BOOLEAN", "NUMBER", "DATE", "SEP", "ID"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "TomlParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TomlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class TomlContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(TomlParser.EOF, 0); }
		public List<TableContext> table() {
			return getRuleContexts(TableContext.class);
		}
		public TableContext table(int i) {
			return getRuleContext(TableContext.class,i);
		}
		public List<TableArrayContext> tableArray() {
			return getRuleContexts(TableArrayContext.class);
		}
		public TableArrayContext tableArray(int i) {
			return getRuleContext(TableArrayContext.class,i);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TomlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_toml; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterToml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitToml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitToml(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TomlContext toml() throws RecognitionException {
		TomlContext _localctx = new TomlContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_toml);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LARRAY) | (1L << LBRACKET) | (1L << STRING) | (1L << ID))) != 0)) {
				{
				setState(25);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACKET:
					{
					setState(22);
					table();
					}
					break;
				case LARRAY:
					{
					setState(23);
					tableArray();
					}
					break;
				case STRING:
				case ID:
					{
					setState(24);
					element();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(30);
			match(EOF);
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

	public static class TableContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(TomlParser.LBRACKET, 0); }
		public DottedIDContext dottedID() {
			return getRuleContext(DottedIDContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(TomlParser.RBRACKET, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_table);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(LBRACKET);
			setState(33);
			dottedID();
			setState(34);
			match(RBRACKET);
			setState(38);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(35);
					element();
					}
					} 
				}
				setState(40);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class TableArrayContext extends ParserRuleContext {
		public TerminalNode LARRAY() { return getToken(TomlParser.LARRAY, 0); }
		public DottedIDContext dottedID() {
			return getRuleContext(DottedIDContext.class,0);
		}
		public TerminalNode RARRAY() { return getToken(TomlParser.RARRAY, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TableArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterTableArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitTableArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitTableArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableArrayContext tableArray() throws RecognitionException {
		TableArrayContext _localctx = new TableArrayContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tableArray);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(LARRAY);
			setState(42);
			dottedID();
			setState(43);
			match(RARRAY);
			setState(47);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(44);
					element();
					}
					} 
				}
				setState(49);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class ElementContext extends ParserRuleContext {
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(TomlParser.EQUAL, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			key();
			setState(51);
			match(EQUAL);
			setState(52);
			value();
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

	public static class KeyContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TomlParser.ID, 0); }
		public TerminalNode STRING() { return getToken(TomlParser.STRING, 0); }
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ValueContext extends ParserRuleContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public ScalarContext scalar() {
			return getRuleContext(ScalarContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_value);
		try {
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				array();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				inlineTable();
				}
				break;
			case BOOLEAN:
			case NUMBER:
			case DATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				scalar();
				}
				break;
			case LITERAL:
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(59);
				string();
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

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(TomlParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(TomlParser.RBRACKET, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> SEP() { return getTokens(TomlParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(TomlParser.SEP, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_array);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(LBRACKET);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACKET) | (1L << LBRACE) | (1L << LITERAL) | (1L << STRING) | (1L << BOOLEAN) | (1L << NUMBER) | (1L << DATE))) != 0)) {
				{
				setState(63);
				value();
				setState(68);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(64);
						match(SEP);
						setState(65);
						value();
						}
						} 
					}
					setState(70);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				}
			}

			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEP) {
				{
				setState(73);
				match(SEP);
				}
			}

			setState(76);
			match(RBRACKET);
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

	public static class InlineTableContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(TomlParser.LBRACE, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(TomlParser.RBRACE, 0); }
		public List<TerminalNode> SEP() { return getTokens(TomlParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(TomlParser.SEP, i);
		}
		public InlineTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterInlineTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitInlineTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitInlineTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineTableContext inlineTable() throws RecognitionException {
		InlineTableContext _localctx = new InlineTableContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_inlineTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(LBRACE);
			setState(79);
			element();
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEP) {
				{
				{
				setState(80);
				match(SEP);
				setState(81);
				element();
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
			match(RBRACE);
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

	public static class ScalarContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(TomlParser.BOOLEAN, 0); }
		public TerminalNode DATE() { return getToken(TomlParser.DATE, 0); }
		public TerminalNode NUMBER() { return getToken(TomlParser.NUMBER, 0); }
		public ScalarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterScalar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitScalar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitScalar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScalarContext scalar() throws RecognitionException {
		ScalarContext _localctx = new ScalarContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_scalar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << NUMBER) | (1L << DATE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(TomlParser.STRING, 0); }
		public TerminalNode LITERAL() { return getToken(TomlParser.LITERAL, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_la = _input.LA(1);
			if ( !(_la==LITERAL || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class DottedIDContext extends ParserRuleContext {
		public Token ID;
		public List<Token> ids = new ArrayList<Token>();
		public List<TerminalNode> ID() { return getTokens(TomlParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TomlParser.ID, i);
		}
		public List<TerminalNode> DOT() { return getTokens(TomlParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(TomlParser.DOT, i);
		}
		public DottedIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dottedID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterDottedID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitDottedID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitDottedID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DottedIDContext dottedID() throws RecognitionException {
		DottedIDContext _localctx = new DottedIDContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_dottedID);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			((DottedIDContext)_localctx).ID = match(ID);
			((DottedIDContext)_localctx).ids.add(((DottedIDContext)_localctx).ID);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(94);
				match(DOT);
				setState(95);
				((DottedIDContext)_localctx).ID = match(ID);
				((DottedIDContext)_localctx).ids.add(((DottedIDContext)_localctx).ID);
				}
				}
				setState(100);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26h\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\7\3\'\n\3\f\3\16\3*\13\3\3\4\3\4\3\4\3\4\7\4\60\n\4\f\4\16\4\63\13\4"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\5\7?\n\7\3\b\3\b\3\b\3\b\7\b"+
		"E\n\b\f\b\16\bH\13\b\5\bJ\n\b\3\b\5\bM\n\b\3\b\3\b\3\t\3\t\3\t\3\t\7\t"+
		"U\n\t\f\t\16\tX\13\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\7\fc\n\f\f"+
		"\f\16\ff\13\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\5\4\2\21\21\26\26"+
		"\3\2\22\24\3\2\20\21\2i\2\35\3\2\2\2\4\"\3\2\2\2\6+\3\2\2\2\b\64\3\2\2"+
		"\2\n8\3\2\2\2\f>\3\2\2\2\16@\3\2\2\2\20P\3\2\2\2\22[\3\2\2\2\24]\3\2\2"+
		"\2\26_\3\2\2\2\30\34\5\4\3\2\31\34\5\6\4\2\32\34\5\b\5\2\33\30\3\2\2\2"+
		"\33\31\3\2\2\2\33\32\3\2\2\2\34\37\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2"+
		"\36 \3\2\2\2\37\35\3\2\2\2 !\7\2\2\3!\3\3\2\2\2\"#\7\n\2\2#$\5\26\f\2"+
		"$(\7\13\2\2%\'\5\b\5\2&%\3\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2)\5\3\2"+
		"\2\2*(\3\2\2\2+,\7\b\2\2,-\5\26\f\2-\61\7\t\2\2.\60\5\b\5\2/.\3\2\2\2"+
		"\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\7\3\2\2\2\63\61\3\2\2\2\64"+
		"\65\5\n\6\2\65\66\7\17\2\2\66\67\5\f\7\2\67\t\3\2\2\289\t\2\2\29\13\3"+
		"\2\2\2:?\5\16\b\2;?\5\20\t\2<?\5\22\n\2=?\5\24\13\2>:\3\2\2\2>;\3\2\2"+
		"\2><\3\2\2\2>=\3\2\2\2?\r\3\2\2\2@I\7\n\2\2AF\5\f\7\2BC\7\25\2\2CE\5\f"+
		"\7\2DB\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GJ\3\2\2\2HF\3\2\2\2IA\3\2"+
		"\2\2IJ\3\2\2\2JL\3\2\2\2KM\7\25\2\2LK\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\7"+
		"\13\2\2O\17\3\2\2\2PQ\7\f\2\2QV\5\b\5\2RS\7\25\2\2SU\5\b\5\2TR\3\2\2\2"+
		"UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WY\3\2\2\2XV\3\2\2\2YZ\7\r\2\2Z\21\3\2\2"+
		"\2[\\\t\3\2\2\\\23\3\2\2\2]^\t\4\2\2^\25\3\2\2\2_d\7\26\2\2`a\7\16\2\2"+
		"ac\7\26\2\2b`\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2e\27\3\2\2\2fd\3\2"+
		"\2\2\f\33\35(\61>FILVd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}