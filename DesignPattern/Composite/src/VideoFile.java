
public class VideoFile extends AbstractFile{
	private String name;
	
	VideoFile(String name)
	{
		this.name = name;
	}

	@Override
	public void killVirus() {
		// TODO Auto-generated method stub
		System.out.println("�ԡ���Ƶ�ļ�-"+name+"������ɱ��...");
	}

}
