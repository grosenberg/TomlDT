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

import org.eclipse.jface.text.IAutoEditStrategy;

import net.certiv.dsl.core.model.IStatement;
import net.certiv.dsl.ui.DslUI;
import net.certiv.dsl.ui.templates.CompletionManager;

public class TomlCompletionManager extends CompletionManager {

	public static final String ELEMENTS = "elements";
	public static final String TABLE = "table";
	public static final String TABLE_ARRAY = "table_array";

	public TomlCompletionManager(DslUI ui, String editorId) {
		super(ui, editorId, ELEMENTS, TABLE, TABLE_ARRAY);
	}

	@Override
	public String getContentAssistScope(IStatement stmt) {
		if (stmt == null) return ELEMENTS;

		switch (stmt.getModelType()) {
			case STATEMENT:
				switch (stmt.getRulename()) {
					case TABLE:
						return TABLE;
					case TABLE_ARRAY:
						return TABLE_ARRAY;
					default:
						return ELEMENTS;
				}

			default:
				return null;
		}
	}

	@Override
	public IAutoEditStrategy getSmartTriggerStrategy(String contentType) {
		return super.getSmartTriggerStrategy(contentType);
	}
}
