package hellocom.api;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class API_POST {
	@Test
	void Api_Post() {
		//Step 1 Specify Endpoint /Base URL 		
		RestAssured.baseURI="https://swapi.dev/api/"; 	
		
		//Step 2 create request object for type of request 		
		RequestSpecification httprequest=RestAssured.given(); 		
		
		//Step 3 Create response object & pass payload	
		//create payload	 		
		JSONObject  RequestEntity  =  new  JSONObject();
		RequestEntity.put("name","mprpheous");
		RequestEntity.put("job","leader");

		//specify format
		httprequest.header("Content.Tyep","application/json");
		
		//values in payload covertend in JSON format
		httprequest.body(RequestEntity.toJSONString());

		//step:4 method call POST
		Response httpresponse=httprequest.request(Method.POST, "people/?search=r2");
		 String response=httpresponse.getBody().asString(); 	
		System.out.println(response); 
		
		//Validate Status code 
		int Code=httpresponse.getStatusCode(); //201	
		System.out.println(Code); 
		
		//Insert asserts 	
		Assert.assertEquals(Code, 201);
}
}
