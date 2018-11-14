package net.java.main.io;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import net.java.main.interfaces.OutputWriter;

public  class ConsoleWriter implements OutputWriter {

	@Override
	public void writeLine(String line) throws IOException {
		System.out.println(line);
		
	}

	public void writeJson(String fileName, JSONArray list) {
		
//		JsonParser parser = new JsonParser();
//	      JsonObject json = parser.parse(jsonString).getAsJsonObject();
//
//	      Gson gson = new GsonBuilder().setPrettyPrinting().create();
//	      String prettyJson = gson.toJson(json);
		
		
		
		
		JSONObject obj = new JSONObject();
//      JSONArray list = new JSONArray();
//      list.add(result);
//      
      obj.put("results", list);

      try (FileWriter file = new FileWriter(fileName)) {
    	  String result = toPrettyFormat(obj.toJSONString());
    	  
    	  file.write(result);
//          file.write(obj.toJSONString());
          file.flush();
      } catch (IOException e) {
          e.printStackTrace();
      }
//      System.out.print(obj);
	}
	

	public String toPrettyFormat(String jsonString) 
	  {
	      JsonParser parser = new JsonParser();
	      JsonObject json = parser.parse(jsonString).getAsJsonObject();

	      Gson gson = new GsonBuilder().setPrettyPrinting().create();
	      String prettyJson = gson.toJson(json);

	      return prettyJson;
	  }
}
