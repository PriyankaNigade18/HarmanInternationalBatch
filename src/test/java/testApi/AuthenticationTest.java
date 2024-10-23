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
public class AuthenticationTest {
  @Test
  public void basicAuth()
  {
	  
	  given()
	  .auth().basic("postman","password")
	  
	  .when().get("https://postman-echo.com/basic-auth")
	  .then()
	  .log().body();
  }
  
  @Test
  public void BearerToken()
  {
	  
	  given()
	  .header("Authorization","Bearer 11111111")
	  
	  .when().get("https://postman-echo.com/")
	  .then().log().body();
  }
}
