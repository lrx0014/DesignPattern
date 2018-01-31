
public class Client {
	public static void main(String[] args){
		DataOperation DO = (DataOperation)XMLUtil.getBean();
		int[] arr = {3,5,8,1,6,8,7,1,0,5};
		System.out.println("arr:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n");
		int[] arr2 = DO.sort(arr);
		System.out.println("after sort:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr2[i]+" ");
		}
		System.out.println("\n\nSearch for 5");
		int n = DO.search(arr,5);
		System.out.println(n);
	}
}
