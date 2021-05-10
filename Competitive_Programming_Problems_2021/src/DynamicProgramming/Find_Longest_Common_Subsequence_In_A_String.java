package DynamicProgramming;

public class Find_Longest_Common_Subsequence_In_A_String {
	

	 int[][] dp = new int[7][8];
	 
		int[][] dp1 = new int[7][8];
	
	public void findSubsequence() {
		
		 String s1 = "AGGTAB";
		 String s2 = "GXTXAYB";
		 
		// Recursive
		 System.out.println(findSubsequence(s1, s2, s1.length(), s2.length()));		 
	}
	
	
	// Recursive
	private int findSubsequence(String a, String b, int n, int m) {
		
		if(n ==0 || m == 0) {
			return 0;
		}
		
		if(a.charAt(n-1) == b.charAt(m-1)) {
			return 1 + findSubsequence(a, b, n-1, m-1);
		}
		else
		{
			return  Integer.max( findSubsequence(a, b , n-1, m), findSubsequence(a, b, n, m-1));
		}		
	}
	
	

}
