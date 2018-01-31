
public class BenzFactory implements CarFactory{

	@Override
	public Driving createConnection() {
		// TODO Auto-generated method stub
		return new BenzDriving();
	}

	@Override
	public Statement createStatement() {
		// TODO Auto-generated method stub
		return new BenzStatement();
	}

}
