package com.formaciondbi.springboot.app.carros.models.service;

import java.util.List;

import com.formaciondbi.springboot.app.carros.models.entity.Carro;

public interface ICarroService {

	public List<Carro> findAllCarros();
	public Carro findCarroById(Long id);
}
