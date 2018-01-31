package h16_Proxy;

public class Client {
	public static void main(String[] args)
	{
		AbstractSystem as;
		as = new PictureProxy();
		as.run();
	}
}
