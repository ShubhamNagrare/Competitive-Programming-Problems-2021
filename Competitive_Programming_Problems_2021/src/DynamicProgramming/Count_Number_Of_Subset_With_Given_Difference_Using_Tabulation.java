package DynamicProgramming;

public class Count_Number_Of_Subset_With_Given_Difference_Using_Tabulation {

	
	public void solve() {
		
		int[] arr = {1,1,2,3};		// Answer : 3
		int diff = 1;
		int n = arr.length;
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		int W  = (  diff + sum) /2;
		
		int[][] dp = new int[n+1][W+1];
		for(int i=0; i<n+1; i++) {
			for(int j=0; j<W+1; j++) {
				if(i == 0) {
					dp[i][j] =0;
				}
				if(j==0) {
					dp[i][j] = 1;
				}
				
			}
		}
		
		System.out.println(solve(arr, n, W, dp));	
	}
	
	private int solve(int[] arr, int n, int W, int[][] dp) {
		
		for(int i=1; i<n+1; i++) {
			for(int j=1; j<W+1; j++) {
				
				if(arr[i-1] <= j) {

					dp[i][j] = dp[i-1][j] + dp[i-1][j-arr[i-1]];	
				}
				else {
					dp[i][j] = dp[i-1][j];
				}			
			}
		}
		
		return dp[n][W];
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	public void givenSubsetWithGivenDifference() {
		
		int[] arr = {1,1,2,3};
		int diff = 1;
		int n= arr.length;
		
		int sum = 0;
		for(int i=0; i<n; i++) {
			sum += arr[i];
		}
		
		int s1 = (diff + sum) /2;
		
		int[][] dp = new int[n+1][s1+1];
		
		for(int i=0; i<n+1; i++) {
			for(int j=0; j<s1+1; j++) {
				if(i==0) {
					dp[i][j] = 0;
				}
				if(j==0) {
					dp[i][j] = 1;
				}
			}
		}		
		System.out.println("Answer : " + givenSubsetWithGivenDifference(arr, n, s1, dp));		
	}
	
	
	private int givenSubsetWithGivenDifference(int[] arr, int n, int sum, int[][] dp) {
		
		for(int i=1; i<n+1; i++) {
			for(int j=1; j<sum+1; j++) {
				
				if (arr[i-1] <= j) {
					dp[i][j] = dp[i-1][j - arr[i-1]] + dp[i-1][j];
				}
				else {
					dp[i][j] = dp[i-1][j];
				}				
			}
		}		
		return dp[n][sum];	
	}
	
	*/
	
	
}
