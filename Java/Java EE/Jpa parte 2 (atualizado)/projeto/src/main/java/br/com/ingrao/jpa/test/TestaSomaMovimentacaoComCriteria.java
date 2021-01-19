package br.com.ingrao.jpa.test;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Root;

import br.com.ingrao.jpa.model.Movimentacao;

public class TestaSomaMovimentacaoComCriteria {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
		EntityManager em = emf.createEntityManager();
		
		//Objeto especialista em criar o criteria query
		CriteriaBuilder builder = em.getCriteriaBuilder();
		
		//passando oObjeto que representa o retorno da query como parametro
		CriteriaQuery<BigDecimal> query = builder.createQuery(BigDecimal.class);
		
		//Raiz da query
		Root<Movimentacao> root = query.from(Movimentacao.class);
		
		//uma expressao  sum(m.valor)
		Expression<BigDecimal> sum = builder.sum(root.<BigDecimal>get("valor"));
		
		//fazendo um select com a expressao
		query.select(sum);
		
		//aqui volta a ser normal 
		TypedQuery<BigDecimal> typedQuery = em.createQuery(query);
		
		
		
		System.out.println("A soma das movimentações é: " + typedQuery.getSingleResult());
	}
}
