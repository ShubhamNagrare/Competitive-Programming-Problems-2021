package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Find_If_Graph_Is_Connected {

	public void solve() {
		
		Graph graph = new Graph();
		graph.addEdge(0, 1,10);
		graph.addEdge(2, 3,10);
		graph.addEdge(4, 5,10);
		graph.addEdge(5, 6,10);
		graph.addEdge(4, 6,10);
		
		graph.getComponentList(0);
		
	}
	
	
	class Edge{
		int start;
		int end;
		int weight;
		public Edge(int start, int end, int weight) {
			this.start = start;
			this.end = end;
			this.weight = weight;		 
		}
	}
	
	
	class Graph{
		Map<Integer, List<Edge> > map = null;
		
		public Graph() {
			map = new HashMap<>();
		}
		
		public void addEdge(int start, int end, int weight) {
			if(!map.containsKey(start)) {
				map.put(start, new ArrayList<>());
			}
			map.get(start).add(new Edge(start, end, weight));
			if(!map.containsKey(end)) {
				map.put(end, new ArrayList<>());
			}
			map.get(end).add(new Edge(end, start, weight));
		}
		
		
		private void dfs(int start, Map<Integer, Boolean> visited, List<Integer> li ) {
			
			visited.put(start, true);

			li.add(start);
			for(Edge curr : map.get(start)) {
				if(!visited.get(curr.end)) {
					dfs(curr.end, visited, li);
				}
			}	
		}
		
		public void getComponentList(int start) {
			Map<Integer, Boolean> visited  = new HashMap<>();
			for(int curr : map.keySet()) {
				visited.put(curr, false);
			}
			List<List<Integer>> liFinal = new ArrayList<>();
			
			for(int curr : map.keySet()) {
				if(!visited.get(curr)) {
					List<Integer> li = new ArrayList<>();
					dfs(curr,  visited, li);
					liFinal.add(li);
				}
			}
			
			if(liFinal.size() == 1) {
				System.out.println("Connected");
			}
			else {
				System.out.println("Not Connected");
			}
		}
		
	
	}

}

