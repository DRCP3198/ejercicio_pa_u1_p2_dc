package com.example.demo.modelo;

import java.time.LocalDate;

public class Propietario {
	
	private String nombre;
	private String apellido;
	private String identificaion;
	private LocalDate fechaNacimiento;
	
	
	
	@Override
	public String toString() {
		return "Propietario [nombre=" + nombre + ", apellido=" + apellido + ", identificaion=" + identificaion
				+ ", fechaNacimiento=" + fechaNacimiento + "]";
	}
	//SET y GET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getIdentificaion() {
		return identificaion;
	}
	public void setIdentificaion(String identificaion) {
		this.identificaion = identificaion;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	

}
