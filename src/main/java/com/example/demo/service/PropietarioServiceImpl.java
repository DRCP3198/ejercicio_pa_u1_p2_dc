package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Propietario;
import com.example.demo.repository.IPropietarioRepo;

@Service
public class PropietarioServiceImpl implements IPropietarioService{

	@Autowired 
	private IPropietarioRepo iPropietarioRepo;

	@Override
	public void agregar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.iPropietarioRepo.insertar(propietario);
	}

	@Override
	public Propietario encontrar(String id) {
		// TODO Auto-generated method stub
		return this.iPropietarioRepo.buscar(id);
	}

	@Override
	public void borrar(String id) {
		// TODO Auto-generated method stub
		this.iPropietarioRepo.eliminar(id);
	}
	

}
