package com.curso.api.desarrollo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping(path = "/{id}")
	public Pais mostrarPais(@PathVariable("id") int id) {
		return service.mostrarPais(id);
	}
	
	@PutMapping(path = "/{id}")
	public Pais actualizarPais(@RequestBody Pais p,@PathVariable("id") int id) {
		p.setId(id);
		return service.actualizarPais(p);
	}
	 
}
