package com.gestor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestor.dao.DeudaDao;
import com.gestor.model.Deuda;

@Service
public class DeudaServiceImplement implements DeudaService {
	
	@Autowired
	DeudaDao dao;

	@Override
	public void pagoDeuda(int idDeuda, double cantidadPagada) {
		Deuda deuda = buscarDeuda(idDeuda);
		double pagosTotales = deuda.getCantidadPagada()+cantidadPagada;
		boolean valoracion = comprobacionRequisitos(deuda.getValorDeuda(), pagosTotales);
			if(valoracion == true && deuda.getValorDeuda() == pagosTotales) {
				double balance = deuda.getValorDeuda() - pagosTotales;
				deuda.setBalance(balance);
				deuda.setCantidadPagada(pagosTotales);
				deuda.setEstado("PAGADO");
			}else if(valoracion == true && deuda.getValorDeuda() > pagosTotales) {
				double balance = deuda.getValorDeuda() - pagosTotales;
				deuda.setBalance(balance);
				deuda.setCantidadPagada(pagosTotales);
				deuda.setEstado("IMPAGADO");
			}
			dao.save(deuda);
	}
	

	private boolean comprobacionRequisitos(double valorDeuda, double cantidadPagada) {
	    try {
	        if (cantidadPagada < 0) {
	            throw new IllegalArgumentException("Inserte una cantidad positiva.");
	        }
	        if(valorDeuda < cantidadPagada) {
	        	throw new IllegalArgumentException("El pago no puede ser mayor que la cantidad a pagar.");
	        }
	        return true;
	    } catch (IllegalArgumentException e) {
	        System.out.println("Advertencia: " + e.getMessage());
	    } finally {
	        System.out.println("Perfecto");
	    }
		return false;
	}

	@Override
	public void modificarDeuda(int idDeuda, Deuda deuda) {
		Deuda deuda1 = buscarDeuda(idDeuda);
		deuda1.setConcepto(deuda.getConcepto());
		deuda1.setValorDeuda(deuda.getValorDeuda());
		deuda1.setFecha(deuda.getFecha());
		dao.save(deuda1);	
	}
	
	@Override
	public Deuda buscarDeuda(int idDeuda) {
		return dao.findById(idDeuda).orElse(null);
		
	}


	@Override
	public List<Deuda> listadoDeudas() {
		return dao.findAll();
	}
	
    

}
