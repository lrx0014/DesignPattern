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
		Keyword = new JLabel("关键词(书名、作者):");
		add(Keyword);
		txtKeyword = new JTextField(20);
		add(txtKeyword);
		
		
		btnLogin = new JButton("检索图书");
		add(btnLogin);
		
		btnCancel = new JButton("取消");
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
			/// 搜索
			fireSearchEvent();
		}
		if(btnCancel==event.getSource())
		{
			/// 清除
			txtKeyword.setText("");
		}
	}

}
