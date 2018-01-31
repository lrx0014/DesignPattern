package com.library.lrx.delete;

import java.util.EventObject;

public class DeleteEvent extends EventObject{

	private String id;
	public DeleteEvent(Object source,String id) {
		super(source);
		// TODO Auto-generated constructor stub
		this.id = id;
	}
	
	public void setId(String id)
	{
		this.id = id;
	}
	
	public String getId()
	{
		return this.id;
	}
	
}
