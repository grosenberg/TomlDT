package com.certiv.toml.dt.core;

import java.util.Arrays;
import java.util.List;

import com.certiv.toml.dt.core.parser.TomlSourceParser;

import net.certiv.dsl.core.DslCore;
import net.certiv.dsl.core.lang.LanguageManager;
import net.certiv.dsl.core.model.ICodeUnit;
import net.certiv.dsl.core.parser.DslSourceParser;

public class TomlLangManager extends LanguageManager {

	// Should be unique, lower case, single word ('_' allowed);
	public static final String DSL_NAME = "toml";

	public static final List<String> EXTENSIONS = Arrays.asList("toml");

	public TomlLangManager(DslCore core) {
		super(core);
	}

	@Override
	public String getDslName() {
		return DSL_NAME;
	}

	@Override
	public DslSourceParser createSourceParser(ICodeUnit unit, String langId) {
		return new TomlSourceParser(unit.getParseRecord(langId));
	}

	@Override
	public List<String> getDslFileExtensions() {
		return EXTENSIONS;
	}
}
