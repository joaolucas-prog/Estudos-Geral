package br.com.ingrao.hibernate.estudoHibernate;

import java.io.File;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Restrictions;

import br.com.ingrao.hibernate.model.bean.Empresa;

public class CriteriaAPI {
	
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration()
				.configure(new File("src/main/resources/META-INF/hibernate.cfg.xml"))
				.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		session.getTransaction().begin();
		
		/*Criteria é uma API que ajuda a criar as query de consulta no banco, ele nos permite fazer clausulas where
		 * dinamicamente criando algumas restrições para que a clausula seja criada*/
		
		//Criando um objeto criteria passando a classe da Entidade
		Criteria criteria = session.createCriteria(Empresa.class);
		//adicionando uma restrição na consulta , onde quero que o criteria pegue a coluna nome com valor Empresa 1
		//Podemos adicionar várias restrições em sequencia
		/*
		 * Métodos de restrição:
		 * 
		 * .eq(column,value) verifica se o valor da coluna é igual(equals) ao passado
		 * .ne(column,value) negação da eq
		 * .isNull(column) objetos que tem a column null
		 * .isNotNull(column) negação isNull
		 * .gt(column,value) verifica se o valor da coluna é maior que(greater than) o passado
		 * .ge(column,value) maior ou igual
		 * .lt(column,value) menor que
		 * .le(column,value) menor ou igual
		 * .like(column,value) equivalente ao like no sql vai verificar se a coluna é igual ao valor passado
		 * .ilike(column,value) equivalete ao .like mas a diferença entra maisculo a menusculo é despresado
		 * .between(column,valuestart,valueend) retorna a coluna de valores entre o valuestart eo valueend
		 * .or(Restrictions1,Restriction2) retorna uma consulta que satisfaça as duas restrições utilizando apenas add
		 * o criteria interpreta como and
		 * */
		criteria.add(Restrictions.like("nome","%Empresa%"))
				.add(Restrictions.gt("id",5L));
		//pegando o resultado e jogando em uma lista
		List<Empresa> lista = criteria.list();
		
		for (Empresa emp : lista) {
			System.out.println(emp.getNome());
		}
		
		/*Projections
		 * 
		 * Podemos utilizar as projetos da api criteria para criar projeções e utilizar algumas funções do sql
		 * 
		 * para criar uma projeção na hora de criar o criteria podemos adicionar um .setProjection(Projection.property(colum))
		 * aqui iremos criar uma projeção sobre a coluna passada e o resultado não será mais uma lista do objeto e sim do 
		 * tipo da coluna.
		 * 
		 * Podemos também ordernar adicionando no final um .addOrder(Oder.asc(column))
		 * 
		 * exemplo Criteria criteria = session.createCriteria(Empresa.class).setProjection(Projections.count("id").addOrder(Order.desc("id");
		 * 
		 * alguns metodos da Projection
		 * 
		 * .avg
		 * .max
		 * .property
		 * .count
		 * .sum
		 * .min
		 * 
		 * 
		 * 
		 * QueryByExample
		 * 
		 * Em casos que você tem um objeto com muitas propriedades , pode ser que não fique viavel você criar uma restriction para cada
		 * uma das variáveis, para resolver esse problema podemos passar um objeto como exemplo para o criteria que ele irá pesquisar todos
		 * os objetos que possuem aquele exemplo. Por padrão o criteria ignora todos os atributos que forem nulos e que sejam chave 
		 * primaria do objeto passado como parametro , além disso podemos utilizar algumas funções a mais como por exemplo
		 * habilitar o like com o metodo .enableLike
		 * */	
		Empresa empresaExemplo = new Empresa();
		empresaExemplo.setNome("Empresa 1%");
		
		Example exemplo = Example.create(empresaExemplo).enableLike();
		Criteria cri =  session.createCriteria(Empresa.class).add(exemplo);
		for (Empresa empresa : (List<Empresa>)cri.list()) {
			System.out.println(empresa.getNome());
		}
		session.getTransaction().commit();
		session.close();
		
		
	}
}
