package com.demo.template.model;

import java.util.List;

public class RequestModule {
	private String clazzName;
	private List<RequestItem> items;
	
	public String getClazzName() {
		return clazzName;
	}
	public void setClazzName(String clazzName) {
		this.clazzName = clazzName;
	}
	public List<RequestItem> getItems() {
		return items;
	}
	public void setItems(List<RequestItem> items) {
		this.items = items;
	}
	
	
	
	
}
