package br.com.ingrao.collections.aulas;

import java.util.HashSet;
import java.util.Set;

public class Aula5 {
	//Sets
	public static void main(String[] args) {
		/* Caracteristicas sets
		 * N�o conseguimos ter o controle de ordem dos sets, por isso n�o temos os metodos de acesso a ordem
		 * N�o adiciona elementos repetidos
		 * Buscas mais rapidas em compara��o ao linkedlist e arraylist
		 * 
		 * HashSet
		 * quando utilizar: quando n�o � necess�rio mater uma ordena��o
		 * Orderna��o: N�o � ordenado e n�o permite valores repetidos
		 * Performace: Por n�o ter repeti��o de valores e n�o ser  ordenado, e a implementa��o mais performatica
		 * 
		 * LinkedHashSet
		 * quando utilizar: quando � necess�rio mater uma ordem de inser��o dos elementos
		 * Orderna��o: Mat�m a ordem de  inser��o dos elementos
		 * Performace: Implementa��o mais lenta por ser necessario manter a ordem
		 * 
		 * TreeSet
		 * quando utilizar: quando � necess�rio alterar a ordem atraves do uso comparaters
		 * Orderna��o: Matem a ordem e pode ser reordenado
		 * Performace: Performatico para leitura. Para modifica��o tem a necessidade de reordenar sendo mais lendo que LinkedHashSet
		 * */
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
