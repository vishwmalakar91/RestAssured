package com.Interview.RestAssured;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Validate_Response {
	@Test
	public void validate()
	{
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification httpRequest = RestAssured.given();
		Response Res=httpRequest.get("/api/users?page=2");
		ResponseBody<?> body = Res.getBody();
		String bodyAsString = body.asString();
		System.out.println(bodyAsString);
		Assert.assertEquals(bodyAsString.contains("first_name"),true, "Response body contains first_name");
		
		JsonPath jsonPathEvaluator = Res.jsonPath();
		System.out.println("image URLS"+jsonPathEvaluator.get("data.avatar"));
	}

	
	

}
