/**
 * 
 */
package com.wi2er.jmonitor.action;

import com.opensymphony.xwork2.ActionSupport;
import com.win2er.jmonitor.beans.UserBean;
import com.win2er.jmonitor.service.UserManager;
import com.win2er.jmonitor.serviceImpl.UserManagerImpl;

/**
 * @author SCI01520
 *
 */
public class RegisterAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private UserBean user;

	private UserManager userManager;

	public UserBean getUser() {
		return user;
	}

	public void setUser(UserBean user) {
		this.user = user;
	}

	public UserManager getUserManager() {
		return userManager;
	}

	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}

	public String execute() {
		try {
			this.setUserManager(new UserManagerImpl());
			userManager.regUser(user);
			return SUCCESS;

		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}

}
