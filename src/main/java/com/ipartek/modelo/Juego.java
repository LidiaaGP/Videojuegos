package com.ipartek.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "juegos")
public class Juego {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="titulo")
	private String titulo;
	
	@Column(name="precio")
	private double precio;
	
	@ManyToOne
	Estilo estilo;
	
	@ManyToOne
	Empresa empresa;

	public Juego(int id, String titulo, double precio, Estilo estilo, Empresa empresa) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.precio = precio;
		this.estilo = estilo;
		this.empresa = empresa;
	}
	
	public Juego() {
		super();
		this.id = 0;
		this.titulo = "";
		this.precio = 0.0;
		this.estilo = new Estilo();
		this.empresa = new Empresa();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Estilo getEstilo() {
		return estilo;
	}

	public void setEstilo(Estilo estilo) {
		this.estilo = estilo;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	@Override
	public String toString() {
		return "Juego [id=" + id + ", titulo=" + titulo + ", precio=" + precio + ", estilo=" + estilo + ", empresa="
				+ empresa + "]";
	}
	

}
