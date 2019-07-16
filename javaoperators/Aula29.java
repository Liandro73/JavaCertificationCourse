package br.com.liandro.javaoperators;

import javax.swing.JOptionPane;

public class Aula29 {
	
	public static void main(String[] args) {
		String resultado = null;
		int idade = 0;
		
		idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a sua idade"));
		
		//resultado = (idade < 18 | idade >= 65) ? "Voto é opcional" : "Voto é obrigatório";
		System.out.println(idade < 18 | idade >= 65 ? 100 : "500");
	}

}
