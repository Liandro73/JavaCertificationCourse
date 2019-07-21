package br.com.liandro.javaoperators;

public class Aula34 {
	String nome;
	
	public Aula34 (String n) {
		this.nome = n;
	}
	
	public boolean equals(Object o) {
		Aula34 outro = (Aula34)o;
		return this.nome.equals(outro.nome);
	}

}
