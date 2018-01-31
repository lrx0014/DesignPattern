package h17_Behavioral;

public class AssistentManager extends Leader{
	
	public void handleRequest(Request request)
	{
		if(request.getMoney()<100000)
		{
			System.out.println("采购："+request.getMoney()+" 副经理审核通过！");
		}
		else{
			if(this.successor!=null)
			{
				this.successor.handleRequest(request);
			}
		}
	}
}
