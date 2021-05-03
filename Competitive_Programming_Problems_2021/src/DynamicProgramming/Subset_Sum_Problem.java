package DynamicProgramming;

public class Subset_Sum_Problem {
	
	// Refer - https://www.geeksforgeeks.org/subset-sum-problem-dp-25/
	
	public void findSum() {
		
		int[] arr = {3, 4, 12, 5, 2, 1,7,6};
		int sum = 9;
		
		
		boolean[][] dp = new boolean[8+1][9+1];
		
		for(int i=0; i< arr.length+1; i++) {
			for(int j=0; j<sum+1; j++) {
				if(i==0) {
					dp[i][j] = false;
				}
				if(j==0) {
					dp[i][j] = true;
				}
			}
		}
			
		System.out.println(findSum(arr, arr.length, sum, dp ));
	}
	
	
	private boolean findSum(int[] arr, int n, int sum,  boolean[][] dp) {
		
		for(int i=1 ; i < n+1; i++) {
			
			for(int j=1; j< sum+1; j++) {
				
				if( arr[i-1] <= j ) {
				
					dp[i][j] = dp[i-1][j - arr[i-1]]  ||  dp[i-1][j];
					
				}	
				else{
					
					dp[i][j] = dp[i-1][j];
					
				}
				
			}
			
		}
		
		
		return dp[n][sum];
	}

}
