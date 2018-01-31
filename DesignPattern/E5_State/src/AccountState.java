
public abstract class AccountState {
	protected Account acc;
	protected String stateName;
	protected double balance;
	
	public abstract void stateCheck();
	
	public void deposit(double amount)
	{
		System.out.println(acc.getOwner() + "���룺" + amount + " Ԫ...");
		this.balance += amount;
		stateCheck();
		System.out.println("�˻����Ϊ��"+this.balance+" Ԫ,��ǰ״̬Ϊ��"+acc.getState());
	}
	
	public void withdraw(double amount)
	{
		System.out.println(acc.getOwner() + "ȡ����" + amount + " Ԫ...");
		this.balance -= amount;
		stateCheck();
		System.out.println("�˻����Ϊ��"+this.balance+" Ԫ,��ǰ״̬Ϊ��"+acc.getState());
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
