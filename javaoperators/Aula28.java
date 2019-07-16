package br.com.liandro.javaoperators;

public class Aula28 {

	public static void main(String[] args) {
		int i = 5;
		
		//Pós incremento.
		System.out.println(i++);
		//Pós decremento.
		System.out.println(i--);
		int j = 10;
		//Pré incremento.
		System.out.println(++j);
		//Pré decremento.
		System.out.println(--j);
		
		int b = 10;
		b += 20;
		System.out.println(b);
		b -= 15;
		System.out.println(b);
		b *= 3;
		System.out.println(b);
		b /= 5;
		System.out.println(b);
		
		int d = 10;
		
		d += ++d + d + ++d;
	//  d = 10 + 11 + 11 + 12; = 44.
		System.out.println(d);
	}
}
