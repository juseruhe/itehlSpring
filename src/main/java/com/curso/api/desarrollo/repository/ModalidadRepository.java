package com.curso.api.desarrollo.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.curso.api.desarrollo.models.Modalidad;


public interface ModalidadRepository extends Repository<Modalidad,Integer> {
	List<Modalidad> findAll();
	Modalidad save(Modalidad m);
	Modalidad findById(int id);
	

}
