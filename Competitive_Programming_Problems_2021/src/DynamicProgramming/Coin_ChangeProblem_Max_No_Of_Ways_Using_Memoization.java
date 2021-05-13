package DynamicProgramming;

public class Coin_ChangeProblem_Max_No_Of_Ways_Using_Memoization {
	
public void solve() {
		
		int[] arr = {1,2,3};
		int sum = 4;
		int n= arr.length;
		
		int[][] dp = new int[n+1][sum+1];
		
		for(int i=0; i<n+1; i++) {
			for(int j=0; j<sum+1; j++) {
					dp[i][j] = -1;	
			}
		}
		
		
		System.out.println(solve(arr, n, sum, dp));
		
	}

		public int solve(int[] arr, int n, int W, int[][] dp) {
	
			if(n == 0 || W == 0) {
				return 0;
			}
			
			if(dp[n][W] != -1) {
				return dp[n][W];
			}
			
			if(arr[n-1] <= W){
				return dp[n][W] = dp[n-1][W] + solve(arr, n, W - arr[n-1] , dp) ;
			}
			else {
				return  dp[n][W] = solve(arr, n-1, W, dp);
			}
		}
}
