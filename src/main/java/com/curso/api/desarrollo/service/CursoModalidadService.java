package com.curso.api.desarrollo.service;

import java.util.List;


import com.curso.api.desarrollo.models.CursoModalidad;
import com.curso.api.desarrollo.models.CursoModalidadCU;

public interface CursoModalidadService {
	
  List<CursoModalidad> mostrarCursosModalidades();
  CursoModalidadCU insertarCursoModalidad(CursoModalidadCU cm);
  CursoModalidad mostrarCursoModalidad(int id);
  CursoModalidadCU actualizarCursoModalidad(CursoModalidadCU cm);
  CursoModalidadCU eliminarCursoModalidad(int id);
 
 
}
