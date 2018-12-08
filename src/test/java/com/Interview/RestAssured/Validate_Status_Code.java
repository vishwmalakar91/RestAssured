package com.Interview.RestAssured;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Validate_Status_Code {
	@Test
	public void validate()
	{
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification httpRequest = RestAssured.given();
		Response Res=httpRequest.get("/api/users/2");
		int status_code=Res.getStatusCode();
		System.out.println("Status Code :"+status_code);
		Assert.assertEquals(status_code, 200,"Correct status code returned");
	}

}
