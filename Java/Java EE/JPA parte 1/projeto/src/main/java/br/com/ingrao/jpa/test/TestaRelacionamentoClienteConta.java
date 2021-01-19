package br.com.ingrao.jpa.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.ingrao.jpa.model.Cliente;
import br.com.ingrao.jpa.model.Conta;

public class TestaRelacionamentoClienteConta {
	public static void main(String[] args) {
		
		
		Conta conta = new Conta();
		conta.setId(1L);
		
		Cliente cliente = new Cliente();
		cliente.setNome("Ingrid");
		cliente.setEndereco("R.Cuiaba 2080");
		cliente.setProfissao("Desenvolvedor");
		cliente.setConta(conta);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
		EntityManager em = emf.createEntityManager();
		
		
		em.getTransaction().begin();
		
		em.persist(cliente);
		em.getTransaction().commit();
		
		em.close();
	}
}
