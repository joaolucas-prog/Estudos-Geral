package br.com.ingrao.hibernate.estudoHibernate;

public class MapeandoEntidades {

	/*
	 *@OneToOne
	 *mapeia o atributo passado de rela��o 1 para 1 criando o FK
	 *@JoinColumn(name="nomeIdMapeado)
	 *para modificar o nome do id que ser� gerado.
	 *
	 *@OneToMany
	 *@ManyToOne
	 *
	 *rela��o de 1 para muitos e muitos para 1 
	 *@JoinTable(name="classe_classeReala��o",joinColumns=@JoinColum(name="class_ID"),inverseJoinColumn=@JoinColumn(name="classRela��o_ID")
	 *aqui estamos mudando o nome da table que ser� criada e o nome dos atributos
	 *
	 *n�o esquecer do mapedBy="atribute" para tornar a rela��o biderecional dento da anota��o @OneToMany ou @ManyToOne
	 *
	 *@ManyToMany
	 *mapeia tabela muito para muitos
	 *n�o esquecer do parametro mapedBy se n�o ele ir� criar uma tabela redundante entre as associa��es
	 *Para mudar o nome � a mesma coisa dos outros mapeamentos
	 *
	 * 
	 **/
}
