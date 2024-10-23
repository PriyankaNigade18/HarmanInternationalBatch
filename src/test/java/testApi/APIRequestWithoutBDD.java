package testApi;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APIRequestWithoutBDD {
  @Test
  public void testSingleUserGET()
  {
	  
	  Response res=RestAssured.get("https://reqres.in/api/users/2");
	  System.out.println("status code:"+res.getStatusCode());
	  System.out.println("Status line: "+res.getStatusLine());
	  System.out.println(res.asString());
	 System.out.println(res.asPrettyString());
	 
	 int id=res.jsonPath().getInt("data.id");
	 Assert.assertEquals(id,2);
	 System.out.println("Id matched!: "+id);
	 
	 String name=res.jsonPath().getString("data.first_name");
	 Assert.assertEquals(name,"Janet");
	 System.out.println("Name matched!: "+name);
	 
	 String url=res.jsonPath().getString("support.url");
	 Assert.assertTrue(url.contains("support"));
	 System.out.println("Valid url!");
	 
	 
	 
	 
  }
  
  @Test
  public void listOfUsers()
  {
	  
	  Response res=RestAssured.get("https://reqres.in/api/users?page=2");
	  
	  System.out.println(res.asPrettyString());
	  
	  //group of records
	  List<Integer> allId=res.jsonPath().getList("data.id");
	  
	  System.out.println(allId);
	  
	  
	  //to get all email
	  List<String> allEmail=res.jsonPath().getList("data.email");
	  System.out.println(allEmail);
	  
	  
	  
	  
	  
  }
}
