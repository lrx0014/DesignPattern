
public class BMWFactory implements CarFactory{

	@Override
	public Driving createConnection() {
		// TODO Auto-generated method stub
		return new BMWDriving();
	}

	@Override
	public Statement createStatement() {
		// TODO Auto-generated method stub
		return new BMWStatement();
	}

}
