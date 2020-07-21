package com.certiv.toml.dt.core.formatter;

import com.certiv.toml.dt.core.TomlCore;

import net.certiv.dsl.core.DslCore;
import net.certiv.dsl.core.formatter.DslCodeFormatter;

public class TomlSourceFormatter extends DslCodeFormatter {

	public TomlSourceFormatter() {
		super();
	}

	@Override
	public DslCore getDslCore() {
		return TomlCore.getDefault();
	}
}
