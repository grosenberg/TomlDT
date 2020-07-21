package com.certiv.toml.dt.ui.editor.outline;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.ILabelDecorator;

import com.certiv.toml.dt.ui.TomlUI;

import net.certiv.dsl.ui.editor.outline.OutlinePage;

public class TomlOutlinePage extends OutlinePage {

	public TomlOutlinePage(IPreferenceStore store) {
		super(TomlUI.getDefault(), store);
	}

	@Override
	protected ILabelDecorator getLabelDecorator() {
		return new TomlStatementLabelProvider();
	}
}
