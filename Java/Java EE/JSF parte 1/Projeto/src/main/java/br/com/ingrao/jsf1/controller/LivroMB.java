package br.com.ingrao.jsf1.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.xml.bind.ValidationException;

import br.com.ingrao.jsf1.bean.Autor;
import br.com.ingrao.jsf1.bean.Livro;
import br.com.ingrao.jsf1.dao.AutorDAO;
import br.com.ingrao.jsf1.dao.ConnectionFactory;
import br.com.ingrao.jsf1.dao.LivroDAO;

@Named
@ViewScoped
public class LivroMB implements Serializable {

	private static final long serialVersionUID = -6496246119082018520L;
	private Livro livro;

	private Long id;

	public LivroMB() {
		livro = new Livro();
	}

	public String formAutor() {
		System.out.println("Chamando formulário");
		return "autor?faces-redirect=true";
	}

	public void gravar() {
		if (livro.getAutores().isEmpty()) {
			FacesContext.getCurrentInstance().addMessage("autor",
					new FacesMessage("Livro deve conter pelo menos um autor"));
			return;
		}
		if (livro.getId() == null) {
			new LivroDAO(ConnectionFactory.getConecction()).save(livro);
		} else {
			new LivroDAO(ConnectionFactory.getConecction()).update(livro);
		}
		livro = new Livro();
	}
	public void removeAutorDoLivro(Autor autor) {
		livro.removeAutor(autor);
	}

	public void gravarAutor() {
		System.out.println(id);
		livro.getAutores().add(new AutorDAO(ConnectionFactory.getConecction()).getById(id));

	}

	public void comecaComDigitoUM(FacesContext fc, UIComponent component, Object value) throws ValidationException {
		String valor = value.toString();
		if (!valor.startsWith("1")) {
			throw new ValidatorException(new FacesMessage("Deveria começar com 1"));
		}
	}

	public void remover(Livro livro) {
		new LivroDAO(ConnectionFactory.getConecction()).remove(livro);
	}

	public void altera(Livro livro) {
		this.livro = livro;
	}

	public List<Autor> getAutoresDoLivro() {
		return livro.getAutores();
	}

	public List<Livro> getLivros() {
		return new LivroDAO(ConnectionFactory.getConecction()).findAll();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Autor> getAutores() {
		return new AutorDAO(ConnectionFactory.getConecction()).findAll();
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

}
