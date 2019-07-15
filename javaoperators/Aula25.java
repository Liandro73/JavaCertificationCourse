package br.com.liandro.javaoperators;

public class Aula25 {
	public static void main(String[] args) {
		int dois = 2;
		int dez = 10;
		
		int doze = dois + dez;
		int oito = dez - dois;
		int vinte = dez * dois;
		int resDaDiv = 10 % 6; //resto da divisão = 4.
		
		//Divisão por Zero.
		
		//int divZero = 5 / 0;
		//int divZero = 5 / 0.0;
		double divZero = 5 / 0.0;
		double divZero1 = -5 / 0.0;
		System.out.println(divZero);
		System.out.println(divZero1);
		System.out.println(divZero/divZero1);
	}

}
