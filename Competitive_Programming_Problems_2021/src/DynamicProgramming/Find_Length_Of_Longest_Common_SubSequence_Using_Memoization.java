package DynamicProgramming;

public class Find_Length_Of_Longest_Common_SubSequence_Using_Memoization {

	public void solve() {
		
		String a = "abcdefgh";
		String b = "alcoepgiiii";
		
		int[][] dp = new int[a.length()+1][b.length()+1]; 
		for(int i=0; i<a.length() +1; i++) {
			for(int j=0; j<b.length()+1; j++) {
				dp[i][j] = -1;
			}
		}		
		System.out.println(solve(a,b, a.length(), b.length(), dp));
	}
	
	
	private int solve(String a, String b, int m, int n, int[][] dp) {
		
		if(m == 0 || n== 0) {
			return 0;
		}
		
		if(dp[m][n] != -1) {
			return dp[m][n];
		}
		
		if(a.charAt(m-1) == b.charAt(n-1)) {
			return dp[m][n] = 1 + solve(a,b,m-1,n-1, dp);
		}
		else {
			return dp[m][n] = Integer.max(solve(a,b,m-1,n,dp), solve(a,b,m,n-1,dp));
		}
		
	}
	
}
