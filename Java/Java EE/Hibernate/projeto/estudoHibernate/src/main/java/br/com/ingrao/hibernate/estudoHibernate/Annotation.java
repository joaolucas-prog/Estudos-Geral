package br.com.ingrao.hibernate.estudoHibernate;

public class Annotation {
	/*
	 * Annotation no hibernate
	 * 
	 * anota��o para criar uma entidade
	 * @Entity (name = "NOME_ENTITY")
	 * propriedades :
	 * name = "NOME_ENTITY" quando o hibernate criar um banco ele usar� o nome passado na propriedade como o nome da tabela
	 * 
	 * @Table() permite que voc� especifique os detalhes da tabela que ser� usada para persistir a entidade no banco de dados.
	 * propriedades:
	 * name = "NOME_TABLE" coloca o nome da tabela como o valor passado no name
	 * 
	 * 
	 * anota��o para configurar uma coluna do banco (atributo da classe)
	 * @Colum(name = "COLUM_NAME",lenght = 20 , nullable=true , unique= false)
	 * propriedades:
	 * name = "COLUM_NAME" coloca o nome da coluna com o valor passado na propriedade
	 * lenght =  tamanho da coluna
	 * nullable= se a coluna pode ser nula
	 * unique = se o valor da coluna � unica
	 * 
	 * @GeneratedValue gerar valores automaticamente dada a estrategia passada , � bom para criar os ID
	 * por default ele usa o valor AUTO onde o hibernate decide qual a melhor estrategia para gerar o PK e nunca s�o reciclados
	 * IDENTITY valor de autoicremente por hierarquia e os valores s�o unicos por tipo de hierarquia
	 * SEQUENCE A anota��o � usada para definir uma sequ�ncia e aceita um nome, um valor inicial (o padr�o � 1) e um tamanho 
	 * de aloca��o (o padr�o � 50) e poder ser usada em outras classes
	 * TABLE s�o quase id�nticas.SEQUENCEUma pequena diferen�a est� relacionada ao atributo de valor inicial. Enquanto a estrat�gia
	 *  mant�m o pr�ximo n�mero de sequ�ncia a ser usado, a estrat�gia TABLE mant�m o �ltimo valor que foi usado. 
	 *  A implica��o para o atributo � que se voc� quiser que os n�meros de sequ�ncia comecem na estrat�gia TABLE , devem ser
	 *   especificados na anota��o.SEQUENCEinitialValue1initialValue=0@SequenceGenerator
	 * 
	 * @Transient os atributos marcados como transient n�o ser�o persistidos
	 * 
	 * @Basic(opcional=false , fetch=FechType.LAZY) � um tipo b�sico e o Hibernate deve usar o mapeamento padr�o para sua persist�ncia.
	 * opcional = true/false permite que a propriedade assuma valores nulos
	 * fetch = FetchType.LAZY/EAGER se o campo marcado deve ser carregado quando necessario(LAZY) ou precarregado(EAGER)
	 * 
	 * @Temporal(TemporalType) se a data ir� ser marcada com qual tipo , s� data , data e hora , data hora e minuto ..
	 * DATA = apenas data
	 * TIMESTAMP valor default guarda at� os milisegundos
	 * 
	 * @Lob demarca uma string muito longa ou um bytestream muito grande , o hibernate detecta automaticamente
	 * 
	 * OBS: as anota��es podem ser feitas tanto na declara��o do atributo ou pelo seu getter , por�m no getter
	 * o valor que ser� inserido no banco ser� o que ele retornar do getter
	 * 
	 * */
}
