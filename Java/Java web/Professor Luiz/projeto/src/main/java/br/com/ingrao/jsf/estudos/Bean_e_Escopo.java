package br.com.ingrao.jsf.estudos;

public class Bean_e_Escopo {
	/*
	 * Um objeto bean CDI é um objeto que possui algumas anotações 
	 * @Named
	 * @RequestScoped
	 * que implementa a interface Serializeble
	 * e possui construtor vazio com getters e setters de seus atributos
	 * para injetar um parametro do objeto bean precisamos demarcá-lo com @Inject
	 * 
	 * Escopos
	 * 
	 * @DependentScoped
	 * Escopo padrão que é definido por quem o injeta.
	 * Quando não anotamos, automaticamente nosso escopo é tipo depedent
	 * 
	 * @RequestScoped
	 * Tempo de vida dura apenas na requisição.
	 * É criado quando ocorre uma determinada requisição HTTP e destruido quando a resposta é dada ao cliente.
	 * 
	 * @SessionScoped
	 * Enquanto durar a sessão do usuário.
	 * Um bom exemplo de um escopo session é um site de compras.
	 * 
	 * @ApplicationScoped
	 * Compartilhado entre os usuários do sistema.
	 * Permanece enquanto a aplicação estiver rodando.
	 * 
	 * @ConversationScoped
	 * Existe durante o tempo de conversação.
	 * Definido pelo programador através de métodos begin() e end() de um objeto do tipo Convesation.
	 * */
}
