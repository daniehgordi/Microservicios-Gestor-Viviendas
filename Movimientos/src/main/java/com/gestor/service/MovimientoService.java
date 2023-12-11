package com.gestor.service;

import java.util.List;

import com.gestor.model.Movimiento;

public interface MovimientoService {
	List<Movimiento> listadoMovimientos();
	List<Movimiento> devolverLista(String tipo);
	Movimiento buscarMovimiento(int idMovimiento);
	void borrarMovimiento(int idMovimiento);
	public void crearMovimiento(Movimiento movimiento);
}
