package com.win2er.jmonitor.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;

public interface IBaseDao {

	public void saveObject(Object obj) throws HibernateException;

	public Session getSession();

	public void setSession(Session session);
}
