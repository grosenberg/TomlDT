package com.certiv.toml.dt.ui.editor.outline;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import com.certiv.toml.dt.core.model.Specialization;
import com.certiv.toml.dt.ui.TomlImageManager;
import com.certiv.toml.dt.ui.TomlUI;

import net.certiv.dsl.ui.DslImageDescriptor;
import net.certiv.dsl.ui.editor.outline.OutlineLabelProvider;

public class TomlStatementLabelProvider extends OutlineLabelProvider {

	public TomlStatementLabelProvider() {
		super(TomlUI.getDefault().getImageManager());
	}

	@Override
	public String decorateText(String text) {
		switch (getStatementType()) {
			case MODULE:
			case STATEMENT:
				return text;

			case BEG_BLOCK:
				Specialization data = (Specialization) getData();
				if (data != null) return data.toString();

			case END_BLOCK:
			default:
				break;
		}
		return text;
	}

	@Override
	public Image decorateImage(Image image) {
		TomlImageManager mgr = (TomlImageManager) imgMgr;

		ImageDescriptor desc = null;
		switch (getStatementType()) {
			case MODULE:
				desc = mgr.getDescriptor(mgr.IMG_OBJ_MODULE);
				break;
			case STATEMENT:
				desc = mgr.getDescriptor(mgr.IMG_OBJ_STATEMENT);
				break;
			case BEG_BLOCK:
				desc = mgr.getDescriptor(mgr.IMG_OBJ_BLOCK);
				break;
			default:
				desc = ImageDescriptor.getMissingImageDescriptor();
		}

		// apply overlay
		Specialization data = (Specialization) getData();
		if (data != null) {
			if (hasOverlay(data.decoration & Specialization.COMBINED)) {
				desc = createOverlayImageDescriptor(desc, mgr.getDescriptor(mgr.IMG_OVR_COMBINED),
						DslImageDescriptor.TOP_RIGHT);
			}
		}
		return mgr.get(desc);
	}
}
