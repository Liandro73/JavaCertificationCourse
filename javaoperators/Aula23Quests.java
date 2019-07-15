package br.com.liandro.javaoperators;

public class Aula23Quests {
	
	public static void main(String[] args) {
		String s = "Rick";
		
		for(int i=0; i<9; i++) {
			s = s + "Rick";
		}
		
		System.out.println(s.length());
		String b = null;
		String s2 = new String(b);
		System.out.println(s2);
	}

}
