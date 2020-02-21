import java.util.*;

public class MergeSort implements SortingAlgorithm {

	public void sort(int [] a) {
		mergeSort(a);
	}

	void mergeSort(int [] a) {
		if (a.length == 1){
			return;
		}
		// split the array in two
		int mid = a.length/2;
		int [] aStart = Arrays.copyOfRange(a, 0, mid);
		int [] aEnd = Arrays.copyOfRange(a, mid, a.length);

		mergeSort(aStart);
		mergeSort(aEnd);
		//merging
		merge(a, aStart, aEnd);
	}


	void merge(int [] target, int [] start, int [] end){
		int indexL = 0;
		int indexR = 0;
		int indexT = 0;
		while(indexL < start.length && indexR < end.length){
			if(start[indexL] <= end[indexR]){
				target[indexT++] = start[indexL++];
			}else{
				target[indexT++] = end[indexR++];
			}
		}

		while(indexL < start.length){
			target[indexT++] = start[indexL++];
		}
		while(indexR < end.length){
			target[indexT++] = end[indexR++];
		}

	}

}