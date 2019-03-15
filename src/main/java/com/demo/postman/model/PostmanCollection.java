package com.demo.postman.model;

import java.util.List;


public class PostmanCollection {
	
	private PostmanInfo info;
	private List<PostmanItem> item;
	private List<PostmanVariable> variable;
	
	public PostmanInfo getInfo() {
		return info;
	}
	public void setInfo(PostmanInfo info) {
		this.info = info;
	}
	public List<PostmanItem> getItem() {
		return item;
	}
	public void setItem(List<PostmanItem> item) {
		this.item = item;
	}
	
	
	
	public List<PostmanVariable> getVariable() {
		return variable;
	}
	public void setVariable(List<PostmanVariable> variable) {
		this.variable = variable;
	}
	@Override
	public String toString() {
		return "PostmanCollection [info=" + info + ", item=" + item
				+ ", variable=" + variable + "]";
	}
	
	
	
	
	
	

}
