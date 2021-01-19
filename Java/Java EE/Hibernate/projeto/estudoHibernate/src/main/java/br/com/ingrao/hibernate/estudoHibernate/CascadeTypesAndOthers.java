package br.com.ingrao.hibernate.estudoHibernate;

public class CascadeTypesAndOthers {
	/*
	 * @NotFound(type="") é uma anotação para dizer ao hibernate o que fazer quando
	 * ele não encontrar aquele atributo na tabela Por default ele lança uma exceção
	 * caso isso aconteça mas você pode mudar isso passando o atributo
	 * action=NotFoundAction.IGNORE
	 * 
	 * Hibernate Collections Bag Semantic - List/ArrayList Bag Semantic with ID -
	 * List/ArrayList List Semantic - List/ArrayList Set Semantic - Set Map Semantic
	 * - Map
	 * 
	 * CascadeType vamos supor que você está usando uma relação de entidades e na
	 * hora de salvar uma entidade você apenas salvou a classe e não sua relação, ex
	 * uma classe usuario que tem um atributo veiculos e sua relação e onetomany e
	 * na hora de salvar você apenas salvou a classe usuario sem os veiculos . O
	 * hibernate iria gerar uma exeção para corrigir isso e fazer com que ele salve
	 * a classe relação sem que você salve os dados antes é colocar a propriedade
	 * cascade na relação @OneToMany(cascade=CascadeType.Persist) obs estudar sobre
	 * os outros CascadeType.All irá atualizar o objeto e o objeto da relação em
	 * todas as operações do banco com isso ao inserir o novo usuario mesmo sem
	 * inserir os carro o hibernate entende e insere os carros automaticamente.
	 */

}
