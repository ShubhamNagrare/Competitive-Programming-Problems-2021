package DynamicProgramming;

public class Find_Equal_Sum_Partition_Problem_Using_Tabulation {

	public void solve() {
		
		// Answer should be TRUE  ->	 1+5+5 = 11  &&  11
		int[] arr = {1,5,5,11};
		int n = arr.length;
		
		int sum = 0;
		for(int i=0; i< n; i++) {
			sum += arr[i];
		}
		
	
		
		
		if(sum % 2 == 1) {
			System.out.println(false);
		}else if (sum % 2 == 0) {
			
			
			boolean[][] dp = new boolean[n+1][(sum/2)+1];
			
			for(int i=0; i<n+1; i++) {
				for(int j=0; j<(sum/2)+1; j++) {
					
					if(i==0) {
						dp[i][j] = false;
					}
					if(j==0) {
						dp[i][j] = true;
					}
					
				}
			}
			
			
			System.out.println(solve(arr, n, sum/2, dp));
		}
		
		
		
	}
	
	
	
	private boolean solve(int[] arr, int n, int sum, boolean[][] dp) {
		
		for(int i=1; i < n+1; i++) {
			
			for(int j=1; j< sum+1; j++) {
				
				if(arr[i-1] <= j) {
					dp[i][j] = dp[i-1][j] || dp[i-1][j - arr[i-1]];
				}
				else {
					dp[i][j] =  dp[i-1][j];
				}	
			}		
		}
		
		return dp[n][sum];		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	public void hasEqualSumPartition() {
		
		int[] arr = {1,5,5,11};
		int n = arr.length;
		
		System.out.println(hasEqualSumPartition(arr, n));
		
	}
	
	
	
	private boolean hasEqualSumPartition(int[] arr, int n) {
		
		int sum = 0;
		for(int i=0; i<n; i++) {
			sum+= arr[i];
		}
		
		if(sum %2 !=0) {
			return false;
		}
		else {
			
			boolean[][] dp = new boolean[n+1][(sum/2)+1];
			
			for(int i=0; i< n+1; i++) {
				for(int j=0; j< (sum/2)+1; j++) {
					
					if(i == 0) {
						dp[i][j] = false;
					}
					if(j ==0) {
						dp[i][j] = true;
					}
					
				}
			}
			
			return fineSubSetSum(arr, n, sum/2, dp);
			
		}
		
	}
	
	private boolean fineSubSetSum(int[] arr, int n, int sum, boolean[][] dp) {
		
		
		for(int i=1; i< n+1 ; i++) {
			for(int j=1; j< sum+1; j++) {
				
				if( arr[i-1]  <= j ) {
					
					dp[i][j] = dp[i-1][ j - arr[i - 1]] || dp[i-1][j];
					
				}
				else {
					dp[i][j] = dp[i-1][j];
				}		
			}
			
		
		}
		
		
		
		
		return dp[n][sum];
	}
	*/
	
	
	
	
}
