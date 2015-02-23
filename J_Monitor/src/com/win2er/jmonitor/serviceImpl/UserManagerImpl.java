package com.win2er.jmonitor.serviceImpl;

import org.hibernate.HibernateException;
import org.springframework.beans.BeanUtils;

import com.win2er.jmonitor.beans.UserBean;
import com.win2er.jmonitor.dao.IBaseDao;
import com.win2er.jmonitor.service.IUserManager;

public class UserManagerImpl implements IUserManager {

	private IBaseDao dao;

	public void setDao(IBaseDao dao) {
		this.dao = dao;
	}

	@Override
	public void regUser(UserBean userBean) throws HibernateException {
		UserBean user = new UserBean();
		BeanUtils.copyProperties(userBean, user);
		dao.saveObject(user);
	}
	
	/*
	 comment out for Spring
	 
	 private Session session;
	 
	 public UserManagerImpl() { dao = new UserDao(); }
	 
	 @Override
	 public void regUser(UserBean UserBean) throws HibernateException
	 { 
	 	session = HibernateSessionFactory.currentSession();
	 	dao.setSession(session); // 获取事务 Transaction ts =
	 	session.beginTransaction(); // 构造User对象 UserBean user = new UserBean();
	 	user.setUsername(UserBean.getUsername());
	 	user.setPassword(UserBean.getPassword());
	 	user.setGender(UserBean.getGender()); // 保存User对象
	 	dao.saveObject(user);	// 提交事务 
	 	ts.commit(); // 关闭
	 	Session HibernateSessionFactory.closeSession();
	 }
	  
	 */
}
