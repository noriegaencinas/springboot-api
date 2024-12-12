package com.formaciondbi.springboot.app.carros.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.formaciondbi.springboot.app.carros.models.entity.Inventario;

public interface InventarioDao extends CrudRepository<Inventario, Long>{

}
