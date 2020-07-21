package com.certiv.toml.dt.core;

import net.certiv.dsl.core.DslCore;
import net.certiv.dsl.core.lang.DslNature;

public class TomlNature extends DslNature {

	@Override
	public DslCore getDslCore() {
		return TomlCore.getDefault();
	}
}
