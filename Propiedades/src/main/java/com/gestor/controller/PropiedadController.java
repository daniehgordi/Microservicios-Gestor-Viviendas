package com.gestor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gestor.model.Propiedad;
import com.gestor.service.PropiedadService;

@RestController
public class PropiedadController {
	
	@Autowired
	PropiedadService service;
	
	//http://localhost:8070/propiedades
	@GetMapping(value="/propiedades", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Propiedad> devuelveListado(){
		return service.listadoPropiedades();
	}
	
	//http://localhost:8070/propiedades/1
	@DeleteMapping(value="/propiedades/{idPropiedad}")
	public void borrado(@PathVariable("idPropiedad") int idPropiedad) {
		service.borrarLista(idPropiedad);
	}
	
	//http://localhost:8070/propiedades
	@PostMapping(value="/propiedades", consumes=MediaType.APPLICATION_JSON_VALUE)
	public void crear(@RequestBody Propiedad propiedad) {
		service.crearPropiedad(propiedad);
	}
	
	//http://localhost:8070/propiedades/1
	@GetMapping(value="/propiedades/{idPropiedad}", produces=MediaType.APPLICATION_JSON_VALUE)
	public Propiedad buscarPorId(@PathVariable("idPropiedad") int idPropiedad) {
		return service.buscarPropiedad(idPropiedad);
	}
	
	//http://localhost:8070/propiedades/porUsuario/1
	@GetMapping(value="/propiedades/porUsuario/{idUsuario}", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Propiedad> propiedadesPorUser(@PathVariable("idUsuario") int idUsuario) {
		return service.propiedadesUsuario(idUsuario);
	}
	
	//http://localhost:8070/propiedades/rendimiento/1
	@GetMapping(value="/propiedades/rendimiento/{idPropiedad}", produces=MediaType.APPLICATION_JSON_VALUE)
	public double devolverRendimiento(@PathVariable("idPropiedad") int idPropiedad){
		return service.rendimientoNeto(idPropiedad);
	}
	
	//http://localhost:8070/propiedades/balanceImpuestos/1
	@GetMapping(value="/propiedades/balanceImpuestos/{idPropiedad}", produces=MediaType.APPLICATION_JSON_VALUE)
	public double balanceImpuestos(@PathVariable("idPropiedad") int idPropiedad){
		return service.balanceImpuestos(idPropiedad);
	}
	
	//http://localhost:8070/propiedades/balanceDeudas/1
	@GetMapping(value="/propiedades/balanceDeudas/{idPropiedad}", produces=MediaType.APPLICATION_JSON_VALUE)
	public double balanceDeudas(@PathVariable("idPropiedad") int idPropiedad){
		return service.balanceDeudas(idPropiedad);
	}
	
	//http://localhost:8070/propiedades/balanceTotal/1
	@GetMapping(value="/propiedades/balanceTotal/{idPropiedad}", produces=MediaType.APPLICATION_JSON_VALUE)
	public double balance(@PathVariable("idPropiedad") int idPropiedad){
		return service.balance(idPropiedad);
	}
	

}
