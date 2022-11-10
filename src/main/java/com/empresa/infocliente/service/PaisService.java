package com.empresa.infocliente.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.empresa.infocliente.model.Pais;
@Service
public interface PaisService {
	public List<Pais> consultarPaises();
	public Optional<Pais> consultarPais(Long id, String descripcion);
	public Pais crearPais(Pais pais);
	public Pais actualizarPais(Pais pais);
	public String eliminarPaisPorId(Long id);
}
