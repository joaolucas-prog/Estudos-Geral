package br.com.ingrao.jpa.test;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteCriaTabela {
	public static void main(String[] args) {
		
		//EntityManagerFactory fabrica de criação do Entity manager
		//Persistence objeto que representa o arquivo de configuração persistence.xml
		EntityManagerFactory  emf = Persistence.createEntityManagerFactory("contas") ;
		emf.close();
	}
}
