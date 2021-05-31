package Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Find_Max_Element_In_A_Stack {
	
	//https://www.hackerrank.com/challenges/maximum-element/problem
	
	public void solve() {
		
		
	
        
        
        System.out.println(5%10);
		
		
		List<String> list = new ArrayList<>();
		list.add("1 97");
		list.add("2");
		list.add("1 20");
		list.add("2");
		list.add("1 26");
		list.add("1 20");
		list.add("2");
		list.add("3");
		list.add("1 91");
		list.add("3");
		
//		list.add("1 83");
//		list.add("3");
//		list.add("2");
//		list.add("1 76");
		
		List<Integer> li = getMax(list);
		for(Integer n : li){
			System.out.println(n + " ");
		}
		
	}
	
	private static class StackNode {
	    int val;
	    int curMax;
	    public StackNode(int val, int curMax) {
	        this.val = val;
	        this.curMax = curMax;
	    }
	}
	
	 private static List<Integer> getMax(List<String> operations) {
		    
		 Stack<StackNode> stack = new Stack<StackNode>();
	    List<Integer> retval = new ArrayList<>();
        
	    int max = Integer.MIN_VALUE; 

	    for(int i=0; i<operations.size(); i++){	        
	        String[] str = operations.get(i).split(" ");
	        
	        
	        if(str[0].equals("1")){
	        	stack.add(new StackNode(Integer.parseInt(str[1]), max));
	            max  = Integer.max(max, Integer.parseInt(str[1]));
	        }
	        
	        
	        else if(str[0].equals("2")){
	        	if(!stack.isEmpty()){
		            stack.pop();
	        	}
	        	
	        	//reset max
	        	if(stack.isEmpty()){
		            max = Integer.MIN_VALUE;
	        	}
	        	else {
	        		max = stack.peek().curMax;
	        	}
	        	
	        }
	        else if(str[0].equals("3")){      
	        	if(!stack.isEmpty()){    
	            retval.add( max  );   
	        	}
	        }
	    }
	    return retval;

	    }

}
