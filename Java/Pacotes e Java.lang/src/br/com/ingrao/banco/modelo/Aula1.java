package br.com.ingrao.banco.modelo;

public class Aula1 {

	/*A organização dos pacotes é parecida com a de um site, isso para poder diferenciar um projeto com mesmo nome que outro
	 * porém pertencente a outra empresa. O padrão dos pacotes se da por br.com.NomeEmpresa.NomeProjeto.NomeAgrupamento
	 * 
	 * Modificadores de Acesso/visibilidade
	 * 	public: É visivel de todos os lugare pacotes, classes e heranças
	 * 	protected: É visivel de todas as classes da hierarquia
	 * <<package private>> : não escrever nada significa que a classe é vísivel apenas no pacote
	 * 	private: visível apenas na própria classe	
	 * 
	 * Comentários de documentação */
	
	/**Classe que representa um estudo feito
	 * 
	 * @author joaolucas-prog
	 * @version 0.1
	 * 
	 * esses comentário devem ser colocados em cima da classe, no construtor e nos metodos publicos, para da uma explicação
	 * do documento. Para criar o javadoc no eclipse você deve ia na barra de  ferramentas > Project > Generate javadoc
	 * 
	 * */
	/*
	 * Repassando bibliotecas
	 * Você deve exportar seu código como arquivo jar, com isso você exportará os arquivos compilados e não o código fonte.
	 * 
	 * Usando bibliotecas externas
	 * 
	 * você deve criar uma pasta com nome libs e colocar os arquivos jar dentro dela, e adicionar os arquivos jar no build path
	 * e para criar um executavel você deve indicar qual a classe de entry point (principal) que o java deve olhar para a aplicação.
	 * */
}
