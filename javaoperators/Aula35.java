package br.com.liandro.javaoperators;

public class Aula35 {
	//Não é possivel executar
	/*public int metodo(int x) {
		if(x > 2000) {
			return 10;
		}
 }*/
	
	public static void main(String[] args) {
		//Método tem retorno
		/*Aula35 o = new Aula35();
		o.metodo(1000);
		System.out.println(o.metodo(1000));*/
		
		boolean login = true;
		
		if(3 > 1) {
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Login ou senha incorretos");
		}
		
		boolean ativo = true;
		if(ativo == false) {
			System.out.println("Funcionário ativo");
		} else {
			System.out.println("Este funcionário não está no sistema");
		}
		
		int a = 10;
		int b = 16;
		
		if(a != b) {
			System.out.println("São iguais!");
		}
		
		boolean valor = false;
		
		if(valor = true) {
			System.out.println("É falso");
		} else {
			System.out.println("É verdadeiro");
		}
		
		boolean verdade = true;
		
		if(verdade) 
			System.out.println("Verdade");
		else
			System.out.println("Mentira");
			System.out.println("Executei assim mesmo.");
			
		int valor1 = 19;
		
		if(valor1 >= 20) {
			System.out.println("Maior que vinte");
		} else if(valor1 == 10){
			System.out.println("Igual a 10");
		} else {
			System.out.println("Menor que 10");
		}
		
	}

}
