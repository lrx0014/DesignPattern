
public class ImageFile extends AbstractFile{
	private String name;
	
	ImageFile(String name)
	{
		this.name = name;
	}
	@Override
	public void killVirus() {
		// TODO Auto-generated method stub
		System.out.println("�ԡ�ͼ���ļ�-"+name+"������ɱ��...");
	}
}
