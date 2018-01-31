
public class MySQLFactory implements dbFactory {

	@Override
	public Database produceDatabase() {
		// TODO Auto-generated method stub
		return new MySQLDatabase();
	}

	@Override
	public Others produceOthers() {
		// TODO Auto-generated method stub
		return new MySqlOthers();
	}
	
}
