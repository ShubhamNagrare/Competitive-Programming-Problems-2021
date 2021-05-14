package DynamicProgramming;

public class Count_Of_Subset_To_Get_Target_Sum {

	public void solve() {
		int[] arr = {1,1,2,3}; // Answer = 3   ex: 1-1-2+3 =1
		int sum = 1;
		int n = arr.length;
		
		int total =0;
		for(int i=0; i<n; i++) {
			total += arr[i];
		}
		
		int W = (sum + total) / 2;
		
		int[][]  dp = new int[n+1][W+1];
		
		for(int i=0; i<n+1; i++) {
			for(int j=0; j<W+1; j++) {
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
	
	
}
