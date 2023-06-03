package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Propietario;

@Repository
public class PropietarioRepoImpl implements IPropietarioRepo{

	private List<Propietario> baseDatos= new ArrayList<>();
	
	
	@Override
	public void insertar(Propietario propietario) {
		// TODO Auto-generated method stub
		baseDatos.add(propietario);
	}

	@Override
	public Propietario buscar(String id) {
		// TODO Auto-generated method stub
		Propietario pro = new Propietario();
		for (Propietario propietario : baseDatos) {
			if(propietario.getIdentificaion().equals(id)) {
				pro=propietario;
			}
		}
		
		return pro;
	}

	@Override
	public void eliminar(String id) {
		// TODO Auto-generated method stub
		baseDatos.remove(this.buscar(id));
	}

}
