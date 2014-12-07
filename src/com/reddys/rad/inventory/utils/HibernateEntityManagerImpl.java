package com.reddys.rad.inventory.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateEntityManagerImpl implements EntityManager{

	 Configuration configuration = new Configuration().configure();
	 SessionFactory sf =configuration.buildSessionFactory() ;
	 Session session ;
	
	public HibernateEntityManagerImpl(){
		setConfiguration();
	}
	
	private void setConfiguration(){
		
	}
	
	private Session getSession(){
		session = sf.openSession();
		return session;
	}

	public Object persist(Object entity) {
		Session session = getSession();
		Transaction tx = session.beginTransaction();
		session.save(entity);
		tx.commit();
		return entity;
	}

	public Object merge(Object entity) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
