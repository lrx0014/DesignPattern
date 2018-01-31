package h17_Behavioral;

public class DepartmentManager extends Leader{
	
	public void handleRequest(Request request)
	{
		if(request.getMoney()<50000)
		{
			System.out.println("�ɹ���"+request.getMoney()+" ���ž������ͨ����");
		}
		else{
			if(this.successor!=null)
			{
				this.successor.handleRequest(request);
			}
		}
	}
}
