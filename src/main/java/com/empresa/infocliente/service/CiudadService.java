package com.empresa.infocliente.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.empresa.infocliente.model.Ciudad;
@Service
public interface CiudadService {
	public List<Ciudad> consultarCiudades();
	public Optional<Ciudad> consultarCiudad(Long id, String descripcion);
	public List<Ciudad> consultarCiudadPorDepartamento(Long departamentoId);
	public Ciudad crearCiudad(Ciudad ciudad);
	public Ciudad actualizarCiudad(Ciudad ciudad);
	public void eliminarCiudad(Ciudad ciudad);
	public void eliminarCiudadPorId(Long id);
}
