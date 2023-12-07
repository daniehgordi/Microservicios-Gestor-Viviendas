package com.gestor.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestor.model.Usuario;

public interface UsuarioDao extends JpaRepository<Usuario, Integer>{

}
