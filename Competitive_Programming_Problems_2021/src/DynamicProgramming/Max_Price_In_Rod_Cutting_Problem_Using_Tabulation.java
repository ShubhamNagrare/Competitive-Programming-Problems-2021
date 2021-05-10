package DynamicProgramming;

public class Max_Price_In_Rod_Cutting_Problem_Using_Tabulation {
	
	public void solve() {
		int[] length = {1,2,3,4,5,6,7,8};
		int[] price = {1,5,8,9,10,17,17,20};

		int rodSize = 8;
		int n = length.length;
		
		int[][] dp = new int[n+1][rodSize+1];
		for(int i=0; i< n+1; i++) {
			for(int j=0; j<rodSize+1; j++) {
				dp[i][j] = 0;
			}
		}
		
		System.out.println(solve(length, price, n, rodSize, dp));		
	}

	
	private int solve(int[] len, int[] price, int n, int W, int[][] dp) {
		
		for(int i=1; i<n+1; i++) {
			for(int j=1; j< W+1; j++) {
				
				if(len[i-1] <=j) {
					
					dp[i][j] = Integer.max( price[i-1] + dp[i][j-len[i-1]]  ,  dp[i-1][j] );
					
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
