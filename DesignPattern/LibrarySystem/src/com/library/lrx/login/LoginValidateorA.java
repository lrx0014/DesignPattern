package com.library.lrx.login;

import javax.swing.*;

import com.library.lrx.main.MainWin;

import java.awt.*;

public class LoginValidateorA extends JFrame implements LoginEventListener{

	private JPanel p;
	private LoginBean sb;
	private JLabel logo;
	MainWin mw;
	public LoginValidateorA(MainWin mw)
	{
		super("��¼ͼ�����ϵͳ");
		this.mw = mw;
		p = new JPanel();
		this.getContentPane().add(p);
		sb = new LoginBean();
		sb.addLoginEventListener(this);
		
		Font f = new Font("����",Font.BOLD,30);
		logo = new JLabel("��¼-ͼ�����ϵͳ",JLabel.CENTER);
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
	public void validateLogin(LoginEvent event) {
		// TODO Auto-generated method stub
		String username = event.getUsername();
		String password = event.getPassword();
		
		if(username.trim().equals("test") && password.trim().equals("12345678"))
		{
			JOptionPane.showMessageDialog(this,new String("��¼�ɹ�����"),"Success",JOptionPane.ERROR_MESSAGE);
			mw.LoginSuccess();
		}else{
			JOptionPane.showMessageDialog(this,new String("�����û���:" + username +" ������:" + password),"����",JOptionPane.ERROR_MESSAGE);
			return;
		}
	}
	
}
