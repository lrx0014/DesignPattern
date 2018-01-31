
public class GreenState extends AccountState{
	public GreenState(double balance,Account acc)
	{
		this.balance = balance;
		this.acc = acc;
		this.stateName = "Green";
	}
	
	public GreenState(AccountState state)
	{
		this.acc = state.acc;
		this.balance = state.getBalance();
		this.stateName = "Green";
	}

	@Override
	public void stateCheck() {
		// TODO Auto-generated method stub
		if(balance<0 && balance>=-1000)
		{
			acc.setState(new YellowState(this));
		}
		else if(balance<-1000)
		{
			acc.setState(new RedState(this));
		}
	}
}
