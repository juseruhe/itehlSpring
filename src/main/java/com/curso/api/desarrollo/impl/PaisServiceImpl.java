package com.curso.api.desarrollo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.api.desarrollo.models.Pais;
import com.curso.api.desarrollo.repository.PaisRepository;
import com.curso.api.desarrollo.service.PaisService;

@Service
public class PaisServiceImpl implements PaisService{
	
	@Autowired
	private PaisRepository repository;

	@Override
	public List<Pais> mostrarPaises() {
		
		return repository.findAll();
	}

	@Override
	public Pais insertarPais(Pais p) {
	   return repository.save(p);
	}

	@Override
	public Pais mostrarPais(int id) {
	
		return  repository.findById(id);
	}

	@Override
	public Pais actualizarPais(Pais p) {
		return repository.save(p);
	}

	

}
