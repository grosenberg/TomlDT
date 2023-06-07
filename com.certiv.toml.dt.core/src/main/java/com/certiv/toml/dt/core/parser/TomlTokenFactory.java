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

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.TokenFactory;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.misc.Pair;

public class TomlTokenFactory implements TokenFactory<TomlToken> {

	@Override
	public TomlToken create(int type, String text) {
		return new TomlToken(type, text);
	}

	@Override
	public TomlToken create(Pair<TokenSource, CharStream> source, int type, String text, int channel, int start,
			int stop, int line, int charPositionInLine) {

		TomlToken token = new TomlToken(source, type, channel, start, stop);
		token.setText(text);
		token.setLine(line);
		token.setCharPositionInLine(charPositionInLine);
		token.setMode(((Lexer) source.a)._mode);
		return token;
	}
}
