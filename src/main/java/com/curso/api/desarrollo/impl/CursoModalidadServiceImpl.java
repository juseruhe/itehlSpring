package com.curso.api.desarrollo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.curso.api.desarrollo.models.Curso;
import com.curso.api.desarrollo.models.CursoModalidad;
import com.curso.api.desarrollo.models.CursoModalidadCU;
import com.curso.api.desarrollo.repository.CursoModalidadCURepository;
import com.curso.api.desarrollo.repository.CursoModalidadRepository;
import com.curso.api.desarrollo.service.CursoModalidadService;

@Service
public class CursoModalidadServiceImpl implements CursoModalidadService {
	
	@Autowired
	private CursoModalidadRepository repository;
	
	@Autowired
	private CursoModalidadCURepository CURepository;
	

	@Override
	public List<CursoModalidad> mostrarCursosModalidades() {
		return repository.find();
	}

	@Override
	public CursoModalidadCU insertarCursoModalidad(CursoModalidadCU cm) {
	    return CURepository.save(cm);
	}

	@Override
	public CursoModalidad mostrarCursoModalidad(int id) {
		return repository.findById(id);
	}

	@Override
	public CursoModalidadCU actualizarCursoModalidad(CursoModalidadCU cm) {
       return CURepository.save(cm);
	}

	@Override
	public CursoModalidadCU eliminarCursoModalidad(int id) {
		   CursoModalidadCU cm = CURepository.findById(id);
		   if(cm != null) {
			   CURepository.delete(cm);
		   }
		   
		   return cm;
	}


}
