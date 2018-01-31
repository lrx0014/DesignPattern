package h17_Behavioral;

public class Meet extends Leader{
	
	public void handleRequest(Request request)
	{
		if(request.getMoney()>=200000)
		{
			System.out.println("采购："+request.getMoney()+" 超过20万，需要开会决定");
		}
		else{
			if(this.successor!=null)
			{
				this.successor.handleRequest(request);
			}
		}
	}
}
