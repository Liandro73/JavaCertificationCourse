package br.com.liandro.javaoperators;

public class Aula33A {
	
	public static void main(String[] args) {
		String txt = "um texto qualquer";
		String txt1 = "texto";
		String txt2 = txt.substring(3,8);     //� criada uma nova string
		System.out.println(txt2);
		
		System.out.println(txt1 == txt2);     //false
		System.out.println(txt.equals(txt2)); //false
		System.out.println(txt2 == "texto");  //false
		
		//Nem sempre na chamada de um m�todo � criada uma nova String.
		System.out.println(txt.toLowerCase() == txt); //n�o cria uma nova String
		System.out.println(txt.toUpperCase() == txt); //cria uma nova String (Camel Case)
		System.out.println(txt.toString() == txt);    //n�o cria uma nova String
	}

}
;