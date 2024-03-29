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
package com.certiv.toml.dt.ui.preferences.page;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.widgets.FormToolkit;

import com.certiv.toml.dt.core.TomlCore;
import com.certiv.toml.dt.ui.TomlUI;

import net.certiv.dsl.core.DslCore;
import net.certiv.dsl.core.color.DslColorRegistry;
import net.certiv.dsl.core.preferences.PrefsDeltaManager;
import net.certiv.dsl.core.preferences.consts.Builder;
import net.certiv.dsl.ui.DslUI;
import net.certiv.dsl.ui.preferences.blocks.IPreferenceConfigBlock;
import net.certiv.dsl.ui.preferences.editors.CheckboxFieldEditor;
import net.certiv.dsl.ui.preferences.pages.AbstractFieldEditorPreferencePage;
import net.certiv.dsl.ui.util.SWTFactory;

public class BuilderPage extends AbstractFieldEditorPreferencePage {

	private Composite buildComp;
	private boolean enabled;
	private CheckboxFieldEditor builderEn;
	private CheckboxFieldEditor projRestriction;
	private CheckboxFieldEditor curpathRestriction;
	private Composite actionsComp;

	public BuilderPage() {
		super(GRID);
		PrefsDeltaManager delta = TomlCore.getDefault().getPrefsManager().createDeltaManager();
		setPreferenceStore(delta);
	}

	@Override
	public void createFieldEditors() {
		Composite parent = getFieldEditorParent();
		GridDataFactory.fillDefaults().grab(true, true).applyTo(parent);

		buildComp = SWTFactory.createGroupComposite(parent, 2, 3, "Builder Options");

		builderEn = new CheckboxFieldEditor(bind(Builder.BUILDER_ENABLE), "Enable Builder", buildComp);
		builderEn.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				enabled = ((Button) e.getSource()).getSelection();
				projRestriction.setEnabled(enabled, buildComp);
				curpathRestriction.setEnabled(enabled, buildComp);
				buildComp.redraw();
			}
		});
		addField(builderEn);

		projRestriction = new CheckboxFieldEditor(bind(Builder.BUILDER_RESTRICT_TO_ACTIVE_PROJECT),
				"Restrict builds to grammars within the current project", buildComp);
		projRestriction.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				boolean selected = ((Button) e.getSource()).getSelection();
				if (!selected) {
					curpathRestriction.setValue(selected);
				}
			}
		});
		addField(projRestriction);

		// ----

		actionsComp = SWTFactory.createGroupComposite(parent, 2, 3, "Post-Build Actions");

		addField(new CheckboxFieldEditor(bind(Builder.BUILDER_REFRESH), "Refresh project", actionsComp));
		addField(new CheckboxFieldEditor(bind(Builder.BUILDER_ORGANIZE), "Organize imports *", actionsComp));
		addField(new CheckboxFieldEditor(bind(Builder.BUILDER_FORMAT), "Format generated source *", actionsComp));
		Label notice = new Label(actionsComp, SWT.NONE);
		notice.setText("        * requires the generated files to within a source package directory");
	}

	protected void updateEnables() {
		buildComp.redraw();
	}

	@Override
	public void performDefaults() {
		super.performDefaults();
		updateEnables();
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
	protected IPreferenceConfigBlock createConfigurationBlock(AbstractFieldEditorPreferencePage page, Composite parent,
			PrefsDeltaManager delta, FormToolkit formkit, DslColorRegistry reg) {
		return null;
	}

	@Override
	protected void adjustSubLayout() {}
}
