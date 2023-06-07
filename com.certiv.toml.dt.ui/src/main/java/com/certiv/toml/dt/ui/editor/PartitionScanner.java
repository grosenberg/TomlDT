/*******************************************************************************
 * Copyright (c) 2012 - 2023 Certiv Analytics.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package com.certiv.toml.dt.ui.editor;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.text.rules.EndOfLineRule;
import org.eclipse.jface.text.rules.IPredicateRule;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.MultiLineRule;
import org.eclipse.jface.text.rules.SingleLineRule;
import org.eclipse.jface.text.rules.Token;

import net.certiv.dsl.ui.editor.scanners.DslRuleBasedPartitionScanner;

public class PartitionScanner extends DslRuleBasedPartitionScanner {

	public PartitionScanner() {

		IToken slComment = new Token(Partitions.COMMENT_SL);
		IToken mlComment = new Token(Partitions.COMMENT_ML);
		IToken string = new Token(Partitions.STRING);

		List<IRule> rules = new ArrayList<>();

		rules.add(new EndOfLineRule("#", slComment));
		rules.add(new MultiLineRule("/*", "*/", mlComment));
		rules.add(new SingleLineRule("\"", "\"", string, '\\'));
		rules.add(new SingleLineRule("'", "'", string, '\\'));

		IPredicateRule[] rule = new IPredicateRule[rules.size()];
		setPredicateRules(rules.toArray(rule));
	}
}
