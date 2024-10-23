package testApi;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Serialization_Deserialization {
//  //@Test//serialization
//  public void pojoToJson() throws JsonProcessingException 
//  {
//	 // POJO p1=new POJO("Sarang","QA");
//	  
//	  ObjectMapper obj=new ObjectMapper();
//	  //String json=obj.writerWithDefaultPrettyPrinter().writeValueAsString(p1);
//	  
//	 // System.out.println(json);
//  }
  
  @Test
  public void jsonToPojo() throws JsonMappingException, JsonProcessingException
  {
	  String jsondata="{\n"
	  		+ "  \"name\" : \"Sarang\",\n"
	  		+ "  \"job\" : \"QA\"\n"
	  		+ "}";
	  
	  
	  ObjectMapper obj=new ObjectMapper();
	  POJO p1=obj.readValue(jsondata,POJO.class);
	  System.out.println(p1.getJob());
	  System.out.println(p1.getName());
	  
	  
	  
  }
}
