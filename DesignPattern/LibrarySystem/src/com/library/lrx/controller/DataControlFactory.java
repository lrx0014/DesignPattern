package com.library.lrx.controller;

public class DataControlFactory implements IFactory{
	public IController produceController(){
		return new DataControl();
	}
}
