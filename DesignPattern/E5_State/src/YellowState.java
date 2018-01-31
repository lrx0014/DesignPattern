
public class YellowState extends AccountState{

	public YellowState(AccountState state)
	{
		this.acc = state.acc;
		this.balance = state.getBalance();
		this.stateName = "Yellow";
	}
	@Override
	public void stateCheck() {
		// TODO Auto-generated method stub
		if(balance>=0)
		{
			acc.setState(new GreenState(this));
		}
		else if(balance<-1000)
		{
			acc.setState(new RedState(this));
		}
	}

}
