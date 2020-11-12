package br.com.ingrao.collections.gerenciadorCursos;

public class Aula implements Comparable<Aula>{
	
	private String nome;
	private int tempo;
	
	public Aula(String nome , int tempo) {
		this.nome = nome;
		this.tempo = tempo;
	}
	
	@Override
	public String toString() {
		return "Aula: "+this.nome + " ,Tempo:" + this.tempo; 
	}
	public String getNome() {
		return nome;
	}

	public int getTempo() {
		return tempo;
	}

	@Override
	public int compareTo(Aula outraAula) {	
		return this.nome.compareTo(outraAula.getNome());
	}
	
	
			
}
