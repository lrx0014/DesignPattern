

public class Level3 extends MyAuthority {

	public void accept(MyAccount visitor) {
		visitor.visit(this);
	}

}
