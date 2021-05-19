package String;

import java.util.HashSet;
import java.util.Set;

public class Remove_All_Duplicates_From_A_String {
	
	public void solve() {
		
		 String str = "geeksforgeeks";
	       System.out.println( removeDuplicates(str, str.length()));
	}
	
	private String removeDuplicates(String str, int n) {
		
		Set<Character> set = new HashSet<>();
		
		for(int i=0; i< str.length(); i++ ) {
			set.add(str.charAt(i));
		}
		
		return set.toString();
		
	}

}
