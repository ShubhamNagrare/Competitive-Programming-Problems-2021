package DynamicProgramming;

public class Find_Nth_Fibonacci_Number {
	
	public void findNthFib() {
		
		int n =9;
		System.out.println(fib(n));
					
	}
	
	private static int fib(int n) {
		if(n ==0 || n==1) {
			return n;
		}
		
		// declare array to store fibonacci num
		int dp[] = new int[n+2];
		dp[0] = 0;
		dp[1] = 1;
		
		for(int i=2; i <=n; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		
		return dp[n];
	}
	

}
