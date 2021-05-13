package DynamicProgramming;

public class Find_Length_Of_Longest_COmmon_SubSequence_Using_Recursion {
	
	public void solve() {
		
		String a = "abcdefgh";
		String b = "alcoepgiiii";
		
		System.out.println(solve(a,b, a.length(), b.length()));
	}
	
	private int solve(String a, String b, int m, int n) {
		
		if(m == 0 || n == 0) {
			return 0;
		}
		
		if(a.charAt(m-1) == b.charAt(n-1)) {
			return 1 +  solve(a,b,m-1,n-1);
		}
		else {
			return Integer.max(solve(a,b,m,n-1), solve(a,b,m-1,n));
		}		
	}

}
