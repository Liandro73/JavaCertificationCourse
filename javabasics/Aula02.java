package br.com.liandro.javabasics;

//importando a AulaImport02
import br.com.liandro.javabasicoimport.*;

public class Aula02 {
	public static void main (String[] args) {
	
		AulaImport02 sample = new AulaImport02();
		sample.c = 50;
		sample.d = 75;
		sample.resul = sample.c - sample.d;
		
		System.out.println("O resultado da soma é " +sample.resul);
	}
	

}
