package com.formaciondbi.springboot.app.inventario.models.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.formaciondbi.springboot.app.inventario.models.Inventario;
import com.formaciondbi.springboot.app.inventario.models.Carro;

@Service("serviceRestTemplate")
public class InventarioServiceImpl implements InventarioService {

	@Autowired
	private RestTemplate clienteRest;
	
	@Override
	public List<Inventario> findAll() {
		List<Carro> carros = Arrays.asList(clienteRest.getForObject("http://servicio-carros/carros/listar", Carro[].class));
		return carros.stream().map(p -> new Inventario(p)).collect(Collectors.toList());
	}

	@Override
	public Inventario findById(Long id) {
		Map<String, String> pathVariables = new HashMap<String, String>();
		pathVariables.put("id", id.toString());
		Carro carro = clienteRest.getForObject("http://servicio-carros/carros/ver/{id}", Carro.class, pathVariables);
		return new Inventario(carro);
	}

}
