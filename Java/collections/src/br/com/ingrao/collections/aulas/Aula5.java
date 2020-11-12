package br.com.ingrao.collections.aulas;

import java.util.HashSet;
import java.util.Set;

public class Aula5 {
	//Sets
	public static void main(String[] args) {
		/* Caracteristicas
		 * Não conseguimos ter o controle de ordem dos sets, por isso não temos os metodos de acesso a ordem
		 * Não adiciona elementos repetidos
		 * Buscas mais rapidas em comparação ao linkedlist e arraylist*/
		Set<String> alunos = new HashSet<>();
		alunos.add("joao");
		alunos.add("ingrod");
		alunos.add("icaro");
		alunos.add("julia");
		alunos.add("joao");//não irá adicionar
		
		System.out.println(alunos.size());
		for (String aluno : alunos) {//varrendo o set
			System.out.println(aluno);
		}
		
		System.out.println(alunos);
	}
}
