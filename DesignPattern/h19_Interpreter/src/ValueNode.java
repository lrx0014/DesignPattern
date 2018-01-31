
public class ValueNode implements Node{

	private int value;
	
	public ValueNode(int value)
	{
		this.value = value;
	}
	
	@Override
	public int interpret() {
		// TODO Auto-generated method stub
		return this.value;
	}

}
