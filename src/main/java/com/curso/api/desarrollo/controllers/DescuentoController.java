package com.curso.api.desarrollo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.api.desarrollo.models.Curso;
import com.curso.api.desarrollo.models.Descuento;
import com.curso.api.desarrollo.models.DescuentoCU;
import com.curso.api.desarrollo.models.Modalidad;
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
	
	@PostMapping
	public  DescuentoCU insertarDescuento(@RequestBody DescuentoCU d) {
		d.setDescuento(0);
		return service.insertarDescuento(d);
	}
}
