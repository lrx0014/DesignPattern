
public class Client {
	public static void main(String[] args){
		Customer customer = new Customer();
		customer.setAddress(new Address());
		Customer copy1 = (Customer)customer.clone();
		System.out.println("customer==copy1");
		System.out.println(customer==copy1);
		System.out.println("customer.getAddress==copy1.getAddress");
		System.out.println(customer.getAddress()==copy1.getAddress());
		
		CustomerDeep deep = new CustomerDeep();
		deep.setAddress(new Address());
		CustomerDeep deep2 = (CustomerDeep)deep.clone();
		System.out.println("\n");
		System.out.println("deep==deep2");
		System.out.println(deep==deep2);
		System.out.println("deep.getAddress==deep2.getAddress");
		System.out.println(deep.getAddress()==deep2.getAddress());
	}
}
