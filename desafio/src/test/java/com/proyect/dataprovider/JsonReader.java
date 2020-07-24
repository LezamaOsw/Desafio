package com.proyect.dataprovider;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

public class JsonReader {
	
	public static Object[][] getdata(String jsonPath, String typeData, int totalDataRow, int totalColumEntry) throws JsonIOException, JsonSyntaxException, FileNotFoundException
	{
		JsonParser jsonParser = new JsonParser();
		JsonObject jsonObj = jsonParser.parse(new FileReader(jsonPath)).getAsJsonObject();
		JsonArray array = (JsonArray) jsonObj.get(typeData);
		return searchJsonElement(array, totalDataRow, totalColumEntry);
	}

	public static Object[][] searchJsonElement(JsonArray jsonArray, int totalDataRow, int totalColumEntry) {

		Object[][] matrix = new Object[totalDataRow][totalColumEntry];
		int i =0;
		int j =0;
		
		for (JsonElement jsonElement : jsonArray)
		{
			for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) 
			{
				matrix[i][j]= entry.getValue().toString().replace("\"", "");
				System.out.println(matrix[i][j]);
				j++;
			}
			i ++;
			j=0;
		}
		return matrix;
	}
}
