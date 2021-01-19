package br.com.ingrao.hibernate.estudoHibernate;

public class Annotation {
	/*
	 * Annotation no hibernate
	 * 
	 * anotação para criar uma entidade
	 * @Entity (name = "NOME_ENTITY")
	 * propriedades :
	 * name = "NOME_ENTITY" quando o hibernate criar um banco ele usará o nome passado na propriedade como o nome da tabela
	 * 
	 * @Table() permite que você especifique os detalhes da tabela que será usada para persistir a entidade no banco de dados.
	 * propriedades:
	 * name = "NOME_TABLE" coloca o nome da tabela como o valor passado no name
	 * 
	 * 
	 * anotação para configurar uma coluna do banco (atributo da classe)
	 * @Colum(name = "COLUM_NAME",lenght = 20 , nullable=true , unique= false)
	 * propriedades:
	 * name = "COLUM_NAME" coloca o nome da coluna com o valor passado na propriedade
	 * lenght =  tamanho da coluna
	 * nullable= se a coluna pode ser nula
	 * unique = se o valor da coluna é unica
	 * 
	 * @GeneratedValue gerar valores automaticamente dada a estrategia passada , é bom para criar os ID
	 * por default ele usa o valor AUTO onde o hibernate decide qual a melhor estrategia para gerar o PK e nunca são reciclados
	 * IDENTITY valor de autoicremente por hierarquia e os valores são unicos por tipo de hierarquia
	 * SEQUENCE A anotação é usada para definir uma sequência e aceita um nome, um valor inicial (o padrão é 1) e um tamanho 
	 * de alocação (o padrão é 50) e poder ser usada em outras classes
	 * TABLE são quase idênticas.SEQUENCEUma pequena diferença está relacionada ao atributo de valor inicial. Enquanto a estratégia
	 *  mantém o próximo número de sequência a ser usado, a estratégia TABLE mantém o último valor que foi usado. 
	 *  A implicação para o atributo é que se você quiser que os números de sequência comecem na estratégia TABLE , devem ser
	 *   especificados na anotação.SEQUENCEinitialValue1initialValue=0@SequenceGenerator
	 * 
	 * @Transient os atributos marcados como transient não serão persistidos
	 * 
	 * @Basic(opcional=false , fetch=FechType.LAZY) é um tipo básico e o Hibernate deve usar o mapeamento padrão para sua persistência.
	 * opcional = true/false permite que a propriedade assuma valores nulos
	 * fetch = FetchType.LAZY/EAGER se o campo marcado deve ser carregado quando necessario(LAZY) ou precarregado(EAGER)
	 * 
	 * @Temporal(TemporalType) se a data irá ser marcada com qual tipo , só data , data e hora , data hora e minuto ..
	 * DATA = apenas data
	 * TIMESTAMP valor default guarda até os milisegundos
	 * 
	 * @Lob demarca uma string muito longa ou um bytestream muito grande , o hibernate detecta automaticamente
	 * 
	 * OBS: as anotações podem ser feitas tanto na declaração do atributo ou pelo seu getter , porém no getter
	 * o valor que será inserido no banco será o que ele retornar do getter
	 * 
	 * */
}
