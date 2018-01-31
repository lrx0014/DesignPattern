
public class DataOperationAdapter implements DataOperation{
	QuickSort qs = new QuickSort();
	BinarySearch bs = new BinarySearch();
	@Override
	public int[] sort(int[] arr) {
		// TODO Auto-generated method stub
		return qs.quicksort(arr);
	}

	@Override
	public int search(int[] arr, int num) {
		// TODO Auto-generated method stub
		return bs.binarySearch(arr, num);
	}
}
