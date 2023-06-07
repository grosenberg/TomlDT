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

import com.certiv.toml.dt.core.TomlCore;

import net.certiv.dsl.core.model.DslModel;
import net.certiv.dsl.ui.editor.hyperlink.DslHyperlinkDetector;

public class TomlHyperlinkDetector extends DslHyperlinkDetector {

	public TomlHyperlinkDetector() {
		super();
	}

	@Override
	public DslModel getDslModel() {
		return TomlCore.getDefault().getDslModel();
	}

	@Override
	protected boolean isDslLikeFilename(String name) {
		return TomlCore.getDefault().getLangManager().isDslLikeFilename(name);
	}

}
