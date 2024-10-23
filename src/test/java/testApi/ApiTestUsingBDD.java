package testApi;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

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
 */
public class ApiTestUsingBDD {
  @Test
  public void testSignleUser_GET()
  {
	    
	  given()
	  .when().get("https://reqres.in/api/users/2")
	  .then()
	  .statusCode(200)
	  .log().all();
	  
	  
  }
  
  @Test
  public void signleUser_GETValidation()
  {
	    
	  given()
	  .when().get("https://reqres.in/api/users/2")
	  .then().body("data.id",equalTo(2))
	  .log().body();
	  
	  
//	  int id=res.jsonPath().getInt("data.id");
//	  Assert.assertEquals(id,2);
//	  System.out.println("Id is: "+id);
	  
  }
}
