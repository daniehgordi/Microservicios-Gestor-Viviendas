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
	private double balance;
	private String estado;
	private Date fecha;
	
	
	public Impuesto() {
		super();
	}

	public Impuesto(String concepto, double valorImpuesto,double pago, Date fecha) {
		super();
		this.concepto = concepto;
		this.valorImpuesto = valorImpuesto;
		this.pago = pago;
		this.fecha = fecha;
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

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
	
	
	

}
