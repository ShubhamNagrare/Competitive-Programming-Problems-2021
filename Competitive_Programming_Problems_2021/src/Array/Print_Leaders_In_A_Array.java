package Array;


public class Print_Leaders_In_A_Array {
	
	public void solve() {
		
		int[] arr = {16, 17, 4, 3, 5, 2};		//17, 15, 2
		
		int max = Integer.MIN_VALUE;
		
		max = arr[arr.length-1];
		System.out.print(arr[arr.length-1]);
		
		for(int i=arr.length-2; i>=0; i--) {
			
			if(arr[i] > max) {
				max= arr[i];
				System.out.print(" " + arr[i] );
			}			
		}
		
		
	}

}
