package com.demo.user;

import static io.restassured.RestAssured.given;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.testng.annotations.Test;

/**
 * 
 * @author gloria
 * @email zhihuilvy@sina.com
 */
public class QueryUserTest {

	private String url="http://127.0.0.1:8089/";

	public void testGetUserByIdAndName(String id,String username) {
		RequestSpecification httpRequest = given();
		httpRequest.param("id", id);
		httpRequest.param("username", username);
		Response response = httpRequest.get(url+"getUserByIdAndName");
		assert (response.getStatusCode() == 200);
	}
	

	public void testGetUserById(String id) {
		RequestSpecification httpRequest = given();
		httpRequest.param("id", id);
		Response response = httpRequest.get(url+"getUserById");
		assert (response.getStatusCode() == 200);
	}
	
	
	@Test()
	public void testQueryUser(){
		testGetUserByIdAndName("1","ab");
		testGetUserById("1");
				
	}

}
