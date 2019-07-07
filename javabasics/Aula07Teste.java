package br.com.liandro.javabasics;

public class Aula07Teste {
	public static void main(String[] args) {
		Aula07 rick = new Aula07();
		System.out.println(rick.nome);
		System.out.println(rick.idade);
		System.out.println(rick.cpf);
		
		Aula07 morty = new Aula07("Morty", 14, 00000);
		System.out.println(morty.nome);
		System.out.println(morty.idade);
		System.out.println(morty.cpf);
		
		Aula07 summer = new Aula07("Summer");
		System.out.println(summer.nome);
		System.out.println(summer.idade);
		System.out.println(summer.cpf);
		
		Aula07 beth = new Aula07(34);
		System.out.println(beth.nome);
		System.out.println(beth.idade);
		System.out.println(beth.cpf);
	}
	
}
