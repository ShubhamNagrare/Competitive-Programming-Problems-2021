package DynamicProgramming;

public class Max_Profit_In_Knapsack_Problem_Using_Tabulation {
	
	public void solve() {
		
		// Answer should be 220
        int wt[] = new int[] { 10, 20, 30 };
		int val[] = new int[] { 60, 100, 120 };
        int W = 50;
        int n = val.length;
		
        int[][] dp = new int[n+1][W+1];
        for(int i=0; i< n+1; i++) {
        	for(int j=0; j<W+1; j++) {
        		dp[i][j] = 0;
        	}
        }
        
        
        System.out.println(solve(wt, val, n, W, dp));
		
	}
	
	
	private int solve(int [] weights, int[] values, int n, int W, int[][] dp){
		
		for(int i=1; i<n+1; i++) {
			for(int j=1; j<W+1; j++) {
				
				if(weights[i-1] <= j) {
					dp[i][j] = Integer.max( values[i-1] + dp[i-1][j - weights[i-1]] , dp[i-1][j]);
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
