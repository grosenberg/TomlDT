package com.certiv.toml.dt.ui;

import org.osgi.framework.BundleContext;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ResourceLocator;

import com.certiv.toml.dt.core.TomlCore;
import com.certiv.toml.dt.ui.editor.TomlEditor;
import com.certiv.toml.dt.ui.editor.TomlTextTools;

import net.certiv.dsl.core.DslCore;
import net.certiv.dsl.core.log.Log;
import net.certiv.dsl.core.log.Log.LogLevel;
import net.certiv.dsl.ui.DslUI;
import net.certiv.dsl.ui.editor.text.DslTextTools;
import net.certiv.dsl.ui.templates.CompletionManager;

public class TomlUI extends DslUI {

	private static TomlUI plugin;

	private TomlImageManager imgMgr;
	private DslTextTools textTools;
	private TomlCompletionManager compMgr;

	public TomlUI() {
		super();
		Log.defLevel(LogLevel.Debug);
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
	 * Returns an image descriptor for the image file at the given plug-in relative
	 * path
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return ResourceLocator.imageDescriptorFromBundle(PLUGIN_ID, path).orElse(null);
	}

	@Override
	public TomlImageManager getImageManager() {
		if (imgMgr == null) {
			imgMgr = new TomlImageManager();
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
