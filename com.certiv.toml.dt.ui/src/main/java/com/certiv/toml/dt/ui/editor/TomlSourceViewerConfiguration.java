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
package com.certiv.toml.dt.ui.editor;

import static net.certiv.dsl.ui.editor.text.completion.engines.IPrefixStops.COLON;
import static net.certiv.dsl.ui.editor.text.completion.engines.IPrefixStops.COMMA;
import static net.certiv.dsl.ui.editor.text.completion.engines.IPrefixStops.LBRACE;
import static net.certiv.dsl.ui.editor.text.completion.engines.IPrefixStops.LPAREN;
import static net.certiv.dsl.ui.editor.text.completion.engines.IPrefixStops.SEMI;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.IAutoEditStrategy;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextDoubleClickStrategy;
import org.eclipse.jface.text.contentassist.ContentAssistant;
import org.eclipse.jface.text.formatter.IContentFormatter;
import org.eclipse.jface.text.formatter.MultiPassContentFormatter;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.ui.texteditor.ITextEditor;

import com.certiv.toml.dt.core.TomlCore;
import com.certiv.toml.dt.ui.TomlUI;
import com.certiv.toml.dt.ui.editor.outline.TomlStatementLabelProvider;
import com.certiv.toml.dt.ui.editor.strategies.TomlAutoEditDocStrategy;
import com.certiv.toml.dt.ui.editor.strategies.TomlAutoEditStrategy;
import com.certiv.toml.dt.ui.editor.text.ScannerCommentML;
import com.certiv.toml.dt.ui.editor.text.ScannerCommentSL;
import com.certiv.toml.dt.ui.editor.text.ScannerKeyword;
import com.certiv.toml.dt.ui.editor.text.ScannerString;

import net.certiv.common.util.Chars;
import net.certiv.common.util.Strings;
import net.certiv.dsl.core.DslCore;
import net.certiv.dsl.core.color.DslColorRegistry;
import net.certiv.dsl.core.preferences.IPrefsManager;
import net.certiv.dsl.core.preferences.PrefsManager;
import net.certiv.dsl.core.util.eclipse.TabStyle;
import net.certiv.dsl.ui.DslUI;
import net.certiv.dsl.ui.editor.DoubleClickStrategy;
import net.certiv.dsl.ui.editor.DslEditor;
import net.certiv.dsl.ui.editor.DslSourceViewerConfiguration;
import net.certiv.dsl.ui.editor.reconcile.PresentationReconciler;
import net.certiv.dsl.ui.editor.semantic.StylesManager;
import net.certiv.dsl.ui.editor.text.completion.CompletionCategory;
import net.certiv.dsl.ui.editor.text.completion.CompletionProcessor;
import net.certiv.dsl.ui.editor.text.completion.engines.FieldEngine;
import net.certiv.dsl.ui.editor.text.completion.engines.ICompletionEngine;
import net.certiv.dsl.ui.editor.text.completion.engines.TemplateEngine;

public class TomlSourceViewerConfiguration extends DslSourceViewerConfiguration {

	private DoubleClickStrategy doubleClickStrategy;
	private ScannerKeyword keyScanner;
	private ScannerString stringScanner;
	private ScannerCommentSL commentSLScanner;
	private ScannerCommentML commentMLScanner;

	public TomlSourceViewerConfiguration(DslColorRegistry reg, IPrefsManager store, DslEditor editor,
			String partitioning) {
		super(TomlCore.getDefault(), reg, store, editor, partitioning);
	}

	@Override
	public DslUI getDslUI() {
		return TomlUI.getDefault();
	}

	@Override
	public DslCore getDslCore() {
		return TomlCore.getDefault();
	}

	private PrefsManager getPrefsMgr() {
		return getDslCore().getPrefsManager();
	}

	@Override
	public String[] getConfiguredContentTypes(ISourceViewer sourceViewer) {
		return Partitions.getContentTypes(IDocument.DEFAULT_CONTENT_TYPE);
	}

	@Override
	public void specializeContentAssistant(ContentAssistant assistant) {
		TomlStatementLabelProvider provider = new TomlStatementLabelProvider();
		// DslImageManager imgMgr = getDslUI().getImageManager();
		// Image image = imgMgr.get(imgMgr.IMG_OBJS_KEYWORD);
		Set<Character> stops = new HashSet<>(Arrays.asList(LBRACE, LBRACE, LPAREN, COLON, COMMA, SEMI));

		// ICompletionEngine keywords = new KeywordEngine(image, stops,
		// ScannerKeyword.KEYWORDS);
		ICompletionEngine fields = new FieldEngine(provider, stops);
		ICompletionEngine templates = new TemplateEngine(provider, stops);

		CompletionCategory lang = new CompletionCategory("Toml", true, false,
				/* keywords, */fields);
		CompletionCategory tmpl = new CompletionCategory("Toml Templates", false, true, templates);
		CompletionProcessor proc = new CompletionProcessor(getDslUI(), assistant, lang, tmpl);
		assistant.addContentAssistProcessor(proc, IDocument.DEFAULT_CONTENT_TYPE);
	}

