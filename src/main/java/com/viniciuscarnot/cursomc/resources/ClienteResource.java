package com.viniciuscarnot.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.viniciuscarnot.cursomc.domain.Cliente;
import com.viniciuscarnot.cursomc.services.ClienteService;


@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {
	
	@Autowired
	private ClienteService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
	// PathVariable serve para dizer q o id da URL deve ir para o id localizado no parâmetro
	// do método
		
	//? significa que o método pode ou não encontrar o objeto desejado
		
		Cliente obj = service.buscar(id);
		
		return ResponseEntity.ok().body(obj);
	}
	
}
