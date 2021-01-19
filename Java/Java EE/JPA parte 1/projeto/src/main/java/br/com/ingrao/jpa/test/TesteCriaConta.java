package br.com.ingrao.jpa.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.ingrao.jpa.model.Conta;

public class TesteCriaConta {
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.setAgencia(1234);
		conta.setNumero(4321);
		conta.setTitular("joao");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
		//EntityManager objeto principal da jpa
		
		EntityManager em = emf.createEntityManager();
		
		//Todo comando que a gente executa na jpa de mudança de estado obrigatóriamente precisa está dentro de uma transação
		
		//Trasação é um escopo de tarefa que exeuta de uma forma única , executa tudo de uma vez , caso alguma coisa de
		//errado ele da um rollback
		
		em.getTransaction().begin();//começando uma transação
		
		em.persist(conta);//persistir objeto no baco "insert"
		
		em.getTransaction().commit();//commitando uma transação
	}
}
