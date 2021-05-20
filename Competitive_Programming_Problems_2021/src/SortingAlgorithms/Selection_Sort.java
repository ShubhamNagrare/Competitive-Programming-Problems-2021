package SortingAlgorithms;

public class Selection_Sort {
	
	public void sort() {
		
		int arr[] = {64,25,12,22,11};
		selectionSort(arr, arr.length);
	}
	
	private void selectionSort(int[] arr, int n) {
		
		for(int i=0; i<n-1; i++) {
			
			int min = i;
			for(int j=i+1; j<n; j++) {
				
				if(arr[j]<arr[min]) {
					min = j;
				}		
			}
			
			if(min != i) {
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}

		}
		
		for(int k=0; k<n; k++) {
			System.out.print(" " + arr[k]);
		}	
	}

	
	
}
