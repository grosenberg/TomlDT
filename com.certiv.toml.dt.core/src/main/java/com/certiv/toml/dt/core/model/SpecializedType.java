package com.certiv.toml.dt.core.model;

import net.certiv.dsl.core.model.builder.ISpecializedType;
import net.certiv.dsl.core.util.Strings;

public enum SpecializedType implements ISpecializedType {
	
	DocComment("Document Comment", Strings.EMPTY),
	BlockComment("Block Comment", Strings.EMPTY),
	LineComment("Line Comment", Strings.EMPTY),

	Toml("Toml", Strings.EMPTY),

	Table("Table", Strings.EMPTY),
	InlineTable("Inline Table", Strings.EMPTY),
	TableArray("Table Array", Strings.EMPTY),

	Element("Element", Strings.EMPTY),
	Array("Array", Strings.EMPTY),
	Value("Value", Strings.EMPTY),
	Scalar("Scalar", Strings.EMPTY),
	String("String", Strings.EMPTY),

	Block("Block", Strings.EMPTY),
	BlockEnd("Block End", Strings.EMPTY),

	;

	public final String name;
	public final String css;

	SpecializedType(String name, String css) {
		this.name = name;
		this.css = css;
	}

	@Override
	public String getStyle() {
		return css;
	}

	@Override
	public String toString() {
		return name;
	}
}
