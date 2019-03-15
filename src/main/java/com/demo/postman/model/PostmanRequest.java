package com.demo.postman.model;

import java.util.List;

public class PostmanRequest {
	private String method;
	private List<PostmanHeader> header;
	private PostmanBody body;
	private PostmanUrl url;

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public List<PostmanHeader> getHeader() {
		return header;
	}

	public void setHeader(List<PostmanHeader> header) {
		this.header = header;
	}

	public PostmanBody getBody() {
		return body;
	}

	public void setBody(PostmanBody body) {
		this.body = body;
	}

	public PostmanUrl getUrl() {
		return url;
	}

	public void setUrl(PostmanUrl url) {
		this.url = url;
	}

}
