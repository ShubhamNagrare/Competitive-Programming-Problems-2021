package Heap;


public class Implement_A_Min_Heap {
	
	public void solve() {
		
		  int arr[] = { 1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17 };
		  
		  int n = arr.length;
		  buildHeap(arr, n);
		  
		  int k = arr[0];
		  System.out.println(k);
		  
	}
	
	
	
	public void heapify(int[] arr, int n, int i) {
		
		int largest = i;
		int left = (2*i)+1;
		int right = (2*i)+2;
		
		if(left < n && arr[left] > arr[largest]) {
			largest = left;
		}
		
		if(right < n && arr[right] > arr[largest]) {
			largest = right;
		}
		
		if(largest != i) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			
			heapify(arr, n, largest);
		}
		
		
		
	}
	
	
	
	public void buildHeap(int[] arr, int n) {
		
		int ind = (n/2) - 1;
		
		for(int i=ind; i>=0; i--) {
			heapify(arr, n, i);
		}
		
	}

}
