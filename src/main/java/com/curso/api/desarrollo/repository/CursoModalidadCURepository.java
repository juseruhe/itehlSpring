package com.curso.api.desarrollo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import com.curso.api.desarrollo.models.CursoModalidad;
import com.curso.api.desarrollo.models.CursoModalidadCU;

public interface CursoModalidadCURepository extends Repository<CursoModalidadCU,Integer> {

	CursoModalidadCU save(CursoModalidadCU cm);
	CursoModalidadCU findById(int id);
	void delete(CursoModalidadCU cm);
}
