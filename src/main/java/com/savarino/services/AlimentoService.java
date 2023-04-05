package com.savarino.services;

import java.util.List;

import com.savarino.entities.Alimento;


public interface AlimentoService {
	
	List<Alimento>getAlimenti();
	List<String>getCategorie();
	List<Alimento>getAlimentiByCategoria(String categoria);
	 
	


}
