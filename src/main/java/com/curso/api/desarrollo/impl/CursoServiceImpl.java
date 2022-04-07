package com.curso.api.desarrollo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.api.desarrollo.models.Curso;
import com.curso.api.desarrollo.repository.CursoRepository;
import com.curso.api.desarrollo.service.CursoService;

@Service
public class CursoServiceImpl implements CursoService {
	
	@Autowired
	private CursoRepository repository;

	@Override
	public List<Curso> mostrarCursos() {
		
		return repository.findAll();
	}

	@Override
	public Curso insertarCurso(Curso c) {
		return repository.save(c);
	}

	@Override
	public Curso mostrarCurso(int id) {
		return repository.findById(id);
	}

}
