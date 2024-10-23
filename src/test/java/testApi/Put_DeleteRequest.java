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
public class Put_DeleteRequest {
  @Test
  public void PutRequest()
  {
	  //Request payload
	  POJO data=new POJO("Jay","Engg");
	  
	  
	  given()
	  .contentType("application/json")
	  .body(data)
	  
	  .when()
	  .put("https://reqres.in/api/users/2")
	  
	  .then()
	  .statusCode(200)
	  .body("name",equalTo("Jay"))
	  .log().body();
	  
	  
	  
	  
  }
  
  @Test
  public void deleteREquest()
  {
	  given()
	  
	  .when().delete("https://reqres.in/api/users/2")
	  .then()
	  .statusCode(204)
	  .log().all();
  }
}
