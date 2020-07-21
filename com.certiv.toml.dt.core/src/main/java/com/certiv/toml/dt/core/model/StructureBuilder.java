package com.certiv.toml.dt.core.model;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import com.certiv.toml.dt.core.parser.gen.TomlParser;
import com.certiv.toml.dt.core.parser.gen.TomlParser.ArrayContext;
import com.certiv.toml.dt.core.parser.gen.TomlParser.ElementContext;
import com.certiv.toml.dt.core.parser.gen.TomlParser.InlineTableContext;
import com.certiv.toml.dt.core.parser.gen.TomlParser.ScalarContext;
import com.certiv.toml.dt.core.parser.gen.TomlParser.StringContext;
import com.certiv.toml.dt.core.parser.gen.TomlParser.TableArrayContext;
import com.certiv.toml.dt.core.parser.gen.TomlParser.TableContext;
import com.certiv.toml.dt.core.parser.gen.TomlParser.TomlContext;

import net.certiv.antlr.runtime.xvisitor.Processor;
import net.certiv.dsl.core.model.ModelType;
import net.certiv.dsl.core.model.Statement;
import net.certiv.dsl.core.model.builder.ModelBuilder;

/**
 * Implementing functions for contructing the Dsl specialized model.
 *
 * @see net.certiv.dsl.core.model.builder.ModelBuilder
 * @see net.certiv.dsl.core.model.builder.ModelSpecialization
 */
public abstract class StructureBuilder extends Processor {

	private ModelBuilder builder;
	private String name = ModelBuilder.UNKNOWN;

	public StructureBuilder(ParseTree tree) {
		super(tree);
	}

	public void setBuilder(ModelBuilder builder) {
		this.builder = builder;
	}

	public void setSourceName(String name) {
		this.name = name;
	}

	/** Create model node corresponding to the grammar root. */
	public void createModule() {
		TomlContext ctx = (TomlContext) lastPathNode();
		Specialization data = new Specialization(SpecializedType.Toml, ruleName(ctx), ctx, name);
		builder.module(ctx, name, data);
	}

	public void createTableStatement() {
		TableContext ctx = (TableContext) lastPathNode();
		String name = ctx.dottedID() != null ? ctx.dottedID().getText() : "<table>";
		Specialization data = new Specialization(SpecializedType.Table, ruleName(ctx), ctx, name);
		Statement stmt = builder.statement(ModelType.DECLARATION, ctx, ctx.dottedID(), data);
		builder.pushParent(stmt);
	}

	public void createTableArrayStatement() {
		TableArrayContext ctx = (TableArrayContext) lastPathNode();
		String name = ctx.dottedID() != null ? ctx.dottedID().getText() : "<table array>";
		Specialization data = new Specialization(SpecializedType.TableArray, ruleName(ctx), ctx, name);
		Statement stmt = builder.statement(ModelType.DECLARATION, ctx, ctx.dottedID(), data);
		builder.pushParent(stmt);
	}

	public void createElementStatement() {
		ElementContext ctx = (ElementContext) lastPathNode();
		Specialization data = new Specialization(SpecializedType.Element, ruleName(ctx), ctx, name);
		Statement stmt = builder.statement(ModelType.DECLARATION, ctx, ctx.key(), data);
		builder.pushParent(stmt);
	}

	public void createArrayStatement() {
		ArrayContext ctx = (ArrayContext) lastPathNode();
		Specialization data = new Specialization(SpecializedType.Array, ruleName(ctx), ctx, "<array>");
		Statement stmt = builder.block(ModelType.BEG_BLOCK, ctx.LBRACKET(), ctx.RBRACKET(), data);
		builder.pushParent(stmt);
	}

	public void createInlineTableStatement() {
		InlineTableContext ctx = (InlineTableContext) lastPathNode();
		Specialization data = new Specialization(SpecializedType.InlineTable, ruleName(ctx), ctx, "<inline table>");
		Statement stmt = builder.block(ModelType.BEG_BLOCK, ctx.LBRACE(), ctx.RBRACE(), data);
		builder.pushParent(stmt);
	}

	public void createScalarStatement() {
		ScalarContext ctx = (ScalarContext) lastPathNode();
		Specialization data = new Specialization(SpecializedType.Scalar, ruleName(ctx), ctx, ctx.getText());
		builder.statement(ModelType.DECLARATION, ctx, ctx, data);
	}

	public void createStringStatement() {
		StringContext ctx = (StringContext) lastPathNode();
		Specialization data = new Specialization(SpecializedType.Scalar, ruleName(ctx), ctx, ctx.getText());
		builder.statement(ModelType.DECLARATION, ctx, ctx, data);
	}

	public void endBlock() {
		ParserRuleContext context = (ParserRuleContext) lastPathNode();
		switch (context.getRuleIndex()) {
			case TomlParser.RULE_table:
				builder.popParent();
				break;

			case TomlParser.RULE_tableArray:
				builder.popParent();
				break;

			case TomlParser.RULE_element:
				builder.popParent();
				break;

			case TomlParser.RULE_array:
				builder.popParent();
				ArrayContext array = (ArrayContext) context;
				builder.block(ModelType.END_BLOCK, array.LBRACKET(), array.RBRACKET(), null);
				break;

			case TomlParser.RULE_inlineTable:
				builder.popParent();
				InlineTableContext ctx = (InlineTableContext) context;
				builder.block(ModelType.END_BLOCK, ctx.LBRACE(), ctx.RBRACE(), null);
				break;
		}
	}

	private String ruleName(ParserRuleContext ctx) {
		return TomlParser.ruleNames[ctx.getRuleIndex()];
	}
}
