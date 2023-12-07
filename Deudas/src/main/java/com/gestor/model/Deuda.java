package com.gestor.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="deudas")
public class Deuda {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_deuda")
	private int idDeuda;
	@Column(name="concepto")
	private String concepto;
	@Column(name="valor_deuda")
	private double valorDeuda;
	@Column(name="pago")
	private double cantidadPagada;
	private double balance;
	private String estado;
	private Date fecha;
	
	
	public Deuda() {
		super();
	}

	public Deuda(String concepto, double valorImpuesto, double cantidadPagada, Date fecha) {
		super();
		this.concepto = concepto;
		this.cantidadPagada = cantidadPagada;
		this.fecha = fecha;
	}

	public int getIdDeuda() {
		return idDeuda;
	}

	public void setIdDeuda(int idDeuda) {
		this.idDeuda = idDeuda;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public double getValorDeuda() {
		return valorDeuda;
	}

	public void setValorDeuda(double valorDeuda) {
		this.valorDeuda = valorDeuda;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	

	public double getCantidadPagada() {
		return cantidadPagada;
	}

	public void setCantidadPagada(double cantidadPagada) {
		this.cantidadPagada = cantidadPagada;
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
