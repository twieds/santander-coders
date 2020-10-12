package br.com.digitalhouse.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.digitalhouse.model.Cliente;
import br.com.digitalhouse.model.Telefone;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	
	@Query("from Cliente where sobrenome like :sobrenome%")
	List<Cliente> findBySobrenome(String sobrenome);

	@Query("select telefone from Cliente as c where c.id = :id")
	List<Telefone> buscarTelefonesPorId(Long id);

}
