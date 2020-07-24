package com.proyect.dataprovider;

import java.io.FileNotFoundException;

import org.testng.annotations.DataProvider;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

public class DataProviderRegister {
	
	@DataProvider (name ="RegisterData")
	  public Object[][] passData() throws JsonIOException, JsonSyntaxException, FileNotFoundException{
		  
		  String Path = "C:\\Users\\oswal\\eclipse-workspace\\desafio\\src\\test\\java\\com\\proyect\\dataprovider\\RegisterData.json";
		
		  return JsonReader.getdata(Path, "Register Data", 1, 7);
		  }

}
