package br.com.liandro.javaarrays;

public class Aula37 {
	
	public static void main(String[] args) {
		
		//declaração array mesma linha
		int[] numeros = {3,5,7,4,6,8};
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		for (int numero: numeros) {
			System.out.println(numero);
		}
		///////////////////////////////////////////////
		
		int[] idade = new int[10];
		idade[2] = 5;
		
		System.out.println(idade[0]);
		System.out.println(idade[1]);
		System.out.println(idade[2]);
		
		String[] nome = new String[] {"Java", "OCAJP", "PASS"};
		
		System.out.println(nome[0]);
		System.out.println(nome[1]);
		System.out.println(nome[2]);
		
		Aula37B[] alunos = new Aula37B[] {new Aula37B(), new Aula37B(), new Aula37B()};
		alunos[0].nome = "Rick";
		alunos[1].nome = "Morty";
		alunos[2].nome = "Parker";
		
		System.out.println(alunos[0].nome);
		System.out.println(alunos[1].nome);
		System.out.println(alunos[2].nome);
		
		//Outras formas de declarar um array
		
		/*double preco[];
		long []telefone;
		long[]cpf;*/
	}
}
