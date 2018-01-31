package com.library.lrx.search;

import javax.swing.*;

import com.library.lrx.controller.DataControl;

import java.awt.*;
import java.io.IOException;

public class SearchValidateor extends JFrame implements SearchEventListener{

	private JPanel p;
	private SearchBean sb;
	private JLabel logo;
	public SearchValidateor()
	{
		super("搜索");
		p = new JPanel();
		this.getContentPane().add(p);
		sb = new SearchBean();
		sb.addSearchEventListener(this);
		
		Font f = new Font("宋体",Font.BOLD,30);
		logo = new JLabel("搜索",JLabel.CENTER);
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
	public void validateLogin(SearchEvent event) {
		// TODO Auto-generated method stub
		String keyword = event.getKeyword();
		
		if(0==keyword.trim().length())
		{
			JOptionPane.showMessageDialog(this,new String("不能为空!!"),"没有找到",JOptionPane.ERROR_MESSAGE);
		}else{
			String Result = new String();
			DataControl dc = new DataControl();
			try {
				dc.Operate();
				Result = dc.Search(keyword);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			JOptionPane.showMessageDialog(this, new String("Searching for: "+keyword + "\n" + Result),"搜索结果",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public static void main(String[] args)
	{
		new SearchValidateor().setVisible(true);
	}
	
}
