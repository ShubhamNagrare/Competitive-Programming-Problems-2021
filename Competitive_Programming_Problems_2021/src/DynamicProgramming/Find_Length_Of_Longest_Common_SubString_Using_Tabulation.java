package DynamicProgramming;

public class Find_Length_Of_Longest_Common_SubString_Using_Tabulation {
	
	public void solve() {
		String a = "abfghj";
		String b = "abnmpo";
		int m= a.length();
		int n = b.length();
		
		int[][] dp = new int[m+1][n+1];
		
		System.out.println(solve(a,b,m,n,dp));
	}
	
	private int solve(String a, String b, int m, int n, int[][] dpp) {
		
		for(int i=1; i<m+1; i++) {
			for(int j=1; j<n+1; j++) {		
				
				if(a.charAt(i-1) == b.charAt(j-1)) {
					dpp[i][j] = dpp[i-1][j-1] + 1;
				}
				else {
					dpp[i][j] = 0;
				}	
				
			}
		}	
		int max = 0;
		for(int i=0; i<m+1; i++) {
			for(int j=0; j<n+1; j++) {
				max = Integer.max(max, dpp[i][j]);
			}
		}
		return max;
	}

}
