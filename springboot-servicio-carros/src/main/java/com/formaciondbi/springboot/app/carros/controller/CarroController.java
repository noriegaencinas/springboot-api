package com.formaciondbi.springboot.app.carros.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.formaciondbi.springboot.app.carros.models.entity.Carro;
import com.formaciondbi.springboot.app.carros.models.service.ICarroService;

@RestController
public class CarroController {

	@Autowired
	private Environment env;
	
	@Value("${server.port}")
	private Integer port;
	
	@Autowired
	private ICarroService carroService;
	
	// Metodos para el microservicio de carros
	@GetMapping("/carros/listar")
	public List<Carro> listarCarros() {
		return carroService.findAllCarros().stream().map(carro -> {
			//producto.setPort(Integer.parseInt(env.getProperty("local.server.port")));
			carro.setPort(port);
			return carro;
		}).collect(Collectors.toList());
	}
	
	@GetMapping("/carros/ver/{id}")
	public Carro detalleCarros(@PathVariable Long id) {
		Carro carro = carroService.findCarroById(id);
		//producto.setPort(Integer.parseInt(env.getProperty("local.server.port")));
		carro.setPort(port);
		return carro;
	}
	 
}
