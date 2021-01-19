package br.com.ingrao.hibernate.estudoHibernate;

public class Cacheing {
	
	/*
	 * Para usar o Second Level Cache precisamos habilitar no xml
	 *  <property name="hibernate.cache.use_second_level_cache">true</property>
		<property name="hibernate.cache.provider_class">org.hibernate.cache.EhCacheProvider</property>
		<!--  -->
		
		Depois você precisa avisar a classe de entidade que ela é cacheavel(Cachable) e passar uma estrategia de cach
		
		@Cachable
		@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
	 * 
	 * READ_ONLY : usado apenas para entidades que nunca mudam (uma exceção é lançada se uma tentativa de atualizar tal entidade 
	 * é feita). É muito simples e eficiente. Muito adequado para alguns dados de referência estáticos que não mudam
	 *
	 * NONSTRICT_READ_WRITE : O cache é atualizado após a confirmação de uma transação que alterou os dados afetados. Portanto,
	 *  a consistência forte não é garantida e há uma pequena janela de tempo em que dados obsoletos podem ser obtidos do cache. 
	 *  Este tipo de estratégia é adequado para casos de uso que podem tolerar consistência eventual
	 * 
	 * READ_WRITE : Esta estratégia garante a consistência forte que consegue usando bloqueios 'soft': Quando uma entidade 
	 * em cache é atualizada, um bloqueio suave é armazenado no cache para essa entidade também, que é liberado após a transação 
	 * ser confirmada. Todas as transações simultâneas que acessam as entradas bloqueadas por software irão buscar os dados 
	 * correspondentes diretamente do banco de dados
	 * 
	 * TRANSACIONAL : as alterações do cache são feitas em transações XA distribuídas. Uma mudança em uma entidade em cache 
	 * é confirmada ou revertida no banco de dados e no cache na mesma transação XA
	 * 
	 * 
	 * Query cache
	 * 
	 * Podemos cachera as querys também para isso devemos habilitar no cfg.xml o query cache e quando criar uma query
	 * setar a query como cacheable
	 * 
	 * <property name="hibernate.cache.use_query_cache">true</property>
	 * 
	 * Query query = session.createQuery("from Empresa e where e.id = 1");
	 * query.setCacheable(true);
	 * */

}
