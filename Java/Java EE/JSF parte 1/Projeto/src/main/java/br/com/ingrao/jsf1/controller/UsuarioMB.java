package br.com.ingrao.jsf1.controller;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.com.ingrao.jsf1.bean.Usuario;
import br.com.ingrao.jsf1.dao.ConnectionFactory;
import br.com.ingrao.jsf1.dao.UsuarioDAO;

@Named
@ViewScoped
public class UsuarioMB implements Serializable {

	private static final long serialVersionUID = -652961069061218892L;

	private Usuario usuario = new Usuario();

	public String acessar() {
		if (!existe(usuario)) {
			FacesContext.getCurrentInstance().addMessage("msg",
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Email ou senha incorreto", null));
			return null;
		} else {
			FacesContext context = FacesContext.getCurrentInstance();// pegando o contexto (arvore de componentes)
			
			context.getExternalContext().getFlash().setKeepMessages(true);//mantem a mensagem por 2 request
			context.getExternalContext().getSessionMap().put("usuarioLogado", this.usuario);// colocando no http o
																							// usuario e seus dados
			return "livro?faces-redirect=true";
		}
	}

	public String deslogar() {

		FacesContext context = FacesContext.getCurrentInstance();// pegando o contexto (arvore de componentes)
		context.getExternalContext().getSessionMap().remove("usuarioLogado");// colocando no http o usuario e
																						// seus dados
		return "login?faces-redirect=true";

	}

	public Usuario getUsuario() {
		return usuario;
	}

	private boolean existe(Usuario usuario) {
		return new UsuarioDAO(ConnectionFactory.getConecction()).getUsuario(usuario.getEmail(), usuario.getSenha());
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
