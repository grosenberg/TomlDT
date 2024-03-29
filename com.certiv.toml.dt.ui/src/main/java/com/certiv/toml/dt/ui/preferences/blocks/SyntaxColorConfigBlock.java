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
package com.certiv.toml.dt.ui.preferences.blocks;

import java.io.InputStream;
import java.util.List;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.source.IOverviewRuler;
import org.eclipse.jface.text.source.IVerticalRuler;
import org.eclipse.jface.text.source.projection.ProjectionViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.FormToolkit;

import com.certiv.toml.dt.ui.TomlUI;
import com.certiv.toml.dt.ui.editor.Partitions;
import com.certiv.toml.dt.ui.editor.TomlSimpleSourceViewerConfiguration;
import com.certiv.toml.dt.ui.preferences.page.SyntaxColorPage;

import net.certiv.dsl.core.color.DslColorRegistry;
import net.certiv.dsl.core.preferences.IPrefsManager;
import net.certiv.dsl.core.preferences.PrefsDeltaManager;
import net.certiv.dsl.core.preferences.consts.Editor;
import net.certiv.dsl.ui.editor.DslEditor;
import net.certiv.dsl.ui.editor.DslSourceViewer;
import net.certiv.dsl.ui.editor.DslSourceViewerConfiguration;
import net.certiv.dsl.ui.preferences.blocks.AbstractSyntaxColorConfigBlock;

public class SyntaxColorConfigBlock extends AbstractSyntaxColorConfigBlock {

	private static final String PREVIEW_FILE_NAME = "ColorPreview.g4";

	public SyntaxColorConfigBlock(SyntaxColorPage page, PrefsDeltaManager delta, FormToolkit formkit,
			DslColorRegistry reg) {
		super(page, delta, formkit, reg);
	}

	@Override
	protected List<String> createDeltaMatchKeys(List<String> keys) {
		keys.add(Editor.EDITOR_COMMENT_DC_COLOR);
		keys.add(Editor.EDITOR_COMMENT_BL_COLOR);
		keys.add(Editor.EDITOR_COMMENT_LN_COLOR);
		keys.add(Editor.EDITOR_KEYWORDS_COLOR);
		keys.add(Editor.EDITOR_STRING_COLOR);
		return keys;
	}

	@Override
	protected void initCatPrefsModel() {
		addColorPreference("Comments", "JavaDoc", Editor.EDITOR_COMMENT_DC_COLOR);
		addColorPreference("Comments", "Block", Editor.EDITOR_COMMENT_BL_COLOR);
		addColorPreference("Comments", "Single line", Editor.EDITOR_COMMENT_LN_COLOR);
		addColorPreference("Grammar", "Keywords", Editor.EDITOR_KEYWORDS_COLOR);
		addColorPreference("Grammar", "Strings", Editor.EDITOR_STRING_COLOR);
	}

	@Override
	protected ProjectionViewer createPreviewViewer(Composite parent, IVerticalRuler verticalRuler,
			IOverviewRuler overviewRuler, boolean showAnnotationsOverview, int styles, IPrefsManager store) {
		return new DslSourceViewer(page.getDslUI(), parent, verticalRuler, overviewRuler, showAnnotationsOverview,
				styles, store);
	}

	@Override
	protected DslSourceViewerConfiguration createSimpleSourceViewerConfiguration(DslColorRegistry colorMgr,
			IPrefsManager store, DslEditor editor, boolean configFormatter) {
		return new TomlSimpleSourceViewerConfiguration(colorMgr, store, editor, Partitions.PARTITIONING,
				configFormatter);
	}

	@Override
	protected void setDocumentPartitioning(IDocument document) {
		TomlUI.getDefault().getTextTools().setupDocumentPartitioner(document, Partitions.PARTITIONING);
	}

	@Override
	protected InputStream getPreviewContentStream() {
		return getClass().getResourceAsStream(PREVIEW_FILE_NAME);
	}
}
