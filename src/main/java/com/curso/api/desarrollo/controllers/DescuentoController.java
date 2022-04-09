package com.curso.api.desarrollo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.api.desarrollo.models.Descuento;
import com.curso.api.desarrollo.service.DescuentoService;

@RestController
@RequestMapping({"/descuentos"})
public class DescuentoController {
	
	@Autowired
	private DescuentoService service;

	@GetMapping
	public List<Descuento> mostrarDescuentos(){
		return service.mostrarDescuentos();
	}
}
