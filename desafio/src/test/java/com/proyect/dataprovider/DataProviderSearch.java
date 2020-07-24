package com.proyect.dataprovider;

import java.io.FileNotFoundException;

import org.testng.annotations.DataProvider;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

public class DataProviderSearch {
	
	@DataProvider (name ="SearchData")
	  public Object[][] passData() throws JsonIOException, JsonSyntaxException, FileNotFoundException{
		  
		  String Path = "C:\\Users\\oswal\\eclipse-workspace\\desafio\\src\\test\\java\\com\\proyect\\dataprovider\\SearchData.json";
		
		  return JsonReader.getdata(Path, "Search Data", 1, 17);
		  
	  }

}
