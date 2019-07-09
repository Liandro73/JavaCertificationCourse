package br.com.liandro.javadatatypes;

public class Aula18 {
	String modelo;
	int ano;
	
	//construtor
	Aula18(){
		ano = 2015;
		System.out.println(ano);
	}
	void modelo(){
		modelo = "Ferrari Enzo";
		System.out.println(modelo);
	}
	void setCarro(String modelo) {
		this.modelo = modelo;
		System.out.println(this.modelo);
	}
	
	public static void main(String[] args) {
		Aula18 var = new Aula18();
		var.modelo();
		var.setCarro("Celta");
		var.modelo = "Palio";
		System.out.println(var.modelo);
		var.ano = 2019;
		System.out.println(var.ano);
	}
}
