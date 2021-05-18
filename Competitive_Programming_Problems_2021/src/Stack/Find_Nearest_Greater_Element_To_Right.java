package Stack;
import java.util.Stack;

public class Find_Nearest_Greater_Element_To_Right {
	
	// https://www.geeksforgeeks.org/next-greater-element/
	
	public void solve() {
		
		int arr[] = {4,5,2,25};		// Answer  5 25 25 -1
		
		int[] ans = getNearestGreater(arr, arr.length);
		
		for(int i=0; i<ans.length; i++) {
			System.out.print(" " + ans[i]);	
		}	
	}
	
	private int[] getNearestGreater(int[] arr, int n) {
		
		if(n == 0) {
			return arr;
		}
		
		int[] retVal = new int[n];
		Stack<Integer> stack = new Stack<>();
		
		for(int i=n-1; i>=0; i--) {
			
			if(stack.isEmpty()) {
				retVal[i] = -1;
			}
			
			else if(stack.size() > 0 && stack.peek() > arr[i]) {
				retVal[i] = stack.peek();
			}
			
			else if(stack.size() > 0 && stack.size() <= arr[i]) {
				
				while(stack.size() > 0 && stack.peek() <= arr[i]) {					
					stack.pop();
				}
				
				if(stack.isEmpty()) {
					retVal[i] = -1;
				}
				else {
					retVal[i] = stack.peek();
				}				
			}
			
			stack.push(arr[i]);			
		}
		
		return retVal;
		
	}

}
