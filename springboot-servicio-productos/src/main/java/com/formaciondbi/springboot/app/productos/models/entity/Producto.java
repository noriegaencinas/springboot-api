package com.formaciondbi.springboot.app.productos.models.entity;

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
@Table(name = "Productos") //si no especificas el name toma el nombre de la clase
public class Producto implements Serializable{
	
	
	private static final long serialVersionUID = 1159404504017828780L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private long id;
	private String nombre;
	private double precio;
	
	@Transient
	private Integer port;
	
	public Integer getPort() {
		return port;
	}
	public void setPort(Integer port) {
		this.port = port;
	}
	
	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	private Date createAt;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
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