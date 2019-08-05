package br.com.liandro.javaarrays;

import java.util.ArrayList;
import java.util.Iterator;

public class Aula41 {
	
	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("Rick");
		nomes.add("Morty");
		nomes.add("Summer");
		
		for(String atual : nomes ) {
			System.out.println(atual);
		}
		
		Iterator<String> lista = nomes.iterator();
		
		while(lista.hasNext()) {
			String novaLista = lista.next();
			System.out.println(novaLista);
			lista.remove();
		}
		System.out.println(nomes.size());
		
		
		Curso cursos = new Curso();
		cursos.nomeCurso = "Curso de Java";
		cursos.cargaHoraria = 55;
				
		ArrayList<Curso> curso = new ArrayList<>();
		curso.add(cursos);
		
		System.out.println(cursos.nomeCurso);
		System.out.println(curso.get(0).nomeCurso);
		System.out.println(curso.get(0).cargaHoraria);
		
		cursos.nomeCurso = "C++";
		System.out.println(cursos.nomeCurso);
		System.out.println(curso.get(0).nomeCurso);
	}
	
	
}
