import java.util.ArrayList;

public class Folder extends AbstractFile{
	private String name;
	
	Folder(String name)
	{
		this.name = name;
	}
	
	private ArrayList<AbstractFile> list = new ArrayList<AbstractFile>();
	
	public void add(AbstractFile file)
	{
		list.add(file);
	}
	
	public void remove(AbstractFile file)
	{
		list.remove(file);
	}

	@Override
	public void killVirus() {
		// TODO Auto-generated method stub
		System.out.println("--->�����ļ��С�"+name+"������ɱ��");
		for(Object object:list)
		{
			((AbstractFile)object).killVirus();
		}
	}

}
