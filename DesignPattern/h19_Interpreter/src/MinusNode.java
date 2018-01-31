
public class MinusNode extends SymbolNode{
	public MinusNode(Node left,Node right)
	{
		super(left,right);
	}
	
	public int interpret()
	{
		return super.left.interpret() - super.right.interpret();
	}
}
