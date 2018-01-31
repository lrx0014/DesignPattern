package h23_Observer;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SearchBean extends JPanel implements ActionListener{

	JLabel labKeyword;
	JTextField txtKeyword;
	JButton btnSearch,btnClear;
	
	SearchEventListener sel;
	SearchEvent se;
	
	public SearchBean()
	{
		this.setLayout(new GridLayout(2,2));
		labKeyword = new JLabel("KEYWORD:");
		add(labKeyword);
		
		txtKeyword = new JTextField(20);
		add(txtKeyword);
		
		btnSearch = new JButton("Search");
		add(btnSearch);
		
		btnClear = new JButton("Clear");
		add(btnClear);
		
		btnSearch.addActionListener(this);
		btnClear.addActionListener(this);
	}
	
	public void addSearchEventListener(SearchEventListener sel)
	{
		this.sel = sel;
	}
	
	private void fireSearchEvent(Object object,String keyword)
	{
		se = new SearchEvent(btnSearch,keyword);
		sel.validateSearch(se);
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		if(btnSearch==event.getSource())
		{
			String keyword = this.txtKeyword.getText();
			fireSearchEvent(btnSearch,keyword);
		}
		if(btnClear==event.getSource())
		{
			this.txtKeyword.setText("");
		}
	}

}
