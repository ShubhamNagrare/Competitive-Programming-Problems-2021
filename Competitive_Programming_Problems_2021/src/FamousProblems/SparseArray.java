package FamousProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SparseArray {
	
	public void solve() {
		
		//https://www.hackerrank.com/challenges/sparse-arrays/problem?h_r=next-challenge&h_v=zen
		
		List<String> strings = new ArrayList<>();
		strings.add("aba");
		strings.add("baba");
		strings.add("aba");
		strings.add("xzxb");
		
		List<String> queries = new ArrayList<>();
		queries.add("aba");
		queries.add("xzxb");
		queries.add("ab");
		
		printOccurence(strings, queries);
		
	}
	
	
	private void printOccurence(List<String> strings, List<String> queries) {
		
	    Map<String,Integer> map = new HashMap<>();
	    
	    for(int i=0; i<strings.size(); i++){
	        if(!map.containsKey(strings.get(i))){
	            map.put(strings.get(i), 1);
	        }
	        else{
	            int val = map.get(strings.get(i));
	            val++;
	            map.put(strings.get(i),val);
	        }
	    }
	    
	    for(int i=0; i<queries.size(); i++){
	        
	        System.out.println( map.get(queries.get(i)) == null ? 0 : map.get(queries.get(i) ));
	    }
		
	}

}
