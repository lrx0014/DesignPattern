
public class Client {
	public static void main(String[] args) throws ClassNotFoundException{
		Log log;
		LogFactory lf;
		Class c = Class.forName("ConsoleLogFactory");
		Object obj = null;
		try {
			obj = c.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		lf = (ConsoleLogFactory)obj;
		log = lf.createLog();
		log.writeLog();
	}
}
