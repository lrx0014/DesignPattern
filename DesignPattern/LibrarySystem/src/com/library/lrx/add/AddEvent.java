package com.library.lrx.add;

import java.util.EventObject;

public class AddEvent extends EventObject{

	private String Info;
	public AddEvent(Object source,String Info) {
		super(source);
		// TODO Auto-generated constructor stub
		this.Info = Info;
	}
	
	public void setInfo(String Info)
	{
		this.Info = Info;
	}
	
	public String getInfo()
	{
		return this.Info;
	}
	
}
