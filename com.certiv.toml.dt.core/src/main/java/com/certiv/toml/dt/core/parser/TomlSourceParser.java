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
package com.certiv.toml.dt.core.parser;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;

import com.certiv.toml.dt.core.TomlCore;
import com.certiv.toml.dt.core.parser.gen.StructureVisitor;
import com.certiv.toml.dt.core.parser.gen.TomlLexer;
import com.certiv.toml.dt.core.parser.gen.TomlParser;

import net.certiv.common.log.Level;
import net.certiv.common.log.Log;
import net.certiv.dsl.core.DslCore;
import net.certiv.dsl.core.model.builder.ModelBuilder;
import net.certiv.dsl.core.parser.DslErrorListener;
import net.certiv.dsl.core.parser.DslParseRecord;
import net.certiv.dsl.core.parser.DslSourceParser;
import net.certiv.dsl.core.parser.Origin;

public class TomlSourceParser extends DslSourceParser {

	private static final TomlTokenFactory TokenFactory = new TomlTokenFactory();

	public TomlSourceParser(DslParseRecord record) {
		super(record);
		Log.setLevel(Level.INFO);
	}

	@Override
	public DslCore getDslCore() {
		return TomlCore.getDefault();
	}

	@Override
	public boolean doAnalysis() {
		return true;
	}

	/** Builds a ParseTree for the given content */
	@Override
	public Throwable parse() {
		DslErrorListener auditor = getErrorListener();
		try {
			record.setCharStream(CharStreams.fromString(getContent(), record.unit.getFile().getName()));
			Lexer lexer = new TomlLexer(record.getCharStream());
			lexer.setTokenFactory(TokenFactory);
			lexer.removeErrorListeners();
			lexer.addErrorListener(auditor);
			record.setTokenStream(new CommonTokenStream(lexer));

			TomlParser parser = new TomlParser(record.getTokenStream());
			record.setParser(parser);
			parser.setTokenFactory(TokenFactory);
			parser.removeErrorListeners();
			parser.addErrorListener(auditor);
			record.setTree(parser.toml());
			return null;

		} catch (Exception | Error e) {
			auditor.generalError(Origin.GENERAL, ERR_ANALYSIS, e);
			return e;
		}
	}

	@Override
	public Throwable analyze(ModelBuilder builder) {
		try {
			StructureVisitor visitor = new StructureVisitor(record.getTree());
			visitor.setSourceName(record.unit.getPackageName());
			visitor.setBuilder(builder);
			builder.beginAnalysis();
			visitor.findAll();
			builder.endAnalysis();
			return null;

		} catch (Exception | Error e) {
			getErrorListener().generalError(Origin.ANALYSIS, ERR_ANALYSIS, e);
			return e;
		}
	}
}
