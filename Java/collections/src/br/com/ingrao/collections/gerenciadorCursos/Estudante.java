package br.com.ingrao.collections.gerenciadorCursos;

public class Estudante implements Comparable<Estudante>{
	
	private String nome;
	private Integer idade;
	
	public Estudante(String nome, Integer idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public Integer getIdade() {
		return this.idade;
	}
	
	@Override
	public String toString() {
		return "Estudande: "+this.nome + " Idade: "+this.idade;
	}
	
	public int compareTo(Estudante outro) {
		return Integer.compare(this.idade, outro.idade);
	}
}
