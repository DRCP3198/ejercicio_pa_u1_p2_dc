package com.example.demo.service;

import com.example.demo.modelo.Propietario;

public interface IPropietarioService {
	
	public void agregar(Propietario propietario);
	public Propietario encontrar(String id);
	public void borrar(String id);

}
