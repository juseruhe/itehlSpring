package com.curso.api.desarrollo.service;

import java.util.List;

import com.curso.api.desarrollo.models.Descuento;

public interface DescuentoService {

 List<Descuento> mostrarDescuentos();
 Descuento insertarDescuento(Descuento d);
} 
