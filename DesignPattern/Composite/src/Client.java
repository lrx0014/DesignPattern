
public class Client {
	public static void main(String[] args)
	{
		AbstractFile text1,text2,text3,video1,video2,video3,image1,image2,image3;
		Folder folder1;
		
		text1 = new TextFile("text1");
		text2 = new TextFile("text2");
		text3 = new TextFile("text3");
		video1 = new VideoFile("video1");
		video2 = new VideoFile("video2");
		video3 = new VideoFile("video3");
		image1 = new ImageFile("image1");
		image2 = new ImageFile("image2");
		image3 = new ImageFile("image3");
		folder1 = new Folder("folder1");
		
		folder1.add(text2);
		folder1.add(video3);
		folder1.add(image1);
		
		text1.killVirus();
		video2.killVirus();
		folder1.killVirus();
	}
}
