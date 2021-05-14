package DynamicProgramming;

public class Coin_ChangeProblem_Max_No_Of_Ways_Using_Tabulation {
	
	// https://www.geeksforgeeks.org/coin-change-dp-7/
	
public void solve() {
		
		int[] arr = {1,2,3};
		int sum = 4;
		int n= arr.length;
		
		int[][] dp = new int[n+1][sum+1];
		
		for(int i=0; i<n+1; i++) {
			for(int j=0; j<sum+1; j++) {
					if(i==0) {
						dp[i][j] = 0;
					}
					if(j==0) {
						dp[i][j] = 1;
					}
			}
		}
				
		System.out.println(solve(arr, n, sum, dp));	
	}


			private int solve(int[] arr, int n, int W, int[][] dp) {
					
				for(int i=1; i<n+1; i++) {
					for(int j=1; j<W+1; j++) {
						
						if(arr[i-1] <= j) {
							dp[i][j] = dp[i-1][j] + dp[i][j - arr[i-1]];
 						}
						else {
							dp[i][j] = dp[i-1][j];
						}				
					}
				}
				return dp[n][W];
			}
}
