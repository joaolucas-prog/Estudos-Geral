package br.com.ingrao.hibernate.estudoHibernate;

import java.io.File;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import br.com.ingrao.hibernate.model.bean.Empresa;

public class MetodoGET {
	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration()
				.configure(new File("src/main/resources/META-INF/hibernate.cfg.xml")).buildSessionFactory();
		// equivalente ao EntityManagerFactory porem mais verboso.
		Session session = sessionFactory.openSession();// equivalente ao EntityManager

		Empresa empresa = new Empresa();
		empresa.setNome("Google");
		empresa.setCnpj("1234");

		session.beginTransaction();
		session.get(Empresa.class,1L);//equivalente ao find ele busca o dado do objeto passado com seu PK
								
		session.getTransaction().commit();
	}

}
