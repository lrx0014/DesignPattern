
public class OracleFactory implements dbFactory {

	@Override
	public Database produceDatabase() {
		// TODO Auto-generated method stub
		return new OracleDatabase();
	}

	@Override
	public Others produceOthers() {
		// TODO Auto-generated method stub
		return null;
	}

}
