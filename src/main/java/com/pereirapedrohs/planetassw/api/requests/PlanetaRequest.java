package com.pereirapedrohs.planetassw.api.requests;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;

//import org.codehaus.jettison.json.JSONObject;

//import org.codehaus.jettison.json.JSONObject;
//import org.json.JSONObject;


public class PlanetaRequest  {
	
	public int obterQtdFilmes(String nome) {
		
		try {
					
	     URL url = new URL("https://swapi.co/api/planets/?search=" + nome);
	     BufferedReader reader = null;
	     StringBuilder stringBuilder;

	     HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	     
	     connection.setRequestProperty("User-Agent", "Mozilla/5.0");
	      
	     connection.setRequestMethod("GET");
	     connection.setReadTimeout(15*1000);
	     connection.connect();

	     
	     reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
	     stringBuilder = new StringBuilder();

	     String line = null;
	     StringBuffer response = new StringBuffer();
	     while ((line = reader.readLine()) != null)
	      {
	    	 response.append(line);
	      }
	     
	     
	     System.out.println(stringBuilder.toString());	     
	     
	     //JSONObject myResponse = new JSONObject(stringBuilder.toString());
	     
	     //System.out.println("PH TESTE ==== " + myResponse.getString("films"));
	     return 2;
	     
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
			return 0;
		}
	}
		
		
}
