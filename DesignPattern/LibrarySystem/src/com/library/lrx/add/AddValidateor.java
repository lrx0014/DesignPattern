package com.library.lrx.add;

import javax.swing.*;

import com.library.lrx.controller.IController;
import com.library.lrx.controller.IFactory;
import com.library.lrx.controller.DataControl;
import com.library.lrx.controller.DataControlFactory;

import java.awt.*;
import java.io.IOException;

public class AddValidateor extends JFrame implements AddEventListener{

	private JPanel p;
	private AddBean sb;
	private JLabel logo;
	public AddValidateor()
	{
		super("添加或编辑图书");
		p = new JPanel();
		this.getContentPane().add(p);
		sb = new AddBean();
		sb.addAddEventListener(this);
		
		Font f = new Font("宋体",Font.BOLD,30);
		logo = new JLabel("添加或编辑图书",JLabel.CENTER);
		logo.setFont(f);
		logo.setForeground(Color.BLACK);
		
		p.setLayout(new GridLayout(2,1));
		p.add(logo);
		p.add(sb);
		p.setBackground(Color.GRAY);
		this.setSize(600,400);
		this.setVisible(true);
	}
	
	@Override
	public void validateLogin(AddEvent event) {
		// TODO Auto-generated method stub
		String Info = event.getInfo();
		
		if(0==Info.trim().length())
		{
			JOptionPane.showMessageDialog(this,new String("信息不能为空!!"),"alert",JOptionPane.ERROR_MESSAGE);
		}else{
			DataControl wd = new DataControl();
			try {
				wd.Operate();
				wd.InsertBook(Info);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args)
	{
		new AddValidateor().setVisible(true);
	}
	
}
