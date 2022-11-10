package com.empresa.infocliente.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import com.empresa.infocliente.model.Departamento;

@Repository
public interface DepartamentoRepository extends MongoRepository<Departamento, Long> {
	@Query("{descripcion:'?0'}")
	List<Departamento> findByDescripcion(String descripcion);
}
