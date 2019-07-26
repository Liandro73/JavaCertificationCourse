package br.com.liandro.javaoperators;

public class Aula36Quests {
	
	public static void main(String[] args) {
		int tamanho = args.length;
		
		switch (tamanho) {
		case 1:
			System.out.println("1");
			break;
			//Inacessível após o break
			//System.out.println("3");
		case 2:
			System.out.println("2");
		default:
			System.out.println("Mais argumentos");
		}
	}

}
