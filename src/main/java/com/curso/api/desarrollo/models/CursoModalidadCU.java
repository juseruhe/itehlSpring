package com.curso.api.desarrollo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cursos_modalidades")
public class CursoModalidadCU {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column
	private int curso_id;
	
	@Column
	private int modalidad_id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCurso_id() {
		return curso_id;
	}

	public void setCurso_id(int curso_id) {
		this.curso_id = curso_id;
	}

	public int getModalidad_id() {
		return modalidad_id;
	}

	public void setModalidad_id(int modalidad_id) {
		this.modalidad_id = modalidad_id;
	}

	
	
}
