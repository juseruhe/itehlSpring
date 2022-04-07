package com.curso.api.desarrollo.service;

import java.util.List;

import com.curso.api.desarrollo.models.Curso;

public interface CursoService {

	List<Curso> mostrarCursos();
	Curso insertarCurso(Curso c);
	Curso mostrarCurso(int id);
	Curso actualizarCurso(Curso c);
	Curso eliminarCurso(int id);
}
