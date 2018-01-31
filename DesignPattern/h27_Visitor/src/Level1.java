

public class Level1 extends MyAuthority {

	public void accept(MyAccount visitor) {
		visitor.visit(this);
	}
}
