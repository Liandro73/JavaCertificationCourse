package br.com.liandro.javaoperators;

import javax.swing.JOptionPane;

public class Aula36 {
	
	public static void main(String[] args) {
		int dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um dia da semana"));
		//Não funciona com float e double
		switch(dia) {
		case (5-4):
			System.out.println("Hoje é domingo");
			break;
			 
		case 2:
			System.out.println("Hoje é segunda");
			break;
			
		case 3:
			System.out.println("Hoje é terça");
			break;
			
		case 4:
			System.out.println("Hoje é quarta");
			break;
			
		case 5:
			System.out.println("Hoje é quinta");
			break;
			
		case 6:
			System.out.println("Hoje é sexta");
			break;
		
		case 7:
			System.out.println("Hoje é sábado");
			break;
			
		default:
			System.out.println("Digite um dia válido entre 1 e 7");
		}
	}

}
