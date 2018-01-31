
public abstract class ComputerBuilder {
	protected Computer computer = new Computer();
	public abstract void buildCPU();
	public abstract void buildCase();
	public abstract void buildMonitor();
	public abstract void buildMemory();
	public abstract void buildHarddisk();
	public Computer getComputer(){
		return computer;
	}
}
