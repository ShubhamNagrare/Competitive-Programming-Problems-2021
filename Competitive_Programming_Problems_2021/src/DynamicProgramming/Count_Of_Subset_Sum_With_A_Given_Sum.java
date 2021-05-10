package DynamicProgramming;

public class Count_Of_Subset_Sum_With_A_Given_Sum {
	
	
	public void solve() {
		
		int[] arr =  {2,3,5,6,8,10};
		int n  = arr.length;		
		int sum = 10;
			
		int[][] dp = new int[n+1][sum+1];
		
		for(int i=0; i< n+1; i++) {
			for(int j=0; j< sum+1; j++) {
				
				if(i == 0) {

					dp[i][j] = 0;
				}
				if(j == 0) {

					dp[i][j] = 1;
				}
								
			}
		}
		
		System.out.println(solve(arr, n, sum, dp));		
	}
	
	
	private int solve(int[] arr, int n, int sum, int[][] dp) {
		
		for(int i=1; i<n+1; i++) {
			for(int j=1; j<sum+1; j++) {
							
				if(arr[i-1] <= j) {
					dp[i][j] = dp[i-1][j] + dp[i-1][j - arr[i-1]];
				}
				else {
					dp[i][j] = dp[i-1][j];
				}
			}
		}
		
		return dp[n][sum];
	}
	
}
