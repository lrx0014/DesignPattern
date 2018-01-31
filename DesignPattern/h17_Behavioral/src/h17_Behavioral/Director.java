package h17_Behavioral;

public class Director extends Leader{
	
	public void handleRequest(Request request)
	{
		if(request.getMoney()<10000)
		{
			System.out.println("采购："+request.getMoney()+" 主任审核通过！");
		}
		else{
			if(this.successor!=null)
			{
				this.successor.handleRequest(request);
			}
		}
	}
}
