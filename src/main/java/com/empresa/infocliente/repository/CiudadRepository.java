package com.empresa.infocliente.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.empresa.infocliente.model.Ciudad;

@Repository
public interface CiudadRepository extends MongoRepository<Ciudad, Long>{
	@Query("{descripcion:'?0'}")
	List<Ciudad> findByDescripcion(String descripcion);
	
	@Query("{departamentoId:'?0'}")
	List<Ciudad> findByDepartamentoId(Long departamentoId);
}
