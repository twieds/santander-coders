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
import br.com.digitalhouse.repository.ClienteRepository;

@CrossOrigin
@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteRepository repository;
	
	@GetMapping
	public List<Cliente> listar() {
		return repository.findAll();
	}
	
	@GetMapping("/{id}")
	public Cliente buscar(@PathVariable Long id) {
		return repository.findById(id).orElse(null);
	}
	
	@PostMapping
	public void salvar(@RequestBody Cliente cliente) {
		repository.save(cliente);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		repository.deleteById(id);
	}
	
	@PutMapping("/{id}")
	public void atualizar(@PathVariable Long id, @RequestBody Cliente cliente) {
		Cliente cli = repository.findById(id).get();
		
		cli.setNome(cliente.getNome());
		cli.setSobrenome(cliente.getSobrenome());
		cli.setTelefone(cliente.getTelefone());
		cli.setDataNascimento(cliente.getDataNascimento());
		cli.setCpf(cliente.getCpf());
		cli.setRg(cliente.getRg());
		cli.setEmail(cliente.getEmail());
		
		
		repository.save(cli);
	}

}
