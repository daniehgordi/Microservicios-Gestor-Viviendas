package com.gestor.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="impuestos")
public class Impuesto {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_impuesto")
	private int idImpuesto;
	@Column(name="concepto")
	private String concepto;
	@Column(name="valor_impuesto")
	private double valorImpuesto;
	private double pago;
	private String estado;
	private Date fecha;
	@Column(name="id_propiedad")
	private int idPropiedad;
	
	
	
	public Impuesto() {
		super();
	}

	public Impuesto(String concepto, double valorImpuesto,double pago, Date fecha, int idPropiedad) {
		super();
		this.concepto = concepto;
		this.valorImpuesto = valorImpuesto;
		this.pago = pago;
		this.fecha = fecha;
		this.idPropiedad = idPropiedad;
	}

	public int getIdImpuesto() {
		return idImpuesto;
	}

	public void setIdImpuesto(int idImpuesto) {
		this.idImpuesto = idImpuesto;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public double getValorImpuesto() {
		return valorImpuesto;
	}

	public void setValorImpuesto(double valorImpuesto) {
		this.valorImpuesto = valorImpuesto;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	

	public double getPago() {
		return pago;
	}

	public void setPago(double pago) {
		this.pago = pago;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getIdPropiedad() {
		return idPropiedad;
	}

	public void setIdPropiedad(int idPropiedad) {
		this.idPropiedad = idPropiedad;
	}
	
	
	
	
	
	

}
