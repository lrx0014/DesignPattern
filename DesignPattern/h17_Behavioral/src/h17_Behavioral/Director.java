package h17_Behavioral;

public class Director extends Leader{
	
	public void handleRequest(Request request)
	{
		if(request.getMoney()<10000)
		{
			System.out.println("�ɹ���"+request.getMoney()+" �������ͨ����");
		}
		else{
			if(this.successor!=null)
			{
				this.successor.handleRequest(request);
			}
		}
	}
}
