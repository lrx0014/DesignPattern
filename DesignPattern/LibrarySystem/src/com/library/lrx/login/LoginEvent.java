package com.library.lrx.login;

import java.util.EventObject;

public class LoginEvent extends EventObject{

	private String username,password;
	public LoginEvent(Object source,String username,String password) {
		super(source);
		// TODO Auto-generated constructor stub
		this.username = username;
		this.password = password;
	}
	
	public void setUsername(String username,String password)
	{
		this.username = username;
		this.password = password;
	}
	
	public String getUsername()
	{
		return this.username;
	}
	
	public String getPassword()
	{
		return this.password;
	}
	
}
