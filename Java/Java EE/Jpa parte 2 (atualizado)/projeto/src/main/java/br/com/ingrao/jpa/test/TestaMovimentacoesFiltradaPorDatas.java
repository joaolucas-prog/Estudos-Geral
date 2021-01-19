package br.com.ingrao.jpa.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.ingrao.jpa.model.Movimentacao;
import br.com.ingrao.jpa.model.dao.MovimentacaoDAO;

public class TestaMovimentacoesFiltradaPorDatas {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
		EntityManager em =  emf.createEntityManager();
		
		MovimentacaoDAO dao = new MovimentacaoDAO(em);
		
		List<Movimentacao> list = dao.getMovimentacoesFiltradasPorData(null, 2, null);
		for (Movimentacao movimentacao : list) {
			System.out.println("Descricao -> "+ movimentacao.getDescricao());
			System.out.println("Valor -> "+movimentacao.getValor());
			System.out.println("------------------------------------");
		}
	}
}
