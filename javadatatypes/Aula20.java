package br.com.liandro.javadatatypes;

public class Aula20 {
	String nome;
	double nota1;
	double nota2;
	double mediaAluno;
	
	public void mediaAluno(double n1, double n2) {
		this.nota1 = n1;
		this.nota2 = n2;
		
		this.mediaAluno = (this.nota1 + this.nota2)/2;
		System.out.println(this.nome + " sua nota é: " + this.mediaAluno);
	}
	public double mediaAluno(double...notas) {
		double mediaTurma = 0;
		for(int i=0; i < notas.length; i++) {
			mediaTurma += notas[i];
		}
		return mediaTurma/notas.length;
	}
}
