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
