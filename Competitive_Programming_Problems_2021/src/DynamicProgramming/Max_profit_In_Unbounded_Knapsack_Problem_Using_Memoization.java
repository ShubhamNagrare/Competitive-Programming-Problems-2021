package DynamicProgramming;

public class Max_profit_In_Unbounded_Knapsack_Problem_Using_Memoization {

	public void solve() {
		int[] weights = {1, 3, 4, 5} ;  
		int[] values = {10, 40, 50, 70};  	// Output 110
		int n = weights.length;
		int W = 8;
		
//		int[] weights = {5,10,15};
//		int[] values = {10,30,20};
//		int n = weights.length;
//		int W = 100;
		
		int[][] dp = new int[n+1][W+1];
		for(int i=0;i<n+1; i++) {
			for(int j=0;j<W+1; j++) {
				dp[i][j] = -1;
			}
		}
		
		System.out.println(solve(weights, values, n, W, dp));
	}
	
	
	private int solve(int[] weights, int[] values, int n, int W, int[][] dp) {
		
		if(n ==0 || W == 0) {
			return 0;
		}
		
		if(dp[n][W] != -1) {
			return dp[n][W];
		}
		
		if(weights[n-1] <= W) {
			
			return dp[n][W] = Integer.max( values[n-1] + solve(weights, values, n, W - weights[n-1], dp), solve(weights, values, n-1, W, dp));
		} 
		else {
			return dp[n][W] = solve(weights, values, n-1, W, dp);
		}
		
	}
	
	
}
