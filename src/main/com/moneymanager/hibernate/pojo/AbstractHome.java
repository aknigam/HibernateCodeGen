package com.moneymanager.hibernate.pojo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class AbstractHome {

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	protected Session currentSession() {
		return getSessionFactory().getCurrentSession();
	}
}
