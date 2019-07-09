package br.com.liandro.javadatatypes;

public class Aula20Test {
	
	public static void main(String[] args) {
		Aula20 aluno1 = new Aula20();
		aluno1.nome = "Rick Morales";
		aluno1.mediaAluno(10, 7);
		
		Aula20 aluno2 = new Aula20();
		double n = aluno2.mediaAluno(8,7,5,6,9,10);
		System.out.println("A media da turma é: " + n);
		System.out.println(aluno2.mediaAluno(8,7,5,6,9,10));
	}
	
}
