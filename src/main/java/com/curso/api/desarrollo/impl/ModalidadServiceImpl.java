package com.curso.api.desarrollo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.api.desarrollo.models.Modalidad;
import com.curso.api.desarrollo.repository.ModalidadRepository;
import com.curso.api.desarrollo.service.ModalidadService;

@Service
public class ModalidadServiceImpl implements ModalidadService {
	
	@Autowired
	private ModalidadRepository repository;

	@Override
	public List<Modalidad> mostrarModalidades() {
	
		return repository.findAll();
	}

	@Override
	public Modalidad insertarModalidad(Modalidad m) {
		
		return repository.save(m);
	}

	@Override
	public Modalidad mostrarModalidad(int id) {
		return repository.findById(id);
	}

	@Override
	public Modalidad actualizarModalidad(Modalidad m) {
		return repository.save(m);
	}

	

}
