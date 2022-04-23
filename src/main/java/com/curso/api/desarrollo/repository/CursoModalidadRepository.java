package com.curso.api.desarrollo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import com.curso.api.desarrollo.models.CursoModalidad;
import com.curso.api.desarrollo.models.CursoModalidadCU;

public interface CursoModalidadRepository extends Repository<CursoModalidad,Integer> {

	@Query(value = "Select cursos_modalidades.id as id,curso_id,modalidad_id,cursos.nombre as curso,"
			+ "modalidades.nombre as modalidad from cursos_modalidades "
			+ "inner join cursos on cursos.id = cursos_modalidades.curso_id "
			+ "inner join modalidades on modalidades.id = cursos_modalidades.modalidad_id", nativeQuery = true )
	List<CursoModalidad> find();
	
	CursoModalidad findById(int id);
	void delete(CursoModalidad cm);

}
