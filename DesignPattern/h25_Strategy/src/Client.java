

public class Client {
	public static void main(String[] args) {
		BookStore bs=new BookStore();
		Discount d1,d2,d3;
		d1=new ComputerBook();
		d2=new LanguageBook();
		d3=new NovelBook();
		bs.setDiscount(d1);
		bs.discount();
		bs.setDiscount(d2);
		bs.discount();
		bs.setDiscount(d3);
		bs.discount();
	}

}
