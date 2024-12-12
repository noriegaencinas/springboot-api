package com.formaciondbi.springboot.app.inventario.models.service;

import java.util.List;

import com.formaciondbi.springboot.app.inventario.models.Inventario;

public interface InventarioService {
	
	public List<Inventario> findAll();
	public Inventario findById(Long id);
	
}

