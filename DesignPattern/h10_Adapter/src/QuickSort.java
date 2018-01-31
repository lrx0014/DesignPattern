
public class QuickSort {
	public int[] quicksort(int[] num){
		return sort(num,0,num.length-1);
	}
	private int[] sort(int[] num,int left,int right){
		if(left<right){
			int s = num[left];
			int i = left;
			int j = right+1;
			while(true){
				while(i+1<num.length && num[++i]<s);
				while(j-1>-1 && num[--j]>s);
				if(i>=j){
					break;
				}
				swap(num,i,j);
			}
			num[left] = num[j];
			num[j] = s;
			sort(num,left,j-1);
			sort(num,j+1,right);
		}
		return num;
	}
	private void swap(int[] num,int i,int j){
		int t;
		t = num[i];
		num[i] = num[j];
		num[j] = t;
	}
}
