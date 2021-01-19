package br.com.ingrao.hibernate.estudoHibernate;

public class ObjetosImbutidos {
	/*
	 * Podemos colocar objetos embutidos dentro das nossas classes de entidade, porem se esse objeto n�o for outra entidade
	 * ent�o dizemos que ele � um objeto Embedding (embutido) e devemos demarcar com a tag Embeddable no objeto 
	 * e Embedded no atributo que inicializa esse objeto
	 * 
	 * Como configurar os atributos do objeto embutido ? existem algumas maneiras a primeira � 
	 * colocar a anota��o @Colum nos atributos do objeto embutido por�m se eu tiver 2 objetos iguais na minha classe entity
	 * eles n�o podem possuir o mesmo valor default passado no @colum , para isso devemos sobrescrever os atributos
	 * com a anota��o @AtributesOverrides({
	 * 		@AtributeOverride(name="nome_Atributo",colum = @Colum(name="nome_sobrescrito")),
	 * 		...
	 * })
	 * 
	 * Podemos usar objetos embutido como Id das entidades, Para isso usamos a tag @EmbeddedId
	 * */
}
