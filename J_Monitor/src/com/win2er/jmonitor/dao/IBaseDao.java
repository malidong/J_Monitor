package com.win2er.jmonitor.dao;

import org.hibernate.HibernateException;

public interface IBaseDao {

	
	public void saveObject(Object obj) throws HibernateException;
	
	//public void saveObject(Object obj) throws HibernateException;

	//comment out for Spring
	//public Session getSession();
	
	//comment out for Spring
	//public void setSession(Session session);
}
