package br.com.liandro.javabasics;

public class Aula07 {
	String nome;
	int idade;
	int cpf;
	
	//Construct1
	Aula07 (){
		this.nome = "Rick";
		this.idade = 60;
		this.cpf = 00055570544;
	}
	
	//Construct2
	Aula07 (String NewName, int NewAge, int Newcpf){
		this.nome = NewName;
		this.idade = NewAge;
		this.cpf = Newcpf;
	}
	
	//Construct3
	Aula07 (String NovoNome){
		this.nome = NovoNome;
		this.idade = 17;
		this.cpf = 03000000055;		
	}
	
	//Construct4
	Aula07 (int NewAge){
		this.nome = "Beth";
		this.idade = NewAge;
		this.cpf = 112156646;
	}

}
