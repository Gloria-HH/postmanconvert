package com.demo.build.data;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.testng.annotations.Test;

import com.demo.entity.User;
import com.demo.service.UserService;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserBuilderTest {

	@Autowired
	private UserBuilder userBuilder;

	@Test
	public void buildCommonUser() {
		User user = userBuilder.build();//使用默认值构建user对象
		User user1=userBuilder.withUserName("Jack").build();//用户名为Jack的user对象
//		UserService.createUser(user);
	}

}
