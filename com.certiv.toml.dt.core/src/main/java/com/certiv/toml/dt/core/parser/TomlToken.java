package com.certiv.toml.dt.core.parser;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.misc.Pair;

import com.certiv.toml.dt.core.parser.gen.TomlLexer;

import net.certiv.dsl.core.parser.IDslToken;
import net.certiv.dsl.core.util.Strings;

public class TomlToken extends CommonToken implements IDslToken {

	private int _mode;

	/** Constructs an extended token */
	public TomlToken(Pair<TokenSource, CharStream> source, int type, int channel, int start, int stop) {
		super(source, type, channel, start, stop);
	}

	public TomlToken(int type, String text) {
		super(type, text);
	}

	@Override
	public int getMode() {
		return _mode;
	}

	public void setMode(int mode) {
		_mode = mode;
	}

	@Override
	public String toString() {
		String text = Strings.encode(getText());
		String tname = TomlLexer.VOCABULARY.getDisplayName(type);
		String mname = _mode == 0 ? "default" : TomlLexer.modeNames[_mode];
		String chan = channel == 0 ? "DEFAULT" : TomlLexer.channelNames[channel];

		String msg = "%-2d %2d:%-2d %s (%s:%s:%s) '%s'";
		return String.format(msg, index, line, charPositionInLine, tname, type, mname, chan, text);
	}
}
