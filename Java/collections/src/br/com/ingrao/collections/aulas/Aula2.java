package br.com.ingrao.collections.aulas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import br.com.ingrao.collections.gerenciadorCursos.Aula;

public class Aula2 {
	public static void main(String[] args) {
		//Listas de objetos
		Aula a1 = new Aula("Revisando as ArrayList", 21);
		Aula a2 = new Aula("Listas de objetoc", 19);
		Aula a3 = new Aula("Relacionamento de listas e objetos", 15);

		ArrayList<Aula> aulas = new ArrayList<Aula>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);
		
		Collections.sort(aulas); // ordenando de forma "natural"(comparable)
		
		System.out.println(aulas);
		
		//ordenando passando um comparador
		aulas.sort(Comparator.comparing(Aula::getTempo));
		
		System.out.println(aulas);
	}
}
