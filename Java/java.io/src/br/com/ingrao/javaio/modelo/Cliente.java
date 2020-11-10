package br.com.ingrao.javaio.modelo;

import java.io.Serializable;

public class Cliente implements Serializable {//interface de marcação para poder serializar o obejto

	private static final long serialVersionUID = 1L; // precisamos desse serial para o java saber qual classe está apontando
													// e cada mudança na classe deve ser somado+1 no numero do serial like a version.
	String nome;
	String cpf;
	String profissao;
	
	public Cliente (String nome , String cpf , String profissao) {
		this.nome = nome;
		this.cpf = cpf;
		this.profissao = profissao;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getProfissao() {
		return profissao;
	}
	
}
