package br.com.ingrao.jpa.test;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.ingrao.jpa.model.dao.MovimentacaoDAO;

public class TestaSomaDasMovimentacoes {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
		EntityManager em = emf.createEntityManager();
//		
//		String jpql = "select sum(m.valor) from Movimentacao m";
//		String jpql2 = "select avg(m.valor) from Movimentacao m";
//		//por padr�o o retorno da funcao avg � Double
//		TypedQuery<BigDecimal> query = em.createQuery(jpql,BigDecimal.class);
		
		BigDecimal somaMovimentacoes = new MovimentacaoDAO(em).getSomaDasMovimentacoes();
			
		System.out.println("A soma das movimenta��es �: "+ somaMovimentacoes);
	}
}
