// Generated from java-escape by ANTLR 4.11.1

	package com.certiv.toml.dt.core.parser.gen;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TomlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TomlParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TomlParser#toml}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToml(TomlParser.TomlContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable(TomlParser.TableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#tableArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableArray(TomlParser.TableArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(TomlParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey(TomlParser.KeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(TomlParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(TomlParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#inlineTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineTable(TomlParser.InlineTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#scalar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalar(TomlParser.ScalarContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(TomlParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#dottedID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDottedID(TomlParser.DottedIDContext ctx);
}