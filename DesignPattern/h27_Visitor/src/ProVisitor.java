

public class ProVisitor extends MyAccount {

	public void visit(Level1 lv1) {
		System.out.println("ProVisitor lv1");
	}

	public void visit(Level2 lv2) {
		System.out.println("ProVisitor lv2");
	}

	public void visit(Level3 lv3) {
		System.out.println("ProVisitor,no authority");
	}

}
