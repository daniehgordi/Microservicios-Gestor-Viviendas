package com.gestor.service;

import java.util.List;

import com.gestor.model.Usuario;

public interface UsuarioService {
	
	List<Usuario> listadoUsuarios();
	Usuario buscarUsuario(int idUsuario);
	void borrarUsuario(int idUsuario);
	void actualizarUsuario(int idUsuario, Usuario usuario);
	boolean autenticacion(String correo, String contrasena);
	
}
