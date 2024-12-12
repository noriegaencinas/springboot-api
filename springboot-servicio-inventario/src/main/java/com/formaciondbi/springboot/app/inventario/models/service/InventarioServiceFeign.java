package com.formaciondbi.springboot.app.inventario.models.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.formaciondbi.springboot.app.inventario.clientes.CarroClienteRest;
import com.formaciondbi.springboot.app.inventario.models.Inventario;

@Service("serviceFeign")
@Primary
public class InventarioServiceFeign implements InventarioService {

	@Autowired
	private CarroClienteRest clienteFeign;
	
	@Override
	public List<Inventario> findAll() {
		// TODO Auto-generated method stub
		return clienteFeign.listar().stream().map(p -> new Inventario(p)).collect(Collectors.toList());
	}
	
	@Override
	public Inventario findById(Long id) {
		// TODO Auto-generated method stub
		return new Inventario(clienteFeign.detalle(id));
	}

}
