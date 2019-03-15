package com.demo.template.model;

import java.util.List;

public class RequestItem {

	private String name;
	private String method;
	private String path;
	private List<RequestParam> params;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	
	
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public List<RequestParam> getParams() {
		return params;
	}
	public void setParams(List<RequestParam> params) {
		this.params = params;
	}

	
}
