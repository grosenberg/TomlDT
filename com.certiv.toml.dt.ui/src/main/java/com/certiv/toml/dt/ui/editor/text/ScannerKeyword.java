package com.certiv.toml.dt.ui.editor.text;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.WhitespaceRule;

import net.certiv.dsl.core.preferences.IPrefsManager;
import net.certiv.dsl.core.preferences.consts.Editor;
import net.certiv.dsl.ui.editor.scanners.DslRuleBasedScanner;
import net.certiv.dsl.ui.editor.semantic.StylesManager;
import net.certiv.dsl.ui.editor.text.rules.DslWordRule;

public class ScannerKeyword extends DslRuleBasedScanner {

	private static String[] tokenProperties;

	public static final String[] KEYWORDS = {};

	public ScannerKeyword(IPrefsManager store, StylesManager stylesMgr) {
		super(store, stylesMgr);
		initialize();
	}

	@Override
	protected String[] getTokenProperties() {
		if (tokenProperties == null) {
			tokenProperties = new String[] { bind(Editor.EDITOR_KEYWORDS_COLOR) };
		}
		return tokenProperties;
	}

	@Override
	protected List<IRule> createRules() {
		DslWordRule rule = new DslWordRule(new WordDetector());
		IToken token = getToken(bind(Editor.EDITOR_KEYWORDS_COLOR));
		for (String element : KEYWORDS) {
			rule.addWord(element, token);
		}

		List<IRule> rules = new ArrayList<>();
		rules.add(rule);
		rules.add(new WhitespaceRule(new WhitespaceDetector()));
		return rules;
	}
}
