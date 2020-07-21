package com.certiv.toml.dt.ui.editor;

import org.eclipse.core.filebuffers.IDocumentSetupParticipant;

import com.certiv.toml.dt.ui.TomlUI;

import net.certiv.dsl.ui.editor.DslDocumentSetupParticipant;

/**
 * Reference in the extension point is used to associate the contextTypeId with
 * a file extension
 */
public class TomlDocumentSetupParticipant extends DslDocumentSetupParticipant implements IDocumentSetupParticipant {

	public TomlDocumentSetupParticipant() {
		super(TomlUI.getDefault().getTextTools());
	}
}
