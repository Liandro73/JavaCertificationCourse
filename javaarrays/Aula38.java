package br.com.liandro.javaarrays;

public class Aula38 {
	
	public static void main(String[] args) {
		Curso cursos[] = new Curso[10];
		
		for(int i = 0; i < cursos.length; i++) {
			cursos[i] = new Curso();
			cursos[i].nomeCurso = "Cursos de Java";
		}
		
		for (Curso c : cursos) {
			System.out.println(c.nomeCurso);
		}
		System.out.println(cursos[0].nomeCurso);
		System.out.println(cursos[1].nomeCurso);
		System.out.println(cursos[2].nomeCurso);
		System.out.println(cursos[3].nomeCurso);
		
		Curso cursos2[] = new Curso[5];
		cursos2[0] = new Curso();
		cursos2[1] = new CursoAvancado();
		
		Curso c = new Curso();
		c.nomeCurso = "Certificação Java";
		c.cargaHoraria = 30;
		System.out.println(c.nomeCurso);
		System.out.println(c.cargaHoraria);
		
		cursos2[0] = c;
		System.out.println(cursos2[0].nomeCurso);
		System.out.println(cursos2[0].cargaHoraria);
	}

}

class Curso {
	String nomeCurso;
	int cargaHoraria;
}

class CursoAvancado extends Curso {

}