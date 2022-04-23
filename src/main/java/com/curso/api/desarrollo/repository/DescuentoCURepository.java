package com.curso.api.desarrollo.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.curso.api.desarrollo.models.Curso;
import com.curso.api.desarrollo.models.DescuentoCU;

public interface DescuentoCURepository extends Repository<DescuentoCU,Integer> {

  DescuentoCU save(DescuentoCU d);

}
