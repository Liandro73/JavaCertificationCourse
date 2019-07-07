package br.com.liandro.javabasics;

public class Aula11 {
	
	public String nome;
	
	public void exibeVelocidade() {
		System.out.println("A velocidade de uma " +nome+ " é de 380km/h");
	}
	
	public static void main(String[] args) {
		Aula11 objeto = new Aula11();
		objeto.nome = "Lamborghini";
		objeto.exibeVelocidade();
	}

}
