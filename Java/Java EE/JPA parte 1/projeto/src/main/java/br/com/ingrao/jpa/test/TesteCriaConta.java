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
		
		//Todo comando que a gente executa na jpa de mudan�a de estado obrigat�riamente precisa est� dentro de uma transa��o
		
		//Trasa��o � um escopo de tarefa que exeuta de uma forma �nica , executa tudo de uma vez , caso alguma coisa de
		//errado ele da um rollback
		
		em.getTransaction().begin();//come�ando uma transa��o
		
		em.persist(conta);//persistir objeto no baco "insert"
		
		em.getTransaction().commit();//commitando uma transa��o
	}
}
