package com.demo.postman.model;

public class PostmanInfo {

	private String name;
	private String schema;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSchema() {
		return schema;
	}

	public void setSchema(String schema) {
		this.schema = schema;
	}

	@Override
	public String toString() {
		return "PostmanInfo [name=" + name + ", schema=" + schema + "]";
	}

	
}
