package h17_Behavioral;

public class Meet extends Leader{
	
	public void handleRequest(Request request)
	{
		if(request.getMoney()>=200000)
		{
			System.out.println("�ɹ���"+request.getMoney()+" ����20����Ҫ�������");
		}
		else{
			if(this.successor!=null)
			{
				this.successor.handleRequest(request);
			}
		}
	}
}
