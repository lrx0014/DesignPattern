package h14_Facade;

public class TurnOn {
	private CPU cpu;
	private Harddisk hd;
	private OS os;
	private Memory memory;
	
	TurnOn()
	{
		cpu = new CPU();
		hd = new Harddisk();
		os = new OS();
		memory = new Memory();
	}
	
	public void on()
	{
		if(
			cpu.run() &&
			memory.check() &&
			hd.read() &&
			os.load()
		  ) System.out.println("\n 计算机启动成功!");
		else
		{
			System.out.println("出现错误，启动失败...");
		};
			
	}
}
