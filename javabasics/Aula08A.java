package br.com.liandro.javabasics;

public class Aula08A implements Aula08, Aula08B{
	
	int soma;
	
	public static void main(String[] args) {
		
		Aula08A c = new Aula08A();
		c.exibeValorDePi();
		c.exibeSoma(3, 70);
		
	}

	public void exibeValorDePi() {
		System.out.println(Aula08.PI);
	}
	
	public void exibeSoma(int num1, int num2) {
		this.soma = num1 + num2;
		System.out.println(this.soma);
	}
}
