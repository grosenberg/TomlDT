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
package com.certiv.toml.dt.ui.editor.outline;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.ILabelDecorator;

import com.certiv.toml.dt.ui.TomlUI;

import net.certiv.dsl.ui.editor.outline.OutlinePage;

public class TomlOutlinePage extends OutlinePage {

	public TomlOutlinePage(IPreferenceStore store) {
		super(TomlUI.getDefault(), store);
	}

	@Override
	protected ILabelDecorator getLabelDecorator() {
		return new TomlStatementLabelProvider();
	}
}
