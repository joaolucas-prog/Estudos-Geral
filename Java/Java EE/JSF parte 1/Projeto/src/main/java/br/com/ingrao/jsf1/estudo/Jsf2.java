package br.com.ingrao.jsf1.estudo;

public class Jsf2 {
	/*O jsf aceita links com parametros para isso devemos colocar o componente
	 * 
	 * exemplo de link http://localhost:8080/seu-projeto/autor.xhtml?autorId=3
	 * <f:metadata>
	 * <f:viewParam	name="autorId" value="#{bean.autor.id}/> aqui pega o valor passado e joga no modelo 
	 * <f:viewAction="#{bean.carregarAutorPeloID}" if="#{param.autorID != null}"/> realiza a ação se o parametro não for nulo
	 * </f:metadata
	 * 
	 * alterando valores do tipos do atributo
	 * 
	 * <f:passThroughAttribute name="type" value="email"/> altera o valor do atributo passado pelo name pelo valor passado em value
	 * 
	 * 
	 * Criando um autorizador de páginas
	 * 
	 * você deve criar uma classe que implementará PhaseListener e adicionar nas configurações do jsf (faces-config.xml)
	 *  com a classe criada você deve escolher em qual fase  do ciclo de vida o autorizador será utilizado
	 *  no meu caso escolhi na 1 fase e depois da fase.
	 */
}
