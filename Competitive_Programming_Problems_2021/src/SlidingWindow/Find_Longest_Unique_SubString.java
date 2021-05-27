package SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class Find_Longest_Unique_SubString {
	
	public void solve() {		
		String str = "abcabed";	//Answer abc
		findLongestUnique(str, str.length());		
	}
	
	private void findLongestUnique(String s, int n) {
		
		int i=0;
		int j=0;
		Set<Character> set = new HashSet<>();		
		int diff = Integer.MIN_VALUE;
		set.add(s.charAt(i));		
		int first = 0;
		int last =0;
		
		while(j<n-1) {
			
			j++;
			
			if(set.contains(s.charAt(j))) {
				set.clear();
				i=j-1;
			}
			
			set.add(s.charAt(j));
						
			if(diff < (j-i)) {
				diff = j-i;
				first = i;
				last = j;
			}
			
	
		}
		for(int m =first; m<=last; m++) {
			System.out.print(s.charAt(m));
		}
	}

}
