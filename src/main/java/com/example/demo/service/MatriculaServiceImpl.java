package com.example.demo.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Matricula;
import com.example.demo.modelo.Propietario;
import com.example.demo.modelo.Vehiculo;
import com.example.demo.repository.IMatriculaRepo;
import com.example.demo.repository.IPropietarioRepo;
import com.example.demo.repository.IVehiculoRepo;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

	@Autowired
	private IMatriculaRepo iMatriculaRepo;
	@Autowired
	private IPropietarioRepo iPropietarioRepo;
	@Autowired
	private IVehiculoRepo iVehiculoRepo;
	
	@Override
	public void matricularVehiculo(String idPropietario, String placaAuto) {
		// TODO Auto-generated method stub
		Matricula matricula = new Matricula();
		matricula.setFechaMatricula(LocalDate.now());
		
		Propietario pro = this.iPropietarioRepo.buscar(idPropietario);
		matricula.setPropietario(pro);
		
		Vehiculo veh = this.iVehiculoRepo.buscar(placaAuto);
		matricula.setVehiculo(veh);
		
		BigDecimal valor =null;
		//Para el tipo de matricula
		if(veh.getTipo().equals("manual")) {
			
			valor= veh.getPrecioMercado().multiply(new BigDecimal(0.10)).setScale(2,RoundingMode.HALF_UP);
			//BigDecimal resultado= valor.setScale(2,RoundingMode.HALF_UP);
            System.out.println("Valor a pagar de vehiculo manual " +valor);
		}else {
			valor= veh.getPrecioMercado().multiply(new BigDecimal(0.15)).setScale(3,RoundingMode.HALF_UP);
			System.out.println("Valor a pagar vehiculo automatico " + valor  );
		}
		//En cualquiera de los dos tipos de vehículos, si el “Valor de matrícula” supera los $3000 
		//se debe aplicar al “Valor de matrícula” un descuento del 9%.
		if(valor.compareTo(new BigDecimal(3000))>1) {
			BigDecimal descuento= valor.multiply(new BigDecimal(0.09));
			valor = valor.subtract(descuento);
			
		}
		matricula.setValor(valor);
		this.iMatriculaRepo.insertar(matricula);
	    System.out.println("Datos de usuario y vehiculo Matriculado ");
	    System.out.println(matricula);
		
		
		
	}

}
