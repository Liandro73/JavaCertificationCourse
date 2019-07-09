package br.com.liandro.javadatatypes;

public class Aula19B {
	
	public static void main(String[] args) {
		Aula19 aluno = new Aula19();
		Aula19 a = new Aula19();
		a.nome = "Rick";
		aluno.c1 = a;
		a = new Aula19();
		a.nome = "Morty";
		aluno.c2 = a;
		a = null;
		
		/*if (15 > 10) {
			Aula19 b = new Aula19();
		}
		Aula19 c;
		for(int i=0; i<10; i++) {
			c = new Aula19();
			c.nome = "Beth";
		}*/
		
		System.out.println("Objeto = " + Aula19.contador);
		System.out.println(aluno.c1.nome);
		System.out.println(aluno.c2.nome);
	}

}
