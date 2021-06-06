package Misclleneous;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Implemetn_Graph_And_Traverse_Using_DFS {
	
public void solve() {
		
		Graph graph = new Graph();
		graph.addEdge(1, 6);
		graph.addEdge(1, 5);
		graph.addEdge(1, 9);
		graph.addEdge(5, 3);
		graph.addEdge(3, 9);
		graph.addEdge(3, 7);
		graph.addEdge(6, 7);
		
		graph.dfs(1);
		
	}

	class Graph{
		Map<Integer,List<Integer>> map;
		
		public Graph() {
			map = new HashMap<>();
		}
		
		
		private void dfsUtil(int src, Map<Integer, Boolean> visited) {
			
			System.out.print(src + " ");
			visited.put(src, true);
			
			for(int curr : map.get(src)) {
				if(!visited.get(curr)) {
					dfsUtil(curr, visited);
				}
			}			
		}
		
		public void dfs(int src) {
			Map<Integer, Boolean> visited = new HashMap<>();
			for(int curr : map.keySet()) {
				visited.put(curr, false);
			}
			
			dfsUtil(src, visited);
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
	
		
		
	}

}
