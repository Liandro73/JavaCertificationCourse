package br.com.liandro.javaarrays;

import java.util.ArrayList;

public class Aula40 {
	
	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList< >();
		nomes.add("Rick");
		nomes.add("Morty");
		nomes.add("Summer");
		
		System.out.println(nomes.contains("Rick"));
		
		boolean removido = nomes.remove("Rick");
		System.out.println("Foi removido? " +removido);
		
		System.out.println(nomes.contains("Rick"));
		
		boolean removido2 = nomes.remove("Pedro");
		System.out.println("Foi removido? " +removido2);
		
		System.out.println(nomes.size());
		
		Object [] obj = nomes.toArray();
		Object [] nomesArray = nomes.toArray(new String[nomes.size()]);
		Object [] nomesArray2 = nomes.toArray(new String[0]);
		
		
		ArrayList<String> paises = new ArrayList<>();
		paises.add("France");
		paises.add("Germany");
		paises.add("Japan");
		paises.add("Brazil");
		
		ArrayList<String> todos = new ArrayList<>();
		todos.addAll(nomes);
		todos.addAll(paises);
		System.out.println("A soma de ArrayLists é " +todos.size());
		
		System.out.println("Na posição 0 está " +todos.get(0));
		
		todos.add(0,"Joel");
		System.out.println("Na posição 0 está " +todos.get(0));
		
		todos.remove(0);
		System.out.println("Na posição 0 está " +todos.get(0));
		
		//O set substitue uma String por outra String
		todos.set(0, "PiccleRick");
		System.out.println(todos.get(0));
		System.out.println(todos.get(1));
		
		System.out.println(todos.indexOf("France"));
		System.out.println(todos.lastIndexOf("Brazil"));
	}

}
