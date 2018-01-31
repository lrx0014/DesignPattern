
public class Main {
	public static void main(String[] args)
	{
		int[] a = new int[3];
		int[] b = new int[3];
		int[] c = new int[3];
		for(int i=0;i<1000;i++)
		{
			for(int j=0;j<1000;j++)
			{
				a[0] = i/100;
				a[1] = (i/10)%10;
				a[2] = i%100;
				
				b[0] = i/100;
				b[1] = (i/10)%10;
				b[2] = i%100;
				if(i+j < 1000)
				{
					System.out.println(i+j);
				}
			}
		}
		
	}
	
}
