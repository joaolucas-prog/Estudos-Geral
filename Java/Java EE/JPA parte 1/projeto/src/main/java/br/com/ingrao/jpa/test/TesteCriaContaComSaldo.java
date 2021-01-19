package br.com.ingrao.jpa.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.ingrao.jpa.model.Conta;

public class TesteCriaContaComSaldo {
	
	//Aconteceu uma alteração no nosso modelo agora quero criar uma conta com saldo;
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setAgencia(12345);
		conta.setNumero(54321);
		conta.setTitular("ingrid");
		conta.setSaldo(500.0);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(conta);
		
		em.getTransaction().commit();
		
		emf.close();
	}

}
