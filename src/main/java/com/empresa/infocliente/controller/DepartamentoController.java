package com.empresa.infocliente.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.infocliente.model.Departamento;
import com.empresa.infocliente.service.DepartamentoService;


@RestController
@RequestMapping("/api/departamentos")
public class DepartamentoController {
	@Autowired
	private DepartamentoService servicio;
	
	@GetMapping
	public ResponseEntity<?> consultarTodos(){
		return ResponseEntity.status(HttpStatus.OK).body(servicio.consultarDepartamentos());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> consultarPersonaPorId(@PathVariable Long id){
		Optional<Departamento> departamento = servicio.consultarDepartamantoPorId(id);
		//if () {
			
		//} else {

		//}
		return null;
	}
}
