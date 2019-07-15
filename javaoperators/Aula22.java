package br.com.liandro.javaoperators;

public class Aula22 {
	
	public static void main(String[] args) {
		String nome = "Java";
		String nome2 = new String("Java");
		char[] nome3 = new char[]{'J','a','v','a'};
		String nome4 = new String(nome3);
		
		StringBuffer nome5 = new StringBuffer("Java");
		String nome6 = new String(nome5);
		
		nome.concat("escola");
		System.out.println(nome);
		
	}
}
