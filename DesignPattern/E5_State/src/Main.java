
public class Main {
	public static void main(String[] args)
	{
		Account ac = new Account("Sam",0);
		ac.deposit(1000);
		
		ac.withdraw(1002);
		
		ac.withdraw(1000);
	}
}
