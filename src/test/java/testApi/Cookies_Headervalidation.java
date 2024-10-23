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
public class Cookies_Headervalidation {
  @Test
  public void testCookies()
  {
	  Response res=given()
	  .when().get("https://www.google.com");
	  //.then().log().cookies();
	  
	  
	  String actCookie=res.getCookie("AEC");
	  String exp="AVYB7crBCUYD1jCeErVaW7e9Yz49RzhiWi5bAa5sRFztTW5js";
	  
	  //cookies are always dynamic so it should not be same
	  Assert.assertFalse(actCookie.contains(exp),"Test Fail: cookies are same");
	  System.out.println("Test Pass:  As cookies are not same");
	  
	  
	 
  }
  
  @Test
  public void testHeader()
  {
	  Response res=given()
	  .when().get("https://www.google.com");
	 
	  
	  String type=res.getHeader("Content-Type");
	  Assert.assertEquals(type,"text/html; charset=ISO-8859-1");
	  System.out.println("Test pass: Headers matched!");
  }
}
