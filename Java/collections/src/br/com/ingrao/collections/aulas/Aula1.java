package br.com.ingrao.collections.aulas;

import java.util.ArrayList;
import java.util.Collections;

public class Aula1 {
	//Listas
	public static void main(String[] args) {
		
		String aula1 = "Conhecendo mais sobre listas";
		String aula2 = "Modelando a Classe aula";
		String aula3 = "Trabalhando com cursos e sets";
		
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas.toString());
		
		aulas.remove(0);
		
		System.out.println(aulas.toString());
		
		//"foreach no java"
		
		for (String aula : aulas ) {//lê-se para cada aula em aulas faça
			System.out.println(aula);
		}
		
		String primeiraAula = aulas.get(0);//valor do primeiro elemento da collection
		System.out.println(primeiraAula);
		
		System.out.println(aulas.size());//tamanho da collection
		//percorrendo o collection de outra forma
		
		for(int i = 0 ;i < aulas.size() ; i++) {
			System.out.println(aulas.get(i));
		}
		
		//foreach da collection
		aulas.forEach(aula -> {
			System.out.println(aula);
		});
		
		//ordenando uma collection usando uma collections
		
		Collections.sort(aulas);
		System.out.println(aulas);
	}

}
