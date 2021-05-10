package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Find_Most_Occured_Character_In_A_String {

	public void findMostOccured() {
		
		int strLen = 2;
		String[] str = new String[strLen];
		
		str[0] = "gqtrawq";
		str[1] = "fnaxtyyzzz";		
		
		System.out.println(findMostOcuured(str));
		
	}
	
	
	private Character findMostOcuured(String[] str) {
		
		Map<Character, Integer> map = new HashMap<>();	
		for(int i=0; i<str.length; i++) {
			
			String curr = str[i];
			for(int j=0; j<curr.length(); j++) {
				
				if(map.containsKey(curr.charAt(j))) {				
					int k = map.get(curr.charAt(j));
					k++;
					map.put(curr.charAt(j), k);			
				}
				else {
					map.put(curr.charAt(j), 1);	
				}		
			}		
		}
		
		int count = 0;
		char ret = '{';
		for(Character curr : map.keySet()){
			
			if(map.get(curr) >= count ) {
				
				if(map.get(curr) == count) {
					
					if((int)ret > (int)curr) {
						ret = curr;
						count = map.get(curr);
					}
					
				}else {
					ret = curr; 
					count = map.get(curr);
				}	
			}			
		}
		
		
		return ret;
	}
	
	
}
