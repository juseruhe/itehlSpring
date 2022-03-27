package com.curso.api.desarrollo.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.curso.api.desarrollo.models.Pais;

public interface PaisRepository extends Repository<Pais,Integer>{

	List<Pais> findAll();
//	Pais findById(int id);
Pais save(Pais p);
//	void delete(Pais p);
	
}
