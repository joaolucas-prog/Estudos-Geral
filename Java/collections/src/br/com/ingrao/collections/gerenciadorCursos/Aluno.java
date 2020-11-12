package br.com.ingrao.collections.gerenciadorCursos;

public class Aluno {
	private String nome;
	private int numMatricula;

	public Aluno(String nome, int numMatricula) {
		if (nome == null) {
			throw new NullPointerException("nome não pode ser null");
		}
		this.nome = nome;
		this.numMatricula = numMatricula;
		
	}

	public String getNome() {
		return nome;
	}

	public int getNumMatricula() {
		return numMatricula;
	}

	@Override
	public String toString() {
		return "Aluno: " + this.nome;
	}

	@Override
	public boolean equals(Object obj) {
		Aluno a = (Aluno) obj;
		return this.nome == a.nome;
	}
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}
}
