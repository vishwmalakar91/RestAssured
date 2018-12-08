package com.Interview.RestAssured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class Post_Req {
	@SuppressWarnings("unchecked")
	@Test
	public void RegistrationSuccessful()
	{ 
	 RestAssured.baseURI ="https://reqres.in/";
	 RequestSpecification request = RestAssured.given();
	 
	 JSONObject requestParams = new JSONObject();
	 requestParams.put("name", "Vishwa"); // Cast
	 requestParams.put("job", "QAE");
	 request.body(requestParams.toJSONString());
	 Response response = request.post("/api/users");
	 
	 int statusCode = response.getStatusCode();
	 System.out.println(statusCode);
	 
	 ResponseBody<?> body = response.getBody();
	 String bodyAsString = body.asString();
	 System.out.println(bodyAsString);
	 
	 Assert.assertEquals(201, statusCode);

	}

}


