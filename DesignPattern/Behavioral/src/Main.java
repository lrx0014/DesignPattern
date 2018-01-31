/// Behavioral

public class Main {
	public static void main(String[] args)
	{
		Leader director,assistent,general,meet;
		director = new Director();
		assistent = new AssistentManager();
		general = new GeneralManager();
		meet = new Meet();
		
		director.setSuccessor(assistent);
		assistent.setSuccessor(general);
		general.setSuccessor(meet);
		
		Request req = new Request(300000);
		director.handleRequest(req);
	}
}

abstract class Leader {
	protected Leader successor;
	
	public void setSuccessor(Leader successor)
	{
		this.successor = successor;
	}
	
	public abstract void handleRequest(Request request);
}

class AssistentManager extends Leader{
	
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

class DepartmentManager extends Leader{
	
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


class Meet extends Leader{
	
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

class GeneralManager extends Leader{
	
	public void handleRequest(Request request)
	{
		if(request.getMoney()<200000)
		{
			System.out.println("采购："+request.getMoney()+" 总经理审核通过！");
		}
		else{
			if(this.successor!=null)
			{
				this.successor.handleRequest(request);
			}
		}
	}
}

class Director extends Leader{
	
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

class Request {
	private int money;
	
	public Request(int money)
	{
		this.money = money;
	}
	
	public int getMoney()
	{
		return money;
	}
}
