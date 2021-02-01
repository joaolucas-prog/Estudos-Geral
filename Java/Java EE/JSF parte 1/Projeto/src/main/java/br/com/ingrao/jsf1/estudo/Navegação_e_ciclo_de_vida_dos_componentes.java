package br.com.ingrao.jsf1.estudo;

public class Navegação_e_ciclo_de_vida_dos_componentes {
	/*
	 * Para entendermos melhor os erros que podem surgir durante o desenvolvimento de jsf devemos entender bem o seu ciclo de vida
	 * 
	 * podemos habilitar essa visualização entre cada fase abrindo o arquivo de configuração do jsf e adicionando uma tag
	 * <lifecycle>
		<phase-listener>sua.classe.phase.listener</phase-listener>
		</lifecycle>
		
		Na classe PhaseListener você deve implementar a interface PhaseListener e implementar os metodos necessário
		
		o metodo beforePhase é chamado antes de uma fase, afterPhase depois de uma fase e phase id qual fase o listener atende
		
		Fases do ciclo de vida
		
		1-Restore view:
			ao receber uma requisição http do tipo get o controlador inicia o ciclo de vida da tela, isso significa que ele
			leu o arquivo xhtml e instanciou todos os componentes da página.
			caso seja uma requisição do tipo post o controlador apenas recupera a arvore de componentes.
		
		2-Apply request values:
			após a recuperação da tela os componentes recebem o valor digitado pelo usuário que vem da requisição
			
		3-Process validation:
			acontece a conversão e validação dos componentes caso acontece algum erro ele pulará para a fase 6 
		
		4-Update Model Value
			aqui o modelo será atualizado com os valores convertidos na fase4, tudo que definimos no xhtml com EL
			nos componentes de input é atualizado
		
		5-Invoke Application
			Agora que o modelo foi atualizado o managed bean pode executar o comando via EL esse comando é o próprio do
			MB e opera sobre os dados convertidos
		
		6-Render Response
			devolve uma resposta para o usuário
			
		 immediate="true" nos commandLink (Talvez em outros componentes) pula o ciclo de vida do jsf para a fase 6 
		 devolvendo uma resposta ao usuário.
	 * */
}
