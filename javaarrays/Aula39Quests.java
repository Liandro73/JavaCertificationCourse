package br.com.liandro.javaarrays;

public class Aula39Quests {
	
	public static void main(String[] args) {
		int zyx[][] = new int [3][10];
		int [] x = new int [20];
		int [] y = new int [10];
		int [] z = new int [30];
		zyx[0] = x;
		zyx[1] = y;
		zyx[2] = z;
		System.out.println(zyx[2].length);
	}

}
