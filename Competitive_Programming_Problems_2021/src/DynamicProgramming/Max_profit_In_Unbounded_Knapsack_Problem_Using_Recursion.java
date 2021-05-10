package DynamicProgramming;

public class Max_profit_In_Unbounded_Knapsack_Problem_Using_Recursion {

	
	public void solve() {
		//int[] weights = {1, 3, 4, 5} ;  
		//int[] values = {10, 40, 50, 70};  	// Output 110
		//int n = weights.length;
		//int W = 8;
		
		int[] weights = {5,10,15};
		int[] values = {10,30,20};
		int n = weights.length;
		int W = 100;
		
		System.out.println(solve(weights, values, n, W));
		
	}
	
	
	private int solve(int[] weights, int[] values, int n, int W) {
		
		if(n ==0 || W == 0) {
			return 0;
		}
		
		if(weights[n-1] <= W) {
			return  Integer.max( values[n-1] + solve(weights, values, n, W - weights[n-1] ), 	solve(weights, values, n-1, W )	);
		}
		else {
			return solve(weights, values, n-1, W);
		}	
	}
	
	
	
	
	/*
	public void getMaxProfit() {
		
		int[] weights = {1, 3, 4, 5} ;  
		int[] values = {10, 40, 50, 70};  	// Output 110
		
		int capacity = 8;
		int n=  weights.length;
		
		int[][] dp = new int[n+1][capacity+1];
		for(int i=0; i<n+1; i++) {
			for(int j=0; j<capacity+1; j++) {
				
				if(i == 0 || j==0) {
					dp[i][j] = 0;	
				}
				
			}
		}
		
		System.out.println(getMaxProfit(weights, values, capacity, n , dp));
	}
	
	private int getMaxProfit(int[] weights, int[] values, int capacity, int n, int[][] dp) {
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=capacity; j++) {
				
				if(weights[i-1] <= j) {
					
					dp[i][j] = Integer.max( values[i-1] + dp[i][j - weights[i-1]] , dp[i-1][j]);
				}
				else if(weights[i-1] > j   ) {
					dp[i][j] = dp[i-1][j];
				}
				
			}
		}
				
		return dp[n][capacity];
	}
	
	
	*/
	
	
}
