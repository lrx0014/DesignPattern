package h13_Decorator;

public class FreezeBook extends Other{

	FreezeBook(Book book) {
		super(book);
		// TODO Auto-generated constructor stub
	}
	
	public void freeze()
	{
		System.out.println("Freeze a book...");
	}

}
