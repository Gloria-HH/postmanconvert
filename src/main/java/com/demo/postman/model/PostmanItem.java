package com.demo.postman.model;

import java.util.List;


public class PostmanItem {

	private String name;
	private PostmanProtocolProfileBehavior protocolProfileBehavior;
	private PostmanRequest request;
	private List<PostmanResponse> response;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public PostmanProtocolProfileBehavior getProtocolProfileBehavior() {
		return protocolProfileBehavior;
	}
	public void setProtocolProfileBehavior(
			PostmanProtocolProfileBehavior protocolProfileBehavior) {
		this.protocolProfileBehavior = protocolProfileBehavior;
	}
	public PostmanRequest getRequest() {
		return request;
	}
	public void setRequest(PostmanRequest request) {
		this.request = request;
	}
	public List<PostmanResponse> getResponse() {
		return response;
	}
	public void setResponse(List<PostmanResponse> response) {
		this.response = response;
	}
	@Override
	public String toString() {
		return "PostmanItem [name=" + name + ", protocolProfileBehavior="
				+ protocolProfileBehavior + ", request=" + request
				+ ", response=" + response + "]";
	}

	

}
