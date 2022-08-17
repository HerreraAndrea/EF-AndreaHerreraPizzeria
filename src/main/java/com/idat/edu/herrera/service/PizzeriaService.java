package com.idat.edu.herrera.service;

import java.util.List;

import com.idat.edu.herrera.entity.Pizzeria;

public interface PizzeriaService {
	
	List<Pizzeria> listar();
	Pizzeria obtenerId(Integer id);
	void guardar(Pizzeria pizzeria);
	void eliminar(Integer id);
	void actualizar(Pizzeria pizzeria);
}
