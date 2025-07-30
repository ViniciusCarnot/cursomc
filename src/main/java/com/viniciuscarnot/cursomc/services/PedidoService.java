package com.viniciuscarnot.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viniciuscarnot.cursomc.domain.Pedido;
import com.viniciuscarnot.cursomc.repositories.PedidoRepository;
import com.viniciuscarnot.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	// Autowired serve para instanciar automaticamente - através do Spring - a depêndencia(repo)
	// pelo mecanismo de injeção de dependência ou inversão de controle
	private PedidoRepository repo;
	
	public Pedido buscar(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
	}
	
}
