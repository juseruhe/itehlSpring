package com.curso.api.desarrollo.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "descuentos")
public class DescuentoCU {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String nombre;
	
	@Column
	private int curso_modalidad_id;
	
	@Column
	private int pais_id;
	
	@Column
	private Double descuento;
	
	@Column
	private Date fecha_final;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCurso_modalidad_id() {
		return curso_modalidad_id;
	}

	public void setCurso_modalidad_id(int curso_modalidad_id) {
		this.curso_modalidad_id = curso_modalidad_id;
	}

	public int getPais_id() {
		return pais_id;
	}

	public void setPais_id(int pais_id) {
		this.pais_id = pais_id;
	}

	public Date getFecha_final() {
		return fecha_final;
	}

	public void setFecha_final(Date fecha_final) {
		this.fecha_final = fecha_final;
	}

	public Double getDescuento() {
		return descuento;
	}

	public void setDescuento(double d) {
		this.descuento = d;
	}
	

}
