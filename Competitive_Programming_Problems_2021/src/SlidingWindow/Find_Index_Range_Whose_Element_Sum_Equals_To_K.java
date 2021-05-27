package SlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class Find_Index_Range_Whose_Element_Sum_Equals_To_K {
	
	public void solve() {
		
		int[] arr = {1,3,2,1,4,1,3,2,1,1,2};			// Answer 2 5		4 6			5 9
		int k = 8;
		
	   getSumIndex(arr, arr.length, k);
		
	}
	
	private void getSumIndex(int[] arr, int n, int k){
		
		
		if(k == 0  || n < 1) {
			return;
		}
	
		int i=0; int j=0;
		int sum = arr[i];
		while( j< n-1) {
			
			if(sum < k) {
				j++;
				sum = sum + arr[j];
			}
			else if(sum > k){
				sum = sum - arr[i];
				i++;
			}
			else {
				System.out.println(" " + i + " " + j);
				sum = sum - arr[i];
				i++;
				j++;
				sum = sum + arr[j];
			}
			
		}
		
		

	}

}
