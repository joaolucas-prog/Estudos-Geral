package br.com.ingrao.collections.aulas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.ingrao.collections.gerenciadorCursos.Aula;
import br.com.ingrao.collections.gerenciadorCursos.Curso;

public class Aula4 {
	//Mais pratica com relacionamentos
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("dominando as coleções Java",
				"Joao Lucas");
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList",21));
		javaColecoes.adiciona(new Aula("Listas de objetoc", 19));
		javaColecoes.adiciona( new Aula("Relacionamento de listas e objetos", 15));
		
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas();// recebendo uma lista imutavel
		
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);// "clonando" a lista imutavel e definindo como arraylist,
		//para assim fazer alteração que eu desejo sem modificar o objeto
		
		Collections.sort(aulas);//ordenando o clone criado
		System.out.println(aulasImutaveis);
		System.out.println(aulas);
	}
}
