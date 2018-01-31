package h17_Behavioral;

public class Client {
	public static void main(String[] args)
	{
		Leader director,assistent,general,meet;
		director = new Director();
		assistent = new AssistentManager();
		general = new GeneralManager();
		meet = new Meet();
		
		director.setSuccessor(assistent);
		assistent.setSuccessor(general);
		general.setSuccessor(meet);
		
		Request req = new Request(300000);
		director.handleRequest(req);
	}
}
