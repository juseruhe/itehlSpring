package com.curso.api.desarrollo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.api.desarrollo.models.Curso;
import com.curso.api.desarrollo.models.CursoModalidad;
import com.curso.api.desarrollo.repository.CursoModalidadRepository;
import com.curso.api.desarrollo.service.CursoModalidadService;

@Service
public class CursoModalidadServiceImpl implements CursoModalidadService {
	
	@Autowired
	private CursoModalidadRepository repository;

	@Override
	public List<CursoModalidad> mostrarCursosModalidades() {
		return repository.findAll();
	}

	@Override
	public CursoModalidad insertarCursoModalidad(CursoModalidad cm) {
	    return repository.save(cm);
	}

	@Override
	public CursoModalidad mostrarCursoModalidad(int id) {
		return repository.findById(id);
	}

	@Override
	public CursoModalidad actualizarCursoModalidad(CursoModalidad cm) {
       return repository.save(cm);
	}

	@Override
	public CursoModalidad eliminarCursoModalidad(int id) {
		   CursoModalidad cm = repository.findById(id);
		   if(cm != null) {
			   repository.delete(cm);
		   }
		   
		   return cm;
	}

}
