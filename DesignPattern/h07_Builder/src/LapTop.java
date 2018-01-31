
public class LapTop extends ComputerBuilder{

	@Override
	public void buildCPU() {
		// TODO Auto-generated method stub
		computer.setCPU("core-i7");
	}

	@Override
	public void buildCase() {
		// TODO Auto-generated method stub
		computer.setCase("laptop-case");
	}

	@Override
	public void buildMonitor() {
		// TODO Auto-generated method stub
		computer.setMonitor("laptop-monitor");
	}

	@Override
	public void buildMemory() {
		// TODO Auto-generated method stub
		computer.setMemory("laptop-memory");
	}

	@Override
	public void buildHarddisk() {
		// TODO Auto-generated method stub
		computer.setHarddisk("laptop-hardisk");
	}

}
