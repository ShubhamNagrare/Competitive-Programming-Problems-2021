package Stack;
import java.util.Stack;

public class Find_Nearest_Greater_Element_To_Left {
	
	// https://www.geeksforgeeks.org/closest-greater-or-same-value-on-left-side-for-every-element-in-array/
	
	public void solve() {
		
		int arr[] = {10, 5, 11, 6, 20, 12};  // Answer = -1, 10, -1, 10, -1, 20
		int n = arr.length;
		
		int[] ans = getGreaterElement(arr, n);
		for(int i=0; i<ans.length; i++) {
			System.out.print(" " + ans[i]);	
		}	
	}
	
	private int[] getGreaterElement(int[] arr, int n) {
		int[] retVal = new int[n];
		if(n == 0) {
			return arr;
		}
		
		
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i=0; i<n; i++) {
			
			if(stack.isEmpty()) {
				retVal[i] = -1;
			}
			
			else if(stack.size() > 0 && stack.peek() > arr[i]) {
				retVal[i] = stack.peek();
			}
			
			else if(stack.size() > 0 && stack.peek() <= arr[i]) {
				
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
