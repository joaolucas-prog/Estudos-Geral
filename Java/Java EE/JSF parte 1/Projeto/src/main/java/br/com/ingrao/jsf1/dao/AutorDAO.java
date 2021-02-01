package br.com.ingrao.jsf1.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import br.com.ingrao.jsf1.bean.Autor;

public class AutorDAO {
private SessionFactory sessionFactory;
	
	public AutorDAO(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void save(Autor entity) {
		try (Session session = sessionFactory.openSession()) {
			session.beginTransaction();
			session.save(entity);
			session.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public Autor getById(Long id) {
		Autor entity = null;
		try(Session session = this.sessionFactory.openSession()){
			session.beginTransaction();
			entity = session.get(Autor.class, id);
			session.getTransaction().commit();
			return entity;
		}catch(Exception ex) {
			ex.printStackTrace();
			return entity;
		}
	}
	public void remove(Autor entity) {
		try(Session session = this.sessionFactory.openSession()){
			session.beginTransaction();
			session.remove(entity);
			session.getTransaction().commit();
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	public void update(Autor entity) {
		
		try(Session session = this.sessionFactory.openSession()){
			session.beginTransaction();
			session.update(entity);
			session.getTransaction().commit();
			
		}catch(Exception ex) {
			ex.printStackTrace();
			
		}
	}
	
	public List<Autor> findAll() {
		List<Autor> list = null;
		try(Session session = this.sessionFactory.openSession()){
			session.beginTransaction();
			TypedQuery<Autor> query = session.createQuery("from Autor",Autor.class);
			list = query.getResultList();
			session.getTransaction().commit();
			return list;
		}catch(Exception ex) {
			ex.printStackTrace();
			return list;
		}
	}
}
