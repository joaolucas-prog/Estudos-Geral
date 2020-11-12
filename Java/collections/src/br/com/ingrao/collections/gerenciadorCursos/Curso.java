package br.com.ingrao.collections.gerenciadorCursos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Curso {
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new ArrayList<Aula>();//boa pratica é encapsular pra classe generica para futuras manutenções
	private Set<Aluno> alunos = new HashSet<>();//considerando que n haverá alunos iguais
	
	public Curso(String nome , String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
		
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);//devolve uma lista apenas de leitura maior proteção
	}
	
	public void matricula(Aluno a) {
		this.alunos.add(a);
	}
	
	public Set<Aluno> getAlunos(){
		return Collections.unmodifiableSet(this.alunos);
	}
	
	public boolean estaMatriculado(Aluno a) {
		return this.alunos.contains(a);
	}
}
