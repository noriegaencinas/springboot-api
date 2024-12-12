package com.formaciondbi.springboot.app.carros.models.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Transient;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "Inventario") //si no especificas el name toma el nombre de la clase
public class Inventario implements Serializable{
	
	
	private static final long serialVersionUID = 1159404504017828780L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private Carro carro_id;
	private int cantidad;
	
	@Transient
	private Integer port;
	
	public Integer getPort() {
		return port;
	}
	public void setPort(Integer port) {
		this.port = port;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Carro getCarro_id() {
		return carro_id;
	}
	public void setCarro_id(Carro carro_id) {
		this.carro_id = carro_id;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	} 

	
}