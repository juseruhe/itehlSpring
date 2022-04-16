package com.curso.api.desarrollo.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.curso.api.desarrollo.models.CursoModalidad;

public interface CursoModalidadRepository extends Repository<CursoModalidad,Integer> {
  
	List<CursoModalidad> findAll();
	CursoModalidad save(CursoModalidad cm);
	CursoModalidad findById(int id);
	void delete(CursoModalidad cm);
}
