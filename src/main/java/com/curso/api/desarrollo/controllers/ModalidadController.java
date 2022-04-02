package com.curso.api.desarrollo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.api.desarrollo.models.Modalidad;
import com.curso.api.desarrollo.service.ModalidadService;

@RestController
@RequestMapping({"/modalidades"})
public class ModalidadController {
	
	@Autowired
	private ModalidadService service;
	
	@GetMapping
	public List<Modalidad> mostrarModalidades(){
		return service.mostrarModalidades();
	}
	
	@PostMapping
	public Modalidad insertarModalidad(@RequestBody Modalidad m) {
		return service.insertarModalidad(m);
	}
	
	@GetMapping(path = "/{id}")
	public Modalidad mostrarModalidad(@PathVariable("id") int id) {
		return service.mostrarModalidad(id);
	}
	
	@PutMapping(path= "/{id}")
	public Modalidad actualizarModalidad(@RequestBody Modalidad m, @PathVariable("id") int id) {
		m.setId(id);
		return service.actualizarModalidad(m);
	}

}
