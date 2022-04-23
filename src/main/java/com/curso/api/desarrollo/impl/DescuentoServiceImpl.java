package com.curso.api.desarrollo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.api.desarrollo.models.Curso;
import com.curso.api.desarrollo.models.CursoModalidad;
import com.curso.api.desarrollo.models.CursoModalidadCU;
import com.curso.api.desarrollo.models.Descuento;
import com.curso.api.desarrollo.models.DescuentoCU;
import com.curso.api.desarrollo.models.Modalidad;
import com.curso.api.desarrollo.repository.CursoModalidadCURepository;
import com.curso.api.desarrollo.repository.CursoModalidadRepository;
import com.curso.api.desarrollo.repository.CursoRepository;
import com.curso.api.desarrollo.repository.DescuentoCURepository;
import com.curso.api.desarrollo.repository.DescuentoRepository;
import com.curso.api.desarrollo.repository.ModalidadRepository;
import com.curso.api.desarrollo.service.DescuentoService;

@Service
public class DescuentoServiceImpl implements DescuentoService {

	@Autowired
	private DescuentoRepository repository;

	@Autowired
	private CursoRepository cursoRepository;

	@Autowired
	private CursoModalidadCURepository cursoModalidadCURepository;

	@Autowired
	private ModalidadRepository modalidadRepository;

	@Autowired
	private DescuentoCURepository DRepository;

	@Override
	public List<Descuento> mostrarDescuentos() {
		return repository.find();
	}

	@Override
	public DescuentoCU insertarDescuento(DescuentoCU d) {

		CursoModalidadCU cm = cursoModalidadCURepository.findById(d.getCurso_modalidad_id());
		Curso c = cursoRepository.findById(cm.getCurso_id());
		Modalidad m = modalidadRepository.findById(cm.getModalidad_id());

		switch (m.getNombre()) {
		case "Privado":
			d.setDescuento(c.getCosto() - (c.getCosto() * 0.1));
			return  DRepository.save(d);
		case "On Demand":
			d.setDescuento(c.getCosto() - (c.getCosto() * 0.2));
			d = DRepository.save(d);
			return DRepository.save(d);
		case "Online":
			d.setDescuento(c.getCosto() - (c.getCosto() * 0.3));
			d = DRepository.save(d);
			 return DRepository.save(d);
		default:
			d.setDescuento(0);
			return DRepository.save(d);
		}
}

	@Override
	public DescuentoCU actualizarDescuento(DescuentoCU d) {
		CursoModalidadCU cm = cursoModalidadCURepository.findById(d.getCurso_modalidad_id());
		Curso c = cursoRepository.findById(cm.getCurso_id());
		Modalidad m = modalidadRepository.findById(cm.getModalidad_id());

		switch (m.getNombre()) {
		case "Privado":
			d.setDescuento(c.getCosto() - (c.getCosto() * 0.1));
			return  DRepository.save(d);
		case "On Demand":
			d.setDescuento(c.getCosto() - (c.getCosto() * 0.2));
			d = DRepository.save(d);
			return DRepository.save(d);
		case "Online":
			d.setDescuento(c.getCosto() - (c.getCosto() * 0.3));
			d = DRepository.save(d);
			 return DRepository.save(d);
		default:
			d.setDescuento(0);
			return DRepository.save(d);
		}
	}
	

}
