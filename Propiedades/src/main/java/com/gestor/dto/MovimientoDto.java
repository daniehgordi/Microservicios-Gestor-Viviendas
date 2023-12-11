package com.gestor.dto;

import java.util.Date;


public class MovimientoDto {
	private int idMovimiento;
	private Date fecha;
	private String tipo;
	private double cantidad; 
	private String concepto;
	private int idPropiedad;
	
	public MovimientoDto() {
		super();
	}

	

	public MovimientoDto(Date date, String tipo, double cantidad, String concepto, int idPropiedad) {
		super();
		this.fecha = date;
		this.cantidad = cantidad;
		this.concepto = concepto;
		this.idPropiedad = idPropiedad;
		this.tipo = tipo;
	}



	public int getIdMovimiento() {
		return idMovimiento;
	}

	public void setIdMovimiento(int idMovimiento) {
		this.idMovimiento = idMovimiento;
	}

	public Date getDate() {
		return fecha;
	}

	public void setDate(Date date) {
		this.fecha = date;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public double getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(double Cantidad) {
		this.cantidad = Cantidad;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public int getIdPropiedad() {
		return idPropiedad;
	}

	public void setIdPropiedad(int idPropiedad) {
		this.idPropiedad = idPropiedad;
	}
	

	
	
	
	
	

}