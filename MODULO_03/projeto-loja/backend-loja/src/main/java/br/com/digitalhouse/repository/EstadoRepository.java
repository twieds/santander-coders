package br.com.digitalhouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.digitalhouse.model.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long> {
	
}

	
