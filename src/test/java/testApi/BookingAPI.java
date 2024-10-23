package testApi;

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
public class BookingAPI
{
	
	String token;
  @Test(priority=1)
  public void generateToken() 
  {
	  
	  Authenticate auth=new Authenticate("admin","password123");
	  Response res=given()
	  .header("Content-Type","application/json")
	  .body(auth)
	  
	  .when().post("https://restful-booker.herokuapp.com/auth");
	  
	  System.out.println(res.asPrettyString());

	   token=res.jsonPath().getString("token");
  System.out.println("Generated token is: "+token);
  
  }
  
  @Test(enabled=false)
  public void getId()
  {
	  given()
	  .when().get("https://restful-booker.herokuapp.com/booking")
	  .then().log().body();
  }
  
  @Test(enabled=false)
  public void getBookingDetails()
  {
	  given()
	  .when().get("https://restful-booker.herokuapp.com/booking/"+207)
	  .then()
	  .log().body();
	  
	   
  }
  
  @Test(priority=2,dependsOnMethods = "generateToken")
  public void partialUpdate()
  {
	  given()
	  .header("Content-Type","application/json")
	  .header("Accept","application/json")
	  .header("Cookie","token="+token)
	  .body("{\n"
	  		+ "    \"firstname\" : \"James\",\n"
	  		+ "    \"lastname\" : \"Brown\"\n"
	  		+ "}")
	  
	  .when().patch("https://restful-booker.herokuapp.com/booking/"+207)
	  .then()
	  .statusCode(200)
	  .log().body();
	  
	  
	  
	  
	  
	  
	  
  }
  
  
  
  
  
  
  
  
}
