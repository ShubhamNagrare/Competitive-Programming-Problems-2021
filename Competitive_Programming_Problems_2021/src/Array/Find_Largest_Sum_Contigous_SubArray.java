package Array;

public class Find_Largest_Sum_Contigous_SubArray {

// NOTE : This Problem is of Kadane's Algorithm
// Question Ref - https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
	
//		Input:
//		N = 5
//		arr[] = {1,2,3,-2,5}
//		Output:
//		9
	
	public static int findLargestSum(int[] arr, int n) {
		if(n ==0) return 0;
		
		int max = 0;
		int curr = 0;
		
		for(int i=0; i<n; i++) {
			
			curr += arr[i];
			if(curr > max) {
				max = curr;
			}
			
			if(curr < 0) curr = 0;			
		}
		return max;
	}
	
}
