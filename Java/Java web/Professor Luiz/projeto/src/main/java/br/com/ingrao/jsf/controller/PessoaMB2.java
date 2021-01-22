package br.com.ingrao.jsf.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.ingrao.jsf.model.Pessoa;
/*Criando um bean CDI*/
@Named("bean2")
@SessionScoped
public class PessoaMB2 implements Serializable {

	private static final long serialVersionUID = -953464792384200775L;
	
	//atributo a qual será injetada os valores do xhtml
	@Inject
	private Pessoa pessoa;

	private List<Pessoa> pessoas = new ArrayList<>();

	public String adicionar() {
		pessoas.add(pessoa);
		return null;
	}

	public void limpar() {
		pessoa = new Pessoa();
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
	
	
}
