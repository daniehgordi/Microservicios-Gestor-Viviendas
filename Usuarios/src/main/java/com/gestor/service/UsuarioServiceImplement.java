package com.gestor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.gestor.dao.UsuarioDao;
import com.gestor.model.Usuario;

@RestController
public class UsuarioServiceImplement implements UsuarioService {

	@Autowired
	UsuarioDao dao;
	
	@Override
	public List<Usuario> listadoUsuarios() {
		List<Usuario> listado = dao.findAll();
		return listado;
	}

	@Override
	public Usuario buscarUsuario(int idUsuario) {
		Usuario usuario = dao.findById(idUsuario).orElse(null);
		return usuario;
	}

	@Override
	public void borrarUsuario(int idUsuario) {
		dao.deleteById(idUsuario);

	}

	@Override
	public void actualizarUsuario(int idUsuario, Usuario usuario) {
		List<Usuario> listadoUsuarios = dao.findAll();
		for(Usuario usuario1:listadoUsuarios) {
			if(usuario1.getIdUsuario() == idUsuario) {
				dao.save(usuario);
			}
		}

	}

	//EqualsIgnoreCase hace que ignore entre mayusculas y minusculas.
	@Override
	public boolean autenticacion(String correo, String contrasena) {
		List<Usuario> listadoUsuarios = dao.findAll();
		for(Usuario usuario:listadoUsuarios) {
			if(usuario.getCorreo().equalsIgnoreCase(correo) && usuario.getContrasena().equals(contrasena)) {
				return true;
			}
		}
		return false;
	}
}
