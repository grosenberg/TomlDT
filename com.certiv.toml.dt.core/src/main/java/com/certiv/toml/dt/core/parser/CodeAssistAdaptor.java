/*******************************************************************************
 * Copyright (c) 2012, 2020 Certiv Analytics.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
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
