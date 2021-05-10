package DynamicProgramming;

public class Max_profit_In_Unbounded_Knapsack_Problem_Using_Tabulation {
	
	public void solve() {
//		int[] weights = {1, 3, 4, 5} ;  
//		int[] values = {10, 40, 50, 70};  	// Output 110
//		int n = weights.length;
//		int W = 8;
		
		int[] weights = {5,10,15};
		int[] values = {10,30,20};  //300
		int n = weights.length;
		int W = 100;
		
		int[][] dp = new int[n+1][W+1];
		for(int i=0;i<n+1; i++) {
			for(int j=0;j<W+1; j++) {
				dp[i][j] = 0;
			}
		}
		
		System.out.println(solve(weights, values, n, W, dp));
	}
	
	
	private int solve(int[] weights, int[] values, int n, int W, int[][] dp) {
		
		for(int i=1; i< n+1; i++)
		{
			for(int j=1; j< W+1; j++) 
			{
				if(weights[i-1] <=j) 
				{
					dp[i][j] = Integer.max( values[i-1] + dp[i][j - weights[i-1]] , dp[i-1][j] );
				}
				else
				{
					dp[i][j] = dp[i-1][j];
				}
			}
		}
		
		return dp[n][W];
	}

}
