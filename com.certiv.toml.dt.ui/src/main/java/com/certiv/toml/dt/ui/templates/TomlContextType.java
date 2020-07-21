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
package com.certiv.toml.dt.ui.templates;

import net.certiv.dsl.ui.editor.text.completion.DslTemplateContextType;

public class TomlContextType extends DslTemplateContextType {

	public static final String CONTEXT_TYPE_ID = "com.certiv.toml.dt.ui.DefaultContext";
	public static final String TOML_CUSTOM_TEMPLATES_KEY = "com.certiv.toml.dt.ui.CustomContext.templates";

	public static final String TOML_CONTEXT_TYPE_ID = "toml";
	public static final String[] CONTEXT_TYPE_IDS = { TOML_CONTEXT_TYPE_ID };

	public TomlContextType(String id) {
		super(id);
	}

	public TomlContextType(String id, String name) {
		super(id, name);
	}
}
