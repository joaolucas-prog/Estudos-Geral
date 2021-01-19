package br.com.ingrao.jpa.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.ingrao.jpa.model.Conta;
import br.com.ingrao.jpa.model.Movimentacao;

public class TestaMovimentacaoConta {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
		EntityManager em =  emf.createEntityManager();
		
		Movimentacao movimentacao = em.find(Movimentacao.class, 1L);
		Conta conta =  movimentacao.getConta();
		
		int quantidadeDeMovimentacoes = conta.getMovimentacoes().size();
		System.out.println("Titular: " +conta.getTitular());
		System.out.println("Quantidade de movimentações: " + quantidadeDeMovimentacoes);
	}
}
