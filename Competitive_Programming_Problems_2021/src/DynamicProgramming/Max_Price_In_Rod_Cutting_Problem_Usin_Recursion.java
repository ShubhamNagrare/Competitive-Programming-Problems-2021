package DynamicProgramming;

public class Max_Price_In_Rod_Cutting_Problem_Usin_Recursion {
	
	
	public void solve() {
		int[] length = {1,2,3,4,5,6,7,8};
		int[] price = {1,5,8,9,10,17,17,20};

		int rodSize = 8;
		int n = length.length;
		
		System.out.println(solve(length, price, n, rodSize));		
	}
	
	private int solve(int[] lengths, int[] prices, int n, int W) {
	
		if(n ==0 || W == 0) {
			return 0;
		}
		
		if(lengths[n-1] <= W) {
			return Integer.max(		prices[n-1] + solve(lengths, prices, n, W - lengths[n-1]),  	solve(lengths, prices, n-1, W) 	);
		}
		else {
			return solve(lengths, prices, n-1, W);
		}
		
		
	}

	
}


