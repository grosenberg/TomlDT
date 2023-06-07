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
package com.certiv.toml.dt.core.preferences;

import com.certiv.toml.dt.core.TomlCore;

import net.certiv.common.log.Log;
import net.certiv.dsl.core.DslCore;
import net.certiv.dsl.core.preferences.DslPrefsInit;
import net.certiv.dsl.core.preferences.consts.Formatter;

/**
 * Initializer for the preferences unique to this plugin.
 */
public class PrefsInitializer extends DslPrefsInit {

	public PrefsInitializer() {
		super();
	}

	@Override
	public DslCore getDslCore() {
		return TomlCore.getDefault();
	}

	@Override
	public void initializeDefaultPreferences() {
		Log.info( "Initializing Toml preferences");
		super.initializeDefaultPreferences();

		setString(Prefs.FORMAT_SPACE_EQ, Formatter.AROUND);
		setString(Prefs.FORMAT_SPACE_SCALAR, Formatter.NONE);
		setString(Prefs.FORMAT_SPACE_COMMA, Formatter.AFTER);
		setString(Prefs.FORMAT_SPACE_LBRACKET, Formatter.BEFORE);
		setString(Prefs.FORMAT_SPACE_RBRACKET, Formatter.NONE);
		setString(Prefs.FORMAT_SPACE_OBRACKET, Formatter.BEFORE);
		setString(Prefs.FORMAT_SPACE_CBRACKET, Formatter.NONE);

		setString(Prefs.FORMAT_WRAP_EQ, Formatter.NONE);
		setString(Prefs.FORMAT_WRAP_COMMA, Formatter.NONE);
		setString(Prefs.FORMAT_WRAP_LBRACKET, Formatter.AFTER);
		setString(Prefs.FORMAT_WRAP_RBRACKET, Formatter.AFTER);
		setString(Prefs.FORMAT_WRAP_OBRACKET, Formatter.NONE);
		setString(Prefs.FORMAT_WRAP_CBRACKET, Formatter.NONE);

		setString(Prefs.FORMAT_LIST_COMMA, Formatter.AFTER);

		setBool(Formatter.FORMATTER_HEADER_FORMAT, false);
		setBool(Formatter.FORMATTER_COMMENT_FORMAT, false);
		setBool(Formatter.FORMATTER_INDENT_COMMENT_MULTILINE, false);
		setBool(Formatter.FORMATTER_INDENT_COMMENT_SINGLELINE, false);
	}
}
