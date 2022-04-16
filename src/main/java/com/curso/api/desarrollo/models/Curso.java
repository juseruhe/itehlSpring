package com.curso.api.desarrollo.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

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

@JsonIgnore
@OneToMany(mappedBy = "curso" )
private List<CursoModalidad> cursos_modalidades;


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

public List<CursoModalidad> getCursos_modalidades() {
	return cursos_modalidades;
}

public void setCursos_modalidades(List<CursoModalidad> cursos_modalidades) {
	this.cursos_modalidades = cursos_modalidades;
}



}
