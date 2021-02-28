package com.mx.entidad;

import javax.persistence.*;

@Entity
@Table(name="VIDEOJUEGOS")
public class VideoJuego {
	
	@Id
	@Column(name="ID", columnDefinition="NUMBER")
	private int id;
	
	@Column(name="NOMBRE", columnDefinition="NVARCHAR2(100)")
	private String nombre;
	
	@Column(name="GENERO", columnDefinition="NVARCHAR2(100)")
	private String genero;
	
	@Column(name="PRECIO", columnDefinition="NUMBER")
	private double precio;
	
	public VideoJuego() {
		
	}
	
public VideoJuego(int id) {
		this.id=id;
	}
	
	public VideoJuego(int id, String nombre, String genero, double precio) {
		this.id = id;
		this.nombre = nombre;
		this.genero = genero;
		this.precio = precio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "VideoJuego [id=" + id + ", nombre=" + nombre + ", genero=" + genero + ", precio=" + precio + "]\n";
	}
	
	
	
	
	
	
}
