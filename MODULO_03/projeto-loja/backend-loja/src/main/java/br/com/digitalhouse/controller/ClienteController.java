package br.com.digitalhouse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.digitalhouse.model.Cliente;
import br.com.digitalhouse.model.Telefone;
import br.com.digitalhouse.service.ClienteService;

@CrossOrigin
@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteService service;
	
	@GetMapping
	public List<Cliente> listar() {
		return service.listar();
	}
	
	@GetMapping("/{id}")
	public Cliente buscar(@PathVariable Long id) {
		return service.buscar(id);
	}
	
	@GetMapping("/{id}/telefones")
	public List<Telefone> buscarTelefones(@PathVariable Long id) {
		return service.buscarTelefones(id);
	}
	
	@PostMapping
	public void salvar(@RequestBody Cliente cliente) {
		System.out.println(cliente);
		service.salvar(cliente);
	}
	
	@DeleteMapping("/{id}")
	public void excluir(@PathVariable Long id) {
		service.excluir(id);
	}
	
	@PutMapping("/{id}")
	public void atualizar(@PathVariable Long id, @RequestBody Cliente cliente) {
		service.atualizar(id, cliente);
	}

}
