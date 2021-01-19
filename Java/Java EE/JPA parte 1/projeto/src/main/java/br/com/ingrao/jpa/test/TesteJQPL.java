package br.com.ingrao.jpa.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.ingrao.jpa.model.Conta;
import br.com.ingrao.jpa.model.Movimentacao;

public class TesteJQPL {
	//JPQL é uma linguagem especifica para manipular o jpa 
	public static void main(String[] args) {
		
		//querys orietada a objetos
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
		EntityManager em = emf.createEntityManager();
		
		Conta conta = new Conta();
		conta.setId(1L);
		
		//String jpql = "select m from Movimentacao m where m.conta = :pConta";
		//a string faz um select em m cuja conta é igual a conta passada como paramentro pConta
		//por convenção os parametros começam com a letra p
		
		//usando order by
		String jpql = "select m from Movimentacao m where m.conta = :pConta order by m.valor desc";
		//Query query = em.createQuery(jpql); gera um warning pois o tipo não é especificado para isso usa-se a TypedQuery
		TypedQuery<Movimentacao> query = em.createQuery(jpql,Movimentacao.class);
		query.setParameter("pConta", conta);//adicionando um parametro a query
		List<Movimentacao> resultList = query.getResultList(); 
		
		
		for (Movimentacao movimentacao : resultList) {
			System.out.println("Descricao: "+ movimentacao.getDescricao());
			System.out.println("Valor: " + movimentacao.getValor());
		}
		
		
	}
}
