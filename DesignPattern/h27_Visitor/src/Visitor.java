

public class Visitor extends MyAccount {

	public void visit(Level1 lv1) {
		System.out.println("Visitor lv1");
	}

	public void visit(Level2 lv2) {
		System.out.println("Visitor,no authority");
	}

	public void visit(Level3 lv3) {
		System.out.println("Visitor,no authority");
	}

}
