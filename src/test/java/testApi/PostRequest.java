package testApi;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

/*
 *given():Pre-requisite
 *---------------------------------
 *header,cookies,path parameter,query parameter,Request payload,authentication
 *
 *when(): send the request
 *----------------------------
 *GET(),POST(),PUT(),PATCH(),DELETE()
 * 
 * then(): validation purpose
 * -------------------------------
 * status code,body/payload,message,json validation
 * 
 * 1.Using Map 
 * 2.Using POJO-plain old java object(Encapsulation)
 * 
 */
public class PostRequest {
  @Test
  public void postUsingMap() 
  {
	  //request payload
	  Map<String,Object> data=new HashMap<String,Object>();
	  data.put("name","Priyanka");
	  data.put("job","SDET");
	  
	  given()
	  .contentType("application/json")
	  .body(data)
	  .when().post("https://reqres.in/api/users")
	  .then()
	  .statusCode(201)
	  .log().body();
	  
	  
		  
	  
  }
  
  
  @Test
  public void postRequestUsingPojo()
  {
	  
	  //request payload
	  POJO p1=new POJO("Sarang","QA");
//	  p1.setName("Sarang");
//	  p1.setJob("QA");
			  
	  Response res=given()
	  .contentType("application/json")
	  .body(p1)
	  .when().post("https://reqres.in/api/users");
	  
	  System.out.println(res.asPrettyString());
	 
	  int statuscode=res.getStatusCode();
	  Assert.assertEquals(statuscode,201);
	  System.out.println("Status code is: "+statuscode);
	  
	  int id=res.jsonPath().getInt("id");
	  System.out.println("User created with is: "+id);
	  
	  
	  
	  
	  
	  
	  
  }
}
