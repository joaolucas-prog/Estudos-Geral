package br.com.ingrao.jsf1.dao;

import java.io.File;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConnectionFactory {
	private static SessionFactory sessionFactory;

	public static SessionFactory getConecction() {
		if (sessionFactory == null) {
			return new Configuration().configure(new File(
					"/Users/joao_/Desktop/Estudos/Estudos-Geral/Java/Java EE/JSF parte 1/Projeto/src/main/resources/META-INF/cfg.xml"))
					.buildSessionFactory();
		}
		return sessionFactory;
		
	}

}
