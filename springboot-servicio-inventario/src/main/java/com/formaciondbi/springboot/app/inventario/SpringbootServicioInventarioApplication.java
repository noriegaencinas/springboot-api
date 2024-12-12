package com.formaciondbi.springboot.app.inventario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableCircuitBreaker
@RibbonClient(name = "servicio-carros")
@EnableFeignClients
@SpringBootApplication
public class SpringbootServicioInventarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioInventarioApplication.class, args);
	}

}