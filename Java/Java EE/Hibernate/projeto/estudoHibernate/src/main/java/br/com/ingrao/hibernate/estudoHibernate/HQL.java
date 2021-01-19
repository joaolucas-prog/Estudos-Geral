package br.com.ingrao.hibernate.estudoHibernate;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HQL {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration()
				.configure(new File("src/main/resources/META-INF/hibernate.cfg.xml"))
				.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		//String hql = "from Empresa ";
		//hql simples que busca tudo da entidade Empresa
		
		//String hql = "select e from Empresa e where e.id > 5";
		//hql simples utilizando a clausula where
		
		//O select nos permite fazer uma grande quantidade de opera��es por exemplo ela aceita buscar apenas um parametro
		// hql = "select e.nome from Empresa e "
		//usar fun��es sql
		// hql = " select max(e.id) from Empresa e "
		//criar objetos
		//hql = "select new Empresa(e.nome,....) from Empresa
		
		String hql = "select e.nome from Empresa e";
		session.beginTransaction();
		
		//criando a query
		//a query permite tambem indicar a partir de qual row come�ar , e at� quantos rows ir
		//query.setFirstResult(i) come�ar a partir do row i
		//query.setMaxResults(i) a quantidade max de row s�o i
		
		//Podemos adicionar parametros a nossa hql , para isso existem duas formas
		// atrav�s da ? ou por nome do parametro
		//no primeiro caso � equivalente ao modelo jdbc
		//ex : "select e.nome from Empresa e where e.id > ?
		//e na query escrever query.setInteger(posi��o,variavel)
		//o segundo caso tb � parecido s� que ao inv�s de colocar a posi��o indica o nome do parametro
		//hql = "select e.nome from Empresa e where e.id > :nomeParametro
		//query.setInteger("nomeParametro",variavel)
		
		
		//NamedQuery e NamedNativeQuery
		//podemos utilizar querys nomeadas pela sua propria classe de entidade com a anota��o @NamadQuery
		// a diferen�a de um para o outro � que NamedQuery � uma string hql e que possui 2 argumentos name e query
		//j� a NamedNativeQuery � uma query sql pura e que recebe 3 argumentos name , query e resultClass que � a classe resultante
		//da query
		Query query = session.createQuery(hql);
		//jogando o resultado em uma lista
		List<Map> empresas = (List<Map>)query.list();
		System.out.println(empresas);
		
		session.getTransaction().commit();
	}

}
