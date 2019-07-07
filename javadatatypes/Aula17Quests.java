package br.com.liandro.javadatatypes;

public class Aula17Quests {
	int B = 15;
	public static void main(String[] args) {
		Aula17Quests x = new Aula17Quests();
		Aula17Quests y = x;
		
		y.B++;
		x.B++;
		
		Aula17Quests z = y;
		
		z.B--;
		
		System.out.println(x.B+y.B+z.B);		
	}
	
}
