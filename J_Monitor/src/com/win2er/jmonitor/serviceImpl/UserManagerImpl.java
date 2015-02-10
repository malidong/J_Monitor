package com.win2er.jmonitor.serviceImpl;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.win2er.jmonitor.beans.UserBean;
import com.win2er.jmonitor.dao.IBaseDao;
import com.win2er.jmonitor.daoImpl.HibernateSessionFactory;
import com.win2er.jmonitor.daoImpl.UserDao;
import com.win2er.jmonitor.service.IUserManager;

public class UserManagerImpl implements IUserManager {

	private IBaseDao dao;

	private Session session;

	public UserManagerImpl() {
		dao = new UserDao();
	}

	@Override
	public void regUser(UserBean UserBean) throws HibernateException {
		session = HibernateSessionFactory.currentSession();
		dao.setSession(session);
		// 获取事务
		Transaction ts = session.beginTransaction();
		// 构造User对象
		UserBean user = new UserBean();
		user.setUsername(UserBean.getUsername());
		user.setPassword(UserBean.getPassword());
		user.setGender(UserBean.getGender());
		// 保存User对象
		dao.saveObject(user);
		// 提交事务
		ts.commit();
		// 关闭Session
		HibernateSessionFactory.closeSession();
	}

}
