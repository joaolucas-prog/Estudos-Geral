package br.com.ingrao.hibernate.estudoHibernate;

import java.io.File;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import br.com.ingrao.hibernate.model.bean.Empresa;
import br.com.ingrao.hibernate.model.bean.Endereco;

public class Introdução {
	//Antes de tudo voc� deve configurar o arquivo xml
	/*
	 *EXEMPLO
	 * 
	 * <?xml version="1.0" encoding="UTF-8"?>
	 *
	<!DOCTYPE hibernate-configuration PUBLIC
	 "-//Hibernate/Hibernate Configuration DTD 3.0//EN" 
	 "http://www.hibernate.org/dtd/hibernate-configuration-3.0.dtd">
	<hibernate-configuration>
		<session-factory>
			<property name="hibernate.dialect">org.hibernate.dialect.PostgreSQL9Dialect</property>
			<property name="hibernate.connection.driver_class">org.postgresql.Driver</property>
			<property name="hibernate.connection.url">jdbc:postgresql://localhost:5432/estudo-jpa" </property>
			<property name="hibernate.connection.username">postgres</property>
			<property name="hibernate.connection.password">Admin123</property>

			<property name="hibernate.show_sql">true</property>
			<property name="hibernate.format_sql">true</property>
			<property name="hibernate.hbm2ddl.auto">update</property>
		</session-factory>
	</hibernate-configuration>
	
	Em seguida crie uma clase de entidade em que o hibernate ir� persistir seus dados em um banco
	*/
	public static void main(String[] args) {
		//Criando uma fabrica de cone��o e uma sessao 
		SessionFactory sessionFactory = new Configuration()
				.configure(new File("src/main/resources/META-INF/hibernate.cfg.xml"))
				.buildSessionFactory(); 
		//equivalente ao EntityManagerFactory porem mais verboso.
		Session session = sessionFactory.openSession();//equivalente ao EntityManager
		
		Empresa empresa = new Empresa();
		empresa.setNome("Google");
		empresa.setCnpj("1234");
		Endereco endereco = new Endereco();
		endereco.setBairro("Nome do Bairro");
		endereco.setCidade("Nome da cidade");
		endereco.setEstado("Nome do estado");
		endereco.setRua("Nome da rua");
		empresa.setEndereco(endereco);
		
		session.beginTransaction();//em.getTransaction.begin() inclusive ele possui o mesmo metodo
		session.save(empresa);//insere no banco o objeto passado como parametro (acho que equivalente ao session.persist
		session.getTransaction().commit();
		
	}
}
