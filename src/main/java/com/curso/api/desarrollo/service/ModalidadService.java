package com.curso.api.desarrollo.service;

import java.util.List;

import com.curso.api.desarrollo.models.Modalidad;

public interface ModalidadService {

	List<Modalidad>mostrarModalidades();
	Modalidad insertarModalidad(Modalidad m);
	Modalidad mostrarModalidad(int id);
	Modalidad actualizarModalidad(Modalidad m);
	Modalidad eliminarModalidad(int id);
}
