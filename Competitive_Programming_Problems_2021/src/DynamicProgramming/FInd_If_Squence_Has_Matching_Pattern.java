package DynamicProgramming;

public class FInd_If_Squence_Has_Matching_Pattern {
	
	// https://www.geeksforgeeks.org/wildcard-pattern-matching/
	
	public void solve(){
		
		String a = "baaababz";
		String b = "baabz";
		
		int m= a.length();
		int n = b.length();
		
		int[][] dp = new int[m+1][n+1];
		
		System.out.println(n == solve(a,b,m,n,dp) ? true : false);		
	}
	
	private int solve(String a, String b, int m ,int n, int[][] dp) {
		
		for(int i=1; i<m+1; i++) {
			for(int j=1; j<n+1; j++) {
				
				if(a.charAt(i-1) == b.charAt(j-1)) {
					dp[i][j] = 1 + dp[i-1][j-1];
				}
				else {
					dp[i][j] = Integer.max(dp[i][j-1], dp[i-1][j]);
				}
			}
		}
		return dp[m][n];
	}

}
