package br.com.ingrao.estudoutil.modelo;

import java.util.LinkedList;

public class Aula2 {
	private String nome;
	
	public Aula2(String nome ) {
		this.nome = nome;
	}
	/* Metodo equals
	 * � um metodo do Object que compara dois objetos, podemos fazer um override e cria nossa pr�pria compara��o
	 * 
	 * LinkedList
	 * lista duplamente encadeada , possui os mesmo metodos do arrayList mas sua estrutura de dados � diferente
	 * 
	 * Vector
	 * o vector � praticamente igual ao ArrayList em sua estrutura de dados, mas ele � utilizado em threadsafe*/
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();	
		ll.add("teste");
		
		Aula2 teste1 = new Aula2("joao");
		Aula2 teste2 = new Aula2("ingrid");
		Aula2 teste3 = new Aula2("joao");
		
		System.out.println(teste1.equals(teste2));
		System.out.println(teste1.equals(teste3));
	}
	
	@Override
	public boolean equals(Object e) {
		Aula2 ref = (Aula2)e;
		if(this.nome != ref.nome ) {
			return false;
		}	
		return true;
	}
	
	public String getNome() {
		return this.nome;
	}
}
