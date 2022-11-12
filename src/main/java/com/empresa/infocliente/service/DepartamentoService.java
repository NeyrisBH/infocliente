package com.empresa.infocliente.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.empresa.infocliente.model.Departamento;
@Service
public interface DepartamentoService {
	public List<Departamento> consultarDepartamentos();
	public Optional<Departamento> consultarDepartamantoPorId(Long id);
	public Departamento crearDepartamento(Departamento departamento);
	public Departamento actualizarDepartamento(Departamento departamento);
	public String eliminarDepartamentoPorId(Long id);
}
