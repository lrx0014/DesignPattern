package h17_Behavioral;

public abstract class Leader {
	protected Leader successor;
	
	public void setSuccessor(Leader successor)
	{
		this.successor = successor;
	}
	
	public abstract void handleRequest(Request request);
}
