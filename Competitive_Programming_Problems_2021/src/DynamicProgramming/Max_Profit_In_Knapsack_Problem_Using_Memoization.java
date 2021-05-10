package DynamicProgramming;

public class Max_Profit_In_Knapsack_Problem_Using_Memoization {

	
	public void solve() {
		
		// Answer should be 220
        int wt[] = new int[] { 10, 20, 30 };
		int val[] = new int[] { 60, 100, 120 };
        int W = 50;
        int n = val.length;
          
        int[][] dp = new int[n+1][W+1]; 
        for(int i=0; i<n+1; i++) {
        	for(int j=0; j<W+1; j++) {
        		dp[i][j] = -1;
        	}
        }
        
        System.out.println(solve(wt, val, n, W, dp));
	}
	
	
	
	private int solve(int[] weights, int[] values, int n, int W, int[][] dp) {
		
		if(n ==0 || W == 0) {
			return 0;
		}
		
		if(dp[n][W] != -1) {
			return dp[n][W];
		}
		
		if(weights[n-1] <= W) {
			return dp[n][W] = values[n-1] + solve(weights, values, n-1, W- weights[n-1], dp); 
		}
		else {
			return dp[n][W] = solve(weights, values, n-1, W, dp);
		}
		
		
	}
	
	
	
	
	
	
	/*static int[][] dp = new int[7+1][25+1];	
	public void findMaxProfit() {
		
		int[] weights ={ 10, 5,2,4,15,7,3 };  
		int[] values = { 50,200,400,30,100,80,60};  
		
		int capacity = 25;
		
		int n = weights.length;
		

		
		
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=capacity; j++) {
				
				if(i == 0 || j==0) {
					dp[i][j] = 0;	
				}
			}
		}
				
		System.out.println(findMaxProfit(weights, values, capacity, n, dp));		
	}
	
	
	
	
	private int findMaxProfit(int[] weights, int[] values, int capacity, int n, int[][] dp) {
	
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=capacity; j++) {
				
				if(weights[i-1] <= j) {
					
					dp[i][j] = Integer.max( values[i-1] + dp[i-1][j - weights[i-1]] , dp[i-1][j]);
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
