package com.formaciondbi.springboot.app.carros.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.formaciondbi.springboot.app.carros.models.entity.Carro;

public interface CarroDao extends CrudRepository<Carro, Long>{

}
