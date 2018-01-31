package h11_Bridge;

public class Client {
	public static void main(String[] args)
	{
		Production production;
		Corporation corporation;
		
		production = new Television();
		corporation = new TCL();
		
		corporation.setProduction(production);
		corporation.function();
	}
}
