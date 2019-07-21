package br.com.liandro.javaoperators;

public class Aula32 {
	
	public static void main(String[] args) {
		String nome1 = new String("Java");
		String nome2 = new String("Java");
		String nome3 = "Java"; //será colocado no pool
		String nome4 = "Java"; //será verificado conteudo igual no pool
		
		
		System.out.println(nome1 == nome2);      //false
		System.out.println(nome1.equals(nome2)); //true
		System.out.println(nome3 == nome4);      //true
		System.out.println(nome3.equals(nome4)); //true
		System.out.println(nome1.equals(nome3)); //true
	}

}
