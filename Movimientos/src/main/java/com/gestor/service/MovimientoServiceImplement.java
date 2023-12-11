package com.gestor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestor.dao.MovimientoDao;
import com.gestor.model.Movimiento;

@Service
public class MovimientoServiceImplement implements MovimientoService {
	
	@Autowired
	MovimientoDao dao;

	@Override
	public List<Movimiento> listadoMovimientos() {
		return dao.findAll();
	}

	@Override
	public List<Movimiento> devolverLista(String tipo) {
		return dao.findAllByTipo(tipo);
	}

	@Override
	public void borrarMovimiento(int idMovimiento) {
		dao.deleteById(idMovimiento);
		
	}
	
	@Override
	public void crearMovimiento(Movimiento movimiento) {
		dao.save(movimiento);
		
	}

	@Override
	public Movimiento buscarMovimiento(int idMovimiento) {
		Movimiento movimiento = dao.findById(idMovimiento).orElse(null);
		return movimiento;
	}



}
