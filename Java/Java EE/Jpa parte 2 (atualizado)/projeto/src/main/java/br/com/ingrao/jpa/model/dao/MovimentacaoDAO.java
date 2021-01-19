package br.com.ingrao.jpa.model.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import br.com.ingrao.jpa.model.MediaComData;
import br.com.ingrao.jpa.model.Movimentacao;

public class MovimentacaoDAO {
	
	private EntityManager em;
	
	public MovimentacaoDAO(EntityManager em) {
		this.em = em;
	}
	
	public List<Movimentacao> getMovimentacoesFiltradasPorData(Integer dia , Integer mes, Integer ano){
		
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<Movimentacao> query = builder.createQuery(Movimentacao.class);
		
		Root<Movimentacao> root = query.from(Movimentacao.class);
		
		List<Predicate> predicates = new ArrayList<Predicate>();
		if(dia != null){
			// builder.function(1,2,3) criando uma funcçao com a query
			//1 = nome da função exemplo day , month , year , sum , avg
			//2 = tipo do argumento que vai passar
			//3 = onde a função será aplicada 
			//resultando na expressao day(m.day)
			//builder.equal(1,2) compara o resultado da funcao com o valor passado e retornará um Predicate
			//Pradicate é uma afirmação em relação ao atributo exemplo o dia é igual ai dia passado como parametro
			//1= uma expressao
			//2 valor comparação 
			Predicate predicate = builder.equal(builder.function("day", Integer.class,root.get("data")), dia );
			predicates.add(predicate);
		}
		if(mes !=null){
			//month(m.data)
			Predicate predicate = builder.equal(builder.function("month", Integer.class,root.get("data")), mes );
			predicates.add(predicate);
		}
		if(ano !=null){
			//year(m.data)
			Predicate predicate = builder.equal(builder.function("year", Integer.class,root.get("data")), ano );
			predicates.add(predicate);
		}
		
		query.where((Predicate[])predicates.toArray(new Predicate[0]));
		
		//convertendo em array de predicate chamando o metodo toArray e passa dentro do metodo o Array para qual ele vai retorna o metodo
		//colocou[0] para evitar alocação desnecessaria de memória
		
		TypedQuery<Movimentacao> typedQuery = em.createQuery(query);
		
		
		return typedQuery.getResultList();
		
	}
	public List<MediaComData> getMediaComData(){		
		String jpql = "select new br.com.ingrao.jpa.model.MediaComData("
				+ "avg(m.valor),day(m.data),month(m.data),year(m.data))"
				+ " from Movimentacao m  group by day(m.data), month(m.data), year(m.data)";
		
		TypedQuery<MediaComData> query = em.createQuery(jpql,MediaComData.class);
		return query.getResultList();
	}
	
	public BigDecimal getSomaDasMovimentacoes() {
		TypedQuery<BigDecimal> query = em.createNamedQuery("somaValor",BigDecimal.class);
		//usando o NamedQuery
		BigDecimal soma = query.getSingleResult();
		return soma;
	}
}
