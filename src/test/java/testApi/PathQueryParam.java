package testApi;

import org.testng.annotations.Test;
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
public class PathQueryParam {
  @Test
  public void pathQueryTest()
  {
	  //https://reqres.in/api/users?page=2
	  
	  given()
	  .pathParam("path","users")
	  .queryParam("page",2)
	  
	  .when().get("https://reqres.in/api/{path}")
	  .then()
	  .log().body();
	  
	  
	  
	  
  }
}
