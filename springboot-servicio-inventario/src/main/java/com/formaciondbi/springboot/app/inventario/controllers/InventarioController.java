package com.formaciondbi.springboot.app.inventario.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.formaciondbi.springboot.app.inventario.models.Inventario;
import com.formaciondbi.springboot.app.inventario.models.Carro;
import com.formaciondbi.springboot.app.inventario.models.service.InventarioService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class InventarioController {

	@Autowired
	@Qualifier("serviceRestTemplate")
	private InventarioService inventarioService;
	
	@GetMapping("/listar")
	public List<Inventario> listar() {
		return inventarioService.findAll();
	}
	
	@GetMapping("/ver/{id}")
	public Inventario detalle(@PathVariable Long id) {
		return inventarioService.findById(id);
	}
}
