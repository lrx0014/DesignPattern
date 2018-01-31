

public class Level2 extends MyAuthority {

	public void accept(MyAccount visitor) {
		visitor.visit(this);
	}

}
