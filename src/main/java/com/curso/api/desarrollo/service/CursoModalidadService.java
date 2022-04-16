package com.curso.api.desarrollo.service;

import java.util.List;

import com.curso.api.desarrollo.models.CursoModalidad;

public interface CursoModalidadService {
	
  List<CursoModalidad> mostrarCursosModalidades();
  CursoModalidad insertarCursoModalidad(CursoModalidad cm);
  CursoModalidad mostrarCursoModalidad(int id);
  CursoModalidad actualizarCursoModalidad(CursoModalidad cm);
  CursoModalidad eliminarCursoModalidad(int id);
}
