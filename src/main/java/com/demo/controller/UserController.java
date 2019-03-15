package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.User;
import com.demo.service.UserService;

@RestController("user")
public class UserController {

	@Autowired
	private UserService accountService;

	@RequestMapping(value = "getUserById", produces = MediaType.APPLICATION_JSON_VALUE)
	public User getUserById(Long id) {
		return accountService.getById(id);
	}

	@RequestMapping(value = "getUserByIdAndName", produces = MediaType.APPLICATION_JSON_VALUE)
	public User getUserByIdAndName(Long id, String username) {
		return accountService.getByIdAndName(id, username);
	}

}
