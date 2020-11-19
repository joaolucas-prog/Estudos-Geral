package br.com.ingrao.collections.aulas;

import java.util.HashSet;
import java.util.Set;

public class Aula5 {
	//Sets
	public static void main(String[] args) {
		/* Caracteristicas sets
		 * Não conseguimos ter o controle de ordem dos sets, por isso não temos os metodos de acesso a ordem
		 * Não adiciona elementos repetidos
		 * Buscas mais rapidas em comparação ao linkedlist e arraylist
		 * 
		 * HashSet
		 * quando utilizar: quando não é necessário mater uma ordenação
		 * Ordernação: Não é ordenado e não permite valores repetidos
		 * Performace: Por não ter repetição de valores e não ser  ordenado, e a implementação mais performatica
		 * 
		 * LinkedHashSet
		 * quando utilizar: quando é necessário mater uma ordem de inserção dos elementos
		 * Ordernação: Matém a ordem de  inserção dos elementos
		 * Performace: Implementação mais lenta por ser necessario manter a ordem
		 * 
		 * TreeSet
		 * quando utilizar: quando é necessário alterar a ordem atraves do uso comparaters
		 * Ordernação: Matem a ordem e pode ser reordenado
		 * Performace: Performatico para leitura. Para modificação tem a necessidade de reordenar sendo mais lendo que LinkedHashSet
		 * */
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
