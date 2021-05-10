package DynamicProgramming;

public class Max_Profit_In_Knapsack_Problem_Using_Recursion {
	
	//Practice 2
	
	public void solve() {
		
		// Answer should be 220
        int wt[] = new int[] { 10, 20, 30 };
		int val[] = new int[] { 60, 100, 120 };
        int W = 50;
        int n = val.length;
        
        System.out.println(solve(wt, val, n, W));       
	}
	
	
	private int solve(int[] weights, int[]  values, int n, int W) {
		
		if(W == 0 || n == 0) {
			return 0;
		}
		
		if(weights[n-1] <= W) {
			
			return values[n-1] + solve(weights, values, n-1, W - weights[n-1]);
		}
		else {
			return solve(weights, values, n-1, W);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// PRACTICE 1
	/*static int mat[][] = new int[10+1][8+1];
	
	public void find_max_profi_In_knapsack_problem() {
		 int weight[] = {2,3,5,1,2,9,3,4};
		 int value[] = {200,800,50,2000,700,500,100,900};
		 
		 int bagCapacity = 10;
		 int weightsLen = weight.length;
		 
		 for(int i=0; i<bagCapacity+1; i++) {
			 for(int j=0; j<weightsLen+1; j++) {
				 mat[i][j] = -1;
			 }
		 }
		 	 
		System.out.println(knapsack(weight, value, bagCapacity, weightsLen));
		  
	}
	
	
	private int knapsack(int[] weight, int[] values, int bagCapacity, int weightsLen) {
		
		if(bagCapacity == 0 || weightsLen == 0) {
			return 0;
		}
		
		if(mat[bagCapacity][weightsLen] != -1) {
			return mat[bagCapacity][weightsLen];
		}
		
		if(bagCapacity >= weight[weightsLen-1]) {
			return mat[bagCapacity][weightsLen] = Integer.max(values[weightsLen-1] + knapsack(weight, values, bagCapacity - weight[weightsLen-1], weightsLen-1), knapsack(weight, values, bagCapacity, weightsLen-1));
		}
		
		else if(bagCapacity < weight[weightsLen-1]) {
			return mat[bagCapacity][weightsLen] = knapsack(weight, values, bagCapacity, weightsLen
					-1);
		}	
		return -1;
	}
	*/

	
	
	
	
	
	
}
