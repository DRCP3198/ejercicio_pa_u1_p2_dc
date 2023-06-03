package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Matricula;

@Repository
public class MatriculaRepoImpl implements IMatriculaRepo{

	
	private List<Matricula> matriculas= new ArrayList<>();
	
	@Override
	public void insertar(Matricula matricula) {
		// TODO Auto-generated method stub
		matriculas.add(matricula);
	}

}
