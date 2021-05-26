package SlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class Find_Index_Range_Whose_Element_Sum_Equals_To_K {
	
	public void solve() {
		
		int[] arr = {1,3,2,1,4,1,3,2,1,1,2};			// Answer 2 5		4 6			5 9
		int k = 8;
		
		List<List<Integer>> ans = getSumIndex(arr, arr.length, k);
	}
	
	private List<List<Integer>> getSumIndex(int[] arr, int n, int k){
		
		List<List<Integer>> retVal = new ArrayList<>();
		
		if(k ==  || n <
			return retVal;
		}
		
		
		
		return retVal;
	}

}
