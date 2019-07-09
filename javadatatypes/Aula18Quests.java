package br.com.liandro.javadatatypes;

public class Aula18Quests {
	
	int c;
	
	void c(int c) {
		c = c;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		Aula18Quests b = new Aula18Quests();
		b.c = 10;
		System.out.println(b.c);
		b.c(30);
		System.out.println(b.c);
	}
}
