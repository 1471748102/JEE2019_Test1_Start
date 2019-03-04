package com.login;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {


	private static final long serialVersionUID = 1L;
	private String name;
	private String password;
	 
	public String execute() throws Exception {
		//System.out.println("账号:" + getName());
		//System.out.println("密码:"+ getPassword());
		if (getName().equals("") || getName() == null) {
			return "error";
		} else {
			return "success";
		}
	}
 
	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}

