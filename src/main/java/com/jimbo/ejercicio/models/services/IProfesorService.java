package com.jimbo.ejercicio.models.services;

import java.util.List;

import com.jimbo.ejercicio.models.entities.Profesor;

public interface IProfesorService {
	
	public void save(Profesor p);
	public Profesor findById(Integer id);
	public void delete(Integer id);
	public List<Profesor> findAll();
}
