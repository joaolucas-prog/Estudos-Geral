package br.com.ingrao.collections.aulas;

import java.util.HashSet;
import java.util.Set;

public class Aula5 {
	//Sets
	public static void main(String[] args) {
		/* Caracteristicas
		 * N�o conseguimos ter o controle de ordem dos sets, por isso n�o temos os metodos de acesso a ordem
		 * N�o adiciona elementos repetidos
		 * Buscas mais rapidas em compara��o ao linkedlist e arraylist*/
		Set<String> alunos = new HashSet<>();
		alunos.add("joao");
		alunos.add("ingrod");
		alunos.add("icaro");
		alunos.add("julia");
		alunos.add("joao");//n�o ir� adicionar
		
		System.out.println(alunos.size());
		for (String aluno : alunos) {//varrendo o set
			System.out.println(aluno);
		}
		
		System.out.println(alunos);
	}
}
