package br.com.ingrao.hibernate.estudoHibernate;

public class Cacheing {
	
	/*
	 * Para usar o Second Level Cache precisamos habilitar no xml
	 *  <property name="hibernate.cache.use_second_level_cache">true</property>
		<property name="hibernate.cache.provider_class">org.hibernate.cache.EhCacheProvider</property>
		<!--  -->
		
		Depois voc� precisa avisar a classe de entidade que ela � cacheavel(Cachable) e passar uma estrategia de cach
		
		@Cachable
		@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
	 * 
	 * READ_ONLY : usado apenas para entidades que nunca mudam (uma exce��o � lan�ada se uma tentativa de atualizar tal entidade 
	 * � feita). � muito simples e eficiente. Muito adequado para alguns dados de refer�ncia est�ticos que n�o mudam
	 *
	 * NONSTRICT_READ_WRITE : O cache � atualizado ap�s a confirma��o de uma transa��o que alterou os dados afetados. Portanto,
	 *  a consist�ncia forte n�o � garantida e h� uma pequena janela de tempo em que dados obsoletos podem ser obtidos do cache. 
	 *  Este tipo de estrat�gia � adequado para casos de uso que podem tolerar consist�ncia eventual
	 * 
	 * READ_WRITE : Esta estrat�gia garante a consist�ncia forte que consegue usando bloqueios 'soft': Quando uma entidade 
	 * em cache � atualizada, um bloqueio suave � armazenado no cache para essa entidade tamb�m, que � liberado ap�s a transa��o 
	 * ser confirmada. Todas as transa��es simult�neas que acessam as entradas bloqueadas por software ir�o buscar os dados 
	 * correspondentes diretamente do banco de dados
	 * 
	 * TRANSACIONAL : as altera��es do cache s�o feitas em transa��es XA distribu�das. Uma mudan�a em uma entidade em cache 
	 * � confirmada ou revertida no banco de dados e no cache na mesma transa��o XA
	 * 
	 * 
	 * Query cache
	 * 
	 * Podemos cachera as querys tamb�m para isso devemos habilitar no cfg.xml o query cache e quando criar uma query
	 * setar a query como cacheable
	 * 
	 * <property name="hibernate.cache.use_query_cache">true</property>
	 * 
	 * Query query = session.createQuery("from Empresa e where e.id = 1");
	 * query.setCacheable(true);
	 * */

}
