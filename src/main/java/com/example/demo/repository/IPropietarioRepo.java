package com.example.demo.repository;

import com.example.demo.modelo.Propietario;

public interface IPropietarioRepo  {
	
	public void insertar(Propietario propietario);
	public Propietario buscar(String id);
	public void eliminar(String id);

}
