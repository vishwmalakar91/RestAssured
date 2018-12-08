package com.Interview.RestAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get_Res_Header {
	@Test
	public void validate() throws Exception
	{
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification httpRequest = RestAssured.given();
		Response Res=httpRequest.get("/api/users?page=2");
		System.out.println(Res.getHeader("Server"));
		System.out.println(Res.header("Content-Type"));
	}
	

}
