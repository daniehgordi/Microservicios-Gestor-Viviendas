package com.gestor.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="propiedades")
public class Propiedad {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_propiedad")
	private int idPropiedad;
	@Column(name="valor_fiscal")
	private double valorFiscal;
	@Column(name="nombre_propiedad")
	private String nombrePropiedad;
	private String direccion;
	@Column(name="id_usuario")
	private int idUsuario;
	
	public Propiedad() {
		super();
	}

	public Propiedad(int idPropiedad, double valorFiscal, String nombrePropiedad, String direccion, int idUsuario) {
		super();
		this.idPropiedad = idPropiedad;
		this.valorFiscal = valorFiscal;
		this.nombrePropiedad = nombrePropiedad;
		this.direccion = direccion;
		this.idUsuario = idUsuario;
	}

	public int getIdPropiedad() {
		return idPropiedad;
	}

	public void setIdPropiedad(int idPropiedad) {
		this.idPropiedad = idPropiedad;
	}

	public double getValorFiscal() {
		return valorFiscal;
	}

	public void setValorFiscal(double valorFiscal) {
		this.valorFiscal = valorFiscal;
	}

	public String getNombrePropiedad() {
		return nombrePropiedad;
	}

	public void setNombrePropiedad(String nombrePropiedad) {
		this.nombrePropiedad = nombrePropiedad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	

}
