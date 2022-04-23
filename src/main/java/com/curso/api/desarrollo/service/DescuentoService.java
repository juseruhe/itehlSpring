package com.curso.api.desarrollo.service;

import java.util.List;

import com.curso.api.desarrollo.models.Descuento;
import com.curso.api.desarrollo.models.DescuentoCU;

public interface DescuentoService {

 List<Descuento> mostrarDescuentos();
 DescuentoCU insertarDescuento(DescuentoCU d);
} 
