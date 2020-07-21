package com.certiv.toml.dt.ui.editor;

import com.certiv.toml.dt.core.TomlCore;

import net.certiv.dsl.core.model.DslModel;
import net.certiv.dsl.ui.editor.hyperlink.DslHyperlinkDetector;

public class TomlHyperlinkDetector extends DslHyperlinkDetector {

	public TomlHyperlinkDetector() {
		super();
	}

	@Override
	public DslModel getDslModel() {
		return TomlCore.getDefault().getDslModel();
	}

	@Override
	protected boolean isDslLikeFilename(String name) {
		return TomlCore.getDefault().getLangManager().isDslLikeFilename(name);
	}

}
