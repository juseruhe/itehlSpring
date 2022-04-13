package com.curso.api.desarrollo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.api.desarrollo.models.Descuento;
import com.curso.api.desarrollo.repository.DescuentoRepository;
import com.curso.api.desarrollo.service.DescuentoService;

@Service
public class DescuentoServiceImpl implements DescuentoService {
	
	@Autowired
	private DescuentoRepository repository;

	@Override
	public List<Descuento> mostrarDescuentos() {
	  return repository.findAll();
	}

	@Override
	public Descuento insertarDescuento(Descuento d) {
	   
		return d;
	}

  

	
	

}
