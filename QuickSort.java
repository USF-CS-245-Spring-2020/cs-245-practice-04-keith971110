public class QuickSort implements SortingAlgorithm{
	public void sort(int[] a){
		qs(a, 0, a.length-1);
	}

	void qs(int[] a, int start, int end){
		if(start<end){
			int p = partition(a,start,end);
			qs(a, start, p-1);
			qs(a, p+1, end);
		}
	}

	public int partition(int[]a, int start, int end){
		int pivot = a[end];
		int small = start-1;
		int temp = 0;
		for(int i = start; i<end; i++){
			if(a[i]<pivot){
				small++;

				temp = a[small];
				a[small] = a[i];
				a[i] = temp;
			}
		}
		//swap
		int Temp = a[small+1];
		a[small+1] = a[end];
		a[end] = Temp;
		return small+1;
	}
}