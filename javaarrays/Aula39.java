package br.com.liandro.javaarrays;

public class Aula39 {
	
	public static void main(String[] args) {
		
		int[][] doisD; //duas dimenss�es
		
		/* para cada Array de 10 teremos
		   outro Array de 5 posi��es.*/
		doisD = new int [10][5];
		
		long[][] tresD[]; //tr�s dimenss�es
		tresD = new long [10][][];
		
		int[] [][] quatroD[]; //quatro dimenss�es
		
		int tabela [][] = new int [][] {{1,2,3,4,5},{6,7,8}};
		
		int outroArray [][] = new int [3][];
		outroArray[0] = new int [200];
		outroArray[1] = new int [100];
		outroArray[2] = new int [150];
		
		for (int i=0; i<outroArray.length; i++) {
			System.out.println("A posi��o " + i + " tem o tamanho de " +outroArray[i].length);
		}
	}

}
