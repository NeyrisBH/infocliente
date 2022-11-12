package com.empresa.infocliente.service;

import java.util.List;
import java.util.Optional;

import com.empresa.infocliente.model.Departamento;
import com.empresa.infocliente.repository.DepartamentoRepository;

public class DepartamentoServiceImpl implements DepartamentoService {

	private DepartamentoRepository repositorio;
	@Override
	public List<Departamento> consultarDepartamentos() {
		return repositorio.findAll();
	}

	@Override
	public Optional<Departamento> consultarDepartamantoPorId(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Departamento crearDepartamento(Departamento departamento) {
		Optional<Departamento> consultarDepartamentoParaCrear = repositorio.findById(departamento.getId());
		if(!consultarDepartamentoParaCrear.isPresent()) {
			return repositorio.insert(departamento);
		}
		return null;
	}

	@Override
	public Departamento actualizarDepartamento(Departamento departamento) {
		
		return null;
	}

	@Override
	public String eliminarDepartamentoPorId(Long id) {
		Optional<Departamento> consultarDepartamentoParaEliminar = repositorio.findById(id);
		if (!consultarDepartamentoParaEliminar.isPresent()) {
			return "Registro no encontrado, no se puede eliminar";
		} else {
			repositorio.delete(consultarDepartamentoParaEliminar.get());
			return "Eliminado correctamente";
		}

	}

}
