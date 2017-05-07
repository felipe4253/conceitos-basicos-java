package com.avsystemgeo.treinamento.entidade;

public class Ave extends Animal{
	
	public void falar() {
		System.out.println("Piu Piu Piu");
	}
	
	public void voar(int metros) {
		System.out.println("Voando " + metros + " metros");
	}
}
