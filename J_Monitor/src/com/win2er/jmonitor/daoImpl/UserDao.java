/**
 * 
 */
package com.win2er.jmonitor.daoImpl;

import org.hibernate.FlushMode;
import org.hibernate.HibernateException;
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
    	//getHibernateTemplate().getSessionFactory().openSession().setFlushMode(FlushMode.AUTO);
        getHibernateTemplate().save(obj);
        //getHibernateTemplate().getSessionFactory().openSession().flush();
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


