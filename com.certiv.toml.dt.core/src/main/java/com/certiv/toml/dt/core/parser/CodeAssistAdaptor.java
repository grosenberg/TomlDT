package com.certiv.toml.dt.core.parser;

import org.antlr.v4.runtime.tree.ParseTree;

import net.certiv.antlr.runtime.xvisitor.Processor;

public abstract class CodeAssistAdaptor extends Processor {

	protected TomlSourceParser helper;

	public CodeAssistAdaptor(ParseTree tree) {
		super(tree);
	}

	public void setHelper(TomlSourceParser helper) {
		this.helper = helper;
	}
}
