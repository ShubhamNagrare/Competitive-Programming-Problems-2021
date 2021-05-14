package DynamicProgramming;

public class Find_Length_Of_Longest_Common_SubString {
	
	public void solve() {
	String a = "zxabcdezy"; 
	String b = "yzabcdezx";		// Answer : 	Output : abcdez	https://www.geeksforgeeks.org/print-longest-common-substring/
	
	int m = a.length();
	int n = b.length();
	
	int[][] dp = new int[m+1][n+1];
	
	System.out.println(solve(a,b,m,n,dp));
	}
	
	private int solve(String a, String b, int m, int n, int[][] dp) {
		
		for(int i =1; i<m+1; i++) {
			for(int j=1; j< n+1; j++) {
				
				if(a.charAt(i-1) == b.charAt(j-1)) {
					dp[i][j] = 1 + dp[i-1][j-1];
				}
				else {
					dp[i][j] = 0;
				}				
			}
		}
		
		
		int max = Integer.MIN_VALUE;
		for(int i =1; i<m+1; i++) {
			for(int j=1; j< n+1; j++) {
				
				max = Integer.max(max, dp[i][j]);
		
			}
		}
		
		return max;
		}
		

	
}