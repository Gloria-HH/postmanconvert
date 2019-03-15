package com.demo.postman.model;

import java.util.List;

public class PostmanUrl {
	private String raw;
	private String protocol;
	private List<String> host;
	private String port;
	private List<String> path;
	private List<PostmanQuery> query;

	public String getRaw() {
		return raw;
	}

	public void setRaw(String raw) {
		this.raw = raw;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public List<String> getHost() {
		return host;
	}

	public void setHost(List<String> host) {
		this.host = host;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public List<String> getPath() {
		return path;
	}

	public void setPath(List<String> path) {
		this.path = path;
	}

	public List<PostmanQuery> getQuery() {
		return query;
	}

	public void setQuery(List<PostmanQuery> query) {
		this.query = query;
	}

}
