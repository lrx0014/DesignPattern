
public class Customer implements Cloneable{
	private Address address = null;
	public Address getAddress(){
		return address;
	}
	public void setAddress(Address address){
		this.address = address;
	}
	public Object clone()
	{
		Customer clone = null;
		try{
			clone = (Customer)super.clone();
		}catch (CloneNotSupportedException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return clone;
	}
}
