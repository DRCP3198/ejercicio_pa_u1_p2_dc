package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Vehiculo;

@Repository
public class VehiculoRepoImpl implements IVehiculoRepo {

	
	private List<Vehiculo> baseDatos= new ArrayList<>();
	
	
	@Override
	public void insertar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		baseDatos.add(vehiculo);
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		
		 this.eliminar(vehiculo.getPlaca());
		 this.insertar(vehiculo);
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		Vehiculo veh= null;
		for (Vehiculo vehiculo : baseDatos) {
			if(vehiculo.getPlaca().equals(placa)) {
				veh=vehiculo;
			}
		}
		
		
		return veh;
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		baseDatos.remove(this.buscar(placa));
	}

}
