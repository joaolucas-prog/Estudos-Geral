package br.com.ingrao.collections.aulas;

import br.com.ingrao.collections.gerenciadorCursos.Aluno;
import br.com.ingrao.collections.gerenciadorCursos.Aula;
import br.com.ingrao.collections.gerenciadorCursos.Curso;

public class Aula6 {
	// sets em objetos
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("dominando as coleções Java", "Joao Lucas");
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Listas de objetoc", 19));
		javaColecoes.adiciona(new Aula("Relacionamento de listas e objetos", 15));

		Aluno a1 = new Aluno("joao", 1111);
		Aluno a2 = new Aluno("ingrid", 2222);
		Aluno a3 = new Aluno("jose", 4444);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);

		System.out.println("todos os alunos matriculados :");

		javaColecoes.getAlunos().forEach(a -> {
			System.out.println(a);
		});
	}

}
