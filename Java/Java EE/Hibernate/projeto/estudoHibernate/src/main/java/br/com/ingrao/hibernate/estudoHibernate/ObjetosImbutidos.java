package br.com.ingrao.hibernate.estudoHibernate;

public class ObjetosImbutidos {
	/*
	 * Podemos colocar objetos embutidos dentro das nossas classes de entidade, porem se esse objeto não for outra entidade
	 * então dizemos que ele é um objeto Embedding (embutido) e devemos demarcar com a tag Embeddable no objeto 
	 * e Embedded no atributo que inicializa esse objeto
	 * 
	 * Como configurar os atributos do objeto embutido ? existem algumas maneiras a primeira é 
	 * colocar a anotação @Colum nos atributos do objeto embutido porém se eu tiver 2 objetos iguais na minha classe entity
	 * eles não podem possuir o mesmo valor default passado no @colum , para isso devemos sobrescrever os atributos
	 * com a anotação @AtributesOverrides({
	 * 		@AtributeOverride(name="nome_Atributo",colum = @Colum(name="nome_sobrescrito")),
	 * 		...
	 * })
	 * 
	 * Podemos usar objetos embutido como Id das entidades, Para isso usamos a tag @EmbeddedId
	 * */
}
