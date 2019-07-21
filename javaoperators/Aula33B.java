package br.com.liandro.javaoperators;

public class Aula33B {
	
	public static void main(String[] args) {
										   //novos objetos criados
		String h = new String("hello");    //2
		String h1 = "hello";               //0
		String w = "world";                //1
		
		System.out.println("hello");       //0
		System.out.println(h1 + "world");  //1
		System.out.println("Hello" == h1); //1
	}

}
