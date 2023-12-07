package com.gestor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestor.dao.ImpuestoDao;
import com.gestor.model.Impuesto;

@Service
public class ImpuestoServiceImplement implements ImpuestoService {
	
	@Autowired
	ImpuestoDao dao;

	@Override
	public void pagoImpuesto(int idImpuesto, double cantidadPagada) {
		Impuesto impuesto = buscarImpuesto(idImpuesto);
		double pagosTotales = impuesto.getPago()+cantidadPagada;
		boolean valoracion = comprobacionRequisitos(impuesto.getValorImpuesto(), pagosTotales);
		
			if(valoracion == true && impuesto.getValorImpuesto() == pagosTotales) {
				double balance = impuesto.getValorImpuesto() - pagosTotales;
				impuesto.setBalance(balance);
				impuesto.setPago(pagosTotales);
				impuesto.setEstado("PAGADO");
			}else if(valoracion == true && impuesto.getValorImpuesto() > pagosTotales) {
				double balance = impuesto.getValorImpuesto() - pagosTotales;
				impuesto.setBalance(balance);
				impuesto.setPago(pagosTotales);
				impuesto.setEstado("IMPAGADO");
			}
			dao.save(impuesto);
	}
	

	private boolean comprobacionRequisitos(double valorImpuesto, double pago) {
	    try {
	        if (pago < 0) {
	            throw new IllegalArgumentException("Inserte una cantidad positiva.");
	        }
	        if(valorImpuesto < pago) {
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
	public void modificarImpuesto(int idImpuesto, Impuesto impuesto) {
		Impuesto impuesto1 = buscarImpuesto(idImpuesto);
		impuesto1.setConcepto(impuesto.getConcepto());
		impuesto1.setValorImpuesto(impuesto.getValorImpuesto());
		impuesto1.setFecha(impuesto.getFecha());
		dao.save(impuesto1);	
	}
	
	@Override
	public Impuesto buscarImpuesto(int idImpuesto) {
		return dao.findById(idImpuesto).orElse(null);
		
	}


	@Override
	public List<Impuesto> listadoImpuestos() {
		return dao.findAll();
	}
	
    

}
