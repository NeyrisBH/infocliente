package com.empresa.infocliente.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.infocliente.service.CiudadService;

@RestController
@RequestMapping("/api/ciudades")
public class CiudadController {
	@Autowired
	private CiudadService servicio;
	
	@GetMapping
	public ResponseEntity<?> consultarTodos(){
		return ResponseEntity.status(HttpStatus.OK).body(servicio.consultarCiudades());
	}
}
