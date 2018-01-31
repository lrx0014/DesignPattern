package h13_Decorator;

public class Other implements Book{
	
	private Book book;
	
	Other(Book book)
	{
		this.book = book;
	}

	@Override
	public void BorrowBook() {
		// TODO Auto-generated method stub
		book.BorrowBook();
	}

	@Override
	public void ReturnBook() {
		// TODO Auto-generated method stub
		book.ReturnBook();
	}

}
