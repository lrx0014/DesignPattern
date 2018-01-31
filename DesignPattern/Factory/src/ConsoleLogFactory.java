
public class ConsoleLogFactory implements LogFactory{

	@Override
	public Log createLog() {
		// TODO Auto-generated method stub
		return new ConsoleLog();
	}
	
}
