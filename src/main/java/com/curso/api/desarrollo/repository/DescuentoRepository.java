package com.curso.api.desarrollo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;


import com.curso.api.desarrollo.models.Descuento;

public interface DescuentoRepository extends Repository<Descuento,Integer> {
  
	@Query(value = "Select descuentos.id as id,descuentos.nombre as nombre,curso_modalidad_id,"
			+ "cursos.nombre as curso,paises.nombre as pais,descuento,fecha_final,pais_id, "
			+ "modalidades.nombre as modalidad, cursos.descripcion as descripcion, cursos.costo as costo,"
			+ " cursos.dirigido_a as dirigido_a "
			+ "from descuentos "
			+ " inner join cursos_modalidades on cursos_modalidades.id = descuentos.curso_modalidad_id"
			+ " inner join cursos on cursos.id = cursos_modalidades.curso_id"
			+ " inner join modalidades on modalidades.id = cursos_modalidades.modalidad_id "
			+ " inner join paises on paises.id = descuentos.pais_id", nativeQuery = true )
	List<Descuento> find();
	
	Descuento findById(Descuento d);
	
}
