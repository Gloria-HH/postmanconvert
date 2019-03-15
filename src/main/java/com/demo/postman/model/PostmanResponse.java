package com.demo.postman.model;

import java.util.List;

public class PostmanResponse {
	private String name;
	private PostmanRequest originalRequest;
	private String status;
	private Integer code;
	private List<PostmanHeader> header;
	private String body;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PostmanRequest getOriginalRequest() {
		return originalRequest;
	}

	public void setOriginalRequest(PostmanRequest originalRequest) {
		this.originalRequest = originalRequest;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public List<PostmanHeader> getHeader() {
		return header;
	}

	public void setHeader(List<PostmanHeader> header) {
		this.header = header;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "PostmanResponse [name=" + name + ", originalRequest="
				+ originalRequest + ", status=" + status + ", code=" + code
				+ ", header=" + header + ", body=" + body + "]";
	}
	
	

}
