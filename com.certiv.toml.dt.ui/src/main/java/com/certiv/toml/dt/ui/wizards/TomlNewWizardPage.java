package com.certiv.toml.dt.ui.wizards;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import com.certiv.toml.dt.core.TomlCore;
import com.certiv.toml.dt.ui.TomlUI;

import net.certiv.dsl.core.DslCore;
import net.certiv.dsl.ui.DslUI;
import net.certiv.dsl.ui.wizards.DslBaseWizard;
import net.certiv.dsl.ui.wizards.DslContainerWizardPage;

/**
 * Wizard UI to obtain the file name and location.
 */
public class TomlNewWizardPage extends DslContainerWizardPage {

	public TomlNewWizardPage(DslBaseWizard wizard, IStructuredSelection selection) {
		super("TomlNewWizardPage", wizard, selection);
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
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(container);
		GridLayoutFactory.fillDefaults().spacing(6, 9).margins(6, 6).applyTo(container);

		setFileName("file_name");
		setFileExtension("toml");
		createContainerControl(container);

		setControl(container);
		setErrorMessage(null);
		setMessage(null);
		validatePage();
	}
}
