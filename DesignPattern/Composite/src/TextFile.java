
public class TextFile extends AbstractFile{
	private String name;
	
	TextFile(String name)
	{
		this.name = name;
	}

	@Override
	public void killVirus() {
		// TODO Auto-generated method stub
		System.out.println("对【文本文件-"+name+"】进行杀毒...");
	}

}
