

public class Client {
	public static void main(String[] args) {
		MyAuthority lv1=new Level1();
		MyAuthority lv2=new Level2();
		MyAuthority lv3=new Level3();
		MyAccount visitor=new Visitor();
		
		MySystem sys=new MySystem();
		sys.addLevel(lv1);
		sys.addLevel(lv2);
		sys.addLevel(lv3);
		
		sys.accept(visitor);
	}

}
