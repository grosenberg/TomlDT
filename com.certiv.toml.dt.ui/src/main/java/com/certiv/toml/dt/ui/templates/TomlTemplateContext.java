package com.certiv.toml.dt.ui.templates;

import org.eclipse.jface.text.IRegion;

import net.certiv.dsl.ui.editor.text.completion.CompletionContext;
import net.certiv.dsl.ui.editor.text.completion.DslTemplateContext;

public class TomlTemplateContext extends DslTemplateContext {

	protected TomlTemplateContext(TomlContextType type, CompletionContext context, IRegion region) {
		super(type, context, region);
	}
}
