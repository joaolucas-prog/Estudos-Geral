package br.com.ingrao.hibernate.estudoHibernate;

public class MapeandoEntidades {

	/*
	 *@OneToOne
	 *mapeia o atributo passado de relação 1 para 1 criando o FK
	 *@JoinColumn(name="nomeIdMapeado)
	 *para modificar o nome do id que será gerado.
	 *
	 *@OneToMany
	 *@ManyToOne
	 *
	 *relação de 1 para muitos e muitos para 1 
	 *@JoinTable(name="classe_classeRealação",joinColumns=@JoinColum(name="class_ID"),inverseJoinColumn=@JoinColumn(name="classRelação_ID")
	 *aqui estamos mudando o nome da table que será criada e o nome dos atributos
	 *
	 *não esquecer do mapedBy="atribute" para tornar a relação biderecional dento da anotação @OneToMany ou @ManyToOne
	 *
	 *@ManyToMany
	 *mapeia tabela muito para muitos
	 *não esquecer do parametro mapedBy se não ele irá criar uma tabela redundante entre as associações
	 *Para mudar o nome é a mesma coisa dos outros mapeamentos
	 *
	 * 
	 **/
}
