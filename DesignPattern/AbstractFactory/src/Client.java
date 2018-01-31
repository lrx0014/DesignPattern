
public class Client {
	public static void main(String[] args)
	{
		CarFactory db;
		Driving con;
		Statement sta;
		db = new BenzFactory();
		con = db.createConnection();
		sta = db.createStatement();
		con.drive();
		sta.state();
	}
}
