package br.com.liandro.javaoperators;

public class Aula23 {
	
	public static void main(String[] args) {
		String nome = "Java";
		String nome2 = new String("Java");
		char[] nome3 = new char[]{'J','a','v','a'};
		String nome4 = new String(nome3);
		
		StringBuffer nome5 = new StringBuffer("Java");
		String nome6 = new String(nome5);
		
		String nome7 = null;
		String nome8 = "meu nome �: " + " " + "Rick Sanchez";
		System.out.println(nome8 + nome7);
		
		System.out.println(2 + 7 + " Ol� meu nome � Rick e tenho " + 2 + 7);
		
		String nome9 = "rick";
		//nome9.toUpperCase();
		//m�todo para o aplicar UpperCase
		nome9 = nome9.toUpperCase(); //Maiusculo.
		nome9 = nome9.toLowerCase(); //Minusculo.
		System.out.println(nome9);
		
		System.out.println(nome9.charAt(3)); //Acesa a posi��o Array.
		System.out.println(nome9.length());  //Devolve a quantidade de elementos no Array.
		
		System.out.println(!nome.isEmpty()); //Verificar se o Array est� vazio.
		System.out.println(nome9.isEmpty());
		System.out.println("Morty".isEmpty());
		
		System.out.println("     Morty     ".trim()); //Remove espa�os vazios dos lados.
		
		String nome10 = "JAVA";
		System.out.println(nome10);
		System.out.println(nome10.replace("JA", "REACT")); //Substitui parte ou toda String por outra.
		System.out.println(nome10);
		
		System.out.println(nome10.substring(2)); //Inicia uma Array de uma posi��o, ou intervalo.
		
		System.out.println("rick".equals("RICK"));
		System.out.println("rick".equalsIgnoreCase("RICK"));
		
		System.out.println("a".compareTo("a")); //igual � zero.
		System.out.println("a".compareTo("b")); //retorna negativo.
		System.out.println("d".compareTo("b")); //retorna positivo.
		System.out.println("a".compareToIgnoreCase("A")); 
		System.out.println("a".compareTo("A"));
		
		String nome11 = "joao e maria";
		System.out.println(nome11.indexOf("a")); //Procurar a String da Esquerda/Direita
		System.out.println(nome11.lastIndexOf("a")); //Procurar a String da Direita/Esquerda
		System.out.println(nome11.indexOf("a",3)); //Procurar a String da Esquerda/Direita a partir de uma posi��o predeterminada
		System.out.println(nome11.startsWith("joao"));
		System.out.println(nome11.endsWith("maria"));
		System.out.println(nome11.startsWith("maria"));
		System.out.println(nome11.endsWith("joao"));
	}

}
