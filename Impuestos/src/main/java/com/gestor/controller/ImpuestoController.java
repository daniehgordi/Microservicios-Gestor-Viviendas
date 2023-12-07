package com.gestor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gestor.model.Impuesto;
import com.gestor.service.ImpuestoService;

@RestController
public class ImpuestoController {
	
	@Autowired
	ImpuestoService service;
	
	//http://localhost:9000/impuestos
	@GetMapping(value="/impuestos", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Impuesto> listar(){
		return service.listadoImpuestos();
		
	}
	
	//http://localhost:9000/impuestos/1
	@PostMapping(value="/impuestos/{idImpuesto}", produces=MediaType.APPLICATION_JSON_VALUE)
	public void pagarImpuestos(@PathVariable("idImpuesto") int idImpuesto, @RequestParam double cantidadPagada) {
		service.pagoImpuesto(idImpuesto, cantidadPagada);
	}
	
	//http://localhost:9000/impuestos/1
	@PutMapping(value="/impuestos/{idImpuesto}", produces=MediaType.APPLICATION_JSON_VALUE)
	public void modificacionImpuesto(@PathVariable int idImpuesto, @RequestBody Impuesto impuesto) {
		service.modificarImpuesto(idImpuesto, impuesto);
	}
	
	//http://localhost:9000/impuestos/buscar/3
	@GetMapping(value="/impuestos/buscar/{idImpuesto}", produces=MediaType.APPLICATION_JSON_VALUE)
	public Impuesto buscarImpuestoPorId(@PathVariable int idImpuesto) {
		return service.buscarImpuesto(idImpuesto);
	}
	
	

}