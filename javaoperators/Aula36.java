package br.com.liandro.javaoperators;

import javax.swing.JOptionPane;

public class Aula36 {
	
	public static void main(String[] args) {
		int dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um dia da semana"));
		//N�o funciona com float e double
		switch(dia) {
		case (5-4):
			System.out.println("Hoje � domingo");
			break;
			 
		case 2:
			System.out.println("Hoje � segunda");
			break;
			
		case 3:
			System.out.println("Hoje � ter�a");
			break;
			
		case 4:
			System.out.println("Hoje � quarta");
			break;
			
		case 5:
			System.out.println("Hoje � quinta");
			break;
			
		case 6:
			System.out.println("Hoje � sexta");
			break;
		
		case 7:
			System.out.println("Hoje � s�bado");
			break;
			
		default:
			System.out.println("Digite um dia v�lido entre 1 e 7");
		}
	}

}
