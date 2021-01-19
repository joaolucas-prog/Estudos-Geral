package br.com.ingrao.hibernate.estudoHibernate;

public class ImplementandoHierarquia {
	/*
	 * Podemos implementar as entidades com hierarquia , digamos que temos uma entidade chamada veiculo e ela possui
	 * duas entidades filhas chamadas duasrodas e quatrorodas, o hibernate consegue mapear as classes filhas listadas
	 * apenas precisando escrever entity em cima das classes e das classes filhas extender a classe pai , por�m pore default
	 * o hibenate cria uma tabela unica para representar todas as hierarquias , sendo assim criando novas colunas
	 * com os valores de parametros de cada entidade filha jutanmente com uma coluna chamada dtype em que ela salva
	 * qual o tipo do objeto persistido se � veiculo , duasrodas ou quatrorodas.
	 * ---------------------------------------------------------------------------------------------------------------
	 * Single Table Strategy
	 * por padr�o essa � a estrategia adotada no hibernate quando usamos hierarquia , nela todas as classes s�o salvas
	 * em uma �nica tabela em que s�o adicionadas colunas extras que representam os atributos das classes filhas
	 * 
	 * Ent�o por default  a estrat�gia da hierarquia � SingleTable
	 * @Inheritance(strategy=InheritanceType.SINGLE_TABLE
	 * 
	 * 
	 * Podemos mudar o nome da coluna Dtype para uma de nossa escolha e mudar o tipo do valor
	 * 
	 * @DescriminatorColumn(name="nome_da_coluna_que_mostra_o_tipo_da_classe",decriominatorType=DiscriminatorType.STRING
	 * 
	 * Al�m disse podemos por a anota��o @DiscriminatorValue("valor") nas classes filhas para dizer qual nome ir�
	 * aparecer na coluna dos tipos de classes
	 * 
	 * -----------------------------------------------------------------------------------------------------------------
	 * 
	 * Table Per Class
	 *  nessa estrategia o hibernate cria uma classe por hierarquia , ent�o n�o precisamos escrever a anota��o 
	 *  @discriminatorColumn apenas @Inheritance(strategy=InheritanceType.TABLE_PER_CLASS) por consequencia
	 *  as classes filhas tamb�m nao precisam da @DescriminatorValue
	 *  
	 *  Joined Strategy
	 *  
	 *  nessa estrat�gia ele ir� criar um banco em que ir� guardar todos os atributos da classe pai em uma unica tabela junto com
	 *  as filhas, porem cria tabelas separadas para cada entidade filha com seus atributos especificos e associam pelo seu id
	 *  
	 *  
	 * */
}
