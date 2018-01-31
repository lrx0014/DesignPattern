import java.util.Random;

public class Multiton {
	private static Multiton[] arr = {
			new Multiton(),
			new Multiton(),
			new Multiton()
	};
	
	private Multiton(){
		//
	}
	
	public static Multiton getInstance(){
		return arr[random()];
	}

	private static int random() {
		// TODO Auto-generated method stub
		Random random = new Random();
		int value = Math.abs(random.nextInt());
		value = value % 3;
		return value;
	}
}
