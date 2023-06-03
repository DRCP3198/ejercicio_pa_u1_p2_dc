package com.example.demo.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Matricula {
	
	private LocalDate FechaMatricula;
	private BigDecimal valor;
	private Propietario propietario;
	private Vehiculo vehiculo;
	
	
	
	@Override
	public String toString() {
		return "Matricula [FechaMatricula=" + FechaMatricula + ", valor=" + valor + ", propietario=" + propietario
				+ ", vehiculo=" + vehiculo + "]";
	}
	//Set y GET
	public LocalDate getFechaMatricula() {
		return FechaMatricula;
	}
	public void setFechaMatricula(LocalDate fechaMatricula) {
		FechaMatricula = fechaMatricula;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public Propietario getPropietario() {
		return propietario;
	}
	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	
	

}
