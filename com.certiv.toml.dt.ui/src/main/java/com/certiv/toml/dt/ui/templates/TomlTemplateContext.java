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
package com.certiv.toml.dt.ui.templates;

import org.eclipse.jface.text.IRegion;

import net.certiv.dsl.ui.editor.text.completion.CompletionContext;
import net.certiv.dsl.ui.editor.text.completion.DslTemplateContext;

public class TomlTemplateContext extends DslTemplateContext {

	protected TomlTemplateContext(TomlContextType type, CompletionContext context, IRegion region) {
		super(type, context, region);
	}
}
