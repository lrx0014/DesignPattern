package h13_Decorator;

public class Client {
	public static void main(String[] args)
	{
		Book book;
		book = new Basic();
		book.BorrowBook();
		book.ReturnBook();
		System.out.println("\n");
		FreezeBook fb = new FreezeBook(book);
		fb.freeze();
		LostBook lb = new LostBook(book);
		lb.lose();
	}
}
