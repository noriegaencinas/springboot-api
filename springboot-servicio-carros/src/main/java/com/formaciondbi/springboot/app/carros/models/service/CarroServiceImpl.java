package com.formaciondbi.springboot.app.carros.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formaciondbi.springboot.app.carros.models.dao.CarroDao;
import com.formaciondbi.springboot.app.carros.models.entity.Carro;

@Service
public class CarroServiceImpl implements ICarroService {

	@Autowired
	private CarroDao carroDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Carro> findAllCarros() {
		// TODO Auto-generated method stub
		return (List<Carro>) carroDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Carro findCarroById(Long id) {
		// TODO Auto-generated method stub
		return carroDao.findById(id).orElse(null);
	}
}