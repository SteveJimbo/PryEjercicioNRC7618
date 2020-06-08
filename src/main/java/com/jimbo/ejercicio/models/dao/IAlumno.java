package com.jimbo.ejercicio.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.jimbo.ejercicio.models.entities.Alumno;

public interface IAlumno extends CrudRepository<Alumno, Integer>{

}
