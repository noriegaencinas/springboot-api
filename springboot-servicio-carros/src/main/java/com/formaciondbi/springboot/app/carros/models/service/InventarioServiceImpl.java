package com.formaciondbi.springboot.app.carros.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formaciondbi.springboot.app.carros.models.dao.InventarioDao;
import com.formaciondbi.springboot.app.carros.models.entity.Inventario;

@Service
public class InventarioServiceImpl implements IInventarioService {

	@Autowired
	private InventarioDao inventarioDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Inventario> findAllInventario() {
		// TODO Auto-generated method stub
		return (List<Inventario>) inventarioDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Inventario findInventarioById(Long id) {
		// TODO Auto-generated method stub
		return inventarioDao.findById(id).orElse(null);
	}
}