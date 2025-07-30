package com.viniciuscarnot.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viniciuscarnot.cursomc.domain.Cliente;
import com.viniciuscarnot.cursomc.repositories.ClienteRepository;
import com.viniciuscarnot.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	// Autowired serve para instanciar automaticamente - através do Spring - a depêndencia(repo)
	// pelo mecanismo de injeção de dependência ou inversão de controle
	private ClienteRepository repo;
	
	public Cliente buscar(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
	}
	
}
