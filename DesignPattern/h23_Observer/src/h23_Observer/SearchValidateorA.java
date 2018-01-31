package h23_Observer;

import javax.swing.*;
import java.awt.*;

public class SearchValidateorA extends JFrame implements SearchEventListener{

	private JPanel p;
	private SearchBean sb;
	private JLabel logo;
	public SearchValidateorA()
	{
		super("BAIDU");
		p = new JPanel();
		this.getContentPane().add(p);
		sb = new SearchBean();
		sb.addSearchEventListener(this);
		
		Font f = new Font("Times New Roman",Font.BOLD,30);
		logo = new JLabel("BAIDU");
		logo.setFont(f);
		logo.setForeground(Color.BLUE);
		
		p.setLayout(new GridLayout(2,1));
		p.add(logo);
		p.add(sb);
		p.setBackground(Color.GRAY);
		this.setSize(600,200);
		this.setVisible(true);
	}
	
	@Override
	public void validateSearch(SearchEvent event) {
		// TODO Auto-generated method stub
		String keyword = event.getKeyword();
		
		if(0==keyword.trim().length())
		{
			JOptionPane.showMessageDialog(this,new String("Keyword is empty!!"),"alert",JOptionPane.ERROR_MESSAGE);
		}else{
			JOptionPane.showMessageDialog(this, new String("Searching for: "+keyword),"alert",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public static void main(String[] args)
	{
		new SearchValidateorA().setVisible(true);
	}
	
}
