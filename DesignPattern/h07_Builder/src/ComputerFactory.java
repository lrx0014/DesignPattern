
public class ComputerFactory {
	private ComputerBuilder cb;
	public void setComputerBuilder(ComputerBuilder cb)
	{
		this.cb = cb;
	}
	
	public Computer construct()
	{
		cb.buildCPU();
		cb.buildCase();
		cb.buildHarddisk();
		cb.buildMemory();
		cb.buildMonitor();
		return cb.getComputer();
	}
}
