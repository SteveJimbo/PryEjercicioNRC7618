package com.jimbo.ejercicio.models.services;

import java.util.List;

import com.jimbo.ejercicio.models.entities.Semestre;

public interface ISemestreService {
	public void save(Semestre s);
	public Semestre findById(Integer id);
	public void delete(Integer id);
	public List<Semestre> findAll();
}
