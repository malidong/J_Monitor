/**
 * 
 */
package com.win2er.jmonitor.daoImpl;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.win2er.jmonitor.dao.IBaseDao;

/**
 * @author SCI01520
 *
 */
public class UserDao implements IBaseDao {

	private Session session;

	@Override
	public Session getSession() {
		return session;
	}

	@Override
	public void setSession(Session session) {
		this.session = session;
	}

	@Override
	public void saveObject(Object obj) throws HibernateException {
		session.save(obj);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
