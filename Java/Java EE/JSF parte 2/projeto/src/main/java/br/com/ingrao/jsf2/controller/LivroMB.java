package br.com.ingrao.jsf2.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.xml.bind.ValidationException;

import br.com.ingrao.jsf2.bean.Autor;
import br.com.ingrao.jsf2.bean.Livro;
import br.com.ingrao.jsf2.dao.AutorDAO;
import br.com.ingrao.jsf2.dao.ConnectionFactory;
import br.com.ingrao.jsf2.dao.LivroDAO;

@Named
@ViewScoped
public class LivroMB implements Serializable {

	private static final long serialVersionUID = -6496246119082018520L;
	private Livro livro;

	private LivroDAO dao = new LivroDAO(ConnectionFactory.getConecction());
	private AutorDAO autordao = new AutorDAO(ConnectionFactory.getConecction());
	private Long id;
	
	private List<Livro> livros;

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
			dao.save(livro);
		} else {
			dao.update(livro);
		}
		livro = new Livro();
		livros = dao.findAll();
		
	}
	public void removeAutorDoLivro(Autor autor) {
		livro.removeAutor(autor);
	}

	public void gravarAutor() {
		System.out.println(id);
		livro.getAutores().add(autordao.getById(id));

	}

	public void comecaComDigitoUM(FacesContext fc, UIComponent component, Object value) throws ValidationException {
		String valor = value.toString();
		if (!valor.startsWith("1")) {
			throw new ValidatorException(new FacesMessage("Deveria começar com 1"));
		}
	}

	public void remover(Livro livro) {
		dao.remove(livro);
		livros = dao.findAll();
	}

	public void altera(Livro livro) {
		this.livro = livro;
	}

	public List<Autor> getAutoresDoLivro() {
		return livro.getAutores();
	}

	public List<Livro> getLivros() {
		if(livros == null) {
			System.out.println(livros);
			livros = dao.findAll();
		}
		return livros;
	}
 
	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Autor> getAutores() {
		return autordao.findAll();
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

}
