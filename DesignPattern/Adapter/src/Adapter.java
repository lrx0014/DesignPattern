
public class Adapter extends Adaptee implements Target{

	@Override
	public void Request() {
		// TODO Auto-generated method stub
		System.out.println("通过适配器调用：");
		super.specificRequest();
	}

}
