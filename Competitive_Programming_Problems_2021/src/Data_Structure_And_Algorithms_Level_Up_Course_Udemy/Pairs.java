package Data_Structure_And_Algorithms_Level_Up_Course_Udemy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Pairs {
	
	// Given an Array containing n integers and a sum s denoting a target sum.   Find 2 distinct numbers that can pair upto form  target sum.
	// Let us assume there will be only one such pair.
	
	public void solve() {
		
		int[] arr = {10, 5, 2, 3, -6, 9, 11 };			//Answer = 10 -6 = 4
		int s = 4;
		
		List<Integer> li = getSet(arr, s);
		for(int i=0; i<li.size(); i++) {
			System.out.print(li.get(i) + " ");
		}
		
	}
	
	private List<Integer> getSet(int[] arr, int sum){
		
		List<Integer> retVal = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		for(int i=0; i<arr.length; i++) {
			
			int x = sum - arr[i];
			if(set.contains(x) && x != arr[i]) {
				retVal.add(x);
				retVal.add(arr[i]);
				return retVal;
			}
			set.add(arr[i]);			
		}
		return retVal;
	}

}
