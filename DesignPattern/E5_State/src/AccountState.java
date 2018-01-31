
public abstract class AccountState {
	protected Account acc;
	protected String stateName;
	protected double balance;
	
	public abstract void stateCheck();
	
	public void deposit(double amount)
	{
		System.out.println(acc.getOwner() + "存入：" + amount + " 元...");
		this.balance += amount;
		stateCheck();
		System.out.println("账户余额为："+this.balance+" 元,当前状态为："+acc.getState());
	}
	
	public void withdraw(double amount)
	{
		System.out.println(acc.getOwner() + "取出：" + amount + " 元...");
		this.balance -= amount;
		stateCheck();
		System.out.println("账户余额为："+this.balance+" 元,当前状态为："+acc.getState());
	}
	
	public String getStateName()
	{
		return this.stateName;
	}
	
	public double getBalance()
	{
		return this.balance;
	}
}
