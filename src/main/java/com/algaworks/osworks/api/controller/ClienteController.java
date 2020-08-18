package com.algaworks.osworks.api.controller;

import java.util.List;
import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.osworks.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> Listar() {
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Jose");
		cliente1.setTelefone("5673357");
		cliente1.setEmail("teste@teste.com");
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Diego");
		cliente2.setTelefone("3939399");
		cliente2.setEmail("teste2@teste.com");
		return Arrays.asList(cliente1,cliente2);
	}

}
