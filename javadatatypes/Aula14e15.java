package br.com.liandro.javadatatypes;

public class Aula14e15 {
	//1-Categoria Numérica
	byte b = 127;
	short s = 32767;
	int i = 2147483647;
	long l = 9223372036854775807l;
	
	//Como representar o número 267 em outras bases.
	int bin = 0b100001011; //base binária
	int oct = 0413; //base octal
	int hexa = 0x10B; //base hexadecimal
	
	//2-Categoria Ponto Flutuante
	float f  = 3.40282347e+38f;
	double d = 1.7976931348623157e+308;
	//3-Categoria Caracter
	char ch = 65535;
	char ch0 = 65;
	char ch1 = 66;
	char ch2 = 67;
	char ch3 = 6;
	char ch4 = '4';
	char ch5 = '\u03A9';
	//4-Categoria Boolean
	boolean bo  = false;
	boolean boo = true;
	
	public static void main(String[] args) {
		Aula14e15 cat = new Aula14e15();
		System.out.println(cat.b);
		System.out.println(cat.s);
		System.out.println(cat.i);
		System.out.println(cat.l);
		System.out.println(cat.bin);
		System.out.println(cat.oct);
		System.out.println(cat.hexa);
		System.out.println(cat.f);
		System.out.println(cat.d);
		System.out.println(cat.ch);
		System.out.println(cat.ch0);
		System.out.println(cat.ch1);
		System.out.println(cat.ch2);
		System.out.println(cat.ch3);
		System.out.println(cat.ch4);
		System.out.println(cat.ch5);
		System.out.println(cat.bo);
		System.out.println(cat.boo);
	}
	
}
