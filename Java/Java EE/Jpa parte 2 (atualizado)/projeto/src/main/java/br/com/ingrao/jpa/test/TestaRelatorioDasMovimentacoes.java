package br.com.ingrao.jpa.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.ingrao.jpa.model.Conta;

public class TestaRelatorioDasMovimentacoes {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
		EntityManager em = emf.createEntityManager();
		
		//String jpql = "select c from Conta c"; deixando assim temos perda de performace pois ele faz uma consulta n+1
		
		String jpql = "select c from Conta c left join fetch c.movimentacoes";
		//solução pro caso n+1 , aqui ele irá fazer uma única consulta trazendo tudo , caso não coloque o left
		//iria trazer apenas as contas que possuem movimentação
		
		TypedQuery<Conta> query = em.createQuery(jpql,Conta.class);
		
		List<Conta> contas = query.getResultList();
		for (Conta conta : contas) {
			System.out.println("Titular: "+ conta.getTitular());
			System.out.println("Agencia: "+ conta.getAgencia());
			System.out.println("Numero: "+conta.getAgencia());
			System.out.println("Movimentacoes: "+ conta.getMovimentacoes());
		}
	}
}
