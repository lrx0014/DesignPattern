
public class Account {
	private AccountState state;
	private String owner;
	
	public Account(String owner,double init)
	{
		this.owner = owner;
		this.state = new GreenState(init,this);
		state.balance = init;
	}
	
	public void setState(AccountState state)
	{
		this.state = state;
	}
	
	public void deposit(double amount)
	{
		state.deposit(amount);
	}
	
	public void withdraw(double amount)
	{
		state.withdraw(amount);
	}
	
	public String getOwner()
	{
		return this.owner;
	}
	
	public String getState()
	{
		return this.state.stateName;
	}
}
