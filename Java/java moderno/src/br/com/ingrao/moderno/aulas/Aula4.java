package br.com.ingrao.moderno.aulas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import static java.util.Comparator.comparing;

import br.com.ingrao.moderno.projeto.Curso;

public class Aula4 {
	//no java 8 toda collection possui um metodo stream e que possui varios metodos associados (recomendo estudar mais sobre) 
	//https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html
	public static void main(String[] args) {
		Curso c1 = new Curso("Python",14);
		Curso c2 = new Curso("JavaScript",30);
		Curso c3 = new Curso("Java",10);
		Curso c4 = new Curso("C",4);
		
		List<Curso> cursos = new ArrayList<Curso>();
		
		cursos.add(c1);
		cursos.add(c2);
		cursos.add(c3);
		cursos.add(c4);
		
		//cursos.sort(Comparator.comparing(Curso::getAlunos));
		//deixando mais enxuto e importando o metodo statico
		cursos.sort(comparing(Curso::getAlunos));
		//cursos.forEach(c -> System.out.println(c.getNome()));
		
		cursos.stream()
		.filter(c -> c.getAlunos() > 10)
		.forEach(c -> System.out.println(c.getNome()));//filtrando cursos com mais de 10 alunos e para cada curso imprimir o nome
		
		cursos.stream()
		.map(Curso::getNome)
		.forEach(System.out::println);//transformando o stram de curso para stram de string e imprimindo cada valor
	}
}
