package DynamicProgramming;

public class Max_Profit_In_Knapsack_Problem {
	
	static int mat[][] = new int[10+1][8+1];
	
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

	
	
	
	
	
	
}
