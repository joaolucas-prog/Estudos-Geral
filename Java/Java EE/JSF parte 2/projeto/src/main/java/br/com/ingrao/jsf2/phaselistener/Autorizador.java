package br.com.ingrao.jsf2.phaselistener;

import javax.faces.application.NavigationHandler;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

import br.com.ingrao.jsf2.bean.Usuario;

public class Autorizador implements PhaseListener{


	private static final long serialVersionUID = -5353556141825233397L;

	@Override
	public void afterPhase(PhaseEvent event) {
		System.out.println("autenticador");
		FacesContext context = event.getFacesContext();
		
		String nomePagina = context.getViewRoot().getViewId(); // recupera o nome da página
		
		if("/login.xhtml".equals(nomePagina)) {
			System.out.println("página login");
			return; //returna pois está acessando a página de login então libera o acesso
		}
		Usuario usuarioLogado = (Usuario)context.getExternalContext().getSessionMap().get("usuarioLogado");//recuperando do http as informações do usuário
		
		if(usuarioLogado !=null ) {
			System.out.println("Usuário logado");
			return; //caso não tenha informação significa que n está logando e returna nulo
		}
		
		//redireciando para login.xhtml
		System.out.println("redirecionando");
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
