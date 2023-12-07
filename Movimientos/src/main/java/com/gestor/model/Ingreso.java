package com.gestor.model;

import java.util.Date;

public class Ingreso extends Movimiento {

	

	public Ingreso() {
		super();
	}

	public Ingreso(Date fecha, String tipo, double cantidad, String concepto, int idPropiedad) {
		super(fecha, "ingreso", cantidad, concepto, idPropiedad);

	}

	public double ingresa() {
		return getCantidad();
		
	}
	
	
}
