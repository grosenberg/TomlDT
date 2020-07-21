package com.certiv.toml.dt.core.preferences;

import net.certiv.dsl.core.preferences.DslPrefsKey;

/**
 * Constant definitions for plug-in preferences
 */
public class Prefs extends DslPrefsKey {

	// custom formatter options
	private static final String FORMAT_SPACE = "formatter.space.";
	private static final String FORMAT_WRAP = "formatter.wrap.";
	private static final String FORMAT_LIST = "formatter.list.";

	public static final String FORMAT_SPACE_EQ = FORMAT_SPACE + "eq";
	public static final String FORMAT_SPACE_SCALAR = FORMAT_SPACE + "scalar";
	public static final String FORMAT_SPACE_COMMA = FORMAT_SPACE + "comma";
	public static final String FORMAT_SPACE_OBRACKET = FORMAT_SPACE + "obracket";
	public static final String FORMAT_SPACE_CBRACKET = FORMAT_SPACE + "cbracket";
	public static final String FORMAT_SPACE_LBRACKET = FORMAT_SPACE + "lbracket";
	public static final String FORMAT_SPACE_RBRACKET = FORMAT_SPACE + "rbracket";

	public static final String FORMAT_WRAP_EQ = FORMAT_WRAP + "eq";
	public static final String FORMAT_WRAP_SCALAR = FORMAT_WRAP + "scalar";
	public static final String FORMAT_WRAP_COMMA = FORMAT_WRAP + "comma";
	public static final String FORMAT_WRAP_OBRACKET = FORMAT_WRAP + "obBracket";
	public static final String FORMAT_WRAP_CBRACKET = FORMAT_WRAP + "cbracket";
	public static final String FORMAT_WRAP_LBRACKET = FORMAT_WRAP + "lbracket";
	public static final String FORMAT_WRAP_RBRACKET = FORMAT_WRAP + "rbracket";

	public static final String FORMAT_LIST_COMMA = FORMAT_LIST + "comma";

}
