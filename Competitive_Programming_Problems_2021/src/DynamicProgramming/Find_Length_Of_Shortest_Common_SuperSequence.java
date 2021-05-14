package DynamicProgramming;

public class Find_Length_Of_Shortest_Common_SuperSequence {
	
	// https://www.geeksforgeeks.org/shortest-common-supersequence/
	
	public void solve() {
		
		String a = "geek";
		String b = "eke";
		
		int m = a.length();
		int n = b.length();
		
		int[][] dp = new int[m+1][n+1];
		
		System.out.println(solve(a,b,m,n,dp));	
	}
	
	private int solve(String a, String b, int m, int n, int[][] dp) {
		
		for(int i=1; i < m+1; i++) {
			for(int j=1; j< n+1; j++) {
				
				if(a.charAt(i-1) == b.charAt(j-1)) {
					dp[i][j] = 1 + dp[i-1][j-1];
				}
				else {
					dp[i][j] = Integer.max(dp[i][j-1], dp[i-1][j]);
				}				
			}
		}
		
		int superSequence = (m + n) - dp[m][n];
		return superSequence;
		
		
	}

}
