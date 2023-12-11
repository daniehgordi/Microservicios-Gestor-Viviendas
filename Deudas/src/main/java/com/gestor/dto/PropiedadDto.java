package com.gestor.dto;



public class PropiedadDto {
	private int idPropiedad;
	private double valorFiscal;
	private String nombrePropiedad;
	private String direccion;
	private int idUsuario;
	
	public PropiedadDto() {
		super();
	}

	public PropiedadDto(int idPropiedad, double valorFiscal, String nombrePropiedad, String direccion, int idUsuario) {
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