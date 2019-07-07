package br.com.liandro.javabasics;

public class Aula04 {
	
	//variável global
	float carro = 0;
	
	//variável local
	static float totalDeCarros;
	
	//método fabricar carro
	void fabricarcarro () {
		carro++;
		totalDeCarros++;
	}

}
