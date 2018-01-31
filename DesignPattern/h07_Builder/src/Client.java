
public class Client {
	public static void main(String[] args){
		ComputerBuilder cb = (ComputerBuilder)XMLUtil.getBean();
		ComputerFactory cf = new ComputerFactory();
		cf.setComputerBuilder(cb);
		Computer computer = cf.construct();
		System.out.println("Computer:");
		
		System.out.println(computer.getCase()     + "\n"
						  +computer.getCPU()      + "\n"
						  +computer.getMemory()   + "\n"
						  +computer.getHarddisk() + "\n"
						  +computer.getMonitor());
	}
}
