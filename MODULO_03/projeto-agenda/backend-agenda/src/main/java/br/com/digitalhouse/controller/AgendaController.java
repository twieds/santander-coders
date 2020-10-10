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

import br.com.digitalhouse.model.Agenda;
import br.com.digitalhouse.repository.AgendaRepository;

@CrossOrigin
@RestController
@RequestMapping("/agenda")
public class AgendaController {
	
	@Autowired
	private AgendaRepository repository;
	
	@GetMapping
	public List<Agenda> listar() {
		return repository.findAll();
	}
	
	@GetMapping("/{id}")
	public Agenda buscar(@PathVariable Long id) {
		return repository.findById(id).orElse(null);
	}
	
	@PostMapping
	public void salvar(@RequestBody Agenda agenda) {
		repository.save(agenda);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		repository.deleteById(id);
	}
	
	@PutMapping("/{id}")
	public void atualizar(@PathVariable Long id, @RequestBody Agenda agenda) {
		Agenda ag = repository.findById(id).get();
		ag.setNome(agenda.getNome());
		ag.setTelefone(agenda.getTelefone());
		
		repository.save(ag);
	}

}
