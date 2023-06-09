package com.example.demo.modelo;

import java.math.BigDecimal;

public class Vehiculo {
	
	private String marca;
	private String placa;
	private String modelo;
	private String tipo;
	private BigDecimal precioMercado;
	
	
	
	
	
	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", placa=" + placa + ", modelo=" + modelo + ", tipo=" + tipo
				+ ", precioMercado=" + precioMercado + "]";
	}
	//SET y GET
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public BigDecimal getPrecioMercado() {
		return precioMercado;
	}

	public void setPrecioMercado(BigDecimal precioMercado) {
		this.precioMercado = precioMercado;
	}
	

}
