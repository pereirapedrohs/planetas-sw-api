package com.pereirapedrohs.planetassw.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pereirapedrohs.planetassw.api.documents.Planeta;
import com.pereirapedrohs.planetassw.api.repositories.PlanetaRepository;
import com.pereirapedrohs.planetassw.api.requests.PlanetaRequest;

@Service
public class PlanetaService {

	@Autowired
	private PlanetaRepository planetaRepository;
	
	public List<Planeta> listarTodos() {
		List<Planeta> listaDePlanetas = this.planetaRepository.findAll();
		for (Planeta planeta : listaDePlanetas) {
			int qtdFilmes = new PlanetaRequest().obterQtdFilmes(planeta.getNome());
			planeta.setQtdFilmes(qtdFilmes);
		}
		
		return listaDePlanetas;
	}

	public Planeta listarPorId(String id) {
		Planeta planeta = this.planetaRepository.findOne(id);
		int qtdFilmes = new PlanetaRequest().obterQtdFilmes(planeta.getNome());
		planeta.setQtdFilmes(qtdFilmes);
		
		return planeta;
	}
	
	public Planeta listarPorNome(String nome) {
		Planeta planeta = this.planetaRepository.findByNome(nome);
		int qtdFilmes = new PlanetaRequest().obterQtdFilmes(nome);
		planeta.setQtdFilmes(qtdFilmes);
		
		return planeta;
	}

	public Planeta cadastrar(Planeta planeta) {	
		return this.planetaRepository.save(planeta);
	}

	public Planeta atualizar(Planeta planeta) {
		return this.planetaRepository.save(planeta);
	}

	public void remover(String id) {
		this.planetaRepository.delete(id);
	}

}