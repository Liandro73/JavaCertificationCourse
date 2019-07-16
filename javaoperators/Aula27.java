package br.com.liandro.javaoperators;

public class Aula27 {
	public static boolean execute (String nome) {
		System.out.println(nome);
		return true;
	}
	
	public static void main(String[] args) {
		/*System.out.println(1 == 1 & 1 > 2);
		System.out.println(1 == 1 | 1 < 2);
		System.out.println(1 == 1 ^ 1 > 2);
		System.out.println(! (1 == 1));*/
		
		System.out.println(1 != 1 && execute("Executei o método"));
		
		int i = 10;
		int j = 10;
		
		//E simples executa a segunda parte da comparação
		System.out.println(i == 2 & i++ == 0);
		System.out.println(i);
		
		//EE duplo não executa a segunda parte da comparação
		System.out.println(j == 2 && j++ == 0);
		System.out.println(j);
	}

}
