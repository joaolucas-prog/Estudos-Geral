package br.com.ingrao.moderno.projeto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {
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
	

}
