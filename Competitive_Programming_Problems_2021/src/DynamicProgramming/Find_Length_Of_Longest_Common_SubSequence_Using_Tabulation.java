package DynamicProgramming;

public class Find_Length_Of_Longest_Common_SubSequence_Using_Tabulation {
	
	public void solve() {
		
		String a = "abcdefgh";
		String b = "alcoepgiiii";
		
		int[][] dp = new int[a.length()+1][b.length()+1]; 
		for(int i=0; i<a.length() +1; i++) {
			for(int j=0; j<b.length()+1; j++) {
				dp[i][j] = 0;
			}
		}		
		System.out.println(solve(a,b, a.length(), b.length(), dp));
	}
	
	
	private int solve(String a, String b, int m, int n, int[][] dp) {
		
		for(int i=1; i<m+1; i++) {
			for(int j=1; j<n+1; j++) {
				
				
				if(a.charAt(i-1) ==  b.charAt(j-1)) {
					dp[i][j] = 1 + dp[i-1][j - 1];
				}
				else {
					dp[i][j] = Integer.max(  dp[i][j-1],  dp[i-1][j]  );
				}
				
			}
		}
		return dp[m][n];
	}
	

}
