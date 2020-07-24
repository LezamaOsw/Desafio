package com.proyect.dataprovider;

import java.io.FileNotFoundException;

import org.testng.annotations.DataProvider;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

public class DataProviderPublish {
	
	@DataProvider (name ="PublishData")
	  public Object[][] passData() throws JsonIOException, JsonSyntaxException, FileNotFoundException{
		  
		  String Path = "C:\\Users\\oswal\\eclipse-workspace\\desafio\\src\\test\\java\\com\\proyect\\dataprovider\\PublishData.json";
		
		  return JsonReader.getdata(Path, "Publication Data", 1, 12);
		  
	  }

}
