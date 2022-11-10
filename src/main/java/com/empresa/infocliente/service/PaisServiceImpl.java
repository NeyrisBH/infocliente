package com.empresa.infocliente.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.infocliente.model.Pais;
import com.empresa.infocliente.repository.PaisRepository;

@Service
public class PaisServiceImpl implements PaisService {
	@Autowired
	private PaisRepository repositorio;

	@Override
	public List<Pais> consultarPaises() {
		return repositorio.findAll();
	}

	@Override
	public Optional<Pais> consultarPais(Long id, String descripcion) {
		if (id == null && descripcion == null) {
			return Optional.empty();
		}
		if (id == null) {
			List<Pais> listaConsultar = repositorio.findByDescripcion(descripcion);
			Optional.of(listaConsultar.get(0));
		} else {
			return repositorio.findById(id);
		}
		return null;
	}

	@Override
	public Pais crearPais(Pais pais) {
		Optional<Pais> consultarParaCrear = repositorio.findById(pais.getCodigo());
		if (!consultarParaCrear.isPresent()) {
			List<Pais> paises = repositorio.findByDescripcion(pais.getDescripcion());
			if (!(paises.size() > 0)) {
				return repositorio.insert(pais);
			} else {
				return null;
			}
		} else {
			return null;
		}
	}

	@Override
	public String eliminarPaisPorId(Long id) {
		Optional<Pais> consultarParaEliminar = repositorio.findById(id);
		if (!consultarParaEliminar.isPresent()) {
			return "Registro no encontrado, no se puede eliminar";
		} else {
			repositorio.delete(consultarParaEliminar.get());
			return "Eliminado correctamente";
		}
	}

	@Override
	public Pais actualizarPais(Pais pais) {
		Optional<Pais> consultarParaActualizar = repositorio.findById(pais.getCodigo());
		if (!consultarParaActualizar.isPresent()) {
			return null;
		} else {
			return repositorio.save(pais);
		}
	}
}
