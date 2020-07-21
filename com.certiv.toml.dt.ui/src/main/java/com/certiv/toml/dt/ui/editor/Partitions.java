package com.certiv.toml.dt.ui.editor;

import org.eclipse.jface.text.IDocument;

public class Partitions {

	public final static String PARTITIONING = "__toml_partitioning";

	public static final String COMMENT_SL = "__comment_single_line";
	public static final String COMMENT_ML = "__comment_multi_line";
	public static final String STRING = "__string";

	/** Partition type groups by similar treatment */
	public static final String[] SPECIAL_TYPES = new String[] { COMMENT_ML, COMMENT_SL, STRING };
	public static final String[] STRING_AND_COMMENT_TYPES = new String[] { COMMENT_ML, COMMENT_SL, STRING };
	public static final String[] COMMENT_TYPES = new String[] { COMMENT_ML, COMMENT_SL };
	public static final String[] STRING_TYPES = new String[] { STRING };

	private Partitions() {}

	public static String[] getContentTypes() {
		return getContentTypes(null);
	}

	public static String[] getCommentContentTypes() {
		return COMMENT_TYPES;
	}

	public static String[] getStringContentTypes() {
		return STRING_TYPES;
	}

	public static String[] getAllContentTypes() {
		return getContentTypes(IDocument.DEFAULT_CONTENT_TYPE);
	}

	public static String[] getContentTypes(String type) {
		if (type != null) {
			String[] dest = new String[SPECIAL_TYPES.length + 1];
			dest[0] = type;
			System.arraycopy(SPECIAL_TYPES, 0, dest, 1, SPECIAL_TYPES.length);
			return dest;
		}
		return SPECIAL_TYPES;
	}
}
