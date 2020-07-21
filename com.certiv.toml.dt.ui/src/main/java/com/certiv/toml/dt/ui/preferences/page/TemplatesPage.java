/*******************************************************************************
 * Copyright (c) 2012, 2020 Certiv Analytics.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package com.certiv.toml.dt.ui.preferences.page;

import org.eclipse.jface.text.IDocument;

import com.certiv.toml.dt.core.TomlCore;
import com.certiv.toml.dt.ui.TomlUI;
import com.certiv.toml.dt.ui.editor.Partitions;
import com.certiv.toml.dt.ui.editor.TomlSimpleSourceViewerConfiguration;
import com.certiv.toml.dt.ui.editor.TomlSourceViewerConfiguration;

import net.certiv.dsl.core.DslCore;
import net.certiv.dsl.core.color.DslColorRegistry;
import net.certiv.dsl.core.preferences.IPrefsManager;
import net.certiv.dsl.core.preferences.PrefsDeltaManager;
import net.certiv.dsl.ui.DslUI;
import net.certiv.dsl.ui.editor.text.DslTextTools;
import net.certiv.dsl.ui.preferences.pages.DslTemplatePreferencePage;
import net.certiv.dsl.ui.templates.CompletionManager;

public class TemplatesPage extends DslTemplatePreferencePage {

	public TemplatesPage() {
		super();
		PrefsDeltaManager delta = getDslCore().getPrefsManager().createDeltaManager();
		setPreferenceStore(delta);
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
	protected TomlSourceViewerConfiguration createSourceViewerConfiguration() {
		return new TomlSimpleSourceViewerConfiguration(getColorManager(), (IPrefsManager) getPreferenceStore(), null,
				Partitions.PARTITIONING, false);
	}

	@Override
	protected void setDocumentPartitioner(IDocument document) {
		getTextTools().setupDocumentPartitioner(document, Partitions.PARTITIONING);
	}

	@Override
	protected CompletionManager getCompletionMgr() {
		return getDslUI().getCompletionMgr();
	}

	private DslColorRegistry getColorManager() {
		return getDslCore().getColorRegistry();
	}

	private DslTextTools getTextTools() {
		return getDslUI().getTextTools();
	}
}
