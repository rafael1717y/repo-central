package curso_java;
//package org.veiculos;

public class Carro1 {
	/*
	 * classe - objeto 
	 * tem ações - executa ações
	 * tem atributos - tem valores
	 * abstrato - concreto
	 * 
	 * */
	int potencia;
	int velocidade;
	String nome;
	
	void acelerar() {
		velocidade += + potencia;
	}
	
	void frear() {
		velocidade = velocidade /2;
	}
	
	int getVelocidade() {
		return velocidade;
	}
	
	void imprimir() {
		System.out.println("O carro " + nome+ " está a velocidade " + getVelocidade() + " km/h");
	}
	
	
	
	
		
}
