package DynamicProgramming;

public class Coin_ChangeProblem_Max_No_Of_Ways_Using_Recursion {
	
	public void solve() {
		
		int[] arr = {1,2,3};
		int sum = 4;
		int n= arr.length;
		
		
		System.out.println(solve(arr, n, sum));
		
	}
	
	private int solve(int[] arr, int n, int sum) {
		
		if(n ==0 || sum == 0) {
			return 0;
		}
		
		if(arr[n-1] <= sum) {
			return   solve(arr, n, sum - arr[n-1]) + solve(arr, n-1, sum)  ;
		}
		else {
			return solve(arr, n-1, sum);
		}
		
	}

}
