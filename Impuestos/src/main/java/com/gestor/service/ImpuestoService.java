package com.gestor.service;

import java.util.List;

import com.gestor.model.Impuesto;

public interface ImpuestoService {
	List<Impuesto> listadoImpuestos();
	void pagoImpuesto(int idImpuesto, double cantidadPagada);
	void modificarImpuesto(int idImpuesto, Impuesto impuesto);
	Impuesto buscarImpuesto(int idImpuesto);

	
}
