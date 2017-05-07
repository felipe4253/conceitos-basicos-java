package com.avsystemgeo.treinamento.entidade;

import com.avsystemgeo.treinamento.interfaace.IAnimal;

/**
 * 
 * @author felipe
 *	Classe representando um animal.
 */
public class Animal implements IAnimal{
	private String nome;
	protected String classe;
	
	public void imprime() {
		this.toString();
	}
	
	public void falar() {
		System.out.println("Blah!");
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
