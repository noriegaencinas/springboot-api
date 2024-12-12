package com.formaciondbi.springboot.app.carros.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.formaciondbi.springboot.app.carros.models.entity.Inventario;
import com.formaciondbi.springboot.app.carros.models.service.IInventarioService;

@RestController
public class InventarioController {

	@Autowired
	private Environment env;
	
	@Value("${server.port}")
	private Integer port;
	
	@Autowired
	private IInventarioService inventarioService;
	
	//Metodos para el microservicio de inventario
	@GetMapping("/inventario/listar")
	public List<Inventario> listarInventario() {
		return inventarioService.findAllInventario().stream().map(inventario -> {
			//producto.setPort(Integer.parseInt(env.getProperty("local.server.port")));
			inventario.setPort(port);
			return inventario;
		}).collect(Collectors.toList());
	}
	
	@GetMapping("/inventario/ver/{id}")
	public Inventario detalleInventario(@PathVariable Long id) {
		Inventario inventario = inventarioService.findInventarioById(id);
		//producto.setPort(Integer.parseInt(env.getProperty("local.server.port")));
		inventario.setPort(port);
		return inventario;
	}
	 
}
