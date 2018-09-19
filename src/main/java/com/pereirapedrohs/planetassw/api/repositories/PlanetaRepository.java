package com.pereirapedrohs.planetassw.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pereirapedrohs.planetassw.api.documents.Planeta;

public interface PlanetaRepository extends MongoRepository<Planeta, String> {
	
	Planeta findByNome(String nome);
	
	

}
