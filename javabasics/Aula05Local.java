package br.com.liandro.javabasics;

public class Aula05Local {

	public static void main(String[] args) {
		
		Aula04 rick = new Aula04();
		rick.fabricarcarro();
		rick.fabricarcarro();
		rick.fabricarcarro();
		rick.fabricarcarro();
		System.out.println("O funcion�rio Rick fabricou um total de " + rick.carro + " carros.");
		
		Aula04 morty = new Aula04();
		morty.fabricarcarro();
		morty.fabricarcarro();
		System.out.println("O funcion�rio Rick fabricou um total de " + morty.carro + " carros.");
		
		System.out.println("O total de carros fabricados pelos funcion�rio Rick e Morty � de " + Aula04.totalDeCarros + " carros.");
	}
}
