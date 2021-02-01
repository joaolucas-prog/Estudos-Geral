package br.com.ingrao.jsf1.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import br.com.ingrao.jsf1.bean.Usuario;

public class UsuarioDAO {

	private SessionFactory sessionFactory;
	
	public UsuarioDAO(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void save(Usuario entity) {
		try (Session session = sessionFactory.openSession()) {
			session.beginTransaction();
			session.save(entity);
			session.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public Usuario getById(Long id) {
		Usuario entity = null;
		try(Session session = this.sessionFactory.openSession()){
			session.beginTransaction();
			entity = session.get(Usuario.class, id);
			session.getTransaction().commit();
			return entity;
		}catch(Exception ex) {
			ex.printStackTrace();
			return entity;
		}
	}
	public void remove(Usuario entity) {
		try(Session session = this.sessionFactory.openSession()){
			session.beginTransaction();
			session.remove(entity);
			session.getTransaction().commit();
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	public void update(Usuario entity) {
		
		try(Session session = this.sessionFactory.openSession()){
			session.beginTransaction();
			session.update(entity);
			session.getTransaction().commit();
			
		}catch(Exception ex) {
			ex.printStackTrace();
			
		}
	}
	
	public List<Usuario> findAll() {
		List<Usuario> list = null;
		try(Session session = this.sessionFactory.openSession()){
			session.beginTransaction();
			TypedQuery<Usuario> query = session.createQuery("from Livro",Usuario.class);
			list = query.getResultList();
			session.getTransaction().commit();
			return list;
		}catch(Exception ex) {
			ex.printStackTrace();
			return list;
		}
	}
	
	@SuppressWarnings("deprecation")
	public boolean getUsuario(String email ,String senha) {
		
		try(Session session = sessionFactory.openSession()) {
			
			session.beginTransaction();
			//TypedQuery<Usuario> usuario = session.createQuery("selec u from Usuario u",Usuario.class);
			Criteria crit = session.createCriteria(Usuario.class);
			crit.add(Restrictions.eq("senha", senha));
			crit.add(Restrictions.eq("email", email));
			crit.uniqueResult();
			session.getTransaction().commit();	
			return crit.uniqueResult() != null;
		}catch(Exception e) {
			return false;
		}
		
	}
	

}
