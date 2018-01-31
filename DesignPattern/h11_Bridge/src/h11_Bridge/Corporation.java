package h11_Bridge;

public abstract class Corporation {
	protected Production production;
	public void setProduction(Production pro)
	{
		this.production = pro;
	}
	public abstract void function();
}
