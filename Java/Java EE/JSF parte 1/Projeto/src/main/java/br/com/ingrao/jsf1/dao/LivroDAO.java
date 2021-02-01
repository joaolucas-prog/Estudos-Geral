package br.com.ingrao.jsf1.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import br.com.ingrao.jsf1.bean.Livro;

public class LivroDAO {

	private SessionFactory sessionFactory;
	
	public LivroDAO(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void save(Livro entity) {
		try (Session session = sessionFactory.openSession()) {
			session.beginTransaction();
			session.save(entity);
			session.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public Livro getById(Long id) {
		Livro entity = null;
		try(Session session = this.sessionFactory.openSession()){
			session.beginTransaction();
			entity = session.get(Livro.class, id);
			session.getTransaction().commit();
			return entity;
		}catch(Exception ex) {
			ex.printStackTrace();
			return entity;
		}
	}
	public void remove(Livro entity) {
		try(Session session = this.sessionFactory.openSession()){
			session.beginTransaction();
			session.remove(entity);
			session.getTransaction().commit();
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	public void update(Livro entity) {
		
		try(Session session = this.sessionFactory.openSession()){
			session.beginTransaction();
			session.update(entity);
			session.getTransaction().commit();
			
		}catch(Exception ex) {
			ex.printStackTrace();
			
		}
	}
	
	public List<Livro> findAll() {
		List<Livro> list = null;
		try(Session session = this.sessionFactory.openSession()){
			session.beginTransaction();
			TypedQuery<Livro> query = session.createQuery("from Livro",Livro.class);
			list = query.getResultList();
			session.getTransaction().commit();
			return list;
		}catch(Exception ex) {
			ex.printStackTrace();
			return list;
		}
	}
	

}
