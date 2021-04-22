package Graph;

import java.util.*;

public class Implement_Depth_First_Search {

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
	
	
	class Graph<T>{
		Map<T, List<T>> map;
		
		public Graph(){
			map = new HashMap<>();
		}
		
		
		public void addEdge(T start, T end) {
			if(!map.containsKey(start)) {
				map.put(start, new ArrayList<>());
			}
			map.get(start).add(end);
			
			if(!map.containsKey(end)) {
				map.put(end, new ArrayList<>());
			}
			map.get(end).add(start);
		}
		
		public void dfsHelper(T src, Map<T, Boolean> visited) {
			
			System.out.println("Visited Node --> " + src);
			visited.put(src, true);
			
			for(T curr : map.keySet()) {
				
				if(!visited.get(curr)) {
					dfsHelper(curr, visited);
				}
			}
			
		}
		
		public void dfs(T src) {
			Map<T, Boolean> visited = new HashMap<>();
			for(T curr : map.keySet()) 
			{
				visited.put(curr, false);
			}
			dfsHelper(src, visited);
		}
		}
		
	}
	

