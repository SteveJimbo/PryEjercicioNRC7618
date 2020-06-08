package com.jimbo.ejercicio.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.jimbo.ejercicio.models.entities.Profesor;

public interface IProfesor extends CrudRepository<Profesor, Integer>{

}
