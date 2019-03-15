package com.demo.build.data;

import org.springframework.stereotype.Service;

import com.demo.entity.User;

@Service
public class UserBuilder {
	private User  user;

	public UserBuilder() {
		if (user == null) {
			user = new User();
		}
	}

	public User build() {
		if (user.getUsername() == null) {
			user.setUsername("test");
		}
		if (user.getVip() == null) {
			user.setVip(0);
		}
		if (user.getSex() == null) {
			user.setSex(1);
		}
		if (user.getEmail() == null) {
			user.setEmail("test@sina.com");
		}
		return user;
	}

	public UserBuilder withUserName(String userName) {
		user.setUsername(userName);
		return this;
	}

	public UserBuilder withVip(int vip) {
		user.setVip(vip);
		return this;
	}

}
