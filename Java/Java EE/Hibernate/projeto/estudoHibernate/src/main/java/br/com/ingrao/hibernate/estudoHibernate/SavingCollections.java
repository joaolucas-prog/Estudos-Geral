package br.com.ingrao.hibernate.estudoHibernate;

public class SavingCollections {
	/*
	 * Agora ao invés de usar vários atributos do mesmo objeto eu quero usar uma coleção , como que faço para o hibernate
	 * identificar na coleção e atribuir os valores da coleção a uma determinada entidade?
	 * 
	 * Neste caso devemos utilizar a tag @ElementCollection em cima do atributo da coleção , com isso o hibernate irá
	 * criar uma tabela para a coleção e irá associar uma chave estrangeira que é o id da entidade que o representa
	 * o nome da tabela é <nomeClassEntidady>_<nomeAtributoCollection>
	 * 
	 * Para modificar isso , devemos colocar a Anotacao @JoinTable(name="Nome_Table")
	 * mas somente isso ainda deixaria o id da tabela criada com o nome da entidade e id para modicar isso devemos então por
	 *  @JoinTable(name="Nome_Table", joinColumns=@Column(name="nomeID"))
	 *  
	 *  outra forma é usando uma anotação que é exclusiva do hibernate 
	 *  
	 *  para criar um PK pra nossa coleção usamos uma anotacao do hibernate 
	 *  
	 *  @GenericGeneration(name="hilo-gen",strategy="hilo")//cria um generator generico da estrategia hilo do hibernate
	 *  @CollectionId(columns=@Column(name="nomeTabela),generator ="hilo-gen",type = @Type(type="long"))
	 *  //aqui passamos o nome da tabela que vai ser criada, o tipo de geração do id e o tipo do id
	 *  
	 *  Podemos também escolher o metodo da qual a collection sera´carregada, por default é LAZY , mas podemos mudar o fetch
	 *  passando o atributo fetch=FetchType.EAGER na anotação @ElementCollection
	 * 	
	 * */

}
