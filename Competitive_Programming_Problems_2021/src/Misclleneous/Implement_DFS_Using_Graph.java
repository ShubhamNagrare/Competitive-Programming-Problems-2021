package Misclleneous;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Implement_DFS_Using_Graph {
	
	

	// Call this Method from main
	public void dfsCall() {
		Graph g = new Graph();
		g.addEdge(0,1);
		g.addEdge(1,2);
		g.addEdge(2,3);
		g.addEdge(3,4);
		g.addEdge(0,3);
		g.addEdge(4,5);
		
		g.dfs(0);
		
	}
	
	
	
	class Graph{
		Map<Integer, List<Integer>> map = null;
		
		public Graph() {
			map = new HashMap<>();
		}
		
		public void addEdge(int src, int destination) {
			
			if(!map.containsKey(src)) {
				map.put(src, new ArrayList<>());
			}
			map.get(src).add(destination);
			
			if(!map.containsKey(destination)) {
				map.put(destination, new ArrayList<>());
			}
			map.get(destination).add(src);
		}
		
		
		public void dfs(int src) {			
			Map<Integer,Boolean> visisted = new HashMap<>();			
			for(int curr : map.keySet()) {
				visisted.put(curr, false);
			}
			dfsUtil(src, visisted);
		}
		
		public void dfsUtil(int src, Map<Integer,Boolean> visisted) {
					
			System.out.println("Visited Node -> " + src);
			visisted.put(src, true);
			
			for(int curr : map.keySet()) {
				if(!visisted.get(curr)){
					dfsUtil(curr, visisted);
				}		
			}		
		}
		
		
		
	}

}
