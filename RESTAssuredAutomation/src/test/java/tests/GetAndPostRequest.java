package tests;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;
public class GetAndPostRequest {
	@Test
public void testGet()
{
		baseURI="https://reqres.in/api/";
		given().get("users?page=2").then().statusCode(200).body("data[4].first_name", equalTo("George"))
		.body("data.first_name", hasItems("George","Rachel"));
		
		}
	
	@Test
	public void testPostusingMap()
	{
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("name", "Raghav");
		map.put("job","automation");
		System.out.println(map);
		JSONObject Request=new JSONObject(map);
		System.out.println(Request.toJSONString());
		
	}
	
	@Test
	public void testPostUsingJson()
	{
		JSONObject Request=new JSONObject();
		Request.put("name", "Purna");
		Request.put("job","QA");
		//System.out.println(Request);
		
		baseURI="https://reqres.in/api/";
		given().body(Request.toJSONString()).when().post("/users").then().statusCode(201).log().all();
		
	}
	
}

