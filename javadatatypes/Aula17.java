package br.com.liandro.javadatatypes;

public class Aula17 {
	
	int valor;
	
	public static void main(String[] args) {
		//vari�vies de refer�ncia guardam o endere�o de mem�ria
		Aula17 reef = new Aula17();
		reef.valor = 10;
		Aula17 ref1 = reef;
		
		reef.valor += 10;
		
		System.out.println(reef.valor);
		System.out.println(ref1.valor);
		
		//vari�veis de tipo primitivo, guardam o valor
		int idade = 21; //26
		int idade3 = idade; //21
		
		idade += 5;
		
		System.out.println(idade);
		System.out.println(idade3);
	
	}

}
