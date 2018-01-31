package com.library.lrx.login;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.library.lrx.main.MainWin;

public class LoginBean extends JPanel implements ActionListener{

	JLabel UserName,Password;
	JTextField txtUserName;
	JTextField txtPassword;
	JButton btnLogin,btnCancel;
	
	LoginEventListener sel;
	LoginEvent se;
	
	public LoginBean()
	{
		this.setLayout(new GridLayout(3,2));
		UserName = new JLabel("用户名:");
		add(UserName);
		txtUserName = new JTextField(20);
		add(txtUserName);
		
		Password = new JLabel("密码:");
		add(Password);
		txtPassword = new JPasswordField(20);
		add(txtPassword);
		
		btnLogin = new JButton("登录");
		add(btnLogin);
		
		btnCancel = new JButton("清除");
		add(btnCancel);
		
		btnLogin.addActionListener(this);
		btnCancel.addActionListener(this);
	}
	
	public void addLoginEventListener(LoginEventListener sel)
	{
		this.sel = sel;
	}
	
	private void fireLoginEvent(Object object,String username,String password)
	{
		se = new LoginEvent(btnLogin,username,password);
		sel.validateLogin(se);
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		if(btnLogin==event.getSource())
		{
			/// 登录验证
			String username = this.txtUserName.getText().toString().trim();
			String password = this.txtPassword.getText().toString().trim();
			fireLoginEvent(btnLogin,username,password);
		}
		if(btnCancel==event.getSource())
		{
			/// 清除
			txtUserName.setText("");
			txtPassword.setText("");
		}
	}

}
