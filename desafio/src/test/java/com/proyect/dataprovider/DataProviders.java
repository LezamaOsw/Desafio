package com.proyect.dataprovider;

import java.io.FileNotFoundException;

import org.testng.annotations.DataProvider;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

public class DataProviders {
	
	@DataProvider (name ="PublishData")
	  public Object[][] passData1() throws JsonIOException, JsonSyntaxException, FileNotFoundException{
		  
		  String Path = "C:\\Users\\oswal\\git\\repository\\desafio\\src\\test\\resources\\Json\\PublishData.json";
		
		  return JsonReader.getdata(Path, "Publication Data", 1, 12);
		  
	  }

	
	@DataProvider (name ="RegisterData")
	  public Object[][] passData2() throws JsonIOException, JsonSyntaxException, FileNotFoundException{
		  
		  String Path = "C:\\Users\\oswal\\git\\repository\\desafio\\src\\test\\resources\\Json\\RegisterData.json";
		
		  return JsonReader.getdata(Path, "Register Data", 1, 7);
		  }
	
	
	@DataProvider (name ="SearchData")
	  public Object[][] passData3() throws JsonIOException, JsonSyntaxException, FileNotFoundException{
		  
		  String Path = "C:\\Users\\oswal\\git\\repository\\desafio\\src\\test\\resources\\Json\\SearchData.json";
		
		  return JsonReader.getdata(Path, "Search Data", 1, 17);
		  
	  }

}
