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

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Composite;

import net.certiv.dsl.ui.wizard.DslFileWizard;
import net.certiv.dsl.ui.wizard.DslFileWizardPage;

/**
 * Wizard UI to obtain the file name and location.
 */
public class TomlNewWizardPage extends DslFileWizardPage {

	public TomlNewWizardPage(DslFileWizard wizard, IStructuredSelection selection) {
		super("TomlNewWizardPage", wizard, selection);
		setFilename("file_name");
		setFileExtension("toml");
	}

	@Override
	protected void createCustomGroup(Composite topLevel) {}

	@Override
	protected String getInitialContents() {
		String contents = "/* New *.toml file */";
		return contents;
	}
}
