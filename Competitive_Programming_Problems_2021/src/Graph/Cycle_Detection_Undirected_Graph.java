package Graph;

import java.util.*;

public class Cycle_Detection_Undirected_Graph {
	
	
	public void deleteCycle() {
		
		Graph g = new Graph();
		g.addEdge(0,1);
		g.addEdge(1,2);
		g.addEdge(2,3);
		g.addEdge(3,4);
		g.addEdge(4,0);
		
		g.dfs();
		
		
	}


	
	
	
	
	
	
	
class Graph{
	Map<Integer, List<Integer>> map = null;
	
	public Graph() {
		map = new HashMap<>();
	}
	
	public void addEdge(int start, int end) {
		if(!map.containsKey(start)) {
			map.put(start, new ArrayList<>());
		}
		map.get(start).add(end);
		
		if(!map.containsKey(end)) {
			map.put(end, new ArrayList<>());
		}
		map.get(end).add(start);
	}
	
	public boolean detectCyle(int curr, int parent, Boolean[] visited) {
		
		visited[curr] = true;
		
		
		for(int currKey : map.get(curr) ) {
			
			if(!visited[currKey]) {
				
				boolean gotCycle = detectCyle(currKey, curr, visited);
				if(gotCycle) {
					return true;	
				}
				
			}else if(currKey != parent) {
				return true;
			}
			
		}
		
		return false;
	}
	
	
	public void dfs() {
		
		Boolean[] visited = new Boolean[map.size()];
		for(int i=0; i<map.size(); i++) {
			visited[i] = false;
		}
		
		System.out.println( "IS VISITED --> " +  detectCyle(0,-1, visited));	
	}
	
}
	
	
	
}
