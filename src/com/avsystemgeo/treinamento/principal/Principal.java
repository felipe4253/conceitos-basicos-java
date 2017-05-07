package com.avsystemgeo.treinamento.principal;

import java.util.ArrayList;
import java.util.List;

import com.avsystemgeo.treinamento.entidade.BemTeVi;
import com.avsystemgeo.treinamento.entidade.Cachorro;
import com.avsystemgeo.treinamento.entidade.Papagaio;
import com.avsystemgeo.treinamento.entidade.Vaca;
import com.avsystemgeo.treinamento.interfaace.IAnimal;

public class Principal {
	public static void main (String[] args) {
		
		//Criando os animais
		Papagaio papagayo = new Papagaio();
		papagayo.setVocabulario("prrrruutaco");
		
		IAnimal cachorro = new Cachorro();
		IAnimal papagaio = papagayo;
		IAnimal bemTeVi = new BemTeVi();
		IAnimal vaca = new Vaca();
		
		//Animais adicionados a uma lista de um tipo unico
		List<IAnimal> animais = new ArrayList<IAnimal>();
		animais.add(cachorro);
		animais.add(papagaio);
		animais.add(bemTeVi);
		animais.add(vaca);
		
		for (IAnimal animal : animais) {
			animal.falar();
		}
		
		
	}

}
