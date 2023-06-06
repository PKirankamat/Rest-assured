package tests;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;


public class PutPatchDeleteExamples {
//	@Test
//public void PutRequest()
//{
//	JSONObject request=new JSONObject();
//	request.put("name", "Purna");
//	request.put("job", "Java Developers");
//	 
//	baseURI = "https://reqres.in/api/";
//	given().body(request.toJSONString()).when().put("/users/2").then().statusCode(200).log().all();
//	
//}
	
//	@Test
//	public void PatchRequest()
//	{
//		JSONObject request=new JSONObject();
//		request.put("name", "Purna");
//		request.put("job", "Java Developers");
//		 System.out.println(request.toJSONString());
//		baseURI = "https://reqres.in";
//		given().body(request.toJSONString()).when().patch("/api/users/2").then().statusCode(200).log().all();
//		
//	}
	@Test
	public void DeleteRequest()
	{
	
		baseURI = "https://reqres.in";
		given().when().delete("/api/users/2").then().statusCode(204).log().all();
		
	}
	
	
}
