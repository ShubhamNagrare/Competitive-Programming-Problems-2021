package DynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class Find_Minimum_Subset_Sum_Difference_Using_Tabulation {

	public void solve() {
		
		int[] arr = {1,2,7};		// Answer should be 7-3 = 4
		int n= arr.length;
		
		int sum= 0;
		
		for(int i=0; i<n; i++) {
			sum+= arr[i];
		}
		
		boolean[][] dp = new boolean[n+1][sum+1];
		
		for(int i=0; i<n+1; i++) {
			for(int j=0; j<sum+1; j++) {
				if(i==0) {

					dp[i][j] = false;
				}
				if(j ==0) {

					dp[i][j] = true;
				}
			}
		}	
		
		System.out.println(solve(arr, n, sum, dp));
	}
	
	
	private int solve(int [] arr, int n, int sum, boolean[][] dp) {
		
		for(int i=1; i<n+1; i++) {
			for(int j=1; j<sum+1; j++) {
				
				if(arr[i-1] <= j) {
					dp[i][j] = dp[i-1][j] || dp[i-1][j- arr[i-1]];
				}
				else {
					dp[i][j] = dp[i-1][j];
				}				
			}
		}
		
		
		List<Integer> li = new ArrayList<>();
		for(int i=n; i<n+1; i++) {
			for(int j=1; j<sum+1; j++) {
				if(dp[i][j]) {
					li.add(i);	
				}
			}
		}
		
		
		int mn = Integer.MAX_VALUE;
		for(int k=0; k<li.size()/2; k++) {
			mn = Integer.min(mn, sum - 2*li.get(k));
		}
		
		return mn;
	}
	
	
	
	
	
	
	
	
	/*
	public void findMinSumSubsetDiff() {
		
		int[] arr = {1,2,7};		// Answer should be 7-3 = 4
		
		int range = 0;
		for(int i=0; i<arr.length; i++) {
			range += arr[i];
		}
		
		int n = arr.length;
		
		System.out.println(finMinSumSubsetDiff(arr, n , range));
		
	}
	
	private int finMinSumSubsetDiff(int[] arr, int n, int sum) {
		
		boolean[][] dp = new boolean[n+1][sum+1];
		
		for(int i=0; i< n+1; i++) {
			for(int j=0; j< sum+1; j++){
				if(i == 0) {
					dp[i][j] = false;
				}
				
				if(j==0) {
					dp[i][j] = true;
				}
				
			}
		}
		
		
		List<Integer> list = findSum(arr, n, sum, dp);
		
		int mn = Integer.MAX_VALUE;
		for(int i=0; i<list.size()/2; i++) {
			
			mn = Integer.min(mn, sum - 2*list.get(i));
			
		}
		
	return mn;
	}
	
	
	private List<Integer> findSum(int[] arr, int n, int sum, boolean[][] dp) {
		
		List<Integer> li = new ArrayList<Integer>();
		
		for(int i=1; i<n+1; i++) {
			for(int j=1; j<sum+1; j++) {
				
				if( arr[i-1] <= j) {
					dp[i][j] = dp[i-1][j - arr[i-1]] || dp[i-1][j];
				}
				else  {
					dp[i][j] = dp[i-1][j];
				}				
			}
		}
		
		for(int i=n; i<=n; i++) {
			for(int j=1; j<=sum; j++) {
				
				if(dp[i][j]) {

					li.add(i);	
				}
			}
		}
		
		return li;
		
	}
	*/
	
}
