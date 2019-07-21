package br.com.liandro.javaoperators;

public class Aula33 {
	
	public static void main(String[] args) {
		
		String ab = "a" + "b"; //ab � literal e ser� colocada no pool
		System.out.println(ab == "ab");      //true
		System.out.println(ab.equals("ab")); //true
		
		String a = "a";
		String ab1 = a + "b"; //n�o ser� colocada no pool
		System.out.println(ab1 == "ab");      //false
		System.out.println(ab1.equals("ab")); //true
	}
}
