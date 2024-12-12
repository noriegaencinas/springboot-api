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
@Table(name = "Carros") //si no especificas el name toma el nombre de la clase
public class Carro implements Serializable{
	
	
	private static final long serialVersionUID = 1159404504017828780L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private long id;
	
	private String modelo;
	private int anio; 
	private double kilometro;
	private boolean nuevo;
	@Transient
	private Integer port;
	private double precio;
	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	private Date createAt;
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public double getKilometro() {
		return kilometro;
	}
	public void setKilometro(double kilometro) {
		this.kilometro = kilometro;
	}
	public boolean isNuevo() {
		return nuevo;
	}
	public void setNuevo(boolean nuevo) {
		this.nuevo = nuevo;
	}
	
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
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	
	
	
}