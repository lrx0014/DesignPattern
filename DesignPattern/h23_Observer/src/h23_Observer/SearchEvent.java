package h23_Observer;

import java.util.EventObject;

public class SearchEvent extends EventObject{

	private String keyword;
	public SearchEvent(Object source,String keyword) {
		super(source);
		// TODO Auto-generated constructor stub
		this.keyword = keyword;
	}
	
	public void setKeyword(String keyword)
	{
		this.keyword = keyword;
	}
	
	public String getKeyword()
	{
		return this.keyword;
	}
	
}
