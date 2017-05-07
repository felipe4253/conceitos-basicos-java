package com.avsystemgeo.treinamento.entidade;

public class Cachorro extends Mamifero{

	private boolean tipoLatido;
	
	public void setLateAlto() {
		this.tipoLatido = true;
	}
	
	public void setLateBaixo() {
		this.tipoLatido = false;
	}
	
	public void falar() {
		if (tipoLatido) {
			System.out.println("AU AU AU");
		} else {
			System.out.println("au au au");
		}
	}
}
