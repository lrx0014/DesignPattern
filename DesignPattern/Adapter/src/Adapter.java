
public class Adapter extends Adaptee implements Target{

	@Override
	public void Request() {
		// TODO Auto-generated method stub
		System.out.println("ͨ�����������ã�");
		super.specificRequest();
	}

}
