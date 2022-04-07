package com.curso.api.desarrollo.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cursos")
public class Curso{
	
@Id
@Column
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;

@Column
private String nombre;

@Column
private int costo;

@Column
private String descripcion;

@Column
private String dirigido_a;

@ManyToOne()
@JoinColumn(name="modalidad_id")
private Modalidad modalidad;

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

public int getCosto() {
	return costo;
}

public void setCosto(int costo) {
	this.costo = costo;
}

public String getDescripcion() {
	return descripcion;
}

public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}

public String getDirigido_a() {
	return dirigido_a;
}

public void setDirigido_a(String dirigido_a) {
	this.dirigido_a = dirigido_a;
}

public Modalidad getModalidad() {
	return modalidad;
}

public void setModalidad(Modalidad modalidad) {
	this.modalidad = modalidad;
}


}
