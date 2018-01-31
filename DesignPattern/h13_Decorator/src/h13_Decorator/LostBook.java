package h13_Decorator;

public class LostBook extends Other{

	LostBook(Book book) {
		super(book);
		// TODO Auto-generated constructor stub
	}

	public void lose()
	{
		System.out.println("Lose a book...");
	}
}
