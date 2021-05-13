package DynamicProgramming;

public class Print_Longest_Common_SubSequence_Using_Tabulation {
	
	public void solve() {
		String a = "AGGTAB";
		String b = "GXTXAYB";
		int m= a.length();
		int n = b.length();
		
		int[][] dp = new int[m+1][n+1];
		
		int dpp = solve(a,b,m,n,dp);
	}
	
	private int solve(String a, String b, int m, int n, int[][] dp) {
		
		for(int i=1; i<m+1; i++) {
			for(int j=1; j<n+1; j++) {
				
				if(a.charAt(i-1) == b.charAt(j-1)) {
					dp[i][j] = 1 + dp[i-1][j-1];
				}
				else {
					dp[i][j] = Integer.max( dp[i-1][j], dp[j-1][i] );
				}		
			}
		}
		
		int i= m;
		int j =n;
		while(i > 0 && j > 0) {
			
			if(a.charAt(i-1) == b.charAt(j-1)) {
				System.out.println(a.charAt(i-1));
				i--;
				j--;
			}
			else {
				if(dp[i][j-1] > dp[i-1][j]) {
					j--;
				}
				else {
					i--;
				}
			}			
		}
		
//		while(i>0) {
//			if(a.charAt(i-1) == b.charAt(j-1)) {
//				System.out.println(a.charAt(i-1));
//				i--;
//			}
//		}
//		
//		while(j>0) {
//			if(a.charAt(i-1) == b.charAt(j-1)) {
//				System.out.println(a.charAt(i-1));
//				j--;
//			}
//		}
		
		
		return 1;
	}

}
