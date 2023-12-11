package com.gestor.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestor.model.Deuda;

public interface DeudaDao extends JpaRepository<Deuda, Integer>{

	List<Deuda> findByIdPropiedad(int id);

}
