package br.com.ingrao.jsf1.estudo;

public class Ajax {

	/*
	 * Ajax melhora os componentes da interface , ela manda uma requisição por uma
	 * interface sem precisar atualizar a página e atualiza apenas a parte da
	 * interface em questão
	 * 
	 * componente ajax <f:ajax execute="" render=""> 
	 * paramentros: 
	 * execute 
		 * definimos o id dos componentes que queremos enviar na requisição podemos
		 * passar também atalhos como :
		 * 
		 * @all
		 * 
		 * Todos os componentes da página.
		 * 
		 * @none
		 * 
		 * Nenhum componente na página; Este é o valor default.
		 * 
		 * @this
		 * 
		 * Elemento que acionou a requisição.
		 * 
		 * @form
		 * 
		 * Todos os componentes dentro do form.
		 * 
		 * IDs
		 * 
		 * Identificadores dos componentes separados por espaços.
		 * 
		 * EL expression
		 * 
		 * Expressão EL que determina uma coleção de string. 
	 * 		
	 * 	   ID Absoluto
	 * 	   :nomeId busca o id fora dos componentes em que o ajax se encontra
	 * 
	 * render  
	 	* id dos componentes que serão atualizados 
	 * 
	 * event 
	 	* executa uma requisição sempre que a ação passada neste parametro for feita
	 * 
	 */
}
