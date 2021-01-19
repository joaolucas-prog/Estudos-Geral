package br.com.ingrao.hibernate.estudoHibernate;

public class CascadeTypesAndOthers {
	/*
	 * @NotFound(type="") � uma anota��o para dizer ao hibernate o que fazer quando
	 * ele n�o encontrar aquele atributo na tabela Por default ele lan�a uma exce��o
	 * caso isso aconte�a mas voc� pode mudar isso passando o atributo
	 * action=NotFoundAction.IGNORE
	 * 
	 * Hibernate Collections Bag Semantic - List/ArrayList Bag Semantic with ID -
	 * List/ArrayList List Semantic - List/ArrayList Set Semantic - Set Map Semantic
	 * - Map
	 * 
	 * CascadeType vamos supor que voc� est� usando uma rela��o de entidades e na
	 * hora de salvar uma entidade voc� apenas salvou a classe e n�o sua rela��o, ex
	 * uma classe usuario que tem um atributo veiculos e sua rela��o e onetomany e
	 * na hora de salvar voc� apenas salvou a classe usuario sem os veiculos . O
	 * hibernate iria gerar uma exe��o para corrigir isso e fazer com que ele salve
	 * a classe rela��o sem que voc� salve os dados antes � colocar a propriedade
	 * cascade na rela��o @OneToMany(cascade=CascadeType.Persist) obs estudar sobre
	 * os outros CascadeType.All ir� atualizar o objeto e o objeto da rela��o em
	 * todas as opera��es do banco com isso ao inserir o novo usuario mesmo sem
	 * inserir os carro o hibernate entende e insere os carros automaticamente.
	 */

}
