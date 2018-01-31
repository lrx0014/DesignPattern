package com.library.lrx.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import com.library.lrx.add.AddValidateor;
import com.library.lrx.delete.DeleteValidateor;
import com.library.lrx.login.LoginValidateorA;
import com.library.lrx.search.SearchValidateor;
import com.library.lrx.view.ViewTable;

public class MainWin extends JFrame implements ActionListener{
	
	JButton btnView,btnAdd,btnRemove,btnEdit,btnSearch,btnLogin,btnLogout;
	JLabel logo;
	JPanel jp,MainPanel,MainPanel2;
	boolean isLogin = false;
	
	public MainWin()
	{
		btnView = new JButton("���ͼ��");
		btnAdd = new JButton("��ӻ�༭ͼ��");
		btnRemove = new JButton("ɾ��ͼ��");
		btnSearch = new JButton("����");
		btnLogin = new JButton("δ��¼������Ե�¼ϵͳ");
		btnLogout = new JButton("ע����¼");
		btnLogin.addActionListener(this);
		btnView.addActionListener(this);
		btnAdd.addActionListener(this);
		btnRemove.addActionListener(this);
		btnSearch.addActionListener(this);
		btnLogout.addActionListener(this);
		
		MainPanel = new JPanel();
		MainPanel2 = new JPanel();
		jp = new JPanel();
		jp.setLayout(new GridLayout(3,1));
		Font f = new Font("����",Font.BOLD,30);
		logo = new JLabel("ͼ�����ϵͳ",JLabel.CENTER);
		logo.setFont(f);
		logo.setForeground(Color.BLACK);
		
		jp.add(logo);
		
		MainPanel.setLayout(new GridLayout(3,1));
		MainPanel2.setLayout(new GridLayout(2,1));
		  
		MainPanel.add(btnLogin);
		MainPanel.add(btnView); 	
		MainPanel.add(btnAdd);      
		
		MainPanel2.add(btnRemove);   
		MainPanel2.add(btnSearch);   
		
		jp.add(MainPanel);
		jp.add(MainPanel2);
		this.add(jp);
		this.setSize(600,600);
		this.setVisible(true);
	}
	
	public void LoginSuccess()
	{
		isLogin = true;
		btnLogin.setText("�ѵ�¼�����ע��");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(isLogin==false && e.getSource()!=btnLogin)
		{
			JOptionPane.showMessageDialog(null, "�����¼���ܽ��д˲�����", "���ȵ�¼", JOptionPane.ERROR_MESSAGE); 
			new LoginValidateorA(this);
			return;
		}
		if(e.getActionCommand()=="δ��¼������Ե�¼ϵͳ"){
			new LoginValidateorA(this);
		}
		if(e.getActionCommand()=="�ѵ�¼�����ע��"){
			this.isLogin = false;
			this.btnLogin.setText("δ��¼������Ե�¼ϵͳ");
			return;
		}
		else if(e.getSource()==btnView){
			new ViewTable();
		}
		else if(e.getSource()==btnAdd){
			new AddValidateor();
		}
		else if(e.getSource()==btnRemove){
			new DeleteValidateor();
		}
		else if(e.getSource()==btnSearch){
			new SearchValidateor();
		}
	}
	
	public static void main(String[] args)
	{
		new MainWin();
	}
}
