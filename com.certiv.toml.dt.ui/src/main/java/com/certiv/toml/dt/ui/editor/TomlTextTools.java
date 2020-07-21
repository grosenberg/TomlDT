package com.certiv.toml.dt.ui.editor;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.rules.IPartitionTokenScanner;
import org.eclipse.jface.text.source.SourceViewerConfiguration;

import com.certiv.toml.dt.core.TomlCore;

import net.certiv.dsl.core.color.DslColorRegistry;
import net.certiv.dsl.core.preferences.IPrefsManager;
import net.certiv.dsl.ui.editor.DslEditor;
import net.certiv.dsl.ui.editor.text.DslTextTools;

public class TomlTextTools extends DslTextTools {

	private PartitionScanner partitionScanner;

	public TomlTextTools(boolean autoDispose) {
		super(Partitions.PARTITIONING, Partitions.getContentTypes(), autoDispose);
	}

	@Override
	public void createAutoClosePairs() {
		for (String contentType : Partitions.getAllContentTypes()) {
			addAutoClosePair(contentType, "{", "}");
			addAutoClosePair(contentType, "(", ")");
			addAutoClosePair(contentType, "[", "]");
			addAutoClosePair(contentType, "<", ">");
		}
	}

	@Override
	public void createAutoIndentPairs() {
		String[] contentTypes = { IDocument.DEFAULT_CONTENT_TYPE };
		for (String contentType : contentTypes) {
			addAutoIndentPair(contentType, "{", "}");
		}
	}

	@Override
	public void createAutoCommentPairs() {
		String[] contentTypes = { IDocument.DEFAULT_CONTENT_TYPE };
		for (String contentType : contentTypes) {
			addAutoCommentPair(contentType, "/**", "*/");
			addAutoCommentPair(contentType, "/*", "*/");
		}
	}

	@Override
	public void createStringDelimPairs() {
		for (String contentType : Partitions.getAllContentTypes()) {
			addStringDelimPairs(contentType, '\'');
			addStringDelimPairs(contentType, '"');
		}
	}

	@Override
	public SourceViewerConfiguration createSourceViewerConfiguraton(IPrefsManager store, DslEditor editor,
			String partitioning) {
		return new TomlSourceViewerConfiguration(getColorManager(), store, editor, partitioning);
	}

	@Override
	public SourceViewerConfiguration createSimpleSourceViewerConfiguration(IPrefsManager store,
			String partitioning) {
		return new TomlSimpleSourceViewerConfiguration(store, null, partitioning);
	}

	private DslColorRegistry getColorManager() {
		return TomlCore.getDefault().getColorRegistry();
	}

	@Override
	public IPartitionTokenScanner createPartitionScanner() {
		if (partitionScanner == null) {
			partitionScanner = new PartitionScanner();
		}
		return partitionScanner;
	}

	@Override
	public String[] getStringContentPartitions() {
		return Partitions.STRING_TYPES;
	}

	@Override
	public String[] getCommentContentPartitions() {
		return Partitions.COMMENT_TYPES;
	}

	@Override
	public String[] getStringAndCommentContentPartitions() {
		return Partitions.STRING_AND_COMMENT_TYPES;
	}
}
