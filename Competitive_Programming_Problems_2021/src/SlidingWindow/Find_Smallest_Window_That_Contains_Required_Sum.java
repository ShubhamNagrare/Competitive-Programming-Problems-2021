package SlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class Find_Smallest_Window_That_Contains_Required_Sum {
	
	public void solve() {
		
		int[] arr = {1, 1, 2, 6, 2, 2, 8, 1};
		int sum = 4;
		
		findSmallestWindow(arr, arr.length, sum);
	}
	
	private void findSmallestWindow(int[] arr, int n, int k) {
		
		if(n==0 || k==0) {
			return;
		}
		
		int i=0; int j=0;
		int sum = 0;
		int diff = Integer.MAX_VALUE;
		List<Integer> list = new ArrayList<>();
		
		while(j<n){			
			sum += arr[j];
			j++;
			
			while(i < j && sum > k) {
				sum -= arr[i];
				i++;
			}
				
			if(sum == k) {
				if((arr[j-1] - arr[i]) < diff) {
					diff = arr[j-1] - arr[i];
					list.clear();
					list.add(i);
					list.add(j-1);
				}
			}			
		}
		
		System.out.println(list.get(0) + "  " + list.get(1));
		
		
	}

}
