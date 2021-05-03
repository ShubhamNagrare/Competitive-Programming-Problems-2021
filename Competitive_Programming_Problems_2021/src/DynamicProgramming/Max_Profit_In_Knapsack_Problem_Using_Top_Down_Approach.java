package DynamicProgramming;

public class Max_Profit_In_Knapsack_Problem_Using_Top_Down_Approach {

	
	
	static int[][] dp = new int[7+1][25+1];
	
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
	
	
}
