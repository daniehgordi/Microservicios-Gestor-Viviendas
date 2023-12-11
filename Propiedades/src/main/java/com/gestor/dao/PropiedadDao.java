package com.gestor.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestor.model.Propiedad;

public interface PropiedadDao extends JpaRepository<Propiedad, Integer> {

	List<Propiedad> findByIdUsuario(int idUsuario);

}
