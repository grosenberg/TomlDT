package com.certiv.toml.dt.ui;

import org.eclipse.jface.text.IAutoEditStrategy;

import net.certiv.dsl.core.model.IStatement;
import net.certiv.dsl.ui.DslUI;
import net.certiv.dsl.ui.templates.CompletionManager;

public class TomlCompletionManager extends CompletionManager {

	public static final String ELEMENTS = "elements";
	public static final String TABLE = "table";
	public static final String TABLE_ARRAY = "table_array";

	public TomlCompletionManager(DslUI ui, String editorId) {
		super(ui, editorId, ELEMENTS, TABLE, TABLE_ARRAY);
	}

	@Override
	public String getContentAssistScope(IStatement stmt) {
		switch (stmt.getModelType()) {
			case STATEMENT:
				switch (stmt.getRulename()) {
					case TABLE:
						return TABLE;
					case TABLE_ARRAY:
						return TABLE_ARRAY;
					default:
						return ELEMENTS;
				}

			default:
				return null;
		}
	}

	@Override
	public IAutoEditStrategy getSmartTriggerStrategy(String contentType) {
		return super.getSmartTriggerStrategy(contentType);
	}
}
