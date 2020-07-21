package com.certiv.toml.dt.ui.preferences.page;

import com.certiv.toml.dt.core.TomlCore;
import com.certiv.toml.dt.ui.TomlUI;
import com.certiv.toml.dt.ui.preferences.blocks.FoldingConfigBlock;

import net.certiv.dsl.core.DslCore;
import net.certiv.dsl.core.preferences.PrefsDeltaManager;
import net.certiv.dsl.ui.DslUI;
import net.certiv.dsl.ui.preferences.Messages;
import net.certiv.dsl.ui.preferences.blocks.IPreferenceConfigBlock;
import net.certiv.dsl.ui.preferences.pages.AbstractPreferencePage;

public class FoldingPage extends AbstractPreferencePage {

	public FoldingPage() {
		super();
	}

	@Override
	public DslUI getDslUI() {
		return TomlUI.getDefault();
	}

	@Override
	public DslCore getDslCore() {
		return TomlCore.getDefault();
	}

	@Override
	protected IPreferenceConfigBlock createConfigurationBlock(PrefsDeltaManager delta) {
		return new FoldingConfigBlock(this, delta, getFormkit(), getColorRegistry());
	}

	@Override
	protected void setDescription() {
		setDescription(Messages.EditorPreferencePage_folding_title);
	}
}
