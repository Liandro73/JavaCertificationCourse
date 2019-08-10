package br.com.liandro.javaloopconstructs;

public class Aula45 {
	
	public static void main(String[] args) {
		int i = 0;
		//DO WHILE
		do {
			System.out.println("Executando... i" +i);
			i++;
		} while(i > 10);
		//WHILE
		int j = 0;
		while (j > 10) {
			System.out.println("Executando... j" +j++);
		}
		//ENHANCED FOR
		int pares[] = {2,4,5,8,10,12,14};
		
		for(int par : pares) {
			System.out.println("Este é um Array de números pares " +par);
		}
		//FOR
		int impares[] = new int [] {1,3,5,7,9,11,13};
		int pares2[] = {2,4,5,8,10,12,14};
		
		for (int a = 0; a < 7; a++) {
			System.out.println("IMPAR " +impares[a]);
			System.out.println("PAR " +pares2[a]);
		}
		
	}

}
