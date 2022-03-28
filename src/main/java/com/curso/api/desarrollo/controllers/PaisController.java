package com.curso.api.desarrollo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.api.desarrollo.models.Pais;
import com.curso.api.desarrollo.service.PaisService;


@RestController
@RequestMapping({"/paises"})
public class PaisController {
  
	@Autowired
	PaisService service;
	
	@GetMapping
	public List<Pais> mostrarPaises(){
		return service.mostrarPaises();
	}
	
	@PostMapping
	public Pais insertarPais(@RequestBody Pais p) {
		return service.insertarPais(p);
	}
	
	
	
}
