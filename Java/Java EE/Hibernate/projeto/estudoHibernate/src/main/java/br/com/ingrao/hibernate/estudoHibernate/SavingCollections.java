package br.com.ingrao.hibernate.estudoHibernate;

public class SavingCollections {
	/*
	 * Agora ao inv�s de usar v�rios atributos do mesmo objeto eu quero usar uma cole��o , como que fa�o para o hibernate
	 * identificar na cole��o e atribuir os valores da cole��o a uma determinada entidade?
	 * 
	 * Neste caso devemos utilizar a tag @ElementCollection em cima do atributo da cole��o , com isso o hibernate ir�
	 * criar uma tabela para a cole��o e ir� associar uma chave estrangeira que � o id da entidade que o representa
	 * o nome da tabela � <nomeClassEntidady>_<nomeAtributoCollection>
	 * 
	 * Para modificar isso , devemos colocar a Anotacao @JoinTable(name="Nome_Table")
	 * mas somente isso ainda deixaria o id da tabela criada com o nome da entidade e id para modicar isso devemos ent�o por
	 *  @JoinTable(name="Nome_Table", joinColumns=@Column(name="nomeID"))
	 *  
	 *  outra forma � usando uma anota��o que � exclusiva do hibernate 
	 *  
	 *  para criar um PK pra nossa cole��o usamos uma anotacao do hibernate 
	 *  
	 *  @GenericGeneration(name="hilo-gen",strategy="hilo")//cria um generator generico da estrategia hilo do hibernate
	 *  @CollectionId(columns=@Column(name="nomeTabela),generator ="hilo-gen",type = @Type(type="long"))
	 *  //aqui passamos o nome da tabela que vai ser criada, o tipo de gera��o do id e o tipo do id
	 *  
	 *  Podemos tamb�m escolher o metodo da qual a collection sera�carregada, por default � LAZY , mas podemos mudar o fetch
	 *  passando o atributo fetch=FetchType.EAGER na anota��o @ElementCollection
	 * 	
	 * */

}