	/**
	 * Loads content formatters into the SourceViewer for execution on receipt of a
	 * ISourceViewer.FORMAT command.
	 * <p>
	 * The master strategy utilizes the DSL formatter tree grammar to drive formatting of
	 * the default partition. The slave strategies are executed to format particular
	 * non-default partitions.
	 * <p>
	 * Two built-in non-default partition strategies are provided:
	 * {@code CommentFormattingStrategy()} and {@code JavaFormattingStrategy()} that use
	 * the JDT formatter and global JDT formatting preferences. The comment strategy can
	 * format stand-alone single-line, mutiple-line, and JavaDoc-style comments. The
	 * JavaCode strategy can format discrete blocks of otherwise standard Java code,
	 * including embedded comments.
	 *
	 * @param sourceViewer the viewer that will contain the content to format
	 * @return the content formatter
	 */
	@Override
	public IContentFormatter getContentFormatter(ISourceViewer sourceViewer) {
		MultiPassContentFormatter formatter = (MultiPassContentFormatter) super.getContentFormatter(sourceViewer);
		// formatter.setSlaveStrategy(new TomlCommentFormattingStrategy(),
		// Partitions.COMMENT_ML);
		// formatter.setSlaveStrategy(new TomlCommentFormattingStrategy(),
		// Partitions.COMMENT_SL);
		return formatter;
	}

	@Override
	public ITextDoubleClickStrategy getDoubleClickStrategy(ISourceViewer sourceViewer, String contentType) {
		if (doubleClickStrategy == null) {
			doubleClickStrategy = new DoubleClickStrategy();
		}
		return doubleClickStrategy;
	}

	@Override
	public String[] getIndentPrefixes(ISourceViewer sourceViewer, String contentType) {
		if (getPrefsMgr().getTabStyle() == TabStyle.SPACES) {
			return new String[] { Strings.dup(getPrefsMgr().getTabWidth(), Chars.SP) };
		} else {
			return new String[] { Strings.TAB };
		}
	}

	@Override
	protected void initializeScanners() {
		IPrefsManager store = getPrefStore();
		StylesManager mgr = getDslUI().getStylesManager();

		keyScanner = new ScannerKeyword(store, mgr);
		stringScanner = new ScannerString(store, mgr);
		commentSLScanner = new ScannerCommentSL(store, mgr);
		commentMLScanner = new ScannerCommentML(store, mgr);
	}

	@Override
	public IPresentationReconciler getPresentationReconciler(ISourceViewer sourceViewer) {
		PresentationReconciler reconciler = new PresentationReconciler(getDslUI());
		reconciler.setDocumentPartitioning(getConfiguredDocumentPartitioning(sourceViewer));

		buildRepairer(reconciler, stringScanner, Partitions.STRING);
		buildRepairer(reconciler, commentSLScanner, Partitions.COMMENT_SL);
		buildRepairer(reconciler, commentMLScanner, Partitions.COMMENT_ML);
		buildRepairer(reconciler, keyScanner, IDocument.DEFAULT_CONTENT_TYPE);

		return reconciler;
	}

	/**
	 * Adapts the behavior of the contained components to the change encoded in the given
	 * event.
	 * <p>
	 * Clients are not allowed to call this method if the old setup with text tools is in
	 * use.
	 *
	 * @param event the event to which to adapt
	 * @see PythonSourceViewerConfiguration#ScriptSourceViewerConfiguration(DslColorRegistry,
	 *          IPreferenceStore, ITextEditor, String)
	 */
	@Override
	public void handlePropertyChangeEvent(PropertyChangeEvent event) {
		if (keyScanner.affectsBehavior(event)) keyScanner.adaptToPreferenceChange(event);
		if (stringScanner.affectsBehavior(event)) stringScanner.adaptToPreferenceChange(event);
		if (commentSLScanner.affectsBehavior(event)) commentSLScanner.adaptToPreferenceChange(event);
		if (commentMLScanner.affectsBehavior(event)) commentMLScanner.adaptToPreferenceChange(event);
	}

	/**
	 * Determines whether the preference change encoded by the given event changes the
	 * behavior of one of its contained components.
	 *
	 * @param event the event to be investigated
	 * @return {@code true} if event causes a behavioral change
	 */
	@Override
	public boolean affectsTextPresentation(PropertyChangeEvent event) {
		return keyScanner.affectsBehavior(event) //
				|| stringScanner.affectsBehavior(event) //
				|| commentSLScanner.affectsBehavior(event) //
				|| commentMLScanner.affectsBehavior(event);
	}

	@Override
	public IAutoEditStrategy[] getAutoEditStrategies(ISourceViewer sourceViewer, String contentType) {
		String partitioning = getConfiguredDocumentPartitioning(sourceViewer);
		IAutoEditStrategy strategy;
		switch (contentType) {
			case Partitions.COMMENT_ML:
				strategy = new TomlAutoEditDocStrategy(partitioning);
				break;
			default:
				strategy = new TomlAutoEditStrategy(partitioning);
		}
		return new IAutoEditStrategy[] { strategy };
	}

	@Override
	protected String getCommentPrefix() {
		return "#";
	}
}
