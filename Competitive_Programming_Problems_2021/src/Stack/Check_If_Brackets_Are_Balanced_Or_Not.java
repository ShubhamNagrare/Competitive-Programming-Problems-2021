package Stack;

import java.util.Stack;

public class Check_If_Brackets_Are_Balanced_Or_Not {
	
	// https://www.geeksforgeeks.org/check-for-balanced-parentheses-in-an-expression/
	
	public void solve() {
		
		String s = "[()]{}{[()()]()}";
		
		System.out.println(checkBalanced(s));
	}
	
	private String checkBalanced(String s) {
		
		if(s.length() < 1) {
			return "INVALID";
		}
		
		Stack<Character> stack = new Stack<>();
		for(int i=0; i<s.length(); i++) {
			
			if(stack.isEmpty()) {
				stack.push(s.charAt(i));
			}
			else {
				
				if(		   (s.charAt(i) == '}' && stack.peek() == '{') 
						|| (s.charAt(i) == ')' && stack.peek() == '(') 
						|| (s.charAt(i) == ']' && stack.peek() == '[') 
				 ) {
					stack.pop();
				}
				else {
					stack.push(s.charAt(i));
				}		
			}		
		}
		
		if(stack.isEmpty()) {
			return "BALANCED";
		}
		return "UNBALANCED";
	}

}
