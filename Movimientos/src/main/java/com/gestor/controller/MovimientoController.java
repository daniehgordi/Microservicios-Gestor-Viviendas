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

import com.gestor.model.Movimiento;
import com.gestor.service.MovimientoService;

@RestController
public class MovimientoController {
	@Autowired
	MovimientoService service;
	
	//http://localhost:8080/movimientos
	@GetMapping(value="/movimientos", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Movimiento> listado(){
		return service.listadoMovimientos();
	}
	
	//http://localhost:8080/movimientos/{idMovimiento}
	@GetMapping(value="/movimientos/{idMovimiento}", produces=MediaType.APPLICATION_JSON_VALUE)
	public Movimiento buscarMovi(@PathVariable("idMovimiento") int idMovimiento){
		return service.buscarMovimiento(idMovimiento);
	}
	
	//http://localhost:8080/movimientos
	@PostMapping(value="/movimientos", produces=MediaType.APPLICATION_JSON_VALUE)
	public void creacionMovimiento(@RequestBody Movimiento movimiento){
		service.crearMovimiento(movimiento);
	}
	
	//http://localhost:8080/movimientos/2
	@DeleteMapping(value="/movimientos/{idMovimiento}")
	public void creacionMovimiento(@PathVariable("idMovimiento") int idMovimiento){
		service.borrarMovimiento(idMovimiento);
	}
	
	

}
