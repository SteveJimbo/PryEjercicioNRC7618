package com.jimbo.ejercicio.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.jimbo.ejercicio.models.entities.Matricula;

public interface IMatricula extends CrudRepository<Matricula, Integer> {

}
