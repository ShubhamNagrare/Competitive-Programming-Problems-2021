package DynamicProgramming;

public class Find_Length_Of_Longest_Common_SubString_Using_Recursion {
	
	public void solve() {
		
		String a = "abmno";
		String b = "abhgt";
		
		int max =0;
		System.out.println(solve(a,b, a.length(), b.length(), max));
	}
	
	
	// TODO : Not getting correct answer
	
	private int solve(String a, String b, int m, int n, int max) {
		
		if(m == 0 || n == 0) {
			return 0;
		}
		
		if(a.charAt(m-1) == b.charAt(n-1)) {
			max = Integer.max(max , solve(a,b, m-1,n-1, max));
			return 1 + solve(a,b, m-1,n-1, max);
		}
		else {
			
			return 0;//Integer.max(solve(a,b,m-1,n), solve(a,b,m,n-1)) ;
		}
	}

}
