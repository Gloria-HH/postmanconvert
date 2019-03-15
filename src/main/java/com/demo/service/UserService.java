package com.demo.service;

import org.springframework.stereotype.Service;

import com.demo.entity.User;

@Service
public class UserService {

	public User getById(Long id) {
		return new User(id, "user1", "user1@sina.com");
	}

	public User getByIdAndName(Long id, String username) {
		return new User(id, username,username+"@sina.com");
	}
}
