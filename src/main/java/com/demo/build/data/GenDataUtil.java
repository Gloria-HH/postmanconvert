package com.demo.build.data;

import com.demo.entity.User;


public class GenDataUtil {

	public static void main(String[] args) {
		UserBuilder userBuilder = new UserBuilder();
		User user = userBuilder.withUserName("hello@sina.com").build();
	}

}
