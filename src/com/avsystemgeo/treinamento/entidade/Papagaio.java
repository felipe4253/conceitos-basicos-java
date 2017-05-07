package com.avsystemgeo.treinamento.entidade;

public class Papagaio extends Ave{

	private String vocabulario;
	
	public void falar() {
		System.out.println(vocabulario);
	}

	public void setVocabulario(String vocabulario) {
		this.vocabulario = vocabulario;
	}
	
}
