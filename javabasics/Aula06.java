package br.com.liandro.javabasics;

import javax.swing.JOptionPane;

public class Aula06 {
	
	static float n1, n2;
	static float media;
	
	static void insiraNota() {
		n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota"));
		n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota"));
	}
	
	static void calculaMedia() {
		media = (n1 + n2)/2;
				
	}
	
	static void exibeMedia() {
		JOptionPane.showMessageDialog(null, "A média foi de  "  +media);
	}
	
}