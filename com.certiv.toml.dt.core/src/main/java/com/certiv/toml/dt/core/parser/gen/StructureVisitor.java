//
// Generated from com.certiv.toml.dt.core.parser.gen
// by XVisitor 4.8.0
//
package com.certiv.toml.dt.core.parser.gen;
	import com.certiv.toml.dt.core.model.StructureBuilder ;

import java.util.List;
import org.antlr.v4.runtime.tree.ParseTree;
import net.certiv.antlr.runtime.xvisitor.Processor;
import net.certiv.antlr.runtime.xvisitor.xpath.EType;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StructureVisitor extends StructureBuilder {

	public static final String[] tokenNames = {
		"<INVALID>", "DOC_COMMENT", "BLOCK_COMMENT", "LINE_COMMENT", "HORZ_WS", 
		"VERT_WS", "LARRAY", "RARRAY", "LBRACKET", "RBRACKET", "LBRACE", "RBRACE", 
		"DOT", "EQUAL", "LITERAL", "STRING", "BOOLEAN", "NUMBER", "DATE", "SEP", 
		"ID"
	};

	public static final int
		DOC_COMMENT = 1, BLOCK_COMMENT = 2, LINE_COMMENT = 3, HORZ_WS = 4, VERT_WS = 5, 
		LARRAY = 6, RARRAY = 7, LBRACKET = 8, RBRACKET = 9, LBRACE = 10, RBRACE = 11, 
		DOT = 12, EQUAL = 13, LITERAL = 14, STRING = 15, BOOLEAN = 16, NUMBER = 17, 
		DATE = 18, SEP = 19, ID = 20;

	public static final String[] ruleNames = {
		"toml", "table", "tableArray", "element", "key", "value", "array", "inlineTable", 
		"scalar", "string", "dottedID"
	};

	public static final int
		toml = 1000, table = 1001, tableArray = 1002, element = 1003, key = 1004, 
		value = 1005, array = 1006, inlineTable = 1007, scalar = 1008, string = 1009, 
		dottedID = 1010;

	public StructureVisitor(ParseTree tree) {
		super(tree);
		init();
	}

	/** Entry point for finding all matches of the defined XPaths in the parse tree */
	@Override
	public void findAll() {
		super.findAll();
	}

	/**
	 * Entry point for finding all matches of a set of one or more named XPaths in the parse tree. The name of an XPath
	 * is the rulename used in the tree grammar to define the XPath.
	 */
	@Override
	public void find(String... names) {
		super.find(names);
	}

	/** Change the parse tree to match against. Implicitly performs a reset. */
	@Override
	public void setNewParseTree(ParseTree tree) {
		super.setNewParseTree(tree);
	}

	/** Clears state information developed in a prior find operation. */
	@Override
	public void reset() {
		super.reset();
	}

	protected String[] getTokenNames() {
		return tokenNames;
	}

	protected String[] getRuleNames() {
		return ruleNames;
	}

	private void init() {
		mainRule("outline");

					createPathSpec("toml");
						addElement(EType.Rule, false, false, "toml", 0); 
					completePathSpec(); 

					createPathSpec("table");
						addElement(EType.Rule, true, false, "table", 1); 
					completePathSpec(); 

					createPathSpec("tableArray");
						addElement(EType.Rule, true, false, "tableArray", 2); 
					completePathSpec(); 

					createPathSpec("element");
						addElement(EType.Rule, true, false, "element", 3); 
					completePathSpec(); 

					createPathSpec("valueArray");
						addElement(EType.Rule, true, false, "array", 6); 
					completePathSpec(); 

					createPathSpec("scalar");
						addElement(EType.Rule, true, false, "scalar", 8); 
					completePathSpec(); 

					createPathSpec("inlineTable");
						addElement(EType.Rule, true, false, "inlineTable", 7); 
					completePathSpec(); 

					createPathSpec("string");
						addElement(EType.Rule, true, false, "string", 9); 
					completePathSpec(); 
	}


	@Override
	public void executeActionBlock(String name) {
		switch (name) {
					case "toml":
						toml();
						break;
					case "table":
						table();
						break;
					case "tableArray":
						tableArray();
						break;
					case "element":
						element();
						break;
					case "valueArray":
						valueArray();
						break;
					case "inlineTable":
						inlineTable();
						break;
					case "scalar":
						scalar();
						break;
					case "string":
						string();
						break;
		}
	}

	private void toml() {
		if (entering()) {	createModule(); }
		if (exiting()) {	endBlock(); }
	}

	private void table() {
		if (entering()) {	createTableStatement();	}
		if (exiting()) {	endBlock(); }
	}

	private void tableArray() {
		if (entering()) {	createTableArrayStatement(); }
		if (exiting()) {	endBlock(); }
	}

	private void element() {
		if (entering()) {	createElementStatement(); }
		if (exiting()) {	endBlock(); }
	}

	private void valueArray() {
		if (entering()) {	createArrayStatement(); }
		if (exiting()) {	endBlock(); }
	}

	private void inlineTable() {
		if (entering()) {	createInlineTableStatement(); }
		if (exiting()) {	endBlock(); }
	}

	private void scalar() {
		if (entering()) { createScalarStatement(); }
	}

	private void string() {
		if (entering()) { createStringStatement(); }
	}



}