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
package com.certiv.toml.dt.core;

import org.osgi.framework.BundleContext;

import net.certiv.dsl.core.DslCore;
import net.certiv.dsl.core.lang.LanguageManager;
import net.certiv.dsl.core.log.Log;
import net.certiv.dsl.core.log.Log.LogLevel;

/** The activator class controls the plug-in life cycle. */
public class TomlCore extends DslCore {

	public static TomlCore plugin;

	private TomlLangManager langMgr;

	public TomlCore() {
		super();
		Log.defLevel(LogLevel.Debug);
	}

	public static TomlCore getDefault() {
		return plugin;
	}

	@Override
	public DslCore getDslCore() {
		return this;
	}

	@Override
	public void start(BundleContext context) throws Exception {
		plugin = this;
		super.start(context);
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	@Override
	public String getPluginId() {
		return getDefault().getBundle().getSymbolicName();
	}

	@Override
	public LanguageManager getLangManager() {
		if (langMgr == null) {
			langMgr = new TomlLangManager(this);
		}
		return langMgr;
	}
}
