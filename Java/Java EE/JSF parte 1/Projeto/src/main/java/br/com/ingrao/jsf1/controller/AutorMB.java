package br.com.ingrao.jsf1.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.com.ingrao.jsf1.bean.Autor;
import br.com.ingrao.jsf1.dao.AutorDAO;
import br.com.ingrao.jsf1.dao.ConnectionFactory;

@Named
@ViewScoped
public class AutorMB implements Serializable {

	private static final long serialVersionUID = 3312916528268288458L;

	private Autor autor;

	private Long autorId;

	public AutorMB() {
		autor = new Autor();
	}

	public String cadastrar() {
		if (autor.getId() == null) {
			new AutorDAO(ConnectionFactory.getConecction()).save(autor);
		} else {
			new AutorDAO(ConnectionFactory.getConecction()).update(autor);
		}
		autor = new Autor();
		return "livro?faces-redirect=true";
	}

	public void carregaAutorPorId() {
		this.autor = new AutorDAO(ConnectionFactory.getConecction()).getById(autorId);
	}

	public List<Autor> getAutores() {
		return new AutorDAO(ConnectionFactory.getConecction()).findAll();
	}

	public void remove(Autor autor) {
		new AutorDAO(ConnectionFactory.getConecction()).remove(autor);
	}

	public void altera(Autor autor) {
		this.autor = autor;
	}

	public Long getAutorId() {
		return autorId;
	}

	public void setAutorId(Long autorId) {
		this.autorId = autorId;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

}
