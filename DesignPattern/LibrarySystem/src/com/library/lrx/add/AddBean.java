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
		BookId = new JLabel("ͼ����(���������Ϊ�༭��������Ϊ���):");
		add(BookId);
		txtBookId = new JTextField(20);
		add(txtBookId);
		
		BookName = new JLabel("ͼ������:");
		add(BookName);
		txtBookName = new JTextField(20);
		add(txtBookName);
		
		Author = new JLabel("��������:");
		add(Author);
		txtAuthor = new JTextField(20);
		add(txtAuthor);
		
		Type = new JLabel("ͼ������:");
		add(Type);
		txtType = new JTextField(20);
		add(txtType);
		
		btnAdd = new JButton("ȷ�����");
		add(btnAdd);
		
		btnCancel = new JButton("���");
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
			/// ��ӻ�༭�滻ͼ��
			String Info = (this.txtBookId.getText()+","+this.txtBookName.getText()+","+this.txtAuthor.getText()+","+this.txtType.getText());
			fireAddEvent(btnAdd,Info);
		}
		if(btnCancel==event.getSource())
		{
			/// ���
			txtType.setText("");
			txtAuthor.setText("");
			txtBookName.setText("");
			txtBookId.setText("");
		}
	}

}
