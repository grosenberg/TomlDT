package com.certiv.toml.dt.ui.editor.strategies;

import com.certiv.toml.dt.core.TomlCore;
import com.certiv.toml.dt.ui.TomlUI;

import net.certiv.dsl.core.DslCore;
import net.certiv.dsl.ui.DslUI;
import net.certiv.dsl.ui.editor.text.AbstractAutoEditStrategy;

public class TomlAutoEditStrategy extends AbstractAutoEditStrategy {

	public TomlAutoEditStrategy(String partitioning) {
		super(partitioning);
	}

	@Override
	public DslUI getDslUI() {
		return TomlUI.getDefault();
	}

	@Override
	public DslCore getDslCore() {
		return TomlCore.getDefault();
	}
}
