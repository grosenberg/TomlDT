// Generated from java-escape by ANTLR 4.11.1

	package com.certiv.toml.dt.core.parser.gen;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TomlParser}.
 */
public interface TomlParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TomlParser#toml}.
	 * @param ctx the parse tree
	 */
	void enterToml(TomlParser.TomlContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#toml}.
	 * @param ctx the parse tree
	 */
	void exitToml(TomlParser.TomlContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTable(TomlParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTable(TomlParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#tableArray}.
	 * @param ctx the parse tree
	 */
	void enterTableArray(TomlParser.TableArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#tableArray}.
	 * @param ctx the parse tree
	 */
	void exitTableArray(TomlParser.TableArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(TomlParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(TomlParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#key}.
	 * @param ctx the parse tree
	 */
	void enterKey(TomlParser.KeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#key}.
	 * @param ctx the parse tree
	 */
	void exitKey(TomlParser.KeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(TomlParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(TomlParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(TomlParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(TomlParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#inlineTable}.
	 * @param ctx the parse tree
	 */
	void enterInlineTable(TomlParser.InlineTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#inlineTable}.
	 * @param ctx the parse tree
	 */
	void exitInlineTable(TomlParser.InlineTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#scalar}.
	 * @param ctx the parse tree
	 */
	void enterScalar(TomlParser.ScalarContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#scalar}.
	 * @param ctx the parse tree
	 */
	void exitScalar(TomlParser.ScalarContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(TomlParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(TomlParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#dottedID}.
	 * @param ctx the parse tree
	 */
	void enterDottedID(TomlParser.DottedIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#dottedID}.
	 * @param ctx the parse tree
	 */
	void exitDottedID(TomlParser.DottedIDContext ctx);
}