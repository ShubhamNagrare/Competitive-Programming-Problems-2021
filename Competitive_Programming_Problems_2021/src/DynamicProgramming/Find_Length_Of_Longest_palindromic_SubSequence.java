package DynamicProgramming;

import java.util.Arrays;

public class Find_Length_Of_Longest_palindromic_SubSequence {
	
	// https://www.geeksforgeeks.org/longest-palindromic-subsequence-dp-12/
	
	public void solve() {
		
		String a = "BBABCBCAB";
		int m = a.length();
		String b = reverse(a);
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
					dp[i][j] = Integer.max(dp[i-1][j], dp[i][j-1]);
				}				
			}
		}
		return dp[m][n];
	}
	
	
	
	
	private String reverse(String str) {
		
		StringBuilder s = new StringBuilder();
		
		for(int i=str.length() -1 ; i >=0 ; i--) {
			s.append(str.charAt(i));
		}
		return s.toString();
	}

}
