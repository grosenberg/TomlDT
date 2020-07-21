package com.certiv.toml.dt.ui.preferences.page;

import com.certiv.toml.dt.core.TomlCore;
import com.certiv.toml.dt.ui.TomlUI;
import com.certiv.toml.dt.ui.preferences.blocks.SyntaxColorConfigBlock;

import net.certiv.dsl.core.DslCore;
import net.certiv.dsl.core.preferences.PrefsDeltaManager;
import net.certiv.dsl.ui.DslUI;
import net.certiv.dsl.ui.preferences.blocks.IPreferenceConfigBlock;
import net.certiv.dsl.ui.preferences.pages.AbstractPreferencePage;

public class SyntaxColorPage extends AbstractPreferencePage {

	public SyntaxColorPage() {
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
		return new SyntaxColorConfigBlock(this, delta, getFormkit(), getColorRegistry());
	}

	@Override
	protected void setDescription() {
		setDescription("Toml Syntax Presentation Preferences");
	}

	@Override
	protected String getHelpId() {
		return null;
	}
}
