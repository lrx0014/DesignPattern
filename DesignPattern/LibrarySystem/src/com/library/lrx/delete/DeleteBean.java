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
		DeleteBookId = new JLabel("Ҫɾ����ͼ��ı��:");
		add(DeleteBookId);
		txtDeleteBookId = new JTextField(20);
		add(txtDeleteBookId);
		
		btnDelete = new JButton("ȷ��ɾ��");
		add(btnDelete);
		
		btnCancel = new JButton("ȡ��");
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
			/// ɾ��
			fireDeleteEvent();
		}
		if(btnCancel==event.getSource())
		{
			/// ���
			txtDeleteBookId.setText("");
		}
	}

}
