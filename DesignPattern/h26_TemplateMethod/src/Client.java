

public class Client {
	public static void main(String[] args) {
		Bank ca=new CurrentAccount();
		Bank sa=new SavingAccount();
		
		ca.accrual();
		sa.accrual();
	}

}
