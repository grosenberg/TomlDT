// Generated from java-escape by ANTLR 4.11.1

	package com.certiv.toml.dt.core.parser.gen;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class TomlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

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
	public String getGrammarFileName() { return "java-escape"; }

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

	@SuppressWarnings("CheckReturnValue")
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
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 1081664L) != 0) {
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 509184L) != 0) {
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 458752L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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
		"\u0004\u0001\u0014f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0005\u0000\u001a\b\u0000\n\u0000\f\u0000\u001d\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		"%\b\u0001\n\u0001\f\u0001(\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002.\b\u0002\n\u0002\f\u00021\t\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005=\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006C\b\u0006\n\u0006\f\u0006"+
		"F\t\u0006\u0003\u0006H\b\u0006\u0001\u0006\u0003\u0006K\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007S\b\u0007\n\u0007\f\u0007V\t\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0005\na\b\n\n\n\f"+
		"\nd\t\n\u0001\n\u0000\u0000\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0000\u0003\u0002\u0000\u000f\u000f\u0014\u0014\u0001"+
		"\u0000\u0010\u0012\u0001\u0000\u000e\u000fg\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0002 \u0001\u0000\u0000\u0000\u0004)\u0001\u0000\u0000\u0000\u0006"+
		"2\u0001\u0000\u0000\u0000\b6\u0001\u0000\u0000\u0000\n<\u0001\u0000\u0000"+
		"\u0000\f>\u0001\u0000\u0000\u0000\u000eN\u0001\u0000\u0000\u0000\u0010"+
		"Y\u0001\u0000\u0000\u0000\u0012[\u0001\u0000\u0000\u0000\u0014]\u0001"+
		"\u0000\u0000\u0000\u0016\u001a\u0003\u0002\u0001\u0000\u0017\u001a\u0003"+
		"\u0004\u0002\u0000\u0018\u001a\u0003\u0006\u0003\u0000\u0019\u0016\u0001"+
		"\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u0019\u0018\u0001"+
		"\u0000\u0000\u0000\u001a\u001d\u0001\u0000\u0000\u0000\u001b\u0019\u0001"+
		"\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000\u0000\u001c\u001e\u0001"+
		"\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001e\u001f\u0005"+
		"\u0000\u0000\u0001\u001f\u0001\u0001\u0000\u0000\u0000 !\u0005\b\u0000"+
		"\u0000!\"\u0003\u0014\n\u0000\"&\u0005\t\u0000\u0000#%\u0003\u0006\u0003"+
		"\u0000$#\u0001\u0000\u0000\u0000%(\u0001\u0000\u0000\u0000&$\u0001\u0000"+
		"\u0000\u0000&\'\u0001\u0000\u0000\u0000\'\u0003\u0001\u0000\u0000\u0000"+
		"(&\u0001\u0000\u0000\u0000)*\u0005\u0006\u0000\u0000*+\u0003\u0014\n\u0000"+
		"+/\u0005\u0007\u0000\u0000,.\u0003\u0006\u0003\u0000-,\u0001\u0000\u0000"+
		"\u0000.1\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000/0\u0001\u0000"+
		"\u0000\u00000\u0005\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u0000"+
		"23\u0003\b\u0004\u000034\u0005\r\u0000\u000045\u0003\n\u0005\u00005\u0007"+
		"\u0001\u0000\u0000\u000067\u0007\u0000\u0000\u00007\t\u0001\u0000\u0000"+
		"\u00008=\u0003\f\u0006\u00009=\u0003\u000e\u0007\u0000:=\u0003\u0010\b"+
		"\u0000;=\u0003\u0012\t\u0000<8\u0001\u0000\u0000\u0000<9\u0001\u0000\u0000"+
		"\u0000<:\u0001\u0000\u0000\u0000<;\u0001\u0000\u0000\u0000=\u000b\u0001"+
		"\u0000\u0000\u0000>G\u0005\b\u0000\u0000?D\u0003\n\u0005\u0000@A\u0005"+
		"\u0013\u0000\u0000AC\u0003\n\u0005\u0000B@\u0001\u0000\u0000\u0000CF\u0001"+
		"\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000"+
		"EH\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000G?\u0001\u0000\u0000"+
		"\u0000GH\u0001\u0000\u0000\u0000HJ\u0001\u0000\u0000\u0000IK\u0005\u0013"+
		"\u0000\u0000JI\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KL\u0001"+
		"\u0000\u0000\u0000LM\u0005\t\u0000\u0000M\r\u0001\u0000\u0000\u0000NO"+
		"\u0005\n\u0000\u0000OT\u0003\u0006\u0003\u0000PQ\u0005\u0013\u0000\u0000"+
		"QS\u0003\u0006\u0003\u0000RP\u0001\u0000\u0000\u0000SV\u0001\u0000\u0000"+
		"\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UW\u0001\u0000"+
		"\u0000\u0000VT\u0001\u0000\u0000\u0000WX\u0005\u000b\u0000\u0000X\u000f"+
		"\u0001\u0000\u0000\u0000YZ\u0007\u0001\u0000\u0000Z\u0011\u0001\u0000"+
		"\u0000\u0000[\\\u0007\u0002\u0000\u0000\\\u0013\u0001\u0000\u0000\u0000"+
		"]b\u0005\u0014\u0000\u0000^_\u0005\f\u0000\u0000_a\u0005\u0014\u0000\u0000"+
		"`^\u0001\u0000\u0000\u0000ad\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000"+
		"\u0000bc\u0001\u0000\u0000\u0000c\u0015\u0001\u0000\u0000\u0000db\u0001"+
		"\u0000\u0000\u0000\n\u0019\u001b&/<DGJTb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}