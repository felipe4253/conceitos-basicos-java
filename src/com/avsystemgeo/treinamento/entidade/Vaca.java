package com.avsystemgeo.treinamento.entidade;

public class Vaca extends Mamifero {
	private boolean permiteOrdenha;
	
	public void ordenhar() {
		if (permiteOrdenha) {
			System.out.println("Ordenhando...");
		}
	}
	
	public void falar() {
		System.out.println("Muuuuuuuuu");
	}

}
