package br.com.ingrao.jpa.test;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.ingrao.jpa.model.Conta;
import br.com.ingrao.jpa.model.Movimentacao;
import br.com.ingrao.jpa.model.TipoMovimentacao;

public class TestaRelacionamento {
	public static void main(String[] args) {
		
		
		Conta conta = new Conta();
		conta.setAgencia(123456);
		conta.setNumero(654321);
		conta.setSaldo(300.0);
		conta.setTitular("Joao Lucas");
		
		Movimentacao movimentacao = new Movimentacao();
		movimentacao.setData(LocalDateTime.now());
		movimentacao.setDescricao("churrascaria");
		movimentacao.setValor(new BigDecimal(200.0));
		movimentacao.setTipoMovimentacao(TipoMovimentacao.ENTRADA);
		movimentacao.setConta(conta);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(conta);
		System.out.println(conta.getId());
		em.persist(movimentacao);
		em.getTransaction().commit();
		em.close();
	}
}
