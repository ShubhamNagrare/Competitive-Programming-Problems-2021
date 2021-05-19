package String;

import java.util.HashMap;
import java.util.Map;


public class Print_Duplicate_Characters_From_A_Given_String {
	
	public void solve() {
		String str = "test string";
        printDups(str, str.length());
	}
	
	private void printDups(String str, int n) {
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i=0; i<str.length(); i++) {
			
			if(map.containsKey(str.charAt(i))) {
				int val = map.get(str.charAt(i));
				val++;
				map.put(str.charAt(i), val);
			}
			else {
				map.put(str.charAt(i), 1);
			}			
		}
		
		
		
		for(Map.Entry li : map.entrySet()) {
			
			if((int)li.getValue() > 1) {
				System.out.println(" " + li.getKey() + " : " + li.getValue());
			}
			
		}
		
	}

}
