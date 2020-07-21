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
package com.certiv.toml.dt.ui.editor;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentExtension3;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.source.DefaultCharacterPairMatcher;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.texteditor.SourceViewerDecorationSupport;

import com.certiv.toml.dt.core.TomlCore;
import com.certiv.toml.dt.ui.TomlUI;
import com.certiv.toml.dt.ui.editor.folding.TomlFoldingStructureProvider;
import com.certiv.toml.dt.ui.editor.outline.TomlOutlinePage;

import net.certiv.dsl.core.DslCore;
import net.certiv.dsl.core.preferences.consts.Editor;
import net.certiv.dsl.ui.DslUI;
import net.certiv.dsl.ui.editor.DslEditor;
import net.certiv.dsl.ui.editor.text.DslWordFinder;
import net.certiv.dsl.ui.editor.text.folding.IFoldingStructureProvider;

public class TomlEditor extends DslEditor {

	public static final String EDITOR_ID = "com.certiv.toml.dt.ui.editor.TomlEditor";
	public static final String EDITOR_CONTEXT = "#TomlEditorContext";
	public static final String RULER_CONTEXT = "#TomlRulerContext";

	private static final String[] EDITOR_KEY_SCOPE = new String[] { "com.certiv.toml.dt.ui.tomlEditorScope" };
	private static final String MARK_OCCURRENCES_ANNOTATION_TYPE = "com.certiv.toml.dt.ui.occurrences";

	private final DslWordFinder finder = new DslWordFinder();
	private final DefaultCharacterPairMatcher pairMatcher = new DefaultCharacterPairMatcher(STD_PAIRS,
			Partitions.PARTITIONING);

	private IFoldingStructureProvider foldingProvider;

	public TomlEditor() {
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
	public String getEditorId() {
		return EDITOR_ID;
	}

	@Override
	public char[] getBrackets() {
		return STD_PAIRS;
	}

	@Override
	protected void initializeEditor() {
		super.initializeEditor();
		setEditorContextMenuId(EDITOR_CONTEXT);
		setRulerContextMenuId(RULER_CONTEXT);
	}

	@Override
	protected void initializeKeyBindingScopes() {
		setKeyBindingScopes(EDITOR_KEY_SCOPE);
	}

	@Override
	public String getMarkOccurrencesAnnotationType() {
		return MARK_OCCURRENCES_ANNOTATION_TYPE;
	}

	@Override
	protected IRegion findWord(IDocument doc, int offset) {
		return finder.findWord(doc, offset);
	}

	@Override
	protected TomlOutlinePage doCreateOutlinePage() {
		return new TomlOutlinePage(getPreferenceStore());
	}

	@Override
	protected IFoldingStructureProvider createFoldingStructureProvider() {
		if (foldingProvider == null) {
			foldingProvider = new TomlFoldingStructureProvider();
		}
		return foldingProvider;
	}

	@Override
	protected void connectPartitioningToElement(IEditorInput input, IDocument document) {
		if (document instanceof IDocumentExtension3) {
			IDocumentExtension3 extension = (IDocumentExtension3) document;
			if (extension.getDocumentPartitioner(Partitions.PARTITIONING) == null) {
				TomlDocumentSetupParticipant participant = new TomlDocumentSetupParticipant();
				participant.setup(document);
			}
		}
	}

	@Override
	protected void configureSourceViewerDecorationSupport(SourceViewerDecorationSupport support) {
		support.setCharacterPairMatcher(pairMatcher);
		support.setMatchingCharacterPainterPreferenceKeys(bind(Editor.EDITOR_MATCHING_BRACKETS),
				bind(Editor.EDITOR_MATCHING_BRACKETS_COLOR));
		super.configureSourceViewerDecorationSupport(support);
	}
}
