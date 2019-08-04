package br.com.liandro.javaarrays;

public class Aula39 {
	
	public static void main(String[] args) {
		
		int[][] doisD; //duas dimenssões
		
		/* para cada Array de 10 teremos
		   outro Array de 5 posições.*/
		doisD = new int [10][5];
		
		long[][] tresD[]; //três dimenssões
		tresD = new long [10][][];
		
		int[] [][] quatroD[]; //quatro dimenssões
		
		int tabela [][] = new int [][] {{1,2,3,4,5},{6,7,8}};
		
		int outroArray [][] = new int [3][];
		outroArray[0] = new int [200];
		outroArray[1] = new int [100];
		outroArray[2] = new int [150];
		
		for (int i=0; i<outroArray.length; i++) {
			System.out.println("A posição " + i + " tem o tamanho de " +outroArray[i].length);
		}
	}

}
