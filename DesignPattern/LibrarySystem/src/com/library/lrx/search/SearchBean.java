package com.library.lrx.search;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SearchBean extends JPanel implements ActionListener{

	JLabel Keyword;
	JTextField txtKeyword;
	JButton btnLogin,btnCancel;
	
	SearchEventListener sel;
	SearchEvent se;
	
	public SearchBean()
	{
		this.setLayout(new GridLayout(2,2));
		Keyword = new JLabel("�ؼ���(����������):");
		add(Keyword);
		txtKeyword = new JTextField(20);
		add(txtKeyword);
		
		
		btnLogin = new JButton("����ͼ��");
		add(btnLogin);
		
		btnCancel = new JButton("ȡ��");
		add(btnCancel);
		
		btnLogin.addActionListener(this);
		btnCancel.addActionListener(this);
	}
	
	public void addSearchEventListener(SearchEventListener sel)
	{
		this.sel = sel;
	}
	
	private void fireSearchEvent()
	{
		se = new SearchEvent(btnLogin,this.txtKeyword.getText());
		sel.validateLogin(se);
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		if(btnLogin==event.getSource())
		{
			/// ����
			fireSearchEvent();
		}
		if(btnCancel==event.getSource())
		{
			/// ���
			txtKeyword.setText("");
		}
	}

}
