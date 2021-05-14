package DynamicProgramming;

public class Min_No_Of_Insertion_Deletion_Required_To_Convert_String_A_To_String_B {
	
	//https://www.geeksforgeeks.org/minimum-number-deletions-insertions-transform-one-string-another/
	
	public void solve() {
		
		String a = "heap";
		String b = "pea";		// Answer = 3
		int m = a.length();
		int n = b.length();
		
		int[][] dp = new int[m+1][n+1];
		
		System.out.println(solve(a,b,m,n,dp));		
	}
	
	private int solve(String a, String b, int m, int n, int[][] dp) {
		
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
		return (m - dp[m][n]) + (n - dp[m][n]);
	}

}
