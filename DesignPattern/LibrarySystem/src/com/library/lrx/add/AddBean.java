package com.library.lrx.add;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddBean extends JPanel implements ActionListener{

	JLabel BookName,Author,Type,BookId;
	JTextField txtBookId;
	JTextField txtBookName;
	JTextField txtAuthor;
	JTextField txtType;
	JButton btnAdd,btnCancel;
	
	AddEventListener sel;
	AddEvent se;
	
	public AddBean()
	{
		this.setLayout(new GridLayout(5,2));
		BookId = new JLabel("图书编号(如果存在则为编辑、不存在为添加):");
		add(BookId);
		txtBookId = new JTextField(20);
		add(txtBookId);
		
		BookName = new JLabel("图书名称:");
		add(BookName);
		txtBookName = new JTextField(20);
		add(txtBookName);
		
		Author = new JLabel("作者姓名:");
		add(Author);
		txtAuthor = new JTextField(20);
		add(txtAuthor);
		
		Type = new JLabel("图书类型:");
		add(Type);
		txtType = new JTextField(20);
		add(txtType);
		
		btnAdd = new JButton("确认添加");
		add(btnAdd);
		
		btnCancel = new JButton("清除");
		add(btnCancel);
		
		btnAdd.addActionListener(this);
		btnCancel.addActionListener(this);
	}
	
	public void addAddEventListener(AddEventListener sel)
	{
		this.sel = sel;
	}
	
	private void fireAddEvent(Object object,String Info)
	{
		se = new AddEvent(btnAdd,Info);
		sel.validateLogin(se);
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		if(btnAdd==event.getSource())
		{
			/// 添加或编辑替换图书
			String Info = (this.txtBookId.getText()+","+this.txtBookName.getText()+","+this.txtAuthor.getText()+","+this.txtType.getText());
			fireAddEvent(btnAdd,Info);
		}
		if(btnCancel==event.getSource())
		{
			/// 清除
			txtType.setText("");
			txtAuthor.setText("");
			txtBookName.setText("");
			txtBookId.setText("");
		}
	}

}
