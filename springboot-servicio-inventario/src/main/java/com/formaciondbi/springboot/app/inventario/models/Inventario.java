package com.formaciondbi.springboot.app.inventario.models;

public class Inventario {

	private Carro carro;
	
	public Inventario() {
		
	}
	
	public Inventario(Carro carro) {
		this.carro = carro;
	}
	
	public Carro getCarro() {
		return carro;
	}
	
	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	
}
