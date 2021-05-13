package DynamicProgramming;

public class Find_Length_Of_Longest_Common_SubString_Using_Memoization {
	
	static int[][] dp = new int[4+1][4+1];
	
	public void solve() {
		
		String a = "abef";
		String b = "abcd";
		int m = a.length();
		int n = b.length();
		
	
		for(int i=0; i<m+1; i++) {
			for(int j=0; j<n+1; j++) {
				dp[i][j] = -1;
			}
		}
				
		int max = 0;
		int last = solve(a,b, a.length(), b.length(), dp);
		
		for(int i=1; i<m+1; i++) {
			for(int j=1; j<n+1; j++) {
				max = Integer.max(max, dp[i][j]);
				System.out.println(max);
			}
		}
		
		System.out.println(max);
	}

	
	// TODO : not getting correct answer
		private int solve(String a, String b, int m, int n, int[][] dp) {
			
			
			if(m == 0 || n == 0) {
				return 0;
			}
			
			if(dp[m][n] != -1) {
				return dp[m][n];
			}
			
			if(a.charAt(m-1) == b.charAt(n-1)){
				return dp[m][n] = 1 + solve(a,b,m-1,n-1, dp);
			}
			else {
				return 0;
			}
		}

}
