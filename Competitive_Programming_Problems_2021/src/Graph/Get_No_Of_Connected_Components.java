package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Get_No_Of_Connected_Components {
	
	public void solve() {
		
		Graph graph = new Graph();
		graph.addEdge(0, 1,10);
		graph.addEdge(2, 3,10);
		graph.addEdge(4, 5,10);
		graph.addEdge(5, 6,10);
		graph.addEdge(4, 6,10);
		
		graph.getConnectedComponents(0);
		
		
	}
	
	public static class Edge{
		int curr;
		int next;
		int wt;
		public Edge(int curr, int next, int wt) {
			this.curr = curr;
			this.next = next;
			this.wt = wt;
		}
	}
	
	 class Graph{
		
		Map<Integer, List<Edge>> map = null;
		
		public Graph() {
			map = new HashMap<>();
		}
		
		public void addEdge(int curr, int next, int value) {
			
			if(!map.containsKey(curr)) {
				map.put(curr, new ArrayList<Edge>());
			}
			map.get(curr).add(new Edge(curr, next, value));
			
			if(!map.containsKey(next)) {
				map.put(next, new ArrayList<Edge>());
			}
			map.get(next).add(new Edge(next, curr, value));		
		}
		
		
		public void getConnectedComponents(int start) {
			
			Map<Integer, Boolean> visited = new HashMap<>();
			for(int curr : map.keySet()) {
				visited.put(curr, false);
			}
			
			int count = 0;
			for(int curr : map.keySet()) {				
				if(!visited.get(curr)) {
					dfs(curr, visited);
					visited.put(curr, true);
					count++;
				}				
			}
			System.out.println("ComponentsCount : " + count);
		}
		
		
		public void dfs(int start, Map<Integer, Boolean> visited ) {			
			visited.put(start, true);			
			for(Edge curr : map.get(start)) {
				if(!visited.get(curr.next)) {
					dfs(curr.next, visited);
				}
			}	
		}
		
		
		
		
		
	}
	

}
