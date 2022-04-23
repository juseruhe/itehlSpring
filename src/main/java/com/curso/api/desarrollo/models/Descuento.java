package com.curso.api.desarrollo.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "descuentos")
public class Descuento {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String nombre;
	
	@Column
	private int descuento;

	@Column
	private int costo;

	@Column
	private String descripcion;

	@Column
	private String dirigido_a;
	
	@Column
	private int curso_modalidad_id;
	
	@Column 
	private String curso;
	
	@Column 
	private String modalidad;
	
    @Column
   private int pais_id;
    
    @Column
    private String pais;


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


	public int getDescuento() {
		return descuento;
	}


	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}


	public int getCurso_modalidad_id() {
		return curso_modalidad_id;
	}


	public void setCurso_modalidad_id(int curso_modalidad_id) {
		this.curso_modalidad_id = curso_modalidad_id;
	}


	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}


	public String getModalidad() {
		return modalidad;
	}


	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}


	public int getPais_id() {
		return pais_id;
	}


	public void setPais_id(int pais_id) {
		this.pais_id = pais_id;
	}


	public String getPais() {
		return pais;
	}


	public void setPais(String pais) {
		this.pais = pais;
	}


	public Date getFecha_final() {
		return fecha_final;
	}


	public void setFecha_final(Date fecha_final) {
		this.fecha_final = fecha_final;
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

	
}
