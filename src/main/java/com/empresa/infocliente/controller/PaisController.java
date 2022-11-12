package com.empresa.infocliente.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.empresa.infocliente.service.PaisService;

public class PaisController {
	@Autowired
	private PaisService servicio;
	
	@GetMapping
	public ResponseEntity<?> consultarTodos(){
		return ResponseEntity.status(HttpStatus.OK).body(servicio.consultarPaises());
	}
}
