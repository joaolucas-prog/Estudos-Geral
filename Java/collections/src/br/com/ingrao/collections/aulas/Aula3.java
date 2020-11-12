package br.com.ingrao.collections.aulas;

import java.util.List;

import br.com.ingrao.collections.gerenciadorCursos.Aula;
import br.com.ingrao.collections.gerenciadorCursos.Curso;

public class Aula3 {
	//Relacionamento com coleções
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("dominando as coleções Java",
				"Joao Lucas");
		List<Aula> aulas = javaColecoes.getAulas();//referenciando o mesmo objeto(caso não esteja protegido)
		
		//aulas.add(new Aula("Trabalhando com ArrayList",21)); //agora está protegido e causa um exception
		
		System.out.println(aulas);
		System.out.println(aulas == javaColecoes.getAulas());
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList",21));
		System.out.println(javaColecoes.getAulas());
		
		System.out.println(aulas == javaColecoes.getAulas());
	}
}
