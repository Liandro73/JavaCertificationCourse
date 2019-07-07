package br.com.liandro.javabasics;

public class Aula04Global {
	
	public static void main(String[] args) {
		
		Aula04 rick = new Aula04();
		rick.fabricarcarro();
		rick.fabricarcarro();
		rick.fabricarcarro();
		rick.fabricarcarro();
		System.out.println("O funcionário Rick fabricou um total de " + rick.carro + " carros.");
		
		Aula04 morty = new Aula04();
		morty.fabricarcarro();
		morty.fabricarcarro();
		System.out.println("O funcionário Rick fabricou um total de " + morty.carro + " carros.");
		
	}

}
