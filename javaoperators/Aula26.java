package br.com.liandro.javaoperators;

public class Aula26 {
	public static void main(String[] args) {
		System.out.println(1 == 1);
		System.out.println(1 != 1);
		System.out.println(1 < 1);
		System.out.println(1 > 1);
		System.out.println(1 <= 1);
		System.out.println(1 >= 1);
		
		System.out.println(1.0f == 1l);
		System.out.println(1.0f == 1.0d);
		
		String nome = new String();
		String nome2 = new String();
		
		System.out.println(nome == nome2);
		System.out.println(nome != nome2);
		
		System.out.println(1 == (100.0 / 100));
	}

}
