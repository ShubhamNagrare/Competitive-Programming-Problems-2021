package DynamicProgramming;

public class Coin_ChangeProblem_Min_No_Of_Coins_Using_Tabulation {
	
public void solve() {
	
	// https://www.geeksforgeeks.org/find-minimum-number-of-coins-that-make-a-change/
	
	
	// TOUGHEST, NOT COMPLETED TODO
		
		int[] arr = {9, 6, 5, 1};
		int sum = 11;
		int n= arr.length;
		
		int[][] dp = new int[n+1][sum+1];
		
		for(int i=0; i<n+1; i++) {
			for(int j=0; j<sum+1; j++) {
					if(i==0) {
						dp[i][j] = Integer.MAX_VALUE;
					}
					
			}
		}
		
		for(int i=0; i<n+1; i++) {
		for(int j=0; i<sum+1; j++) {
			if(j % arr[0] == 0) {
				dp[i][j] = j/arr[0];
			}
			else {
				dp[i][j] = Integer.MAX_VALUE -1;
			}
		}
		}
				
		System.out.println(solve(arr, n, sum, dp));	
	}

	private int solve(int[] arr, int n, int W, int[][] dp) {
		
		for(int i=2; i<n+1; i++) {
			for(int j=1; j<W+1; j++) {
				
				if(arr[i-1] <= j) {
					dp[i][j] = Integer.min( dp[i-1][j],   dp[i][j-arr[i-1]]  );
				}
				else {
					dp[i][j] = dp[i-1][j];
				}		
			}
		}
		
		return dp[n][W];
		
	}

	
	
	
	
	
	
	
	
	
	
	
}
