package h17_Behavioral;

public class DepartmentManager extends Leader{
	
	public void handleRequest(Request request)
	{
		if(request.getMoney()<50000)
		{
			System.out.println("采购："+request.getMoney()+" 部门经理审核通过！");
		}
		else{
			if(this.successor!=null)
			{
				this.successor.handleRequest(request);
			}
		}
	}
}
