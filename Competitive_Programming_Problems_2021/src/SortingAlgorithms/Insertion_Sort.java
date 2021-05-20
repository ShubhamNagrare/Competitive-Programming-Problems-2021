package SortingAlgorithms;

public class Insertion_Sort {
	
	public void sort() {		
		int arr[] = {64,25,12,22,11};
		insertionSort(arr, arr.length);
	}
	
	private void insertionSort(int[] arr, int n) {
		
		for(int i=1; i<n; i++) {
			
			int key = arr[i];
			
			int j = i-1;
			while(j >= 0 && arr[j] > key) {
				
				arr[j+1] = arr[j];
				j = j-1;
			}
			
			arr[j+1] = key;			
		}
		
		for(int k=0; k<n; k++)
		System.out.print(" " + arr[k]);
		
	}

}
