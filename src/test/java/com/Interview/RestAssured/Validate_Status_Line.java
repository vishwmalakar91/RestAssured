package com.Interview.RestAssured;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Validate_Status_Line {
	@Test
	public void validate() throws Exception
	{
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification httpRequest = RestAssured.given();
		Response Res=httpRequest.get("/api/users/2");
		String status_line=Res.getStatusLine();
		System.out.println("Status Code :"+status_line);
		Assert.assertEquals(status_line, "HTTP/1.1 200 OK","Correct status code returned");
	}
	

}
