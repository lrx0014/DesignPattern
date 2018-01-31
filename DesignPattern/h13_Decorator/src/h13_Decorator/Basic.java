package h13_Decorator;

public class Basic implements Book{

	@Override
	public void BorrowBook() {
		// TODO Auto-generated method stub
		System.out.println("Borrow a book...");
	}

	@Override
	public void ReturnBook() {
		// TODO Auto-generated method stub
		System.out.println("Return a book...");
	}

}
