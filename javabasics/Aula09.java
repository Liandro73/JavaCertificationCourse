package br.com.liandro.javabasics;

public class Aula09 {
	String cliente;
	double saldo;
	
	void exibeSaldo() {
		System.out.println("O Sr. " +this.cliente+ " tem o saldo de " +this.saldo+ " reais.");
		
	}
	
	void saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Sr. " +this.cliente+ ", seu saque no valor de " +valor+ " reais foi efetuado com sucesso.");
		}else {
			System.out.println("Sr. " +this.cliente+ ", voc� n�o possui saldo suficiente para realizar a transa��o.");
		}
	}
	
	void deposito(double valor) {
		this.saldo += valor;
		System.out.println("Sr. " +this.cliente+ ", seu dep�sito no valor de " +valor+ " foi efetuado com sucesso.");
	}
				
	
	public static void main(String args[]) {
		Aula09 c1 = new Aula09();
		c1.cliente = "Rick";
		c1.saldo = 10000;
		c1.exibeSaldo();
		c1.saca(11000);
		c1.exibeSaldo();
		c1.deposito(1500);
		c1.exibeSaldo();
	}
	
}
