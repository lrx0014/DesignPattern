package h22_Memento;

public class Client {
	public static void main(String[] args){
		UserInfoDTO user = new UserInfoDTO();
		CareTaker c = new CareTaker();
		
		user.setAccount("aaa");
		user.setPassword("0000");
		user.setTelNo("1300000");
		System.out.print("State 1:\n");
		user.show();
		c.setMemento(user.saveMemento());
		System.out.print("\n");
		
		user.setPassword("1111");
		System.out.print("State 2:\n");
		user.show();
		c.setMemento(user.saveMemento());
		System.out.print("\n");
		
		user.setPassword("2222");
		System.out.print("State 3:\n");
		user.show();
		System.out.print("\nRestore to 2:\n");
		
		user.restoreMemento(c.getMemento());
		user.show();
		
		System.out.print("\nRestore to 1:\n");
		user.restoreMemento(c.getMemento());
		user.show();
		
	}
}
