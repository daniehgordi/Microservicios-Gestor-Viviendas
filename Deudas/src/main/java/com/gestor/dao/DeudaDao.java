package com.gestor.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestor.model.Deuda;

public interface DeudaDao extends JpaRepository<Deuda, Integer>{

}
