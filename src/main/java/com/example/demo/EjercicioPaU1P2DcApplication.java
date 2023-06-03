package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Propietario;
import com.example.demo.modelo.Vehiculo;
import com.example.demo.service.IMatriculaService;
import com.example.demo.service.IPropietarioService;
import com.example.demo.service.IVehiculoService;

@SpringBootApplication
public class EjercicioPaU1P2DcApplication implements CommandLineRunner{

	@Autowired
	private IMatriculaService iMatriculaService;
	
	@Autowired
	private IVehiculoService iVehiculoService;
	
	@Autowired
	private IPropietarioService iPropietarioService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(EjercicioPaU1P2DcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		Vehiculo veh = new Vehiculo();
		veh.setMarca("kia");
		veh.setModelo("rio ex");
		veh.setPlaca("POP553");
		veh.setPrecioMercado(new BigDecimal(3015));
		veh.setTipo("manual");
		
		this.iVehiculoService.agregar(veh);
		Vehiculo v = this.iVehiculoService.encontrar("POP553");
		System.out.println(v);
		//Actualizar dos atributos del vehiculo vehiculos
		veh.setMarca("peugeot");
		veh.setModelo("berlina");
		Vehiculo v2 = this.iVehiculoService.encontrar("POP553");
		System.out.println(v2);
		
		
		Propietario pro = new Propietario();
		pro.setNombre("Israel Coloma");
		pro.setApellido("Coloma");
		pro.setFechaNacimiento(LocalDate.of(1996, 8, 28));
		pro.setIdentificaion("1725247645");
		
		this.iPropietarioService.agregar(pro);
		Propietario p = this.iPropietarioService.encontrar("1725247645");
		System.out.println(p);
		
		this.iMatriculaService.matricularVehiculo("1725247645", "POP553");
		
		
		
	}

}
