package com.curso.api.desarrollo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.api.desarrollo.models.Pais;
import com.curso.api.desarrollo.service.PaisService;

@CrossOrigin(origins="http://localhost:4200",maxAge=3600)
@RestController
@RequestMapping({"/paises"})
public class PaisController {
  
	@Autowired
	PaisService service;
	
	@GetMapping
	public List<Pais> mostrarPaises(){
		return service.mostrarPaises();
	}
	
	
	
	
}
