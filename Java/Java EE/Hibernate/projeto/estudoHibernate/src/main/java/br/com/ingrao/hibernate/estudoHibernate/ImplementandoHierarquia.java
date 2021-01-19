package br.com.ingrao.hibernate.estudoHibernate;

public class ImplementandoHierarquia {
	/*
	 * Podemos implementar as entidades com hierarquia , digamos que temos uma entidade chamada veiculo e ela possui
	 * duas entidades filhas chamadas duasrodas e quatrorodas, o hibernate consegue mapear as classes filhas listadas
	 * apenas precisando escrever entity em cima das classes e das classes filhas extender a classe pai , porém pore default
	 * o hibenate cria uma tabela unica para representar todas as hierarquias , sendo assim criando novas colunas
	 * com os valores de parametros de cada entidade filha jutanmente com uma coluna chamada dtype em que ela salva
	 * qual o tipo do objeto persistido se é veiculo , duasrodas ou quatrorodas.
	 * ---------------------------------------------------------------------------------------------------------------
	 * Single Table Strategy
	 * por padrão essa é a estrategia adotada no hibernate quando usamos hierarquia , nela todas as classes são salvas
	 * em uma única tabela em que são adicionadas colunas extras que representam os atributos das classes filhas
	 * 
	 * Então por default  a estratégia da hierarquia é SingleTable
	 * @Inheritance(strategy=InheritanceType.SINGLE_TABLE
	 * 
	 * 
	 * Podemos mudar o nome da coluna Dtype para uma de nossa escolha e mudar o tipo do valor
	 * 
	 * @DescriminatorColumn(name="nome_da_coluna_que_mostra_o_tipo_da_classe",decriominatorType=DiscriminatorType.STRING
	 * 
	 * Além disse podemos por a anotação @DiscriminatorValue("valor") nas classes filhas para dizer qual nome irá
	 * aparecer na coluna dos tipos de classes
	 * 
	 * -----------------------------------------------------------------------------------------------------------------
	 * 
	 * Table Per Class
	 *  nessa estrategia o hibernate cria uma classe por hierarquia , então não precisamos escrever a anotação 
	 *  @discriminatorColumn apenas @Inheritance(strategy=InheritanceType.TABLE_PER_CLASS) por consequencia
	 *  as classes filhas também nao precisam da @DescriminatorValue
	 *  
	 *  Joined Strategy
	 *  
	 *  nessa estratégia ele irá criar um banco em que irá guardar todos os atributos da classe pai em uma unica tabela junto com
	 *  as filhas, porem cria tabelas separadas para cada entidade filha com seus atributos especificos e associam pelo seu id
	 *  
	 *  
	 * */
}
