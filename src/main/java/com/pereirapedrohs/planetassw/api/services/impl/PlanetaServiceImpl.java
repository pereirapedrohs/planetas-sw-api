package com.pereirapedrohs.planetassw.api.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pereirapedrohs.planetassw.api.documents.Planeta;
import com.pereirapedrohs.planetassw.api.repositories.PlanetaRepository;
import com.pereirapedrohs.planetassw.api.requests.PlanetaRequest;
import com.pereirapedrohs.planetassw.api.services.PlanetaService;

@Service
public class PlanetaServiceImpl implements PlanetaService {

	@Autowired
	private PlanetaRepository planetaRepository;
	
	@Override
	public List<Planeta> listarTodos() {
		return this.planetaRepository.findAll();
	}

	@Override
	public Planeta listarPorId(String id) {
		return this.planetaRepository.findOne(id);
	}
	
	@Override
	public Planeta listarPorNome(String nome) {
		return this.planetaRepository.findByNome(nome);
	}

	@Override
	public Planeta cadastrar(Planeta planeta) {	
		
		int qtdFilmes=new PlanetaRequest().obterQtdFilmes(planeta.getNome());
		
		planeta.setQtdFilmes(qtdFilmes);
				
		return this.planetaRepository.save(planeta);
		
	}

	@Override
	public Planeta atualizar(Planeta planeta) {
		return this.planetaRepository.save(planeta);
	}

	@Override
	public void remover(String id) {
		this.planetaRepository.delete(id);

	}

}
