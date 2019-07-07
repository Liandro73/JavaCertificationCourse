package br.com.liandro.javabasics;

import static java.lang.Math.*;
import static java.lang.System.*;

public class Aula10 {
	
	static double raiz = 81;
	
	static void calculaRaiz() {
		out.println(sqrt(raiz));
	}
	
	static void calculaSeno() {
		out.println(sin(raiz));
	}
	
	static void exibePI() {
		out.println(PI);
	}
	
	public static void main(String[] args) {
		
		calculaRaiz();
		calculaSeno();
		exibePI();
						
	}

}
