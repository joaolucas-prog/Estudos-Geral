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
		// Quando eu uso o m�todo find vai buscar o cara no banco e vai devolver o objeto do tipo passado no caso Conta,
		//por�m ele salva a refer�ncia aquele objeto ,ou seja , ele reconhece aquele objeto ficando no estado de managed
		//e quando voc� fizer qualquer altera��o nessa entidady ela faz a altera��o automaticamente j� que ela conhece os 
		//dados originais isso funciona em objetos que foi usando o metodo persist e alterado ap�s
		
		
		contajoao.setSaldo(20.0);
		
		em.getTransaction().commit();
		
		em.close();
		
		//Datached
		//Agora pense em uma situa��o em que o EntityManager foi fechado e que voc� realizou alguma altera��o ap�s o fechamento
		//nesse caso o Objeto se torna Datached e o jpa n�o faz as altera��es automaticamente no sistema e o objeto fica no
		//estado em que ela se encontrava antes de fechar, caso voc� fa�a alguma altera��o e queira voltar para o estado
		//Managed ter� que criar outra EntityManager e usar o metodo .merge(contaDatached); assim ele volta a alterar automaticamente
		//Lembre-se que precisa sempre est� em transa��o
		
		
		//Transient
		//Objetos que n�o tem vinculo com a jpa mas s�o candidatas a se tornar Managed
		//ao usar o persist o estado do Objeto muda
		//Transient -> Managed
		
		//metodo .remove(entity) remove o objeto do contexto do jpa , ou seja remove do banco,
		//Managed -> Removed
		emf.close();
	}
}
