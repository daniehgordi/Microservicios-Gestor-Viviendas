package com.gestor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gestor.model.Usuario;
import com.gestor.service.UsuarioService;

@RestController
public class UsuarioController {
	@Autowired
	private UsuarioService service;
	
	//http://localhost:9090/gestor
    @GetMapping(value="/gestor", produces=MediaType.APPLICATION_JSON_VALUE)
	List<Usuario> listado(){
		return service.listadoUsuarios();
	}
    
    //http://localhost:9090/gestor/1
    @GetMapping(value="/gestor/{idUsuario}", produces=MediaType.APPLICATION_JSON_VALUE)
	public Usuario busqueda(@PathVariable("idUsuario") int idUsuario){
		return service.buscarUsuario(idUsuario);
	}
    
    //http://localhost:9090/gestor/1
    @DeleteMapping(value="/gestor/{idUsuario}", produces=MediaType.APPLICATION_JSON_VALUE)
	public void borrar(@PathVariable("idUsuario") int idUsuario){
		service.borrarUsuario(idUsuario);
	}
    
    //http://localhost:9090/gestor/1
    @PutMapping(value="/gestor/{idUsuario}", produces=MediaType.APPLICATION_JSON_VALUE)
    public void actualizar(@PathVariable("idUsuario") int idUsuario, @RequestBody Usuario usuario) {
    	service.actualizarUsuario(idUsuario, usuario);
    }
    
    //http://localhost:9090/autenticacion
    @PostMapping("/autenticacion")
    public boolean autenticacion(@RequestParam String correo, @RequestParam String contrasena) {
        return service.autenticacion(correo, contrasena);
    }
    
    
    
    

}
