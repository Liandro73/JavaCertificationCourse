package br.com.liandro.javabasics;

public class Aula04 {
	
	//vari�vel global
	float carro = 0;
	
	//vari�vel local
	static float totalDeCarros;
	
	//m�todo fabricar carro
	void fabricarcarro () {
		carro++;
		totalDeCarros++;
	}

}
