package com.curso.api.desarrollo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.curso.api.desarrollo.models.CursoModalidad;
import com.curso.api.desarrollo.models.CursoModalidadCU;
import com.curso.api.desarrollo.service.CursoModalidadService;

@RestController
@RequestMapping({"/cursos_modalidades"})
public class CursoModalidadController {

	@Autowired
	private CursoModalidadService service;
	
	@GetMapping
	public List<CursoModalidad> mostrarCursosModalidades(){
		return service.mostrarCursosModalidades();
	}
	
	@PostMapping
	public CursoModalidadCU insertarCursoModalidad(@RequestBody CursoModalidadCU cm) {
		return service.insertarCursoModalidad(cm);
	}
	
	@GetMapping(path = "/{id}")
	public CursoModalidad mostrarCursoModalidad(@PathVariable("id") int id) {
		return service.mostrarCursoModalidad(id);
	}
	
	@PutMapping(path = "/{id}")
	public CursoModalidadCU actualizarCursoModalidad(@PathVariable("id") int id,@RequestBody CursoModalidadCU cm) {
		cm.setId(id);
		return service.actualizarCursoModalidad(cm);
	}
	
	@DeleteMapping(path = "/{id}")
	public CursoModalidadCU eliminarCursoModalidad(@PathVariable("id") int id) {
		return service.eliminarCursoModalidad(id);
	}
	

}
