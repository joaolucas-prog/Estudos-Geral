package br.com.ingrao.moderno.projeto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil.ToStringAdapter;

public class Curso implements Comparator<Curso>{
	private String nome;
	private int alunos;
	public Curso(String nome , int alunos) {
		this.nome = nome;
		this.alunos = alunos;
		
	}

	public String getNome() {
		return nome;
	}

	public int getAlunos() {
		return alunos;
	}
	
	@Override
	public String toString() {
		return "[Nome : " + this.nome + ", Alunos: "+ this.alunos+ "]";
	}

	@Override
	public int compare(Curso c1, Curso c2) {
		
		return Integer.compare(c1.getAlunos(), c2.getAlunos());
	}
}
