package br.com.ingrao.jpa.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.ingrao.jpa.model.Conta;

public class AlterandoSaldoJoao {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
		EntityManager em = emf.createEntityManager();
		
		Conta contajoao = em.find(Conta.class, 1L);
		
		em.getTransaction().begin();
		
		//Entendendo oque acontece
		// Quando eu uso o método find vai buscar o cara no banco e vai devolver o objeto do tipo passado no caso Conta,
		//porém ele salva a referência aquele objeto ,ou seja , ele reconhece aquele objeto ficando no estado de managed
		//e quando você fizer qualquer alteração nessa entidady ela faz a alteração automaticamente já que ela conhece os 
		//dados originais isso funciona em objetos que foi usando o metodo persist e alterado após
		
		
		contajoao.setSaldo(20.0);
		
		em.getTransaction().commit();
		
		em.close();
		
		//Datached
		//Agora pense em uma situação em que o EntityManager foi fechado e que você realizou alguma alteração após o fechamento
		//nesse caso o Objeto se torna Datached e o jpa não faz as alterações automaticamente no sistema e o objeto fica no
		//estado em que ela se encontrava antes de fechar, caso você faça alguma alteração e queira voltar para o estado
		//Managed terá que criar outra EntityManager e usar o metodo .merge(contaDatached); assim ele volta a alterar automaticamente
		//Lembre-se que precisa sempre está em transação
		
		
		//Transient
		//Objetos que não tem vinculo com a jpa mas são candidatas a se tornar Managed
		//ao usar o persist o estado do Objeto muda
		//Transient -> Managed
		
		//metodo .remove(entity) remove o objeto do contexto do jpa , ou seja remove do banco,
		//Managed -> Removed
		emf.close();
	}
}
