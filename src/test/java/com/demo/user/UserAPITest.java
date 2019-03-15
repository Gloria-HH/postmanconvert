package com.demo.user;

import static io.restassured.RestAssured.given;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.testng.annotations.Test;

public class UserAPITest {
	private static String url = "http://127.0.0.1:8089/";

	public void testGetUserByIdAndName(String id, String name) {
		RequestSpecification httpRequest = given();
		httpRequest.param("id", id);
		httpRequest.param("name", name);
		Response response = httpRequest.get(url + "getUserByIdAndName");
		assert (response.getStatusCode() == 200);
	}

	public void testGetUserById(String id) {
		RequestSpecification httpRequest = given();
		httpRequest.param("id", id);
		Response response = httpRequest.get(url + "getUserById");
		assert (response.getStatusCode() == 200);
	}

	@Test()
	public void testUserUserAPI() {
		testGetUserByIdAndName("1", "abc");
		testGetUserById("2");
	}

}
