package com.pereirapedrohs.planetassw.api.requests;

import org.json.JSONArray;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;


public class PlanetaRequest {

	public int obterQtdFilmes(String nome) {
		try {
						
			HttpResponse<JsonNode> jsonResponse=Unirest.get("https://swapi.co/api/planets/")
			.queryString("format", "json")
			.queryString("search", nome)
			.asJson();

			JSONArray response = jsonResponse.getBody().getObject().getJSONArray("results").getJSONObject(0).getJSONArray("films");
			
			return response.length();

		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

}
