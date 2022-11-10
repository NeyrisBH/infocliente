package com.empresa.infocliente.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.empresa.infocliente.model.Pais;

@Repository
public interface PaisRepository extends MongoRepository<Pais, Long>{
	@Query("{descripcion:'?0'}")
	List<Pais> findByDescripcion(String descripcion);
}
