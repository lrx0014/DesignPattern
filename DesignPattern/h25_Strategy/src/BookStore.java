

public class BookStore {
	private Discount discount;
	public void  setDiscount(Discount discount){
		this.discount=discount;
	}
	
	public void discount(){
		discount.discount();
	}
}
