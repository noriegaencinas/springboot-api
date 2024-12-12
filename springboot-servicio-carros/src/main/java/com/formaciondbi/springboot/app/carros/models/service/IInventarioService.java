package com.formaciondbi.springboot.app.carros.models.service;

import java.util.List;

import com.formaciondbi.springboot.app.carros.models.entity.Inventario;

public interface IInventarioService {

	public List<Inventario> findAllInventario();
	public Inventario findInventarioById(Long id);
}
