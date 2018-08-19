package com.hibernate.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConnectToDB {

	public Session getSession() {
		SessionFactory sessionFactory = new Configuration().configure("com/hibernate/services/hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		return session;
	}
}
