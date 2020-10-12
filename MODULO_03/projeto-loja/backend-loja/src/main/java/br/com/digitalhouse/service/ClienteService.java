package br.com.digitalhouse.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.digitalhouse.model.Cliente;
import br.com.digitalhouse.model.Telefone;
import br.com.digitalhouse.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repository;

	@Transactional
	public void salvar(Cliente cliente) {
		
		cliente.getTelefone().stream().
		forEach(telefone -> telefone.setCliente(cliente));
				
		repository.save(cliente);		
	}

	@Transactional
	public void excluir(Long id) {
		repository.deleteById(id);		
	}
	
	
	public Cliente buscar(Long id) {
		return repository.findById(id).get();
	}

	public List<Cliente> listar() {
		return repository.findAll();	
	}
	
	public List<Telefone> buscarTelefones(Long id) {
		return repository.buscarTelefonesPorId(id);
	}

	public void atualizar(Long id, Cliente cliente) {
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
