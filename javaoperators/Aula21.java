package br.com.liandro.javaoperators;

public class Aula21 {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("11030212738");
		sb1.insert(3, '.');
		sb1.insert(7, '.');
		sb1.insert(11, '-');
		sb1.append(" este");
		sb1.append(" é meu CPF");
		System.out.println(sb1.toString());
		
		StringBuffer sb2 = new StringBuffer(60);
		System.out.println(sb2);
		
		StringBuffer sb3 = new StringBuffer(sb1);
		sb3.append(" e o meu nome é Rick");
		sb3.append('.');
		System.out.println(sb3);
		
		StringBuffer sb4 = new StringBuffer();
		sb4.append(sb3);
		System.out.println(sb4);
		sb4.delete(30, 50);
		System.out.println(sb4);
		
		/*StringBuilder sb5 = new StringBuilder();
		sb5.append(new num1().toString());
		System.out.println(sb5);*/
		
		StringBuilder sb6 = new StringBuilder("Rick");
		sb6.reverse();
		System.out.println(sb6);
		
		StringBuilder sb7 = new StringBuilder("Java Certification");
		System.out.println(sb7.substring(12, 18));
		System.out.println(sb7.subSequence(0, 4));
		System.out.println(sb7);
	}

}
