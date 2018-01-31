
public class Client {
	public static void main(String[] args){
		Multiton A,B,C;
		A = Multiton.getInstance();
		B = Multiton.getInstance();
		C = Multiton.getInstance();
		System.out.println(A==B);
		System.out.println(A==C);
		System.out.println(C==B);
	}
}
