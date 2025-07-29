package com.viniciuscarnot.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viniciuscarnot.cursomc.domain.Categoria;
import com.viniciuscarnot.cursomc.repositories.CategoriaRepository;
import com.viniciuscarnot.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	// Autowired serve para instanciar automaticamente - através do Spring - a depêndencia(repo)
	// pelo mecanismo de injeção de dependência ou inversão de controle
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}
	
}
