package com.library.lrx.delete;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class DeleteBean extends JPanel implements ActionListener{

	JLabel DeleteBookId;
	JTextField txtDeleteBookId;
	JButton btnDelete,btnCancel;
	
	DeleteEventListener sel;
	DeleteEvent se;
	
	public DeleteBean()
	{
		this.setLayout(new GridLayout(2,2));
		DeleteBookId = new JLabel("要删除的图书的编号:");
		add(DeleteBookId);
		txtDeleteBookId = new JTextField(20);
		add(txtDeleteBookId);
		
		btnDelete = new JButton("确认删除");
		add(btnDelete);
		
		btnCancel = new JButton("取消");
		add(btnCancel);
		
		btnDelete.addActionListener(this);
		btnCancel.addActionListener(this);
	}
	
	public void addSearchEventListener(DeleteEventListener sel)
	{
		this.sel = sel;
	}
	
	private void fireDeleteEvent()
	{
		se = new DeleteEvent(btnDelete,this.txtDeleteBookId.getText());
		sel.validateLogin(se);
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		if(btnDelete==event.getSource())
		{
			/// 删除
			fireDeleteEvent();
		}
		if(btnCancel==event.getSource())
		{
			/// 清除
			txtDeleteBookId.setText("");
		}
	}

}
