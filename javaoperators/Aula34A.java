package br.com.liandro.javaoperators;

public class Aula34A {
	public static void main(String[] args) {
		Aula34 c1 = new Aula34("Morty");
		Aula34 c2 = new Aula34("Rick");
		Aula34 c3 = new Aula34("Morty");
				
		System.out.println(c1 == c2); //endereço de memória diferentes
		System.out.println(c1 == c1);
		System.out.println(c1 == c3);
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c1));
		System.out.println(c1.equals(c3));
	}

}
