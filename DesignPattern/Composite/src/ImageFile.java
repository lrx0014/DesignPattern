
public class ImageFile extends AbstractFile{
	private String name;
	
	ImageFile(String name)
	{
		this.name = name;
	}
	@Override
	public void killVirus() {
		// TODO Auto-generated method stub
		System.out.println("对【图像文件-"+name+"】进行杀毒...");
	}
}
