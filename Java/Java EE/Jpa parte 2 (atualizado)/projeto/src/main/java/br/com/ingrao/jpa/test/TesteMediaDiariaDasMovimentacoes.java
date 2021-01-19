package br.com.ingrao.jpa.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.ingrao.jpa.model.MediaComData;
import br.com.ingrao.jpa.model.dao.MovimentacaoDAO;

public class TesteMediaDiariaDasMovimentacoes {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
		EntityManager em = emf.createEntityManager();
//		
//		String jpql = "select new br.com.ingrao.jpa.model.MediaComData("
//				+ "avg(m.valor),day(m.data),month(m.data),year(m.data))"
//				+ " from Movimentacao m  group by day(m.data), month(m.data), year(m.data)";
//		//instanciando um objeto pelo select
//		
//		TypedQuery<MediaComData> query = em.createQuery(jpql,MediaComData.class);
//		//como o select tras 2 tipos de resultados ,não podemos usar a query tipada
//		//Para isso instanciamos um objeto com os valores do resultado e poderemos voltar a utilizar o typedquery
//
//		Utilizando o padrãoDAO tranferi o código para camada DAO
		
		List<MediaComData> somaMovimentacoes = new MovimentacaoDAO(em).getMediaComData();
		//O resultado das querys sao todos do tipo Object
		for (MediaComData resultado : somaMovimentacoes) {
			System.out.println("Media: "+ resultado.getValor() + " Dia: "+ resultado.getDia()+"/"+
					resultado.getMes()+"/"+ resultado.getAno());
		}
		
		
	}

}
