package SortingAlgorithms;

public class BubbleSort {
	
	public void sort() {
		
		int arr[] = {64,25,12,22,11};
		bubbleSort(arr, arr.length);
	}
	
	private void bubbleSort(int arr[], int n) {
		
			for(int i=0; i<n-1; i++) {
				for(int j=i+1; j<n; j++) {
					
					if(arr[i] > arr[j]) {			
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;					
					}
				}
			}
			
			for(int k=0; k<n; k++)
			System.out.print(" " + arr[k]);
			
			
	}

}
