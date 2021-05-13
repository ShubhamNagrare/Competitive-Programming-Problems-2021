package DynamicProgramming;

public class Coin_ChangeProblem_Min_No_Of_Coins_Using_Tabulation {
	
public void solve() {
		
		int[] arr = {1,2,3};
		int sum = 5;
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
				
	//	System.out.println(solve(arr, n, sum, dp));	
	}

}
