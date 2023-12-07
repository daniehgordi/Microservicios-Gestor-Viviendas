package com.gestor.model;

public class Propiedad {
	private int idPropiedad;
	private double valorFiscal;
	private String nombrePropiedad;
	private String direccion;
	private int idMovimiento;
	private int idDeuda;
	private int idImpuesto;
	private int idUsuario;
	
	public Propiedad() {
		super();
	}

	public Propiedad(double valorFiscal, String nombrePropiedad, String direccion, int idMovimiento,
			int idDeuda, int idImpuesto, int idUsuario) {
		super();
		this.valorFiscal = valorFiscal;
		this.nombrePropiedad = nombrePropiedad;
		this.direccion = direccion;
		this.idMovimiento = idMovimiento;
		this.idDeuda = idDeuda;
		this.idImpuesto = idImpuesto;
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

	public int getIdMovimiento() {
		return idMovimiento;
	}

	public void setIdMovimiento(int idMovimiento) {
		this.idMovimiento = idMovimiento;
	}

	public int getIdDeuda() {
		return idDeuda;
	}

	public void setIdDeuda(int idDeuda) {
		this.idDeuda = idDeuda;
	}

	public int getIdImpuesto() {
		return idImpuesto;
	}

	public void setIdImpuesto(int idImpuesto) {
		this.idImpuesto = idImpuesto;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	
	
	

}
