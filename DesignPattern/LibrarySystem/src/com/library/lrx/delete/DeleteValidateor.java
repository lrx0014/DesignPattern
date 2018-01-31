package com.library.lrx.delete;

import javax.swing.*;

import com.library.lrx.controller.DataControl;

import java.awt.*;
import java.io.IOException;

public class DeleteValidateor extends JFrame implements DeleteEventListener{

	private JPanel p;
	private DeleteBean sb;
	private JLabel logo;
	public DeleteValidateor()
	{
		super("删除图书");
		p = new JPanel();
		this.getContentPane().add(p);
		sb = new DeleteBean();
		sb.addSearchEventListener(this);
		
		Font f = new Font("宋体",Font.BOLD,30);
		logo = new JLabel("删除图书",JLabel.CENTER);
		logo.setFont(f);
		logo.setForeground(Color.BLACK);
		
		p.setLayout(new GridLayout(2,1));
		p.add(logo);
		p.add(sb);
		p.setBackground(Color.GRAY);
		this.setSize(600,200);
		this.setVisible(true);
	}
	
	@Override
	public void validateLogin(DeleteEvent event) {
		// TODO Auto-generated method stub
		String id = event.getId();
		
		if(0==id.trim().length())
		{
			JOptionPane.showMessageDialog(this,new String("不能为空!!"),"alert",JOptionPane.ERROR_MESSAGE);
		}else{
			DataControl dc = new DataControl();
			try {
				dc.Operate();
				dc.deleteBook(id);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args)
	{
		new DeleteValidateor().setVisible(true);
	}
	
}
