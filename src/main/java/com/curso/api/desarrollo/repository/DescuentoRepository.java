package com.curso.api.desarrollo.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.curso.api.desarrollo.models.Descuento;

public interface DescuentoRepository extends Repository<Descuento,Integer> {

	  List<Descuento> findAll();
	  Descuento insertarDescuento(Descuento d);
}
