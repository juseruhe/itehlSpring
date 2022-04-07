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

import com.curso.api.desarrollo.models.Curso;
import com.curso.api.desarrollo.service.CursoService;


@RestController
@RequestMapping({"/cursos"})
public class CursoController {

	@Autowired
	CursoService service;
	
	@GetMapping
	public List<Curso> mostrarCursos(){
		return service.mostrarCursos();
	}
	
	@PostMapping
	public Curso insertarCurso(@RequestBody Curso c) {
	
		return service.insertarCurso(c);
	}
	
	@GetMapping("/{id}")
	public Curso mostrarCurso(@PathVariable("id") int id) {
		return service.mostrarCurso(id);
	}
	
	@PutMapping("/{id}")
	public Curso actualizarCurso(@PathVariable("id") int id, @RequestBody Curso c) {
		c.setId(id);
		return service.actualizarCurso(c);
	}
	
	@DeleteMapping("/{id}")
	public Curso eliminarCurso(@PathVariable("id") int id) {
		return service.eliminarCurso(id);
	}
}
