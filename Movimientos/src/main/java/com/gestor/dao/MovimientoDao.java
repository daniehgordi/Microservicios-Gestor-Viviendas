package com.gestor.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestor.model.Movimiento;

public interface MovimientoDao extends JpaRepository<Movimiento, Integer> {
	List<Movimiento> findAllByTipo(String tipo);
	List<Movimiento> findByTipo(String tipo);
	
}
