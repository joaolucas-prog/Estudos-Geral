package br.com.ingrao.jsf1.phaselistener;

import javax.faces.application.NavigationHandler;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

import br.com.ingrao.jsf1.bean.Usuario;

public class Autorizador implements PhaseListener{


	private static final long serialVersionUID = -5353556141825233397L;

	@Override
	public void afterPhase(PhaseEvent event) {
		
		FacesContext context = event.getFacesContext();
		
		String nomePagina = context.getViewRoot().getViewId(); // recupera o nome da página
		
		if("/login.xhtml".equals(nomePagina)) {
			return; //returna pois está acessando a página de login então libera o acesso
		}
		Usuario usuarioLogado = (Usuario)context.getExternalContext().getSessionMap().get("usuarioLogado");//recuperando do http as informações do usuário
		
		if(usuarioLogado !=null ) {
			return; //caso não tenha informação significa que n está logando e returna nulo
		}
		
		//redireciando para login.xhtml
		
		NavigationHandler handler = context.getApplication().getNavigationHandler(); //pegando a navegação do contexto
		
		//recebe 3 argumentos , o contexto , uma string do faces-confing(mas ninguem usa deixa nulo) e qual página quer redirecionar
		handler.handleNavigation(context, null, "/login?faces-redirect=true");//redirecionando a página
		
		context.renderResponse();// atualiza o response, ou seja aplica as alterações e redireciona
	}

	@Override
	public void beforePhase(PhaseEvent event) {
	}

	@Override
	public PhaseId getPhaseId() {
		return PhaseId.RESTORE_VIEW;
	}

}
