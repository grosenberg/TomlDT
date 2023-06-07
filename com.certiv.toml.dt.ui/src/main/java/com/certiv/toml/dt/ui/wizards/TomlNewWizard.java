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
package com.certiv.toml.dt.ui.wizards;

import org.eclipse.jface.resource.ImageDescriptor;

import com.certiv.toml.dt.core.TomlCore;
import com.certiv.toml.dt.ui.TomlUI;

import net.certiv.dsl.core.DslCore;
import net.certiv.dsl.ui.DslImageManager;
import net.certiv.dsl.ui.DslUI;
import net.certiv.dsl.ui.wizard.DslFileWizard;

/** Create a new resource in the indicated container. */
public class TomlNewWizard extends DslFileWizard {

	private TomlNewWizardPage page;

	/**
	 * Constructor for TomlNewWizard.
	 */
	public TomlNewWizard() {
		super("TomlNewWizard");
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
	public ImageDescriptor getPageImageDescriptor() {
		DslImageManager imgMgr = getDslUI().getImageManager();
		return imgMgr.getDescriptor(imgMgr.IMG_WIZBAN_NEW_FILE);
	}

	@Override
	public String getWindowShellTitle() {
		return "New Toml file";
	}

	@Override
	protected TomlNewWizardPage getMainPage() {
		if (page == null) {
			page = new TomlNewWizardPage(this, getSelection());
		}
		return page;
	}
}
