package DynamicProgramming;

public class Coin_ChangeProblem_Max_No_Of_Ways_Using_Memoization {
	
public void solve() {
		
		int[] arr = {1,2,3};
		int sum = 4;
		int n= arr.length;
		
		int[][] dp = new int[n+1][sum+1];
		
		for(int i=0; i<n+1; i++) {
			for(int j=0; j<sum+1; j++) {
				if(i == 0) {
					dp[i][j] = 0;
				}
				if(j == 0) {
					dp[i][j] = 1;
				}
			}
		}
		
		
		System.out.println(solve(arr, n, sum, dp));
		
	}

		public int solve(int[] arr, int n, int W, int[][] dp) {
	
			if(arr[n-1] <= W) {
				dp[n][W] = Integer.max( dp[n-1][W] + solve(arr, n, W - arr[n-1], dp), solve(arr, n-1, W - arr[n-1], dp));
			}
			else {
				dp[n][W] = solve(arr, n, W - arr[n-1], dp);
			}		
			return dp[n][W];
		}
}
