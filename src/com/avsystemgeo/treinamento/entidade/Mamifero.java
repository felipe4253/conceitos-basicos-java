package com.avsystemgeo.treinamento.entidade;

public class Mamifero extends Animal{

	private int velocidade;
	
	public void correr() {
		System.out.println("Estou correndo");
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
}