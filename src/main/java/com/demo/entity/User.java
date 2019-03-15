package com.demo.entity;

public class User {

	private Long id;//id
	private String username;//用户名
	private String email;//邮箱
	private Integer vip;//是否是vip，0-不是，1-是
	private Integer sex;//性别，1-女，2-男

	public User() {
	};

	public User(Long id, String username) {
		this.id = id;
		this.username = username;
	}

	public User(Long id, String username, String email) {
		this.id = id;
		this.username = username;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getVip() {
		return vip;
	}

	public void setVip(Integer vip) {
		this.vip = vip;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", email=" + email
				+ ", vip=" + vip + ", sex=" + sex + "]";
	}

}
