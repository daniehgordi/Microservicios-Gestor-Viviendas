package com.gestor.model;

import java.util.Date;

public class Gasto extends Movimiento{

	public Gasto() {
		super();
	}

	public Gasto(Date fecha, String tipo, double cantidad, String concepto, int idPropiedad) {
		super(fecha, "gasto", cantidad, concepto, idPropiedad);
	}
	
	public double gastar() {
		return -getCantidad();
	}
	
	

}
