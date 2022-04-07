package com.curso.api.desarrollo.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.curso.api.desarrollo.models.Curso;

public interface CursoRepository extends Repository<Curso,Integer> {
   List<Curso> findAll();
   Curso  save(Curso c);
   Curso  findById(int id);
	
}
