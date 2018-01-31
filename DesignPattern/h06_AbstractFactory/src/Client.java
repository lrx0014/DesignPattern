
public class Client {
	public static void main(String[] args){
		try{
			dbFactory factory;
			Others db;
			factory = (dbFactory)XMLUtil.getBean();
			db = factory.produceOthers();
			db.run();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}
