package Array;

public class Reverse_The_Array {

	public static int[] reverseArray(int[] arr, int n) {
		if(n > 0) {			
			for(int i=0; i<n/2; i++) {
				arr[i] = arr[i] ^ arr[n-i-1];
				arr[n-i-1] = arr[i] ^ arr[n-i-1];
				arr[i] = arr[i] ^ arr[n-i-1];
			}
		}
		return arr;
	}
	
}
