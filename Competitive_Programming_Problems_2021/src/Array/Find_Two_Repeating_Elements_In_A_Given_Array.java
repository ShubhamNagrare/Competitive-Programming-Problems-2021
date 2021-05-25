package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Find_Two_Repeating_Elements_In_A_Given_Array {
	
	// https://www.geeksforgeeks.org/find-the-two-repeating-elements-in-a-given-array/
	
	public void solve() {
		
		int[] arr = {4, 2, 4, 5, 2, 3, 1};			// Answer  - 4 2
		int n=5;
		
		List<Integer> list = getSingleElementList(arr, n);	
		for(int i=0; i<list.size(); i++) {
			System.out.print(" " + list.get(i));
		}
	}
	
	private List<Integer> getSingleElementList(int[] arr, int n){

		List<Integer> list = new ArrayList<>();
		if(n <= 2) {
			return list;
		}
		
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<arr.length; i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			}
			else {
				int val = map.get(arr[i]) + 1;
				map.put(arr[i], val);
			}
		}
		
		for(Integer entry : map.keySet()){		
			if(map.get(entry) == 2) {
				list.add(entry);
			}			
		}
		
		return list;
	}

}
