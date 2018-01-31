
public class RedState extends AccountState{

	public RedState(AccountState state)
	{
		this.acc = state.acc;
		this.balance = state.getBalance();
		this.stateName = "Red";
	}
	
	@Override
	public void stateCheck() {
		// TODO Auto-generated method stub
		if(balance>0)
		{
			acc.setState(new GreenState(this));
		}
		else if(balance<0 && balance>=-1000)
		{
			acc.setState(new YellowState(this));
		}
	}
	
}
