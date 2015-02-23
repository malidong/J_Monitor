/**
 * 
 */
package com.win2er.jmonitor.daoImpl;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.win2er.jmonitor.dao.IBaseDao;

/**
 * @author SCI01520
 *
 */
public class UserDao extends HibernateDaoSupport implements IBaseDao {

	//private Session sessionFactory;
	
    @Override  
    public void saveObject(Object obj) throws HibernateException {  
        getHibernateTemplate().save(obj);  
    }  
/*
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
		sessionFactory.save(obj);
	}
 	*/
}


