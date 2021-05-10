package DynamicProgramming;

public class Max_Price_In_Rod_Cutting_Problem_Using_Memoization {
	
	public void solve() {
		int[] length = {1,2,3,4,5,6,7,8};
		int[] price = {1,5,8,9,10,17,17,20};

		int rodSize = 8;
		int n = length.length;
		
		int[][] dp = new int[n+1][rodSize+1];
		for(int i=0; i< n+1; i++) {
			for(int j=0; j<rodSize+1; j++) {
				dp[i][j] = -1;
			}
		}
		
		System.out.println(solve(length, price, n, rodSize, dp));		
	}
	
	
	private int solve(int[] len, int[] price, int n, int W, int[][] dp) {
		
		if(n == 0 || W == 0) {
			return 0;
		}
		
		if(dp[n][W] != -1) {
			return dp[n][W];
		}
		
		if(len[n-1] <= W) {
			return dp[n][W] = Integer.max(  price[n-1]  + solve(len, price, n, W - len[n-1], dp) , solve(len, price, n-1, W, dp) );
		}
		else 
		{
			return dp[n][W] = solve(len, price, n-1, W, dp);
		}	
	}

}
