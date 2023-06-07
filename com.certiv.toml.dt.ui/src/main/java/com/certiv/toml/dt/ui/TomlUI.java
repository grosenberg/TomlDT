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
package com.certiv.toml.dt.ui;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ResourceLocator;
import org.osgi.framework.BundleContext;

import com.certiv.toml.dt.core.TomlCore;
import com.certiv.toml.dt.ui.editor.TomlCompletionManager;
import com.certiv.toml.dt.ui.editor.TomlEditor;
import com.certiv.toml.dt.ui.editor.TomlTextTools;

import net.certiv.common.log.Level;
import net.certiv.common.log.Log;
import net.certiv.dsl.core.DslCore;
import net.certiv.dsl.ui.DslUI;
import net.certiv.dsl.ui.editor.text.DslTextTools;
import net.certiv.dsl.ui.templates.CompletionManager;

public class TomlUI extends DslUI {

	private static TomlUI plugin;

	private ImageManager imgMgr;
	private DslTextTools textTools;
	private TomlCompletionManager compMgr;

	public TomlUI() {
		super();
	}

	public static TomlUI getDefault() {
		return plugin;
	}

	@Override
	public DslUI getDslUI() {
		return plugin;
	}

	@Override
	public DslCore getDslCore() {
		return TomlCore.getDefault();
	}

	@Override
	public void start(BundleContext context) throws Exception {
		plugin = this;
		super.start(context);
		Log.defLevel(Level.DEBUG);
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		super.stop(context);
		plugin = null;
	}

	@Override
	public String getPluginId() {
		return plugin.getBundle().getSymbolicName();
	}

	/**
	 * Returns an image descriptor for the image file at the given plug-in relative path
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return ResourceLocator.imageDescriptorFromBundle(PLUGIN_ID, path).orElse(null);
	}

	@Override
	public ImageManager getImageManager() {
		if (imgMgr == null) {
			imgMgr = new ImageManager();
		}
		return imgMgr;
	}

	@Override
	public DslTextTools getTextTools() {
		if (textTools == null) {
			textTools = new TomlTextTools(true);
		}
		return textTools;
	}

	@Override
	public String getEditorId() {
		return TomlEditor.EDITOR_ID;
	}

	@Override
	public CompletionManager getCompletionMgr() {
		if (compMgr == null) {
			compMgr = new TomlCompletionManager(this, getEditorId());
		}
		return compMgr;
	}
}
